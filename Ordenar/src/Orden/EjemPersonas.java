package Orden;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EjemPersonas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona p = new Persona("Juanito", "76532-A", "Avellaneda", 32, 89);
		Persona pe = new Persona("Pepito", "52345-C", "Garcia", 56, 98.5);
		Persona per = new Persona("Agapito", "12984-B", "Garnika", 33, 105.5);	
		Persona pers = new Persona("Zacarías", "89984-Z", "Albiol", 13, 40.5);

		ArrayList<Persona> al = new ArrayList<Persona>();
		al.add(p);
		al.add(pe);
		al.add(per);
		al.add(pers);
		
//		/Como viene/
		imprimeArrayL(al);
		System.out.println("\n");
		
//		Por el método de ordenación de la clase
		Collections.sort(al);
		imprimeArrayL(al);
		System.out.println("\n");
		
//		Por ordenación por dni
		Collections.sort(al, new porDni());
		imprimeArrayL(al);
		System.out.println("\n");
		
//		Por ordenación de la letra del dni desde la z (damos la vuelta a los signos)
		Collections.sort(al, new porUltiDni());
		imprimeArrayL(al);
		System.out.println("\n");
		
//		Por ordenación del apellido
		Collections.sort(al, new porApellido());
		imprimeArrayL(al);
		System.out.println("\n");
		
//		Por ordenación de la edad
		Collections.sort(al, new porEdad());
		imprimeArrayL(al);
		System.out.println("\n");
		
//		Por ordenación del peso
		Collections.sort(al, new porPeso ());
		imprimeArrayL(al);
		System.out.println("\n");
		
	}
	public static void imprimeArrayL(ArrayList<Persona> al){
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
	}
}

class porDni implements Comparator<Persona>{
@Override
public int compare(Persona una, Persona dos) {
	// TODO Auto-generated method stub
	return una.getDni().compareTo(dos.getDni());
}
}


class porUltiDni implements Comparator<Persona>{
@Override
public int compare(Persona una, Persona dos){
	return -una.getDni().charAt(6) + dos.getDni().charAt(6);
}
}

class porApellido implements Comparator<Persona>{
@Override
public int compare(Persona una, Persona dos){
	return una.getApellido().compareTo(dos.getApellido());
}
}

class porEdad implements Comparator<Persona>{
@Override
public int compare(Persona una, Persona dos){
	return una.getEdad() - dos.getEdad();
}
}

class porPeso implements Comparator<Persona>{
	@Override
	public int compare(Persona una, Persona dos){
		
		return (int) (una.getPeso() - dos.getPeso());
	}
}

