package ar.edu.unlam.java;

public class Motor extends Yate {
	private final Double precioAmarreMotor = 10000.0;
	

	private Double desplazamiento;
	private String tipoPropulsion;
	private Integer potencia;
	private Double velocidad;
	private Double autonomia;

	public Motor(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Double desplazamiento, String tipoPropulsion, Integer potencia, Double velocidad,
			Double autonomia) {
		super(nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.desplazamiento = desplazamiento;
		this.tipoPropulsion = tipoPropulsion;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}
	
	public Double getPrecioAmarreMotor() {
		return precioAmarreMotor;
	}
	
	public Double getDesplazamiento() {
		return desplazamiento;
	}

	public String getTipoPropulsion() {
		return tipoPropulsion;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public Double getAutonomia() {
		return autonomia;
	}

	public void setDesplazamiento(Double desplazamiento) {
		this.desplazamiento = desplazamiento;
	}

	public void setTipoPropulsion(String tipoPropulsion) {
		this.tipoPropulsion = tipoPropulsion;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	public void setAutonomia(Double autonomia) {
		this.autonomia = autonomia;
	}

	public Double getPrecioAmarre(){
		return this.precioAmarreMotor;
	}

}
