package principal;

import gestor.Gestor;
import utils.Interfaz;

public class Principal {

	public static void main(String[] args) {

		// TOTAL DEVENGO
		float salarioBase = (float) Interfaz.pideDoble("Salario Base: ");
		float plusConvenio = (float) Interfaz.pideDoble("Plus Convenio: ");
		float plusTransporte = (float) Interfaz.pideDoble("Plus Transporte: ");
		float dietas = (int) Interfaz.pideDoble("Dietas: ");
		float antiguedad = (int) Interfaz.pideDoble("Antiguedad: ");
		float horasExtras = (int) Interfaz.pideDoble("Horas Extras: ");
		float totalDevengo = Gestor.calculaDevengo(salarioBase, plusConvenio, plusTransporte, dietas, antiguedad,
				horasExtras);

		// TOTAL BASES COTIZACION
		// BCCC
		float totalBCCC = Gestor.calculaBCCC(salarioBase, antiguedad, plusTransporte, plusConvenio);
		float totalBCP = Gestor.calculaBCP(horasExtras, totalBCCC);
		float totalBHHEE = Gestor.calculaHHEE(horasExtras);
		float totalBIRPF = Gestor.calculaBIRPF(salarioBase, plusConvenio, plusTransporte, dietas, antiguedad,
				horasExtras);

		// DEDUCCIONES
		float totalCC = Gestor.calculaCC(totalBCCC);
		float totalDesempleo = Gestor.calculaDesempleo(totalBCP);
		float totalFP = Gestor.calculaFP(totalBCP);
		float totalHHEE = Gestor.calculaHEE(totalBHHEE);
		float totalIRPF = Gestor.calculaIRPF(totalBIRPF);
		float totalDeducciones = Gestor.calculaTotalDeduccion(totalCC, totalDesempleo, totalFP, totalHHEE, totalIRPF);

		// TOTAL A PERCIBIR
		float totalPercibir = Gestor.calculaTotalPercibir(totalDevengo, totalDeducciones);
		// MUESTRA RESULTADO
		Interfaz.muestraMensaje("-TOTAL DEVENGO: " + totalDevengo + "\n"
				+ "------------------------------\n-BASES COTIZACION\n" + "TOTAL BCCC: " + totalBCCC + "\n"
				+ "TOTAL BCP: " + totalBCP + "\n" + "TOTAL BHHEE: " + totalBHHEE + "\n" + "TOTAL BIRPF: " + totalBIRPF
				+ "\n-------------------------------\n" + "-DEDUCCIONES\n" + "TOTAL CC: " + totalCC + "\n"
				+ "TOTAL DESEMPLEO: " + totalDesempleo + "\n" + "TOTAL FP: " + totalFP + "\n" + "TOTAL HHEE: "
				+ totalHHEE + "\n" + "IRPF: " + totalIRPF + "\n" + "TOTAL DEDUCCIONES: " + totalDeducciones
				+ "\n-------------------------------\n" + "-TOTAL PERCIBIR: " + totalPercibir);

	}

}
