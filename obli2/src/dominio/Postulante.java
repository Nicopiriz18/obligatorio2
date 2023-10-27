package dominio;

public class Postulante {

    private String Nombre;
    private int Cedula;
    private String direccion;
    private int Telefono;
    private String Maile;
    private String linkedin;
    private String formato;

    public Postulante(String Nombre, int Cedula, String direccion, int Telefono, String Maile, String linkedin, String formato) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.direccion = direccion;
        this.Telefono = Telefono;
        this.Maile = Maile;
        this.linkedin = linkedin;
        this.formato = formato;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getMaile() {
        return Maile;
    }

    public void setMaile(String Maile) {
        this.Maile = Maile;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
