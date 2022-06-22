package ar.edu.unlam.java;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class AmarrasTest {

	Set<Yate> fondeadero = new TreeSet<Yate>();

	Motor motor1 = new Motor("AZ1", "Andres Borgeat", 18.87, 5.15, 119.0, 37, 5500.0, 5959.0,
			"2x motores diesel MAN RK2805", 9000, 23.0, 6500.0);
	Vela vela1 = new Vela("XXR", "Sebastian Pardo", 6.90, 2.7, 13.45, 5, 1400.0, 21.5, 85.0, 133.0);
	Vela vela2 = new Vela("XXR", "Jose Martinez", 6.80, 5.7, 13.25, 5, 1400.0, 19.5, 79.0, 128.5);
	Motor motor2 = new Motor("BR8", "Pepe Sanchez", 12.87, 6.15, 12.0, 87, 2500.0, 4959.0,
			"2x motores naftero MAN RK2805", 8000, 13.0, 2500.0);
	Vela vela3 = new Vela("PX2", "Maria Rojas", 2.90, 3.7, 28.45, 6, 2400.0, 22.5, 83.1, 146.0);

	@Test
	public void seInsertan2NombresIgualesYNoSePuede() {

		PuertoAmarre puerto1 = new PuertoAmarre(70);

		puerto1.amarrarYate(motor1);
		puerto1.amarrarYate(vela1);
		puerto1.amarrarYate(vela2);

		Integer valorEsperado = 2;
		Integer valorObtenido = puerto1.getFondeadero().size();

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void seDesamarraUnYate() {

		PuertoAmarre puerto2 = new PuertoAmarre(70);

		puerto2.amarrarYate(motor1);
		puerto2.amarrarYate(vela1);

		puerto2.desamarrarYate(vela1);

		Integer valorEsperado = 1;
		Integer valorObtenido = puerto2.getFondeadero().size();

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void obtengoCantidadDeYatesAmarrados() {
		PuertoAmarre puerto3 = new PuertoAmarre(70);

		puerto3.amarrarYate(motor1);
		puerto3.amarrarYate(vela1);
		puerto3.amarrarYate(vela3);
		puerto3.amarrarYate(motor2);

		Integer valorEsperado = 4;
		Integer valorObtenido = puerto3.obtenerCantidadDeYatesAmarrados();

		assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queNoSePuedaExcederElLimiteDelFondeadero() {
		PuertoAmarre puerto4 = new PuertoAmarre(3);

		puerto4.amarrarYate(motor1);
		puerto4.amarrarYate(vela1);
		puerto4.amarrarYate(vela3);
		puerto4.amarrarYate(motor2);

		Integer valorEsperado = 3;
		Integer valorObtenido = puerto4.obtenerCantidadDeYatesAmarrados();

		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void seObtieneLaCantidadDeAmarrasDisponibles() {
		PuertoAmarre puerto5 = new PuertoAmarre(38);

		puerto5.amarrarYate(motor1);
		puerto5.amarrarYate(vela1);
		puerto5.amarrarYate(vela3);
		puerto5.amarrarYate(motor2);

		Integer valorEsperado = 34;
		Integer valorObtenido = puerto5.obtenerCantidadDeAmarrasDisponibles();
		assertEquals(valorEsperado, valorObtenido);
	}

	@Test
	public void seCalculaElPrecioDeAmarreMensual() {
		PuertoAmarre puerto6 = new PuertoAmarre(20);

		puerto6.amarrarYate(motor1);
		puerto6.amarrarYate(vela1);
		puerto6.amarrarYate(vela3);
		puerto6.amarrarYate(motor2);

		Double valorEsperado1 = 13000.0;
		Double valorObtenido1 = puerto6.obtenerPrecioDeAmarre(motor1);
		assertEquals(valorEsperado1, valorObtenido1);

		Double valorEsperado2 = 12000.0;
		Double valorObtenido2 = puerto6.obtenerPrecioDeAmarre(motor2);
		assertEquals(valorEsperado2, valorObtenido2);

		Double valorEsperado3 = 11000.0;
		Double valorObtenido3 = puerto6.obtenerPrecioDeAmarre(vela1);
		assertEquals(valorEsperado3, valorObtenido3);

		Double valorEsperado4 = 12000.0;
		Double valorObtenido4 = puerto6.obtenerPrecioDeAmarre(vela3);
		assertEquals(valorEsperado4, valorObtenido4);

	}

	@Test
	public void seObtieneLaRecaudacionMensualDelPuertoPorLosYatesAmarrados() {
		PuertoAmarre puerto7 = new PuertoAmarre(20);

		puerto7.amarrarYate(motor1);
		puerto7.amarrarYate(vela1);
		puerto7.amarrarYate(vela3);
		puerto7.amarrarYate(motor2);
		
		Double valorEsperado = 48000.0;
		Double valorObtenido = puerto7.obtenerRecaudacionTotal();
		
		assertEquals(valorEsperado,valorObtenido);
	}

}
