package proyecto;

import dominio.*;
import interfaz.*;
import java.util.*;

public class Obli2 {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        VentanaRegistro vent = new VentanaRegistro(sistema);
        vent.setVisible(true);
    }
}
