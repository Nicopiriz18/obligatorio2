/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author manue
 */
public class Puesto implements Serializable{
    //nombre del puesto tiene que ser unico
    private String nombre;
    private String formato;
    private ArrayList<Tematica> temas;

    public Puesto(String nombre, String formato, ArrayList<Tematica> temas) {
        this.nombre = nombre;
        this.formato = formato;
        this.temas = temas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Tematica> getTemas() {
        return temas;
    }

    public String getFormato() {
        return formato;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
