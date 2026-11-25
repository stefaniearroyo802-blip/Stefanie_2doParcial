// PreparedStatements usados por la aplicacion de libreta de direcciones
package addressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultasPersona {
    private static final String URL = "jdbc:mysql://localhost/AddressBook?&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "nbuser";
    private Connection conexion;
    private PreparedStatement seleccionaTodasLasPersonas;
    private PreparedStatement seleccionaPersonasPorApellido;
    private PreparedStatement insertaNuevaPersona;

    // constructor
    public ConsultasPersona() {
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);

            // crea consulta que selecciona todas las entradas en la libreta de direcciones
            seleccionaTodasLasPersonas = conexion.prepareStatement("SELECT * FROM Contactos");

            // crea consulta que selecciona entradas con apellido específico
            seleccionaPersonasPorApellido = conexion.prepareStatement(
                "SELECT * FROM Contactos WHERE apellidos = ?");

            // crea instruccion de inserción que agrega una nueva entrada dentro de la base de datos
            insertaNuevaPersona = conexion.prepareStatement(
                "INSERT INTO Contactos " +
                "(nombre, apellidos, email, telefono) " +
                "VALUES (?, ?, ?, ?)");
        } catch (SQLException sqlExcep) {
            sqlExcep.printStackTrace();
            System.exit(1);
        }
    }

    // selecciona todos los contactos en la base de datos.
    public List<Persona> obtenerTodasLasPersonas() {
        List<Persona> resultados = null;
        ResultSet conjuntoResultados = null;

        try {
            // executeQuery que devuelve un ResultSet que contiene las entradas encontradas
            conjuntoResultados = seleccionaTodasLasPersonas.executeQuery();
            resultados = new ArrayList<Persona>();

            while (conjuntoResultados.next()) {
                resultados.add(new Persona(
                    conjuntoResultados.getInt("idContacto"),
                    conjuntoResultados.getString("nombre"),
                    conjuntoResultados.getString("apellidos"),
                    conjuntoResultados.getString("email"),
                    conjuntoResultados.getString("telefono")));
            }
        } catch (SQLException sqlExcep) {
            sqlExcep.printStackTrace();
        } finally {
            try {
                conjuntoResultados.close();
            } catch (SQLException sqlExcep) {
                sqlExcep.printStackTrace();
                cerrar();
            }
        }
        return resultados;
    }

    // selecciona personas por apellido
    public List<Persona> obtenerPersonasPorApellido(String apellido) {
        List<Persona> resultados = null;
        ResultSet conjuntoResultados = null;

        try {
            seleccionaPersonasPorApellido.setString(1, apellido); // especificar apellido

            // executeQuery devuelve ResultSet que contiene las entradas coincidentes
            conjuntoResultados = seleccionaPersonasPorApellido.executeQuery();
            resultados = new ArrayList<Persona>();

            while (conjuntoResultados.next()) {
                resultados.add(new Persona(
                    conjuntoResultados.getInt("idContacto"),
                    conjuntoResultados.getString("nombre"),
                    conjuntoResultados.getString("apellidos"),
                    conjuntoResultados.getString("email"),
                    conjuntoResultados.getString("telefono")));
            }
        } catch (SQLException sqlExcep) {
            sqlExcep.printStackTrace();
        } finally {
            try {
                conjuntoResultados.close();
            } catch (SQLException sqlExcep) {
                sqlExcep.printStackTrace();
                cerrar();
            }
        }
        return resultados;
    }

    // agregar una entrada
    public int agregarPersona(String nomb, String apell, String email, String tel) {
        int resultado = 0;

        // definir parámetros que ejecuten insertaNuevaPersona
        try {
            insertaNuevaPersona.setString(1, nomb);
            insertaNuevaPersona.setString(2, apell);
            insertaNuevaPersona.setString(3, email);
            insertaNuevaPersona.setString(4, tel);

            // insertar la nueva entrada; devuelve el número de filas actualizadas
            resultado = insertaNuevaPersona.executeUpdate();
        } catch (SQLException sqlExcep) {
            sqlExcep.printStackTrace();
            cerrar();
        }
        return resultado;
    }

    // cierra la conexión a la base de datos.
    public void cerrar() {
        try {
            conexion.close();
        } catch (SQLException sqlExcep) {
            sqlExcep.printStackTrace();
        }
    }
} // fin de la clase ConsultasPersona