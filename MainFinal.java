package proyectointroprogra;

import java.util.*;
import javax.swing.JOptionPane;
import static proyectointroprogra.MenuJugador.menuJugador;

/**
 *
 * @author steve
 */
public class Main {

    public static void main(String[] args) {

        byte opcion;
        boolean flag = true;

        JOptionPane.showMessageDialog(null, "Bienvenido al juego"
                + " BattleShip: Batalla Naval.");
        while (flag) {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(""
                    + "Menu del Juego \n "
                    + "Por favor digite una opción para continuar: \n"
                    + "1. Iniciar juego\n"
                    + "2. Terminar juego\n"));
            switch (opcion) {
                case 1:
                    menuJugador();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Usted"
                            + " ha finalizado el juego");
                    flag = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione"
                            + " una opción válida.");
            }
        }

    }

}
