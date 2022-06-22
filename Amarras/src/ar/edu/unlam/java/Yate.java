package ar.edu.unlam.java;

public abstract class Yate implements Comparable<Yate> {
	private String nombre;
	private String duenio;
	private Double manga;
	private Double calado;
	private Double eslora;
	private Integer tripulacion;
	private Double peso;
	
	

	public Yate(String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso) {
		super();
		this.nombre = nombre;
		this.duenio = duenio;
		this.manga = manga;
		this.calado = calado;
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDuenio() {
		return duenio;
	}

	public Double getManga() {
		return manga;
	}

	public Double getCalado() {
		return calado;
	}

	public Double getEslora() {
		return eslora;
	}

	public Integer getTripulacion() {
		return tripulacion;
	}

	public Double getPeso() {
		return peso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public void setManga(Double manga) {
		this.manga = manga;
	}

	public void setCalado(Double calado) {
		this.calado = calado;
	}

	public void setEslora(Double eslora) {
		this.eslora = eslora;
	}

	public void setTripulacion(Integer tripulacion) {
		this.tripulacion = tripulacion;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	@Override
	public int compareTo(Yate o) {
		return this.getNombre().compareTo(o.getNombre());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yate other = (Yate) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public abstract Double getPrecioAmarre();

}
