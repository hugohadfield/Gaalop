package de.gaalop.compressed;

import de.gaalop.Notifications;
import de.gaalop.cfg.*;
import de.gaalop.dfg.*;
import de.gaalop.gaalet.*;
import de.gaalop.gaalet.output.*;

import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This visitor traverses the control and data flow graphs and generates C/C++ code.
 */
public class CompressedVisitor extends de.gaalop.gaalet.output.CppVisitor {

    protected boolean gcdMetaInfo = true;

    public CompressedVisitor(boolean standalone) {
        super(standalone);
    }

    @Override
    public void visit(StartNode node) {
        graph = node.getGraph();

        FindStoreOutputNodes findOutput = new FindStoreOutputNodes();
        graph.accept(findOutput);
        for (StoreResultNode var : findOutput.getNodes()) {
            String outputName = var.getValue().getName() + "_out";

            outputNamesMap.put(var, outputName);
        }
        if (standalone) {
            code.append("void calculate(");

            // Input Parameters
            List<Variable> inputParameters = sortVariables(graph.getInputVariables());
            for (Variable var : inputParameters) {
                code.append("float "); // The assumption here is that they all are normal scalars
                printVarName(var.getName());
                code.append(", ");
            }

            for (StoreResultNode var : findOutput.getNodes()) {
                code.append("float **");
                printVarName(outputNamesMap.get(var));
                code.append(", ");
            }

            if (!graph.getInputVariables().isEmpty() || !findOutput.getNodes().isEmpty()) {
                code.setLength(code.length() - 2);
            }

            code.append(") {\n");
            indentation++;
        }

        handleLocalVariables();
        createVectorSet(findOutput);
        node.getSuccessor().accept(this);
    }

    /**
     * Declare local variables
     *	 but first local variables in a set, so we reduce redundancy
     */
    @Override
    protected void handleLocalVariables() {
        Set<String> varNames = new HashSet<String>();
        for (Variable var : graph.getLocalVariables()) {
            varNames.add(var.getName());
        }
        for (String var : varNames) {
            appendIndentation();
            FieldsUsedVisitor fieldVisitor = new FieldsUsedVisitor(var);

            // GCD definition
            code.append("#pragma gcd multivector ");
            code.append(var);
            code.append('\n');

            // standard definition
            graph.accept(fieldVisitor);
            int size = fieldVisitor.getMultiVector().getGaalopBlades().size();
            code.append(variableType + ' ' + fieldVisitor.getMultiVector().getName());
            if (size > 0) {
                code.append('[');
                code.append(size);
                code.append(']');
            }
            code.append(";\n");

            // GCD blade usage definition
            if (gcdMetaInfo) {
                Iterator<Integer> it = fieldVisitor.getMultiVector().getGaalopBlades().keySet().iterator();
                code.append("const unsigned int ");
                code.append(var);
                code.append("_usage = 0");
                while (it.hasNext()) {
                    code.append(" | (1 << ");
                    code.append(it.next());
                    code.append(')');
                }

                code.append(";\n");
            }

            if (!graph.getLocalVariables().isEmpty()) {
                code.append("\n");
            }
        }
    }
    
    	@Override
	public void visit(MultivectorComponent component) {
		// GCD definition
		gcdDefinition(component,code,assigned,outputSuffix,gcdMetaInfo);

		// standard definition
		code.append(component.getName().replace(outputSuffix, ""));
		code.append('[');
		code.append(component.getBladeIndex());
		code.append(']');
	}

   protected void gcdDefinition(MultivectorComponent component,StringBuilder code,
                        Set<String> assigned,String outputSuffix,boolean gcdMetaInfo)
   {
	String componentName = component.getName().replace(outputSuffix, "") + '_' + component.getBladeHandle();
	if(gcdMetaInfo && !assigned.contains(componentName))
	{
		code.append("//#pragma gcd multivector_component ");
		code.append(component.getName().replace(outputSuffix, ""));
		code.append(' ');
		code.append(component.getBladeHandle());
		code.append(' ');
		code.append(component.getBladeName());
		code.append(' ');
		code.append(component.getBladeIndex());
		code.append('\n');
		code.append("const float ");
		code.append(componentName);
		code.append(" = ");
			
		assigned.add(componentName);
	}
   }
}
