package principal;

import dao.UsuarioDAO;
import modelo.Usuario;

public class Main {

    public static void main(String[] args) {

        UsuarioDAO dao = new UsuarioDAO();

        // INSERTAR
        Usuario usuario1 =
                new Usuario(
                        "Carlos Perez",
                        "carlos@gmail.com",
                        "3001234567"
                );

        dao.insertarUsuario(usuario1);

        // CONSULTAR
        dao.consultarUsuarios();

        // ACTUALIZAR
        dao.actualizarUsuario(1, "Carlos Actualizado");

        // ELIMINAR
        dao.eliminarUsuario(2);
    }
}
