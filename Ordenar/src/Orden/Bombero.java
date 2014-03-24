package Orden;


public class Bombero extends Persona{
	private String sexo;
	private String casco;
	private int fuerza;

public Bombero (){}
public Bombero (String nombre, String dni, String apellido, int edad, double peso, String sexo, String casco, int fuerza){
	this.sexo= sexo;
	this.casco= casco;
	this.fuerza= fuerza;
}
@Override
public String toString() {
	return "Bombero:" + sexo + ", casco:" + casco + ", fuerza=" + fuerza
			+ ", getNombre()=" + getNombre() + ", getDni()=" + getDni() + ".";
}




}
