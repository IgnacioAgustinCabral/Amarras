package ar.edu.unlam.java;

import java.util.Set;
import java.util.TreeSet;

public class PuertoAmarre {
	private Integer cantMax;
	private Set<Yate> fondeadero = new TreeSet<Yate>();
	

	public PuertoAmarre(Integer cantMax) {
		this.cantMax = cantMax;
	}

	public Integer getCantMax() {
		return cantMax;
	}

	public Set<Yate> getFondeadero() {
		return fondeadero;
	}

	public void setFondeadero(Set<Yate> fondeadero) {
		this.fondeadero = fondeadero;
	}

	public void amarrarYate(Yate yate){
		try {if(fondeadero.size() < cantMax){
			fondeadero.add(yate);
		}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void desamarrarYate(Yate yate) {
		if(fondeadero.contains(yate)){
			fondeadero.remove(yate);
		}
	}

	public Integer obtenerCantidadDeYatesAmarrados() {
		return fondeadero.size();
	}

	public Integer obtenerCantidadDeAmarrasDisponibles() {
		return cantMax - fondeadero.size();
	}
	
	public Double obtenerPrecioDeAmarre(Yate yate) {
		if(yate.getEslora() > 20.0){
			return yate.getPrecioAmarre() + 3000.0; 
		} else {
			return yate.getPrecioAmarre() + 2000.0;
		}
	}

	public Double obtenerRecaudacionTotal() {
		Double sumador = 0.0;
		for (Yate yate : fondeadero) {
			sumador += this.obtenerPrecioDeAmarre(yate);
		}
		return sumador;
	}

}
