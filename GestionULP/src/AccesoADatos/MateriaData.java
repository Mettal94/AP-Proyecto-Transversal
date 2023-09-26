package AccesoADatos;

import Entidades.Materia;
import static Vistas.mainMenu.mensaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con = null;
    
    public MateriaData() {

        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre,año,estado) VALUES(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                mensaje("Materia añadida con éxito");
            }
            ps.close();

        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla materia " + ex.getMessage());
        }
    }

    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT idMateria,nombre,año FROM materia WHERE idMateria = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt(1));
                materia.setNombre(rs.getString(2));
                materia.setAnio(rs.getInt(3));
                materia.setEstado(true);
            } else {
                mensaje("No existe la materia");
            }
            ps.close();
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla materia " + ex.getMessage());
        }
        return materia;
    }

    public List<Materia> listarMaterias(int estado) {
        List<Materia> materias = new ArrayList<>();

        try {
            String sql = "SELECT * FROM materia WHERE estado = ?";
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, estado);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(rs.getInt("estado")== 1);
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla materia " + ex.getMessage());
        }
        return materias;
    }

    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre=?,año=? WHERE idMateria = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                mensaje("Materia modificada exitosamente.");
            } else {
                mensaje("La materia no existe.");
            }
            
            ps.close();
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla materia " + ex.getMessage());
        }
    }

    public void eliminarMateria(int id) {
        try {
            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                mensaje("Se eliminó la materia.");
            } else {
                mensaje("La materia no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla materia " + ex.getMessage());
        }
    }
    
    public void reactivarMateria(int id){
        try {
            String sql = "UPDATE materia SET estado = 1 WHERE idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                mensaje("Se reactivó la materia.");
            } else {
                mensaje("La materia no existe.");
            }
            ps.close();
        } catch (SQLException ex) {
            mensaje("Error al acceder a la tabla materia " + ex.getMessage());
        }
    }
}
