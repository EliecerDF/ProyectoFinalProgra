/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointroprogra;

/**
 *
 * @author steve
 */
public class FichasJugador {
    private int almirante;
    private int capitan01;
    private int capitan02;
    private int teniente01;
    private int teniente02;
    private int teniente03;

    public FichasJugador(int almirante, int capitan01, int capitan02, 
           int teniente01, int teniente02, int teniente03) {
        this.almirante = almirante;
        this.capitan01 = capitan01;
        this.capitan02 = capitan02;
        this.teniente01 = teniente01;
        this.teniente02 = teniente02;
        this.teniente03 = teniente03;
    }

    

    public int getAlmirante() {
        return almirante;
    }

    public int getCapitan01() {
        return capitan01;
    }

    public int getCapitan02() {
        return capitan02;
    }

    public int getTeniente01() {
        return teniente01;
    }

    public int getTeniente02() {
        return teniente02;
    }

    public int getTeniente03() {
        return teniente03;
    }
    
    public void disVidaAlmirante(){
        almirante -= 1;
    }
    public void disVidaCapitan01(){
        capitan01 -= 1;
    }
    public void disVidaCapitan02(){
        capitan02 -= 1;
    }
    public void disVidaTeniente01(){
        teniente01 -= 1;
    }
    public void disVidaTeniente02(){
        teniente02  -= 1;
    }
    public void disVidaTeniente03(){
        teniente03  -= 1;
    }
    
}
