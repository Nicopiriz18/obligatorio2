package proyecto;

import dominio.*;
import interfaz.*;
import java.util.*;

public class Obli2 {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        AltaPostulante vent = new AltaPostulante(sistema);
        vent.setVisible(true);
        VentanaRegistroEvaluador ventana = new VentanaRegistroEvaluador(sistema);
        ventana.setVisible(true);
        VentanaRegistroTematica wats = new VentanaRegistroTematica(sistema);
        wats.setVisible(true);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num == 0){
           VentanaIngresoEntrevista sape = new VentanaIngresoEntrevista(sistema);
           sape.setVisible(true);
        }
    }
}