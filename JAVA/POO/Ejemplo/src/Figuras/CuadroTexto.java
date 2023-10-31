package Figuras;

import javax.swing.*;

public class CuadroTexto {

    public static void main(String[] args) {

        //Introducir valores.
        String msg = JOptionPane.showInputDialog("Introduzca un mensaje: ");
        if (msg != null) {
            //Booleano || Yes = 0, No = 1, Cancel = 2.
            int confirmar = JOptionPane.showConfirmDialog(null, msg);

            if (confirmar == 0) {
                //Mostrar mensaje.
                JOptionPane.showMessageDialog(null, msg);
            } else if (confirmar == 1) {
                //Mostrar mensaje.
                JOptionPane.showMessageDialog(null, "¿Cómo que no?");
            } else {
                JOptionPane.showMessageDialog(null, "Eres mu tonto.");
            }
        }
    }
}
