/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Alumno Mañana
 */
public class UsuarioDao {

    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (usuario, "
            + "contrasenya) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET "
            + "usuario = ? "
            + "contrasenya = ?"
            + "WHERE idUsuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE idUsuario = ?";
    
}
