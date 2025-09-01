
import java.util.HashSet;

/**
 *
 * @autor Benegas Gonzalez Cristian Rene
 */
public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    public boolean agregarMateria(Materia materia) {
        return materias.add(materia); // solo si agrega una materia devuelve true, caso contrario false (materia ya está en la lista)
    }

    public int cantidadMateria() {
        return materias.size(); // que devuelve la cantidad de materias a las que está inscripto el alumno.
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

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre + " [Legajo: " + legajo + "]";
    }

}
