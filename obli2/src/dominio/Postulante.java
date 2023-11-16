package dominio;
import java.io.Serializable;
import java.util.*;

public class Postulante extends Persona implements Serializable{

    private String Telefono;
    private String Mail;
    private String linkedin;
    private String formato;
    private HashMap<Tematica, Integer> experiencia;

    public Postulante(String nombre, int cedula, String direccion, String Telefono, String Mail, String linkedin, String formato) {

        super(nombre, cedula, direccion);

        this.Telefono = Telefono;
        this.Mail = Mail;
        this.linkedin = linkedin;
        this.formato = formato;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
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

    public HashMap<Tematica, Integer> getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(HashMap<Tematica, Integer> experiencia) {
        this.experiencia = experiencia;
    }
    public void agregarExperiencia(Tematica tem, int numero){
        experiencia.put(tem, numero);
    }
    @Override
    public String toString(){
        return this.getNombre();
    }
    
}
