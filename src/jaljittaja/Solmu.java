/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jaljittaja;

/**
 * Verkon solmu
 * @author jouni
 */
public class Solmu {

    public Solmu(int x, int y, boolean OnEste) {
        this.x = x;
        this.y = y;
        this.OnEste = OnEste;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int x;
    public int y;

    public int getKustannus() {
        return Kustannus;
    }

    public void setKustannus(int Kustannus) {
        this.Kustannus = Kustannus;
    }

    public boolean isOnEste() {
        return OnEste;
    }

    public void setOnEste(boolean OnEste) {
        this.OnEste = OnEste;
    }
    
    
    public int Kustannus;
    
    public boolean OnEste;
    
    public Solmu Edeltaja;

    public Solmu getEdeltaja() {
        return Edeltaja;
    }

    public void setEdeltaja(Solmu Edeltaja) {
        this.Edeltaja = Edeltaja;
    }
}
