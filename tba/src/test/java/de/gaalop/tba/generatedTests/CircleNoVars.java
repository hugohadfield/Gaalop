package de.gaalop.tba.generatedTests;

public class CircleNoVars implements GAProgram {
	// input variables

	// output variables
	private float m_1;
	private float r_0;
	private float m_2;

	@Override
	public float getValue(String varName) {
		if (varName.equals("m_1")) return m_1;
		if (varName.equals("r_0")) return r_0;
		if (varName.equals("m_2")) return m_2;
		return 0.0f;
	}

	@Override
	public boolean setValue(String varName, float value) {
		return false;
	}
	
	@Override
	public void calculate() {
		float x1_0 = 5.0f;
		float y1_0 = 2.0f;
		float x2_0 = 3.0f;
		float y2_0 = 9.0f;
		float x3_0 = 6.0f;
		float y3_0 = 4.0f;
		float v1_1 = ((x1_0 * 1.0f) * 1.0f);
		float v1_2 = ((y1_0 * 1.0f) * 1.0f);
		float v2_1 = ((x2_0 * 1.0f) * 1.0f);
		float v2_2 = ((y2_0 * 1.0f) * 1.0f);
		float v3_1 = ((x3_0 * 1.0f) * 1.0f);
		float v3_2 = ((y3_0 * 1.0f) * 1.0f);
		float p1_1 = v1_1;
		float p1_2 = v1_2;
		float p1_4 = ((((((((0.5f * v1_1) * 1.0f) * v1_1) * 1.0f) + ((((0.5f * v1_2) * 1.0f) * v1_2) * 1.0f))) * 1.0f) * 1.0f);
		float p1_5 = 1.0f;
		float p1_17 = ((((((((0.5f * v1_1) * 1.0f) * v1_2) * 1.0f) + ((((0.5f * v1_2) * 1.0f) * v1_1) * -1.0f))) * 1.0f) * 1.0f);
		float p2_1 = v2_1;
		float p2_2 = v2_2;
		float p2_4 = ((((((((0.5f * v2_1) * 1.0f) * v2_1) * 1.0f) + ((((0.5f * v2_2) * 1.0f) * v2_2) * 1.0f))) * 1.0f) * 1.0f);
		float p2_5 = 1.0f;
		float p2_17 = ((((((((0.5f * v2_1) * 1.0f) * v2_2) * 1.0f) + ((((0.5f * v2_2) * 1.0f) * v2_1) * -1.0f))) * 1.0f) * 1.0f);
		float p3_1 = v3_1;
		float p3_2 = v3_2;
		float p3_4 = ((((((((0.5f * v3_1) * 1.0f) * v3_1) * 1.0f) + ((((0.5f * v3_2) * 1.0f) * v3_2) * 1.0f))) * 1.0f) * 1.0f);
		float p3_5 = 1.0f;
		float p3_17 = ((((((((0.5f * v3_1) * 1.0f) * v3_2) * 1.0f) + ((((0.5f * v3_2) * 1.0f) * v3_1) * -1.0f))) * 1.0f) * 1.0f);
		float c_7 = (((-(((((((((p1_2 * p2_4) * 1.0f) + ((p1_4 * p2_2) * -1.0f))) * p3_5) * 1.0f) + ((((((p1_2 * p2_5) * 1.0f) + ((p1_5 * p2_2) * -1.0f))) * p3_4) * -1.0f)) + ((((((p1_4 * p2_5) * 1.0f) + ((p1_5 * p2_4) * -1.0f))) * p3_2) * 1.0f)))) * ((1.0f * ((1.0f * ((1.0f * ((1.0f * 1.0f) * 1.0f)) * 1.0f)) * 1.0f)) * 1.0f)) * -1.0f);
		float c_10 = (((-(((((((((p1_1 * p2_4) * 1.0f) + ((p1_4 * p2_1) * -1.0f))) * p3_5) * 1.0f) + ((((((p1_1 * p2_5) * 1.0f) + ((p1_5 * p2_1) * -1.0f))) * p3_4) * -1.0f)) + ((((((p1_4 * p2_5) * 1.0f) + ((p1_5 * p2_4) * -1.0f))) * p3_1) * 1.0f)))) * ((1.0f * ((1.0f * ((1.0f * ((1.0f * 1.0f) * 1.0f)) * 1.0f)) * 1.0f)) * 1.0f)) * 1.0f);
		float c_13 = (((-(((((((((p1_1 * p2_2) * 1.0f) + ((p1_2 * p2_1) * -1.0f))) * p3_4) * 1.0f) + ((((((p1_1 * p2_4) * 1.0f) + ((p1_4 * p2_1) * -1.0f))) * p3_2) * -1.0f)) + ((((((p1_2 * p2_4) * 1.0f) + ((p1_4 * p2_2) * -1.0f))) * p3_1) * 1.0f)))) * ((1.0f * ((1.0f * ((1.0f * ((1.0f * 1.0f) * 1.0f)) * 1.0f)) * 1.0f)) * 1.0f)) * 1.0f);
		float c_14 = (((-(((((((((p1_1 * p2_2) * 1.0f) + ((p1_2 * p2_1) * -1.0f))) * p3_5) * 1.0f) + ((((((p1_1 * p2_5) * 1.0f) + ((p1_5 * p2_1) * -1.0f))) * p3_2) * -1.0f)) + ((((((p1_2 * p2_5) * 1.0f) + ((p1_5 * p2_2) * -1.0f))) * p3_1) * 1.0f)))) * ((1.0f * ((1.0f * ((1.0f * ((1.0f * 1.0f) * 1.0f)) * 1.0f)) * 1.0f)) * 1.0f)) * -1.0f);
		m_1 = (((((c_14 * 1.0f) * -1.0f) * c_7) * -1.0f) + ((((c_7 * 1.0f) * 1.0f) * c_14) * 1.0f));
		m_2 = (((((c_14 * 1.0f) * -1.0f) * c_10) * -1.0f) + ((((c_10 * 1.0f) * 1.0f) * c_14) * 1.0f));
		float m_4 = (((((((c_14 * 1.0f) * -1.0f) * c_13) * 1.0f) + ((((c_7 * 1.0f) * 1.0f) * c_7) * -1.0f)) + ((((c_10 * 1.0f) * 1.0f) * c_10) * -1.0f)) + ((((c_14 * 1.0f) * -1.0f) * c_13) * -1.0f));
		float m_5 = (((((c_14 * 1.0f) * -1.0f) * c_14) * 1.0f) + ((((c_14 * 1.0f) * -1.0f) * c_14) * 1.0f));
		float m_17 = (((((c_7 * 1.0f) * 1.0f) * c_10) * -1.0f) + ((((c_10 * 1.0f) * 1.0f) * c_7) * 1.0f));
		float m_21 = (((((c_7 * 1.0f) * 1.0f) * c_14) * -1.0f) + ((((c_14 * 1.0f) * -1.0f) * c_7) * -1.0f));
		float m_24 = (((((c_10 * 1.0f) * 1.0f) * c_14) * -1.0f) + ((((c_14 * 1.0f) * -1.0f) * c_10) * -1.0f));
		m_1 = ((((-m_1) * (((m_5 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f) + (((-m_5) * (((m_21 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f));
		m_2 = ((((-m_2) * (((m_5 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f) + (((-m_5) * (((m_24 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f));
		m_4 = (((((((-m_1) * (((m_21 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f) + (((-m_2) * (((m_24 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f)) + (((-m_4) * (((m_5 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f)) + (((-m_21) * (((m_21 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * -1.0f)) + (((-m_24) * (((m_24 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * -1.0f));
		m_5 = (((-m_5) * (((m_5 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f);
		m_17 = (((((((-m_1) * (((m_24 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f) + (((-m_2) * (((m_21 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * -1.0f)) + (((-m_17) * (((m_5 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f)) + (((-m_21) * (((m_24 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * -1.0f)) + (((-m_24) * (((m_21 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f));
		m_21 = ((((-m_5) * (((m_21 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f) + (((-m_21) * (((m_5 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f));
		m_24 = ((((-m_5) * (((m_24 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f) + (((-m_24) * (((m_5 * 1.0f) * -1.0f) / ((((m_5 * 1.0f) * -1.0f) * ((m_5 * 1.0f) * -1.0f)) * 1.0f))) * 1.0f));
		r_0 = (float) Math.sqrt((float) Math.sqrt(Math.abs(((((((((((c_7 * c_7) * -1.0f) + ((c_10 * c_10) * -1.0f)) + ((c_13 * c_14) * 1.0f)) + ((c_14 * c_13) * 1.0f))) * (((((1.0f * c_14) * 1.0f) * ((1.0f * c_14) * 1.0f)) * 1.0f) / ((((((1.0f * c_14) * 1.0f) * ((1.0f * c_14) * 1.0f)) * 1.0f) * ((((1.0f * c_14) * 1.0f) * ((1.0f * c_14) * 1.0f)) * 1.0f)) * 1.0f))) * 1.0f) * ((((((((c_7 * c_7) * -1.0f) + ((c_10 * c_10) * -1.0f)) + ((c_13 * c_14) * 1.0f)) + ((c_14 * c_13) * 1.0f))) * (((((1.0f * c_14) * 1.0f) * ((1.0f * c_14) * 1.0f)) * 1.0f) / ((((((1.0f * c_14) * 1.0f) * ((1.0f * c_14) * 1.0f)) * 1.0f) * ((((1.0f * c_14) * 1.0f) * ((1.0f * c_14) * 1.0f)) * 1.0f)) * 1.0f))) * 1.0f)) * 1.0f))));
	}
}
