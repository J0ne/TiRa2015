
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jaljittaja;

import jaljittajaUI.Verkkonakyma;

/**
 *
 * @author jouni
 */
public class Jaljittaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Verkko matriisi = new Verkko(10);
        
        Polunetsija etsija = new Polunetsija(matriisi);
        
        etsija.EtsiLyhinPolku(new Solmu(2, 2, false), new Solmu(7, 6, false));
        
        //Verkkonakyma vn = new Verkkonakyma(matriisi);
        
    }
    
}
