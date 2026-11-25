// Clase Persona que representa una entrada en una libreta de direcciones
package addressbook;

public class Persona {
    private int idDireccion;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;

    // constructor
    public Persona() {
    }

    // constructor
    public Persona(int idDireccion, String nombre, String apellidos, String email, String telefono) {
        setIdDireccion(idDireccion);
        setNombre(nombre);
        setApellidos(apellidos);
        setEmail(email);
        setTelefono(telefono);
    }

    // definir métodos setter y getter para los campos
    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
} // fin de la clase Persona