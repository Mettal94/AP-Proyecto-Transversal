package AccesoADatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import static Vistas.mainMenu.mensaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class InscripcionData {

    private Connection con = null;
    private MateriaData matData = null;
    private AlumnoData aluData = null;

    public InscripcionData() {

        con = Conexion.getConexion();
        matData = new MateriaData();
        aluData = new AlumnoData();

    }

    public void guardarInscripcion(Inscripcion insc) {

        String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getIdAlumno().getIdAlumno());
            ps.setInt(3, insc.getIdMateria().getIdMateria());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripción exitosa");
            }
            ps.close();
        } catch (SQLException ex) {
           mensaje("Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
    }

    public List<Inscripcion> obtenerInscripciones(int id) {
        List<Inscripcion> inscripciones = new ArrayList<>();

        try {
            String sql = "SELECT idInscripto, nota, idAlumno, idMateria FROM inscripcion WHERE idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt(1));
                insc.setNota(rs.getDouble(2));
                insc.setIdAlumno(aluData.buscarAlumno(rs.getInt(3)));
                insc.setIdMateria(matData.buscarMateria(rs.getInt(4)));

                inscripciones.add(insc);
            }
            ps.close();
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        return inscripciones;
    }
    
    public List<Inscripcion> obtenerAlumnosInscriptosPorMateria(int id){
        List<Inscripcion> listaInscriptos = new ArrayList<>();
        
        try{
            String sql = "SELECT idAlumno,idMateria,nota FROM inscripcion WHERE idMateria = ?;";
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Inscripcion insc = new Inscripcion();
                insc.setIdAlumno(aluData.buscarAlumno(rs.getInt(1)));
                insc.setIdMateria(matData.buscarMateria(rs.getInt(2)));
                insc.setNota(rs.getDouble(3));
                
                listaInscriptos.add(insc);
            }
            ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la tabla de inscripción "+ex.getMessage());
        }
        return listaInscriptos;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> IPA = new ArrayList<>();
        try {
            String sql = "SELECT materia.idMateria, materia.nombre,materia.año FROM materia"
                    + " JOIN inscripcion ON(materia.idMateria=inscripcion.idMateria) JOIN alumno ON (alumno.idAlumno = inscripcion.idAlumno)"
                    + " WHERE alumno.idAlumno=? AND materia.estado=1;";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt(1));
                materia.setNombre(rs.getString(2));
                materia.setAnio(rs.getInt(3));

                IPA.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        return IPA;
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
        List<Materia> IPNA = new ArrayList<>();
        try {
            String sql = "SELECT idMateria,nombre,año FROM materia WHERE idMateria"
                    + " NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?);";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt(1));
                materia.setNombre(rs.getString(2));
                materia.setAnio(rs.getInt(3));

                IPNA.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla inscripcion " + ex.getMessage());
        }
        return IPNA;
    }
    
    public void anularInscripcion(int idMat, int idAlu){
        try{
            String sql ="DELETE FROM inscripcion WHERE inscripcion.idAlumno = ? AND inscripcion.idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlu);
            ps.setInt(2, idMat);
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                mensaje("Inscripcion anulada exitosamente");
            } else {
                mensaje("El alumno o la materia no existen");
            }
        }catch(SQLException ex){
            mensaje("Error al acceder a la tabla inscripcion. "+ex.getMessage());
        }    
    }
}
