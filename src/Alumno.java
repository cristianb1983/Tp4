
import java.util.HashSet;

/**
 *
 * @autor Benegas Gonzalez Cristian Rene
 */
public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materiasInscriptas;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materiasInscriptas = new HashSet<>();
    }

    public boolean agregarMateria(Materia materia) {
        return materiasInscriptas.add(materia); // solo si agrega una materia devuelve true, caso contrario false (la materia ya está en la lista)
    }

    public int cantidadMaterias() {
        return materiasInscriptas.size(); // que devuelve la cantidad de materiasInscriptas a las que está inscripto el alumno.
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
        
    @Override
    public String toString() {
        return apellido + ", " + nombre + " [Legajo: " + legajo + "]";
    }

}
