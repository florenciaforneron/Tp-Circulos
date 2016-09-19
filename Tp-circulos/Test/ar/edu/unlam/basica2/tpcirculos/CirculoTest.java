package ar.edu.unlam.basica2.tpcirculos;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void crearUnCirculoConRadio2() {
		
		Circulo MiCirculo = new Circulo(2.00);
		
 		assertEquals(2.00,MiCirculo.radioDeUnCirculo(), 0.01);
	}
	

	@Test
	public void crearUnCirculoConRadio3Punto7() {
		
		Circulo MiCirculo = new Circulo (3.7);
		
		assertEquals(3.7,MiCirculo.radioDeUnCirculo(),0.01);
		
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		
		Circulo MiCirculo = new Circulo(5.00);
		
		assertEquals(5.00,MiCirculo.radioDeUnCirculo(),0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		
		Circulo MiCirculo = new Circulo(10.9);
		
		assertEquals(10.9,MiCirculo.radioDeUnCirculo(),0.01);
	}
	
	
	@Test 
	public void crearUnCirculoConRadio9Punto8(){
		
		Circulo MiCirculo = new Circulo(9.8);
		
		assertEquals(9.8,MiCirculo.radioDeUnCirculo(),0.1);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Sea61Punto54(){
		
		 Circulo MiCirculo = new Circulo(9.8);
		 
		 assertEquals(61.54,MiCirculo.perimetroDeUnCirculo(),0.01);
		
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6() {
		 Circulo MiCirculo = new Circulo(16.6);
		 
		 assertEquals(16.6, MiCirculo.radioDeUnCirculo(), 0.01);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio16Punto6Sea104Punto24(){
		
		Circulo MiCirculo = new Circulo(16.6);
		
		assertEquals(104.24,MiCirculo.perimetroDeUnCirculo(),0.01);
	}
	
	
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}