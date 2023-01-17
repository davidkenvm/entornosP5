package gestor;

import modelo.Nomina;

public class Gestor {

	// VARIABLE MIMEBRO DE LA CLASE
	private static float totalDevengo;
	private static float totalBCCC;
	private static float totalBCP;
	private static float totalHHEE;
	private static float totalBIRPF;
	// DEDUCCIONES
	private static float totalDeduccionCC;
	private static float totalDeduccionDesempleo;
	private static float totalDeduccionFP;
	private static float totalDeduccionHHEE;
	private static float totalDeduccionIRPF;
	private static float totalDeducciones;

	// TOTAL DEVENGO
	public static float calculaDevengo(float salarioBase, float plusConvenio, float plusTransporte, float dietas,
			float antiguedad, float horasExtras) {
		totalDevengo = salarioBase + plusConvenio + plusTransporte + dietas + horasExtras + dietas + antiguedad;
		return totalDevengo;
	}

	// BASES COTIZACION
	// BCCC
	public static float calculaBCCC(float salarioBase, float antiguedad, float plusTransporte, float plusConvenio) {
		totalBCCC = salarioBase + antiguedad + plusTransporte + plusConvenio + ((salarioBase * 2) / 12);
		return totalBCCC;
	}

	// BCP
	public static float calculaBCP(float horasExtras, float totalBCCC) {
		totalBCP = totalBCCC + horasExtras;
		return totalBCP;
	}

	// BHHEE
	public static float calculaHHEE(float horasExtras) {
		totalHHEE = horasExtras;
		return totalHHEE;
	}

	// BIRPF
	public static float calculaBIRPF(float salarioBase, float plusConvenio, float plusTransporte, float dietas,
			float antiguedad, float horasExtras) {
		totalBIRPF = salarioBase + plusConvenio + plusTransporte + dietas + antiguedad + horasExtras
				+ (2 * (salarioBase + antiguedad));
		return totalBIRPF;
	}

	// DEDUCCIONES
	// CC
	public static float calculaCC(float totalBCCC) {
		totalDeduccionCC = totalBCCC * (0.047f);
		return totalDeduccionCC;
	}

	// DESEMPLEO
	public static float calculaDesempleo(float totalBCP) {
		totalDeduccionDesempleo = totalBCP * (0.0155f);
		return totalDeduccionDesempleo;
	}

	// FP
	public static float calculaFP(float totalBCP) {
		totalDeduccionFP = totalBCP * (0.001f);
		return totalDeduccionFP;
	}

	// HHEE
	public static float calculaHEE(float totalHHEE) {
		totalDeduccionHHEE = totalHHEE * (0.047f);
		return totalDeduccionHHEE;
	}

	// BIRPF
	public static float calculaIRPF(float totalBIRPF) {
		totalDeduccionIRPF = totalBIRPF * (0.15f);
		return totalDeduccionIRPF;
	}

	// TOTAL DEDUCCIONES
	public static float calculaTotalDeduccion(float totalDeduccionCC, float totalDeduccionDesempleo,
			float totalDeduccionFP, float totalDeduccionHHEE, float totalDeduccionIRPF) {
		totalDeducciones = totalDeduccionCC + totalDeduccionDesempleo + totalDeduccionFP + totalDeduccionHHEE
				+ totalDeduccionIRPF;
		return totalDeducciones;
	}

	// TOTAL A PERCIBIR
	public static float calculaTotalPercibir(float totalDevengo, float totalDeducciones) {
		float totalPercibir = totalDevengo - totalDeducciones;
		return totalPercibir;
	}

}
