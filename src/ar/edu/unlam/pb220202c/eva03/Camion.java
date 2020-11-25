package ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo{
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los que crean conveniente
	private String patente;
	private Integer velocidadMaxima = 80;
	private Integer cantidadDeEjes;
	
	public Camion(String Patente, Integer VelocidadActual, Integer limiteVelocidad, String patente2,
			Integer velocidadMaxima, Integer cantidadDeEjes) {
		super(Patente, VelocidadActual, limiteVelocidad);
		patente = patente2;
		this.velocidadMaxima = velocidadMaxima;
		this.cantidadDeEjes = cantidadDeEjes;
	}
	//el Limite de velociadad para autos es de 80km
	//en caso que supere dicho limite el este sera multado
	

}
