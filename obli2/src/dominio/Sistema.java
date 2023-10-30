package dominio;

import java.util.*;
import dominio.*;

public class Sistema {
    private ArrayList<Tematica> tematicas;
    private ArrayList<Postulante> postulantes;
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Entrevista> entrevistas;
    private ArrayList<Puesto> puestos;

    public Sistema() {
        this.tematicas = new ArrayList<Tematica>();
        this.postulantes = new ArrayList<Postulante>();
    }
    public ArrayList<Tematica> agregarTematica(Tematica tematica){
        tematicas.add(tematica);
        return tematicas;
    }
    public ArrayList<Tematica> obtenerTematicas() {
        return tematicas;
    }
    public ArrayList<Postulante> obtenerPostulantes(){
        return postulantes;
    }
    public ArrayList<Postulante> agregarPostulante(Postulante postulante){
        postulantes.add(postulante);
        return postulantes;
    }
    public ArrayList<String> obtenerNombresTematicas(){
        ArrayList<String> nombres = new ArrayList<>();
        for (Tematica elemento : tematicas){
            String nombre = elemento.getNombre();
            nombres.add(nombre);
        }   
        return nombres;
    }
    public Boolean nombreEsUnico(String nombre){
        Boolean repetido = false;
        for(int i=0; i<tematicas.size() && !repetido; i++){
            Tematica tematica = tematicas.get(i);
            repetido = tematica.getNombre() == nombre;
        }
        return repetido;
    }
    public ArrayList<Entrevista> obtenerEntrevistasPorPersona(Persona unPost) {
        ArrayList<Entrevista> entrevistasPorPersona = new ArrayList<>();
        
        for (Entrevista entrevista : entrevistas) {
            if (entrevista.getEntrevistado().equals(unPost)) {
                entrevistasPorPersona.add(entrevista);
            }
        }
        return entrevistasPorPersona;
    }
}