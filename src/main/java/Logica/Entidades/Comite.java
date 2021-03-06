package Logica.Entidades;

import java.util.List;

/**
 *
 * @author Alejandro Anzola <alejandro.anzola@mail.escuelaing.edu.co>
 */
public class Comite {
    private int id;
    private String nombre;
    private List<Profesor> profesores;
    private List<Reunion> reuniones;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the profesores
     */
    public List<Profesor> getProfesores() {
        return profesores;
    }

    /**
     * @param profesores the profesores to set
     */
    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    /**
     * @return the reuniones
     */
    public List<Reunion> getReuniones() {
        return reuniones;
    }

    /**
     * @param reuniones the reuniones to set
     */
    public void setReuniones(List<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    @Override
    public String toString() {
        return "Comite{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}
