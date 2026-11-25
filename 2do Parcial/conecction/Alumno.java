//clase pojo para crear un onteo de tipo alumno que perita representar la bd y acceder

public class Alumno {

    protected int cuenta;
    protected String aPaterno;
    protected String aMaterno;
    protected String nombre;
    protected String licenciatura;
    protected String direccion;
    protected String telefeno;
    protected int semestre;

    public int getCuenta(){
        return cuenta;
    }

    public void setCuenta(int cuenta){
        this.cuenta = cuenta;
    }

    public String getAPaterno(){
        return aPaterno;
    }

    public void setAPaterno(String aPaterno){
        this.aPaterno = aPaterno;
    }

    public String getAMaterno(){
        return aMaterno;
    }

    public void setAMaterno(String aMaterno){
        this.aMaterno = aMaterno;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getLicenciatua(){
        return licenciatura;
    }

    public void setLicencitura(String licenciatura){
        this.licenciatura = licenciatura;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getTelefono(){
        return telefeno;
    }

    public void setTelefono(String telefono){
        this.telefeno = telefono;
    }

       public int getSemestre(){
        return semestre;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }

}