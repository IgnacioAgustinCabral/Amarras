package ar.edu.unlam.java;

public class Vela extends Yate {
	private final Double precioAmarreVela = 9000.0;
	private Double alturaMastil;
	private Double superficieVelicaMayor;
	private Double superficieTotal;

	public Vela(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Double alturaMastil, Double superficieVelicaMayor, Double superficieTotal) {
		super(nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.alturaMastil = alturaMastil;
		this.superficieVelicaMayor = superficieVelicaMayor;
		this.superficieTotal = superficieTotal;
	}
	
	public Double getPrecioAmarreVela() {
		return precioAmarreVela;
	}
	

	public Double getAlturaMastil() {
		return alturaMastil;
	}

	public Double getSuperficieVelicaMayor() {
		return superficieVelicaMayor;
	}

	public Double getSuperficieTotal() {
		return superficieTotal;
	}

	public void setAlturaMastil(Double alturaMastil) {
		this.alturaMastil = alturaMastil;
	}

	public void setSuperficieVelicaMayor(Double superficieVelicaMayor) {
		this.superficieVelicaMayor = superficieVelicaMayor;
	}

	public void setSuperficieTotal(Double superficieTotal) {
		this.superficieTotal = superficieTotal;
	}

	public Double getPrecioAmarre(){
		return this.precioAmarreVela;
	}

}
