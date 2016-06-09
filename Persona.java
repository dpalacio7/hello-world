package unidad7;

import java.util.*;
/**
 * Crea una clase llamada Persona con las siguientes características. Define los atributos de forma que sólo sean accesibles desde la propia clase y 
los métodos para que puedan ser accedidos desde cualquier clase.
       a).- Atributos:
            - dni de tipo String
            - nombre de tipo String
            - direccion de tipo String 
       b).- Métodos:
            - Un método constructor que inicialice los atributos dni, nombre y dirección con los valor que reciba el constructor.
            - Un método get por cada atributo que retorne su valor.
            - Un método set por cada atributo que les asigne un valor.
            - Un método equals que sobrescribe el método equals de la clase Object. Suponemos que dos personas son iguales cuando tienen el mismo dni.
            - Un método toString que sobrescribe el método toString de la clase Object.
            - Un método compareTo que implementa el método compareTo de la interface Comparable.
            - Un método muestraPersona que retorna un String con los atributos de la persona.
            - Un método verDatosPersona que visualice los datos de la persona.                         
 * @author Profesor
 * @version 20/05/2016
 */
public class Persona implements Comparable<Persona>  {
    private String dni;
    private String nombre;
    private String direccion;
    
    public Persona(String dni, String nombre, String direccion) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public String muestraPersona() {
        return this.toString();
    }
	
	public void verDatosPersona() {
		System.out.println(muestraPersona());
	}
	@Override
	public int compareTo(Persona p) {
		return this.dni.compareTo(p.dni);
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
    
}
