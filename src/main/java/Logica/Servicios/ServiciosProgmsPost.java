package Logica.Servicios;

import Logica.Entidades.Asignatura;
import Logica.Entidades.Clase;
import Logica.Entidades.Recurso;
import Logica.Entidades.RecursoConcedido;
import Logica.Entidades.Profesor;
import Logica.Entidades.Comite;
import Logica.Entidades.Materia;
import Logica.Entidades.Programa;
import Logica.Entidades.Reunion;
import java.util.List;

/**
 *
 * @author Esteban
 * @author Alejandro Anzola <alejandro.anzola@mail.escuelaing.edu.co>
 */
public interface ServiciosProgmsPost {
    
    /**
     * @obj consultar los recursos concedidos a clases para un periodo academico
     * @pre el semestre debe ser 1 o 2 unicamente
     * @param anio el anio donde se realiza el programa
     * @param semestre el anio donde se realiza el programa (1 o 2)
     * @return el listado de recursos prestados para el programa en determinado periodo academico
     */
    public abstract List<RecursoConcedido> consultarRecursosConcedidos(int anio, int semestre) throws ExcepcionServiciosProgmsPost;
    
    /**
     * @obj registrar una clase para un programa
     * @param c la clase a registrar
     * @throws ExcepcionServiciosProgmsPost si la clase ya existe
     */
    public abstract void registrarClase(Clase c) throws ExcepcionServiciosProgmsPost;
    
    /**
     * @obj registrar un recurso para un programa
     * @param rec el recurso a registrar
     * @throws ExcepcionServiciosProgmsPost si el recurso ya existe
     */
    public abstract void registrarRecurso(Recurso rec) throws ExcepcionServiciosProgmsPost;
    
    /**
     * @obj registrar el prestamo de un recurso a una clase
     * @param clase el identificador de la clase
     * @param rec el recurso a conceder a la clase
     * @pos el recurso ahora tiene una cantidad menos disponible y esta asociado a la clase
     * @throws ExcepcionServiciosProgmsPost si no existe la clase o 
     * el recurso no esta disponible para esa clase (horario y fecha)
     */
    public abstract void registrarPrestamoClase(int clase, Recurso rec) throws ExcepcionServiciosProgmsPost;
    
    /**
     * @obj consulta los programas que estan en un periodo de tiempo
     * @pre el semestre es 1 o 2 unicamente
     * @param anio donde se realiza los programas
     * @param semestre donde se realizan los programas
     * @return lista de los programas presentes en el periodo especificado
     * @throws ExcepcionServiciosProgmsPost falla en persistencia
     */
    public abstract List<Programa> consultarProgramas(int anio, int semestre) throws ExcepcionServiciosProgmsPost;
}
