/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author manue
 */
public class Utils {

    public static int convertirAEntero(String numeroString) {
        try {
            return Integer.parseInt(numeroString);
        } catch (NumberFormatException e) {
            return -1;  // Valor especial para indicar error
        }
    }
}
