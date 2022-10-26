/*
 * Programa de testeo conexión base de datos MySQL
 */
package com.ceep.introjdbc;

import datos.PersonaDao;
import dominio.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SantiagoMrv
 */
public class TestMysql {
    
    public static void main(String[] args) {
        
        PersonaDao personaDao = new PersonaDao();
        
        Persona persona1 = new Persona("Roman","Lopez","rlopez@gmail.com","383992992");
        Persona persona2 = new Persona("Juan","Lopez","jlopez@gmail.com","123992992");
        
        personaDao.insertar(persona1);
        
        try {
            List<Persona> personas = personaDao.seleccionar();
            personas.forEach(persona -> {
                    System.out.println("persona = " + persona);
            }
            );
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
}
