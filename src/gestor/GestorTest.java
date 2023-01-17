package gestor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GestorTest {

	// PARA NO ESTAR TODO EL TIEMPO INICIALIZANDO UN OBJETO DE LA CLASE GESTOR
	Gestor g;

	@Before
	public void setUp() {
		g = new Gestor();
	}

	// TOTAL DEVENGO
	@Test
	public void testCalculaDevengo() {
		float resultadoEsperado = 1050;
		float resultadoReal = g.calculaDevengo(900, 0, 0, 0, 0, 150);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

	// TOTAL BCCC
	@Test
	public void testCalculaBCCC() {
		float resultadoEsperado = 1050;
		float resultadoReal = g.calculaBCCC(900, 0, 0, 0);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

	// TOTAL BCP
	@Test
	public void testCalculaBCP() {
		float resultadoEsperado = 1200;
		float resultadoReal = g.calculaBCP(150, 1050);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

	// TOTAL HHEE
	@Test
	public void testCalculaHHEE() {
		float resultadoEsperado = 150;
		float resultadoReal = g.calculaHHEE(150);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

	// TOTAL BIRPF
	@Test
	public void testCalculaBIRPF() {
		float resultadoEsperado = 2850;
		float resultadoReal = g.calculaBIRPF(900, 0, 0, 0, 0, 150);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

	// DEDUCCIONES
	// CC
	@Test
	public void testCalculaCC() {
		float resultadoEsperado = 49.35f;
		float resultadoReal = g.calculaCC(1050);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

	// DESEMPLEO
	@Test
	public void testCalculaDesempleo() {
		float resultadoEsperado = 18.6F;
		float resultadoReal = g.calculaDesempleo(1200);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

	// FP
	@Test
	public void testCalculaFP() {
		float resultadoEsperado = 1.2F;
		float resultadoReal = g.calculaFP(1200);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

	// HHEE
	@Test
	public void testCalculaHEE() {
		float resultadoEsperado = 7.896F;
		float resultadoReal = g.calculaHEE(168);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

	// IRPF
	@Test
	public void testCalculaIRPF() {
		float resultadoEsperado = 427.50003f;
		float resultadoReal = g.calculaIRPF(2850.0f);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

	// TOTAL DEDUCCION
	@Test
	public void testCalculaTotalDeduccion() {
		float resultadoEsperado = 503.65f;
		float resultadoReal = g.calculaTotalDeduccion(49.3f, 18.6f, 1.2f, 7.05f, 427.5f);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

	// TOTAL PERCIBIR
	@Test
	public void testCalculaTotalPercibir() {
		float resultadoEsperado = 546.3f;
		float resultadoReal = g.calculaTotalPercibir(1050.0f, 503.7f);
		assertEquals(resultadoEsperado, resultadoReal, 0);
	}

}
