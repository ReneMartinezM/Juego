package modelo;

public class Jugador {
	
	
	//Atributos
	
	private String nombre;
	private int capital;
	private int apuesta;
	
	//Constructores
	
	public Jugador(String nombre, int capital)
	{
		this.nombre = nombre;
		this.capital = capital;
	}
	
	
	//Metodos
	
	public boolean realizarApuesta(){
		boolean bandera = true;
		return  bandera;
	}
	
	public int getCapital() {
		return capital;
	}
	
	public int getApuesta() {
		return apuesta;
	}
	public String getNombre() {
		return nombre;
	}
	
	
	

}//FIN CLASE DADO
