package dominio;

import java.util.*;
public class Tematica extends Observable {
    private String nombre;
    private String descripcion;
    
    public Tematica(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tematica{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
}
