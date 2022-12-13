/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class MenuJugador {
    
    private static int tamaño = 7;
    private static boolean flag = true;
    private static short marcador;
    
     public static void menuJugador() {
        
        short opcion = 0;
        while (flag) {
            opcion = Short.parseShort(JOptionPane.showInputDialog(
                    "MENU"
                    + "\n1)  Colocar naves"
                    + "\n2)  Atacar"
                    + "\n3)  Mostrar tablero de ataque"
                    + "\n4)  Mostrar tablero de jugador"
                    + "\n5)  Trampa"
                    + "\n6)  Volver a menú principal"));
            if (opcion == 1) {
                //Se colocan naves del jugador
                
            } else if (opcion == 2) {
                //Atacar 
                
                if (marcador == 0){
                    flag = false; 
                }
            } else if (opcion == 3) {
                //Muestra tablero de ataque con las naves del jugador
                
            } else if (opcion == 4) {
                //Mostrar tablero de jugador  
               
            } else if (opcion == 5) {
                //Trampa mostrar mapa del CPU con posición de las fichas
               
            } else if (opcion == 6) {
                //Volver a menú principal
                flag = false;
            }
            
        }
    }
    
}
