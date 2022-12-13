/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointroprogra;

import javax.swing.JOptionPane;
import static proyectointroprogra.Tableros.*;

/**
 *
 * @author steve
 */
public class MenuJugador {
    private static int tamaño = 7;
    
    public static void menuJugador() {
        short opcion = 0;
        boolean flag = true;
        Tableros tablero = new Tableros(tamaño);
        iniciarFichas();
        nombreJugador();
        //Se colocan naves del jugador
        tablero.llenarMapaJugador();
        tablero.colocarNavesJugador();
        tablero.llenarMapaAtaqueJugador();
        //Se colocan naves del CPU
        tablero.llenarMapaCpu();
        tablero.colocarNavesCpu();
        tablero.llenarMapaAtaqueCpu();

        while (flag) {
            opcion = Short.parseShort(JOptionPane.showInputDialog(
                    "MENU"
                    + "\n1)  Atacar"
                    + "\n2)  Mostrar tablero de ataque"
                    + "\n3)  Mostrar tablero de jugador"
                    + "\n4)  Trampa"
                    + "\n5)  Volver a menú principal"));
                 
            if (opcion == 1) {
                //Atacar 
                tablero.turnoJugador();
                tablero.imprimirMapaAtaqueJugador();
                tablero.turnoCpu();
                tablero.imprimirMapaAtaqueCpu();
                tablero.finalizarJuego();
            } else if (opcion == 2) {
                //Muestra tablero de ataque con las naves del jugador
                tablero.imprimirMapaAtaqueJugador();
            } else if (opcion == 3) {
                //Mostrar tablero de jugador  
                tablero.imprimirMapaJugador();
            } else if (opcion == 4) {
                //Trampa mostrar mapa del CPU con posición de las fichas
                tablero.imprimirMapaCpu();
            } else if (opcion == 5) {
                //Volver a menú principal
                flag = false;
            }

        }
    }
}
