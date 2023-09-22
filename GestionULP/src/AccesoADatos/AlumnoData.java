package AccesoADatos;

import Entidades.Alumno;
import static Vistas.mainMenu.mensaje;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class AlumnoData {

    private Connection con = null;
    
    public AlumnoData(){
        
        con = Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        
        String sql = "INSERT INTO alumno (dni,apellido,nombre,fechaNacimiento,estado) VALUES (?,?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                
                mensaje("Alumno añadido con éxito");
            }
            ps.close();
            
        }catch(SQLException ex){
            mensaje("Error al acceder a la tabla alumno "+ex.getMessage());
        }
    }
    
    public Alumno buscarAlumno(int id){
        Alumno alumno = null;
        String sql = "SELECT dni,apellido,nombre,fechaNacimiento FROM alumno WHERE idAlumno=? AND estado = 1";
        
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
            }else{
                mensaje("No existe el alumno");
            }
             ps.close();
        }catch(SQLException ex){
            mensaje("Error al acceder a la tabla alumno "+ex.getMessage());
        }
        return alumno;
    }
    
    public Alumno buscarAlumnoPorDni(int dni,int estado){
        Alumno alumno = null;
        String sql = "SELECT idAlumno,dni,apellido,nombre,fechaNacimiento FROM alumno WHERE dni=? AND estado=?";
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, dni);
            ps.setInt(2, estado);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt(1));
                alumno.setDni(rs.getInt(2));
                alumno.setApellido(rs.getString(3));
                alumno.setNombre(rs.getString(4));
                alumno.setFechaNacimiento(rs.getDate(5).toLocalDate());
                if(estado==1){
                    alumno.setEstado(true);
                }else{
                    alumno.setEstado(false);
                }
            }else{
                mensaje("No existe el alumno");
                }
            ps.close();
        }catch(SQLException ex){
             mensaje("Error al acceder a la tabla alumno "+ex.getMessage());
        }
        return alumno;
    }
    
    
    
    public List <Alumno> listarAlumno(int estado){
        List <Alumno> alumnos = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM alumno WHERE estado = ?";
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, estado);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt(1));
                alumno.setDni(rs.getInt(2));
                alumno.setApellido(rs.getString(3));
                alumno.setNombre(rs.getString(4));
                alumno.setFechaNacimiento(rs.getDate(5).toLocalDate());
                if(estado ==1){
                    alumno.setEstado(true);
                }else{
                    alumno.setEstado(false);
                }
                
                alumnos.add(alumno);
            }
            ps.close();
        }catch(SQLException ex){
              mensaje("Error al acceder a la tabla alumno "+ex.getMessage());
        }
        return alumnos;
    }
    
    public void modificarAlumno(Alumno alumno){
        String sql =  "UPDATE alumno SET dni=?, apellido=?,nombre=?,fechaNacimiento=? WHERE idAlumno = ?";
        PreparedStatement ps = null;
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                mensaje("Alumno modificado exitosamente.");
            } else {
                mensaje("El alumno no existe.");
            }
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla alumno " + ex.getMessage());
        }
    }
    
    public void eliminarAlumno(int id){
        try{
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                mensaje("Se eliminó el alumno");
            }else{
                 mensaje("El alumno no existe.");
            }
            ps.close();
        }catch(SQLException ex){
               mensaje("Error al acceder a la tabla alumno "+ex.getMessage());
        }
    }
    
    public void reactivarAlumno(int id){
        try{
            String sql = "UPDATE alumno SET estado = 1 WHERE idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                mensaje("Reinscripción exitosa");
            }else{
                 mensaje("El alumno no existe");
            }
            ps.close();
        }catch(SQLException ex){
               mensaje("Error al acceder a la tabla alumno "+ex.getMessage());
        }
    }
}
