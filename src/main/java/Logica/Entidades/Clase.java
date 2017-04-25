package Logica.Entidades;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Esteban
 */
public class Clase implements Serializable{
    private int id;
    private Date fecha;
    private Time hora_inicio;
    private Time hora_fin;
    private List<RecursoConcedido> recursos;
    private Materia materia;

    public Clase() {
        
    }
    
    public Clase(int id, Date fecha, Time hora_inicio, Time hora_fin) {
        this.id = id;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.recursos = new ArrayList<>();
    }

    public Clase(int id, Date fecha, Time hora_inicio, Time hora_fin, ArrayList<RecursoConcedido> recursos) {
        this.id = id;
        this.fecha = fecha;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.recursos = recursos;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(Time hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public Time getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(Time hora_fin) {
        this.hora_fin = hora_fin;
    }

    public List<RecursoConcedido> getRecursos() {
        return recursos;
    }

    /*public void setRecursos(List<RecursoConcedido> recursos) {
        this.recursos = recursos;
    }*/
    
    public void setRecursos(RecursoConcedido recurso) {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
    
    @Override
    public String toString() {
        return "Clase{" + "id=" + id + ", fecha=" + fecha + ", hora_inicio=" + hora_inicio+ ", hora_fin=" + hora_fin + ", recursos=" + recursos +"}\n";
    }

    /**
     * @return the materia
     */
    public Materia getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
