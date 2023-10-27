package dominio;

import java.util.*;

public class Sistema {
    ArrayList<Tematica> tematicas = new ArrayList<>();
    ArrayList<Tematica> postulantes = new ArrayList<>();
    
    public ArrayList<Tematica> agregarTematica(Tematica tematica){
        tematicas.add(tematica);
        return tematicas;
    }
    public ArrayList<Tematica> obtenerTematicas() {
        return tematicas;
    }
}
