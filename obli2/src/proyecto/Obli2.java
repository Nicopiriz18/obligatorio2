package proyecto;

import dominio.*;
import interfaz.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Obli2 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("es", "ES"));

        Sistema sis;
        //creamos las opciones de los botones en espanol para pasar al confirm dialog
        Object[] opciones = {"Sí","No"};
        int opcion = JOptionPane.showOptionDialog(
                null,
                "¿Desea iniciar el sistema con los últimos datos guardados?",
                "Datos del sistema",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
        if (opcion == JOptionPane.YES_OPTION) {
            try {
                ObjectInputStream in = new ObjectInputStream(
                        Files.newInputStream(Paths.get("datos.ser")));
                sis = (Sistema) in.readObject();
                in.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al recuperar los últimos datos.\nSe procede con un nuevo sistema sin datos.", "Error", JOptionPane.ERROR_MESSAGE);
                sis = new Sistema();
            }
        } else {
            sis = new Sistema();
        }

        VentanaMenu vent = new VentanaMenu(sis);

        vent.setVisible(true);
    }
}
