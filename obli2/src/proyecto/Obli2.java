package proyecto;

import dominio.*;
import interfaz.*;
import java.util.*;

public class Obli2 {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        ventanaRegistro vent = new ventanaRegistro(sistema);
        vent.setVisible(true);
    }
}
