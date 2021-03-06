package Logica.Dao.MyBatis;

import Logica.Dao.MyBatis.Mappers.ProgramaMapper;
import Logica.Dao.PersistenceException;
import Logica.Dao.ProgramaDAO;
import Logica.Entidades.Programa;
import com.google.inject.Inject;
import java.util.List;

/**
 *
 * @author Alejandro Anzola <alejandro.anzola@mail.escuelaing.edu.co>
 * @author Fabian Ardila
 */
public class MyBatisProgramaDAO implements ProgramaDAO{

    @Inject
    private ProgramaMapper programaMapper;
    
    @Override
    public void save(Programa programa) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); // TODO implementar
    }

    @Override
    public List<Programa> loadProgramas(int anio, int semestre) throws PersistenceException {
        try {
            return programaMapper.consultarProgramas((anio*10)+semestre);
        } catch (org.apache.ibatis.exceptions.PersistenceException e) {
            throw new PersistenceException("Error al consultar los programas en el periodo "+((anio*10)+semestre));
        }
    }

    @Override
    public Programa loadProgram(int id_program,int periodo) throws PersistenceException {
        try {
            return programaMapper.cosultarProgramaPorPeriodo(id_program, periodo);
        } catch (org.apache.ibatis.exceptions.PersistenceException e) {
            throw new PersistenceException("Error al consultar el programa con id: "+id_program+" en el periodo: "+periodo);
        }
    }
    
}
