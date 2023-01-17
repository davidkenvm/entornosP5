package modelo;

public class Nomina {

	// VARIABLES MIEMBRO DE LA CLASE
	private float salarioBase;
	private float plusConvenio;
	private float plusTransporte;
	private float dietas;
	private float antiguedad;
	private float horasExtras;

	// CONSTRUCTOR
	public Nomina(float salarioBase, float plusConvenio, float plusTransporte, float dietas, float antiguedad,
			float horasExtras) {
		setAntiguedad(antiguedad);
		setDietas(dietas);
		setHorasExtras(horasExtras);
		setPlusConvenio(plusConvenio);
		setPlusTransporte(plusTransporte);
		setSalarioBase(salarioBase);
	}

	public Nomina() {

	}

	// GETTERS AND SETTERS
	// SALARIO BASE
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	// PLUS CONVENIO
	public void setPlusConvenio(float plusConvenio) {
		this.plusConvenio = plusConvenio;
	}

	public float getPlusConvenio() {
		return plusConvenio;
	}

	// PLUS TRANSPORTE
	public void setPlusTransporte(float plusTransporte) {
		this.plusTransporte = plusTransporte;
	}

	public float getPlusTransporte() {
		return plusTransporte;
	}

	// DIETAS
	public void setDietas(float dietas) {
		this.dietas = dietas;
	}

	public float getDietas() {
		return dietas;
	}

	// ANTIGUEDAD
	public void setAntiguedad(float antiguedad) {
		this.antiguedad = antiguedad;
	}

	public float getAntiguedad() {
		return antiguedad;
	}

	// HORAS EXTRAS
	public void setHorasExtras(float horasExtras) {
		this.horasExtras = horasExtras;
	}

	public float getHorasExtras() {
		return horasExtras;
	}
}
