
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaljittaja;

/**
 * Suuntaamaton verkko (n x n matriisi), joka muodostuu solmuista ja kaarista
 *
 * @author jouni
 */
public class Verkko {

    public Solmu[][] Solmut;

    public void RakennaVerkko(int n) {

        int rivit = 4;
        int sarakkeet = 4;
        Solmut = new Solmu[rivit][sarakkeet];
//        boolean pariton = false;
//        if(solmujenMaara % 2 != 0){
//            pariton = true;
//        }
        // luodaan ensin solmut (n x n matriisi)    
        for (int i = 0; i < rivit; i++) {
            for (int j = 0; j < sarakkeet; j++) {
                // luodaan uusi solmu, suunnat ei tiedossa
                Solmut[i][j] = new Solmu("S[" + i + "," + j + "]", null);
            }
        }
        
    }

}
/* 
  4 x 4 
A--O--O--O
|  |  |  |
O--O--O--O
|  |  |  |
O--O--M--O
|  |  |  |
O--O--O--O

*/
