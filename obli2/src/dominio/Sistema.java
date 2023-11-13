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
        this.evaluadores = new ArrayList<Evaluador>();
        this.entrevistas = new ArrayList<Entrevista>();
        this.puestos = new ArrayList<Puesto>();

    }

    public ArrayList<Tematica> agregarTematica(Tematica tematica) {
        tematicas.add(tematica);
        return tematicas;
    }

    public ArrayList<Tematica> obtenerTematicas() {
        return tematicas;
    }

    public ArrayList<Postulante> obtenerPostulantes() {
        return postulantes;
    }

    public ArrayList<Postulante> agregarPostulante(Postulante postulante) {
        postulantes.add(postulante);
        return postulantes;
    }

    public ArrayList<Evaluador> agregarEvaluador(Evaluador evaluador) {
        evaluadores.add(evaluador);
        return evaluadores;
    }

    public void agregarPuesto(Puesto puesto) {
        puestos.add(puesto);
    }

    public ArrayList<String> obtenerNombresTematicas() {
        ArrayList<String> nombres = new ArrayList<>();
        for (Tematica elemento : tematicas) {
            String nombre = elemento.getNombre();
            nombres.add(nombre);
        }
        return nombres;
    }

    public Boolean nombreEsUnico(String nombre) {
        Boolean repetido = false;
        for (int i = 0; i < tematicas.size() && !repetido; i++) {
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

    public Boolean cedulaEsUnica(int ced) {
        Boolean repetida = false;
        for (int i = 0; i < postulantes.size() && !repetida; i++) {
            Postulante post = postulantes.get(i);
            repetida = post.getCedula() == ced;
        }
        for (int i = 0; i < evaluadores.size() && !repetida; i++) {
            Evaluador ev = evaluadores.get(i);
            repetida = ev.getCedula() == ced;
        }
        return !repetida;
    }

    public ArrayList<Evaluador> obtenerEvaluadores() {
        return evaluadores;
    }

    public Boolean PuestoEsUnico(String nomb) {
        Boolean repetido = false;
        for (int i = 0; i < puestos.size() && !repetido; i++) {
            Puesto puesto = puestos.get(i);
            repetido = puesto.getNombre().equals(nomb);
        }
        return !repetido;
    }

    public Tematica devolverTematicaNombre(String nombre) {
        Tematica tem = new Tematica("default", "default");
        boolean hallada = false;
        for (int i = 0; i < tematicas.size() && !hallada; i++) {
            if (tematicas.get(i).getNombre().equals(nombre)) {
                tem = tematicas.get(i);
                hallada = true;
            }
        }
        return tem;
    }

    public void eliminarPostulante(Postulante post) {
        postulantes.remove(post);
    }
}
