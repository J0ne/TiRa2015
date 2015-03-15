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

    public Solmu(String Nimi, Kaari[] Suunnat) {
        this.Nimi = Nimi;
        this.Suunnat = Suunnat;
    }


    /**
     *
     * @return
     */
    public String getNimi() {
        return Nimi;
    }

    /**
     *
     * @param Nimi
     */
    public void setNimi(String Nimi) {
        this.Nimi = Nimi;
    }

    /**
     *
     * @return
     */
    public Kaari[] getSuunnat() {
        return Suunnat;
    }

    /**
     *
     * @param Suunnat
     */
    public void setSuunnat(Kaari[] Suunnat) {
        this.Suunnat = Suunnat;
    }

    /**
     * Solmun tunniste. todo: id tms. helpottamaan debuggaamista ym
     */
    public String Nimi;
    
    /**
     * Suunnat joihin solmusta pääsee. Toistaiseksi max 4 suuntaa
     * 0 = ylös, 1 = oikealle, 2 = alas, 3 = vasemmalle TODO: voi olla ettei suunnilla ole muuta väliä kuin 
     * debugatessa / havainnollistettaessa algoritmin toimintaa
     */
    public Kaari[] Suunnat;
    
    public enum suunta{
        ylos,
        oikealle,
        alas,
        vasemmalle
    }
}
