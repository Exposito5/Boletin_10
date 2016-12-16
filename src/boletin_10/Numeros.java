package boletin_10;

import javax.swing.JOptionPane;

public class Numeros {

    public void Juego() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Inserta un número"));
        int i = Integer.parseInt(JOptionPane.showInputDialog("Inserta un número de intentos"));

        do {
            int e = Integer.parseInt(JOptionPane.showInputDialog("Inserta un número"));
            i = i - 1;
            if (e == num) {
                System.out.println("Has acertado");
            } else if (e != num) {
                System.out.println("Uy casi intentalo otra vez");
            }
        } while (i > 0);
        if (i == 0) {
            System.out.println("Oh se te han acabado los intentos. Que pena... Vuelve mañana");
        }
    }
}
