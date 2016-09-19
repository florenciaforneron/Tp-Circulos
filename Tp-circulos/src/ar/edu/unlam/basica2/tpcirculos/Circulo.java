package ar.edu.unlam.basica2.tpcirculos;

public class Circulo {
	
	private Double radio;
	private Double perimetro;

	
	public Circulo (Double radioCirculo){  //CONSTRUCTOR 
	
		this.radio = radioCirculo ;
		this.setPerimetro(0.0);
	}
	

	public Double radioDeUnCirculo() {

		return this.radio;
	}
	
	public Double perimetroDeUnCirculo(){
		
		return this.setPerimetro(2*3.14*this.radio);
	}
	
	
	
	
	
	public Double getPerimetro() {
		return perimetro;
	}


	public Double setPerimetro(Double perimetro) {
		return this.perimetro = perimetro;
	}
	
	
	
}
