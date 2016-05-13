/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Matias
 */
public class Agente {
    public int posicionX;
    public int posicionY;

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }
    public void setPosicionXY(int posicionX,int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
}
