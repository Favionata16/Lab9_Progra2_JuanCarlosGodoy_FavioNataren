
package Lab9_Godoy_favio;

import java.util.ArrayList;


public class Alumno extends Usuario {
    private String carrera;
    private ArrayList <Clase> clases = new ArrayList();

    public Alumno(String nombre, String nombreUsuario, String pass, String id) {
        super(nombre, nombreUsuario, pass, id);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }
    
    
}
