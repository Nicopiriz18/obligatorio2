package dominio;
import java.util.*;
public class Postulante {

    private String Nombre;
    private int Cedula;
    private String direccion;
    private int Telefono;
    private String Mail;
    private String linkedin;
    private String formato;
    private HashMap<String, Integer> experiencia;

    public Postulante(String Nombre, int Cedula, String direccion, int Telefono, String Mail, String linkedin, String formato, HashMap<String, Integer> experiencia) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.direccion = direccion;
        this.Telefono = Telefono;
        this.Mail = Mail;
        this.linkedin = linkedin;
        this.formato = formato;
        this.experiencia = experiencia;
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

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
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

    public HashMap<String, Integer> getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(HashMap<String, Integer> experiencia) {
        this.experiencia = experiencia;
    }
    
}
