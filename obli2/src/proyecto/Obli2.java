package proyecto;

import dominio.*;
import interfaz.*;
import java.util.*;

public class Obli2 {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        VentanaRegistroTematica vent = new VentanaRegistroTematica(sistema);
        AltaPostulante ventana = new AltaPostulante(sistema);
        vent.setVisible(true);
        ventana.setVisible(true);
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
//        while (num != 0 ){
//            VentanaTematicasPostulante ven = new VentanaTematicasPostulante(sistema);
//            ven.setVisible(true);
//            num = in.nextInt();
//        }
    }
}