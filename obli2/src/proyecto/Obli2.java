package proyecto;

import dominio.*;
import interfaz.*;
import java.util.*;

public class Obli2 {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
//        VentanaRegistro vent = new VentanaRegistro(sistema);
        AltaPostulante vent = new AltaPostulante(sistema);
        vent.setVisible(true);
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 0 ){
            VentanaTematicasPostulante ven = new VentanaTematicasPostulante(sistema);
            ven.setVisible(true);
        }
    }
}