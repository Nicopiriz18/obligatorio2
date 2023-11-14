/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import dominio.*;

/**
 *
 * @author manue
 */
public class Evaluador extends Persona {
    private int anoIngresoEmpresa;

    public Evaluador(String nombre, int cedula, String direccion, int anoIngresoEmpresa) {
        // Llama al constructor de la clase base (Persona) para inicializar los atributos heredados.
        super(nombre, cedula, direccion);
        
        // Inicializa los atributos específicos de Evaluador.
        this.anoIngresoEmpresa = anoIngresoEmpresa;
    }

    // Getters y setters para los atributos específicos de Evaluador.
    public int getAnoIngresoEmpresa() {
        return anoIngresoEmpresa;
    }

    public void setAnoIngresoEmpresa(int anoIngresoEmpresa) {
        this.anoIngresoEmpresa = anoIngresoEmpresa;
    }
    @Override
    public String toString(){
        return this.getNombre();
    }
}
