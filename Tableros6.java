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
    private static short numCap = 1;
    private static short numTen = 1;
    private static short y;
    private static String k = " ";
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
    
    public void imprimirMapaJugador() {
        System.out.println("\n      MAPA DEL JUGADOR");
        System.out.print("    A   B   C   D   E   F   ");
        System.out.println();

        for (int i = 1; i < mapaJugador.length; i++) {
            for (int j = 1; j < mapaJugador[i].length; j++) {
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

    public void imprimirMapaCpu() {
        System.out.println("\n        MAPA DEL CPU");
        System.out.print("    A   B   C   D   E   F   ");
        System.out.println();

        for (int i = 1; i < mapaCPU.length; i++) {
            for (int j = 1; j < mapaCPU[i].length; j++) {
                if (j == 1) {
                    System.out.print(i + "|" + mapaCPU[i][j]);
                } else if (j == mapaCPU[i].length - 1) {
                    System.out.print(mapaCPU[i][j] + "|" + i);
                } else {
                    System.out.print(mapaCPU[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("    A   B   C   D   E   F   ");
    }

    public void imprimirMapaAtaqueJugador() {
        //Este muestra los sitios donde el jugador ha atacado en el mapa del CPU
        System.out.println("\n  MAPA DE ATAQUE DEL JUGADOR");
        System.out.print("    A   B   C   D   E   F   ");
        System.out.println();

        for (int i = 1; i < mapaAtaqueJugador.length; i++) {
            for (int j = 1; j < mapaAtaqueJugador[i].length; j++) {
                if (j == 1) {
                    System.out.print(i + "|" + mapaAtaqueJugador[i][j]);
                } else if (j == mapaAtaqueJugador[i].length - 1) {
                    System.out.print(mapaAtaqueJugador[i][j] + "|" + i);
                } else {
                    System.out.print(mapaAtaqueJugador[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("    A   B   C   D   E   F   ");
    }

    public void imprimirMapaAtaqueCpu() {
        //Este muestra los sitios donde el CPU ha atacado en el mapa del jugador 
        System.out.println("\n    MAPA DE ATAQUE DEL CPU");
        System.out.print("    A   B   C   D   E   F   ");
        System.out.println();

        for (int i = 1; i < mapaAtaqueCPU.length; i++) {
            for (int j = 1; j < mapaAtaqueCPU[i].length; j++) {
                if (j == 1) {
                    System.out.print(i + "|" + mapaAtaqueCPU[i][j]);
                } else if (j == mapaAtaqueCPU[i].length - 1) {
                    System.out.print(mapaAtaqueCPU[i][j] + "|" + i);
                } else {
                    System.out.print(mapaAtaqueCPU[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("    A   B   C   D   E   F   ");
    }
    public static void convertirColumnas() {
        if ("a".equalsIgnoreCase(k)) {
            y = 1;
        } else if ("b".equalsIgnoreCase(k)) {
            y = 2;
        } else if ("c".equalsIgnoreCase(k)) {
            y = 3;
        } else if ("d".equalsIgnoreCase(k)) {
            y = 4;
        } else if ("e".equalsIgnoreCase(k)) {
            y = 5;
        } else if ("f".equalsIgnoreCase(k)) {
            y = 6;
        }
    }

    public void colocarNavesJugador() {
        //COLOCAR ALMIRANTE
        boolean flagA = true;
        boolean flagC1 = true;
        boolean flagC2 = true;
        boolean flagT1 = true;
        boolean flagT2 = true;
        boolean flagT3 = true;
        
        Short x = Short.parseShort(JOptionPane.showInputDialog("Colocar Almirante"
                + "\nIndique coordenada (filas) X:"));
        k = JOptionPane.showInputDialog("Indique coordenada (columnas) Y:");
        convertirColumnas();
        if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                && (mapaJugador[x][y] == "  - ")) {
            mapaJugador[x][y] = "  A ";
        } else if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                && (mapaJugador[x][y] == "  A " || mapaJugador[x][y] == " C1 "
                || mapaJugador[x][y] == " C2 " || mapaJugador[x][y] == " T1 "
                || mapaJugador[x][y] == " T2 " || mapaJugador[x][y] == " T3 ")) {
            JOptionPane.showMessageDialog(null, "No puedes"
                    + "colocar nave en espacio ya ocupado");
        } else if ((x < 0 || x >= tamaño) || (y < 0 || y >= tamaño)) {
            JOptionPane.showMessageDialog(null, "Colocar "
                    + "coordenadas validas");
        }

        //COLOCAR CAPITAN 01
        x = Short.parseShort(JOptionPane.showInputDialog("Colocar"
                + " Capitan" + numCap + "\nIndique coordenada X (filas):"));
        k = JOptionPane.showInputDialog("Colocar Capitan" + numCap
                + "\nIndique coordenada Y (columnas):");
        convertirColumnas();
        if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                && (mapaJugador[x][y] == "  - ")) {
            mapaJugador[x][y] = " C1 ";
            numCap++;
        } else if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                && (mapaJugador[x][y] == "  A " || mapaJugador[x][y] == "  C "
                || mapaJugador[x][y] == "  T ")) {
            JOptionPane.showMessageDialog(null, "No puedes"
                    + "colocar nave en espacio ya ocupado");
        } else if ((x < 0 || x >= tamaño) || (y < 0 || y >= tamaño)) {
            JOptionPane.showMessageDialog(null, "Colocar "
                    + "coordenadas validas");
        }

        //COLOCAR CAPITAN 02
        x = Short.parseShort(JOptionPane.showInputDialog("Colocar"
                + " Capitan" + numCap + "\nIndique coordenada X (filas):"));
        k = JOptionPane.showInputDialog("Colocar Capitan" + numCap
                + "\nIndique coordenada Y (columnas):");
        convertirColumnas();
        if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                && (mapaJugador[x][y] == "  - ")) {
            mapaJugador[x][y] = " C2 ";
            numCap++;
        } else if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                && (mapaJugador[x][y] == "  A " || mapaJugador[x][y] == "  C "
                || mapaJugador[x][y] == "  T ")) {
            JOptionPane.showMessageDialog(null, "No puedes"
                    + "colocar nave en espacio ya ocupado");
        } else if ((x < 0 || x >= tamaño) || (y < 0 || y >= tamaño)) {
            JOptionPane.showMessageDialog(null, "Colocar "
                    + "coordenadas validas");
        }

        //COLOCAR TENIENTE 01 
        x = Short.parseShort(JOptionPane.showInputDialog("Colocar"
                + " Teniente" + numTen + "\nIndique coordenada X (filas):"));
        k = JOptionPane.showInputDialog("Colocar Teniente" + numTen
                + "\nIndique coordenada Y (columnas):");
        convertirColumnas();
        if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                && (mapaJugador[x][y] == "  - ")) {
            mapaJugador[x][y] = " T1 ";
            numTen++;
        } else if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                && (mapaJugador[x][y] == "  A " || mapaJugador[x][y] == "  C "
                || mapaJugador[x][y] == "  T ")) {
            JOptionPane.showMessageDialog(null, "No puedes"
                    + "colocar nave en espacio ya ocupado");
        } else if ((x < 0 || x >= tamaño) || (y < 0 || y >= tamaño)) {
            JOptionPane.showMessageDialog(null, "Colocar "
                    + "coordenadas validas");
        }
        //COLOCAR TENIENTE 02 

        x = Short.parseShort(JOptionPane.showInputDialog("Colocar"
                + " Teniente" + numTen + "\nIndique coordenada X (filas):"));
        k = JOptionPane.showInputDialog("Colocar Teniente" + numTen
                + "\nIndique coordenada Y (columnas):");
        convertirColumnas();
        if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                && (mapaJugador[x][y] == "  - ")) {
            mapaJugador[x][y] = " T2 ";
            numTen++;
        } else if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                && (mapaJugador[x][y] == "  A " || mapaJugador[x][y] == "  C "
                || mapaJugador[x][y] == "  T ")) {
            JOptionPane.showMessageDialog(null, "No puedes"
                    + "colocar nave en espacio ya ocupado");
        } else if ((x < 0 || x >= tamaño) || (y < 0 || y >= tamaño)) {
            JOptionPane.showMessageDialog(null, "Colocar "
                    + "coordenadas validas");
        }
        //COLOCAR TENIENTE 03 

        x = Short.parseShort(JOptionPane.showInputDialog("Colocar"
                + " Teniente" + numTen + "\nIndique coordenada X (filas):"));
        k = JOptionPane.showInputDialog("Colocar Teniente" + numTen
                + "\nIndique coordenada Y (columnas):");
        convertirColumnas();
        if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                && (mapaJugador[x][y] == "  - ")) {
            mapaJugador[x][y] = " T3 ";
            numTen++;
        } else if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                && (mapaJugador[x][y] == "  A " || mapaJugador[x][y] == "  C "
                || mapaJugador[x][y] == "  T ")) {
            JOptionPane.showMessageDialog(null, "No puedes"
                    + "colocar nave en espacio ya ocupado");
        } else if ((x < 0 || x >= tamaño) || (y < 0 || y >= tamaño)) {
            JOptionPane.showMessageDialog(null, "Colocar "
                    + "coordenadas validas");
        }
    }

    public void colocarNavesCpu() {
        boolean flagA = true;
        boolean flagC1 = true;
        boolean flagC2 = true;
        boolean flagT1 = true;
        boolean flagT2 = true;
        boolean flagT3 = true;
        short x;
        short y;

        //COLOCAR ALMIRANTE CPU
        while (flagA) {
            x = (short) (Math.random() * 6 + 1);
            y = (short) (Math.random() * 6 + 1);
            if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                    && (mapaCPU[x][y] == "  - ")) {
                mapaCPU[x][y] = "  A ";
                flagA = false;
            }
        }
        //COLOCAR CAPITAN 01 CPU
        while (flagC1) {
            x = (short) (Math.random() * 6 + 1);
            y = (short) (Math.random() * 6 + 1);
            if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                    && (mapaCPU[x][y] == "  - ")) {
                mapaCPU[x][y] = " C1 ";
                flagC1 = false;
            }
        }

        //COLOCAR CAPITAN 02 CPU
        while (flagC2) {
            x = (short) (Math.random() * 6 + 1);
            y = (short) (Math.random() * 6 + 1);
            if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                    && (mapaCPU[x][y] == "  - ")) {
                mapaCPU[x][y] = " C2 ";
                flagC2 = false;
            }
        }

        //COLOCAR TENIENTE 01 CPU
        while (flagT1) {
            x = (short) (Math.random() * 6 + 1);
            y = (short) (Math.random() * 6 + 1);
            if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                    && (mapaCPU[x][y] == "  - ")) {
                mapaCPU[x][y] = " T1 ";
                flagT1 = false;
            }
        }
        //COLOCAR TENIENTE 02 CPU
        while (flagT2) {
            x = (short) (Math.random() * 6 + 1);
            y = (short) (Math.random() * 6 + 1);
            if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                    && (mapaCPU[x][y] == "  - ")) {
                mapaCPU[x][y] = " T2 ";
                flagT2 = false;
            }
        }
        //COLOCAR TENIENTE 03 CPU
        while (flagT3) {
            x = (short) (Math.random() * 6 + 1);
            y = (short) (Math.random() * 6 + 1);
            if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)
                    && (mapaCPU[x][y] == "  - ")) {
                mapaCPU[x][y] = " T3 ";
                flagT3 = false;
            }
        }
    }
    public void turnoJugador() {
        JOptionPane.showMessageDialog(null, "\nTURNO JUGADOR");
        short x = -1;
        boolean flag = true;
        while (flag) {
            x = Short.parseShort(JOptionPane.showInputDialog("\nIndique "
                    + "coordenada de ataque en X (filas):"));
            k = JOptionPane.showInputDialog("Indique coordenada de ataque en "
                    + "Y (columnas):");
            convertirColumnas();

            if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)) {
                if ((mapaCPU[x][y] == "  A ")) {
                    JOptionPane.showMessageDialog(null,
                            "Nave impactada!!!");
                    fichas[1].disVidaAlmirante();
                    if (fichas[1].getAlmirante() > 0) {
                        mapaAtaqueJugador[x][y] = "  O ";
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Almirante destruido!!!");
                        mapaAtaqueJugador[x][y] = "  * ";
                    }
                } else if (mapaCPU[x][y] == " C1 ") {
                    JOptionPane.showMessageDialog(null,
                            "Nave impactada!!!");
                    fichas[1].disVidaCapitan01();
                    if (fichas[1].getCapitan01() > 0) {
                        mapaAtaqueJugador[x][y] = "  O ";
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Capitan 01 destruido!!!");
                        mapaAtaqueJugador[x][y] = "  * ";
                    }
                } else if (mapaCPU[x][y] == " C2 ") {
                    JOptionPane.showMessageDialog(null,
                            "Nave impactada!!!");
                    fichas[1].disVidaCapitan02();
                    if (fichas[1].getCapitan02() > 0) {
                        mapaAtaqueJugador[x][y] = "  O ";
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Capitan 02 destruido!!!");
                        mapaAtaqueJugador[x][y] = "  * ";
                    }
                } else if (mapaCPU[x][y] == " T1 ") {
                    JOptionPane.showMessageDialog(null,
                            "Teniente 01 destruido!!!");
                    fichas[1].disVidaTeniente01();
                    mapaAtaqueJugador[x][y] = "  * ";
                } else if (mapaCPU[x][y] == " T2 ") {
                    JOptionPane.showMessageDialog(null,
                            "Teniente 02 destruido!!!");
                    fichas[1].disVidaTeniente02();
                    mapaAtaqueJugador[x][y] = "  * ";
                } else if (mapaCPU[x][y] == " T3 ") {
                    JOptionPane.showMessageDialog(null,
                            "Teniente 03 destruido!!!");
                    fichas[1].disVidaTeniente03();
                    mapaAtaqueJugador[x][y] = "  * ";
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Ataque fallado!!!");
                    mapaAtaqueJugador[x][y] = "  X ";
                }
                flag = false;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese"
                        + "coordenadas correctas");
            }
        }
    }
        public void turnoCpu() {
        JOptionPane.showMessageDialog(null, "\nTURNO CPU");
        short x = -1;
        short y = -1;
        boolean flag = true;
        while (flag) {
            x = (short) (Math.random() * 6 + 1);
            y = (short) (Math.random() * 6 + 1);

            if ((x >= 0 && x < tamaño) && (y >= 0 && y < tamaño)) {
                if ((mapaJugador[x][y] == "  A ")) {
                    JOptionPane.showMessageDialog(null,
                            "Nave impactada!!!");
                    fichas[0].disVidaAlmirante();
                    if (fichas[0].getAlmirante() > 0) {
                        mapaAtaqueCPU[x][y] = "  O ";
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Almirante destruido!!!");
                        mapaAtaqueCPU[x][y] = "  * ";
                    }
                } else if (mapaJugador[x][y] == " C1 ") {
                    JOptionPane.showMessageDialog(null,
                            "Nave impactada!!!");
                    fichas[0].disVidaCapitan01();
                    if (fichas[0].getCapitan01() > 0) {
                        mapaAtaqueCPU[x][y] = "  O ";
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Capitan 01 destruido!!!");
                        mapaAtaqueCPU[x][y] = "  * ";
                    }
                } else if (mapaJugador[x][y] == " C2 ") {
                    JOptionPane.showMessageDialog(null,
                            "Nave impactada!!!");
                    fichas[0].disVidaCapitan02();
                    if (fichas[0].getCapitan02() > 0) {
                        mapaAtaqueCPU[x][y] = "  O ";
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Capitan 02 destruido!!!");
                        mapaAtaqueCPU[x][y] = "  * ";
                    }
                } else if (mapaJugador[x][y] == " T1 ") {
                    JOptionPane.showMessageDialog(null,
                            "Teniente 01 destruido!!!");
                    fichas[0].disVidaTeniente01();
                    mapaAtaqueCPU[x][y] = "  * ";
                } else if (mapaJugador[x][y] == " T2 ") {
                    JOptionPane.showMessageDialog(null,
                            "Teniente 02 destruido!!!");
                    fichas[0].disVidaTeniente02();
                    mapaAtaqueCPU[x][y] = "  * ";
                } else if (mapaJugador[x][y] == " T3 ") {
                    JOptionPane.showMessageDialog(null,
                            "Teniente 03 destruido!!!");
                    fichas[0].disVidaTeniente03();
                    mapaAtaqueCPU[x][y] = "  * ";
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Ataque fallado!!!");
                    mapaAtaqueCPU[x][y] = "  X ";
                }
                flag = false;
            }
        }
    }
    
}
