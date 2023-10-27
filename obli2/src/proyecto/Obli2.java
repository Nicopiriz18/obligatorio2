package proyecto;

import dominio.*;
import interfaz.*;
import java.util.*;

public class Obli2 {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        ArrayList<Tematica> listaTematicas = sistema.obtenerTematicas();

        ventanaRegistro ventana = new ventanaRegistro(sistema);
        ventana.setVisible(true);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 0) {
            if (listaTematicas.isEmpty()) {
                System.out.println("La lista de temáticas está vacía.");
            } else {
                for (Tematica elemento : listaTematicas) {
                    System.out.println(elemento);
                }
            }
        } else {
            System.out.println("El número ingresado no es 0.");
        }
    }
}
