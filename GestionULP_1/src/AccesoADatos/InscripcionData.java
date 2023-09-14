package AccesoADatos;

import Entidades.Inscripcion;
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
    
    public InscripcionData(){
        
        con = Conexion.getConexion();
       
    }
    
    public void guardarInscripcion(Inscripcion insc){
        
        String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES (?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getIdAlumno().getIdAlumno());
            ps.setInt(3, insc.getIdMateria().getIdMateria());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                JOptionPane.showMessageDialog(null, "Inscripción exitosa");
            }
            ps.close();
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion "+ex.getMessage());
        }
    }
    
    public List<Inscripcion>obtenerInscripciones(){
        List<Inscripcion>inscripciones = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM inscripcion";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                insc.setNota(rs.getDouble("nota"));
                // insc.setIdAlumno(rs.get FALTA SABER QUE MIERDA HACER ACA
                //insc.setIdMateria();
                
                inscripciones.add(insc);
            }
            ps.close();
          }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion "+ex.getMessage());
        }
        return inscripciones;
    }
    
    public List<Inscripcion>obtenerInscripcionesPorAlumno(){
         List<Inscripcion>inscripcionesPA = new ArrayList<>();
         try{
           String sql = "SELECT * FROM inscripcion";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            //HAY QUE ACOMODAR BIEN TODO ESTO 
          ps.close();
          }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion "+ex.getMessage());
        }
          return inscripcionesPA; 
    }
   
}
