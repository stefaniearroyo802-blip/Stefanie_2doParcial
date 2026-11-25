import java.sql.*;

public class ProcesosBD extends ConexionBD {
    protected PreparedStatement pstm = null;
    protected String sql = "";

    // Ahora el método recibe un objeto Alumno con los datos a guardar
    public void insertarRegistro(Alumno alumno) throws Exception {
        // Asegúrate de que los nombres de las columnas ('Paterno', 'Materno', etc.) 
        // coincidan exactamente con los que creaste en tu base de datos de MySQL Workbench.
        sql = "INSERT INTO alumno (Cuenta, Paterno, Materno, Nombre, Licenciatura, Direccion, Telefono, Semestre) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            conn = optenerConexion();
            if (conn != null) {
                pstm = conn.prepareStatement(sql);
                
                // Mapeamos los datos del objeto Alumno a los signos '?' de la consulta
                pstm.setInt(1, alumno.getCuenta());
                pstm.setString(2, alumno.getAPaterno());
                pstm.setString(3, alumno.getAMaterno());
                pstm.setString(4, alumno.getNombre());
                pstm.setString(5, alumno.getLicenciatua());
                pstm.setString(6, alumno.getDireccion());
                pstm.setString(7, alumno.getTelefono());
                pstm.setInt(8, alumno.getSemestre());

                // Ejecutamos la inserción en la base de datos
                pstm.executeUpdate();
                System.out.println("¡Registro insertado correctamente en MySQL Workbench!");
            }
        } catch (SQLException sqle) {
            System.out.println("Error al insertar los datos:");
            sqle.printStackTrace();
        } finally {
            // Cerramos los recursos de forma segura
            if (pstm != null) pstm.close();
            if (conn != null) conn.close();
        }
    }
}