/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author manue
 */
public class Entrevista {
    private Evaluador evaluador;
    private Postulante entrevistado;
    private int puntaje;
    private String comentarios;
    private int id;

    public Entrevista(Evaluador evaluador, Postulante entrevistado, int puntaje, String comentarios, int id) {
        this.evaluador = evaluador;
        this.entrevistado = entrevistado;
        this.puntaje = puntaje;
        this.comentarios = comentarios;
        this.id = id;
    }
    public Evaluador getEvaluador() {
        return evaluador;
    }

    public Postulante getEntrevistado() {
        return entrevistado;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public String getComentarios() {
        return comentarios;
    }

    public int getId() {
        return id;
    }
    
    
}
