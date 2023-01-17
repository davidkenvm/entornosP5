package utils;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	//constructor
	public Fecha(int dia,int mes,int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	
	private String getMesLetras() {
		switch(this.mes) {
			case 1:
				return "enero";
			case 2:
				return "febrero";
			case 3:
				return "marzo";
			case 4:
				return "abril";
			case 5: 
				return "mayo";
			case 6:
				return "junio";
			case 7:
				return "julio";
			case 8:
				return "agosto";
			case 9:
				return "septiembre";
			case 10:
				return "octubre";
			case 11:
				return "noviembre";
			case 12:
				return "diciembre";	
		}
		return "";
	}
	private boolean esBisiesto() {
		if((this.anio % 4 == 0) && ((this.anio % 100 != 0) || (this.anio % 400 == 0))) return true;
		return false;
	}
	private int getDiasMes() {
		if (this.mes % 2 == 0) {
			if (this.mes < 7)
			if (this.mes == 8) return 31;
			else if (this.mes == 2) {
				if(esBisiesto()) return 29;
				return 28;
			}
			else return 30;
			
		}
		return 31;
	}
	public boolean esCorrecta() { 
	if(this.dia>0 && this.dia<=getDiasMes() && this.anio>0 && this.mes>=1 && this.mes<=12) {
		return true;
		}
	return false;
	}
	public String toString() {
		return  this.dia + " de " + getMesLetras() + " de " +this.anio;
	}
}
