package dominio;

import java.util.*;
import dominio.*;
import java.io.Serializable;

public class Sistema extends Observable implements Serializable {

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

    public void agregarTematica(Tematica tematica) {
        tematicas.add(tematica);
        setChanged();
        notifyObservers();

    }

    public ArrayList<Tematica> obtenerTematicas() {
        return tematicas;
    }

    public ArrayList<Postulante> obtenerPostulantes() {
        return postulantes;
    }

    public ArrayList<Puesto> obtenerPuestos() {
        return puestos;
    }

    public void agregarPostulante(Postulante postulante) {
        postulantes.add(postulante);
        setChanged();
        notifyObservers();
    }

    public void agregarEvaluador(Evaluador evaluador) {
        evaluadores.add(evaluador);
        setChanged();
        notifyObservers();
    }

    public void agregarPuesto(Puesto puesto) {
        puestos.add(puesto);
        setChanged();
        notifyObservers();
    }

    public void agregarEntrevista(Entrevista env) {
        entrevistas.add(env);
        setChanged();
        notifyObservers();
    }

    public ArrayList<String> obtenerNombresTematicas() {
        ArrayList<String> nombres = new ArrayList<>();
        for (Tematica elemento : tematicas) {
            String nombre = elemento.getNombre();
            nombres.add(nombre);
        }
        return nombres;
    }

    public ArrayList<Postulante> postulantesPorTemaNivel(Tematica[] temas, int nivel, String formato) {
        ArrayList<Postulante> aptos = new ArrayList<Postulante>();
        for (Postulante postulante : postulantes) {
            //primero me fijo si el formato buscado por el postulante coincide con el del puesto
            boolean apto = formato.toUpperCase().equals(postulante.getFormato().toUpperCase());
            //luego agarramos la experiencia del postulante estudiado
            HashMap<Tematica, Integer> expPostulante = postulante.getExperiencia();
            //si el formato coincide, entra en el for   
            for (int i = 0; i < temas.length && apto; i++) {
                //primero me fijo si el postulante tiene la habilidad dada dentro de su experiencia
                apto = expPostulante.containsKey(temas[i]);
                //luego nos fijamos si el nivel en esta habilidad es mayor al necesario
                if (apto && expPostulante.get(temas[i]) >= nivel) {
                    aptos.add(postulante);
                }
            }
        }
        return aptos;
    }

    public HashMap<Postulante, Integer> ultimasEntrevistasPostulantes(Postulante[] posts) {
        HashMap<Postulante, Integer> ret = new HashMap<Postulante, Integer>();
        for (Postulante post : posts) {
            Boolean hallado = false;
            for (int i = entrevistas.size() - 1; i >= 0 && !hallado; i--) {
                Entrevista entrevistaActual = entrevistas.get(i);
                hallado = entrevistaActual.getEntrevistado().equals(post);
                if (hallado) {
                    ret.put(post, entrevistaActual.getPuntaje());
                }
            }
        }
        return ret;
    }

    public Boolean nombreEsUnico(String nombre) {
        Boolean repetido = false;
        for (int i = 0; i < tematicas.size() && !repetido; i++) {
            Tematica tematica = tematicas.get(i);
            repetido = tematica.getNombre().toUpperCase().equals(nombre.toUpperCase());
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

    public Boolean puestoEsUnico(String nomb) {
        Boolean repetido = false;
        for (int i = 0; i < puestos.size() && !repetido; i++) {
            Puesto puesto = puestos.get(i);
            repetido = puesto.getNombre().toUpperCase().equals(nomb.toUpperCase());
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

    public int devolverIdUltimaEntrevista() {
        //si el arraylist entrevistas es vacio, se devuelve 0. Si no se devuelve uno mas que el ultimo id
        int ret = 0;
        if (!entrevistas.isEmpty()) {
            ret = entrevistas.get(entrevistas.size() - 1).getId();
        }
        return ret;
    }

    public void eliminarPostulante(Postulante post) {
        postulantes.remove(post);
        //luego se borran todas las entrevistas que tengan el entrevistado dado
        for (Entrevista entre : entrevistas) {
            if (entre.getEntrevistado().equals(post)) {
                entrevistas.remove(entre);
            }
        }
        setChanged();
        notifyObservers();
    }

    public int consultarPostulantesTematica(Tematica tem) {
        int num = 0;
        for (Postulante post : postulantes) {
            //checkeamos si el hashmap contiene la clave y si el valor de la misma es mayor que 5. De serlo, se suma uno a num
            if (post.getExperiencia().containsKey(tem) && post.getExperiencia().get(tem) > 5) {
                num++;
            }
        }
        return num;

    }

    public int consultarPuestosTematica(Tematica tem) {
        int num = 0;
        for (Puesto puesto : puestos) {
            if (puesto.getTemas().contains(tem)) {
                num++;
            }
        }
        return num;
    }

    public ArrayList<Postulante> obtenerPostulantesOrdenados() {
        ArrayList<Postulante> postulantesOrdenados = new ArrayList<>(postulantes);
        Collections.sort(postulantesOrdenados, new Comparator<Postulante>() {
            @Override
            public int compare(Postulante postu1ante1, Postulante postulante2) {
                // Comparar por número de documento
                return Integer.compare(postu1ante1.getCedula(), postulante2.getCedula());
            }
        });
        return postulantesOrdenados;
    }
    public ArrayList<Entrevista> obtenerEntrevistaPorBusqueda(Postulante postulante, String busqueda){
        ArrayList<Entrevista> entrevistasPorPostulante = obtenerEntrevistasPorPersona(postulante);
        ArrayList<Entrevista> entrevistasPorBusqueda = new ArrayList<>();
        for (Entrevista entrevista : entrevistasPorPostulante){
            String comentarios = entrevista.getComentarios();
            if (comentarios.toLowerCase().contains(busqueda)){
                entrevistasPorBusqueda.add(entrevista);
            }
        }
        return entrevistasPorBusqueda;
    }
}
