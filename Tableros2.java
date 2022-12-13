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
public class Tableros {
    private static FichasJugador fichas[] = new FichasJugador[2];
    private static String nombreJugador;
    private int tamaño;
    private String[][] mapaJugador;
    private String[][] mapaCPU;
    private String[][] mapaAtaqueJugador;
    private String[][] mapaAtaqueCPU;

    public Tableross(int tamaño) {
        this.tamaño = tamaño;
        this.mapaJugador = new String[this.tamaño][this.tamaño];
        this.mapaCPU = new String[this.tamaño][this.tamaño];
        this.mapaAtaqueJugador = new String[this.tamaño][this.tamaño];
        this.mapaAtaqueCPU = new String[this.tamaño][this.tamaño];
    }

    public static void nombreJugador() {
        nombreJugador = JOptionPane.showInputDialog("Digite "
                + "el nombre del jugador: ");
    }

    public static void iniciarFichas() {
        // i = 0 (fichas del jugador) i = 1 (fichas CPU)
        for (int i = 0; i < 2; i++) {
            int almirante = 4;
            int capitan01 = 3;
            int capitan02 = 3;
            int teniente01 = 1;
            int teniente02 = 1;
            int teniente03 = 1;
            fichas[i] = new FichasJugador(almirante, capitan01, capitan02,
                    teniente01, teniente02, teniente03);
        }
    }
        public void llenarMapaJugador() {
        System.out.print("    A   B   C   D   E   F   ");
        System.out.println();

        for (int i = 1; i < mapaJugador.length; i++) {
            for (int j = 1; j < mapaJugador[i].length; j++) {
                mapaJugador[i][j] = "  - ";
                if (j == 1) {
                    System.out.print(i + "|" + mapaJugador[i][j]);
                } else if (j == mapaJugador[i].length - 1) {
                    System.out.print(mapaJugador[i][j] + "|" + i);
                } else {
                    System.out.print(mapaJugador[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("    A   B   C   D   E   F   ");

    }

    public void llenarMapaCpu() {

        for (int i = 1; i < mapaCPU.length; i++) {
            for (int j = 1; j < mapaCPU[i].length; j++) {
                mapaCPU[i][j] = "  - ";
            }
        }
    }

    public void llenarMapaAtaqueJugador() {
        for (int i = 1; i < mapaAtaqueJugador.length; i++) {
            for (int j = 1; j < mapaAtaqueJugador[i].length; j++) {
                mapaAtaqueJugador[i][j] = "  - ";
            }
        }
    }

    public void llenarMapaAtaqueCpu() {
        for (int i = 1; i < mapaAtaqueCPU.length; i++) {
            for (int j = 1; j < mapaAtaqueCPU[i].length; j++) {
                mapaAtaqueCPU[i][j] = "  - ";
            }
        }
    }
    
}
