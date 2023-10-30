package proyecto;

import dominio.*;
import interfaz.*;
import java.util.*;

public class Obli2 {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        ventanaRegistro vent = new ventanaRegistro(sistema);
        vent.setVisible(true);
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 0 ){
            siguienteVentana ven = new siguienteVentana(sistema);
            ven.setVisible(true);
        }
    }
}
