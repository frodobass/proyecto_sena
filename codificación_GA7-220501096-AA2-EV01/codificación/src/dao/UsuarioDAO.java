package dao;

import conexion.ConexionBD;
import modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    Connection conexion;

    public UsuarioDAO() {
        conexion = ConexionBD.conectar();
    }

    // INSERTAR
    public void insertarUsuario(Usuario usuario) {

        String sql =
                "INSERT INTO usuarios(nombre, correo, telefono) VALUES(?,?,?)";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreo());
            ps.setString(3, usuario.getTelefono());

            ps.executeUpdate();

            System.out.println("Usuario registrado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }

    // CONSULTAR
    public void consultarUsuarios() {

        String sql = "SELECT * FROM usuarios";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " - " +
                        rs.getString("nombre") + " - " +
                        rs.getString("correo") + " - " +
                        rs.getString("telefono")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error en consulta: " + e.getMessage());
        }
    }

    // ACTUALIZAR
    public void actualizarUsuario(int id, String nombre) {

        String sql =
                "UPDATE usuarios SET nombre=? WHERE id=?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Usuario actualizado");

        } catch (SQLException e) {
            System.out.println("Error al actualizar");
        }
    }

    // ELIMINAR
    public void eliminarUsuario(int id) {

        String sql = "DELETE FROM usuarios WHERE id=?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Usuario eliminado");

        } catch (SQLException e) {
            System.out.println("Error al eliminar");
        }
    }
}