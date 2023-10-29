package dominio;

import java.util.*;
import dominio.*;

public class Sistema {
    private ArrayList<Tematica> tematicas;
    private ArrayList<Postulante> postulantes;
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Entrevista> entrevistas;
    private ArrayList<Puesto> puestos;
    
    public ArrayList<Tematica> agregarTematica(Tematica tematica){
        tematicas.add(tematica);
        return tematicas;
    }
    public ArrayList<Tematica> obtenerTematicas() {
        return tematicas;
    }
    public ArrayList<String> obtenerNombresTematicas(){
        ArrayList<String> nombres = new ArrayList<>();
        for (Tematica elemento : tematicas){
            String nombre = elemento.getNombre();
            nombres.add(nombre);
        }   
        return nombres;
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
