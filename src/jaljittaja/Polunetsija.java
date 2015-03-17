/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaljittaja;

import jaljittajaUI.Verkkonakyma;
import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.SortedSet;

/**
 *
 * @author jouni
 */
public class Polunetsija {

    public Polunetsija(Verkko verkko) {
        this.verkko = verkko;
    }

    public Verkko verkko;

    public ArrayList<Solmu> EtsiLyhinPolku(Solmu alkupiste, Solmu maali) {
        
        PriorityQueue<Solmu> avoinLista = new PriorityQueue<>(); // open set 
        ArrayList<Solmu> suljettuLista = new ArrayList<>(); // closed set

        ArrayList<Solmu> kuljettuReitti = new ArrayList<>();

        int G_arvo = 0;
        int F_arvo = G_arvo + laskeHeuristinenArvio(alkupiste, maali);
        alkupiste.setKustannus(F_arvo);

        avoinLista.add(alkupiste);
        while (!avoinLista.isEmpty()) {
            Solmu nykyinen = avoinLista.element();
            
            if (nykyinen.equals(maali)) {
                return tulostaPolku(maali, nykyinen);
            }
            avoinLista.remove(nykyinen);
            suljettuLista.add(nykyinen);
            
            ArrayList<Solmu> naapuriSolmut = annaSolmunNaapurit(nykyinen);
            for (Solmu naapuri : naapuriSolmut) {
                if(suljettuLista.contains(naapuri))
                    continue;
                
                
            }

        }
        return null;
    }

    private int laskeHeuristinenArvio(Solmu alku, Solmu maali) {
        int etaisyysX = Math.abs(maali.getX() - alku.getX());
        int etaisyysY = Math.abs(maali.getY() - alku.getY());
        return etaisyysX + etaisyysY;
    }
    
    private ArrayList<Solmu> tulostaPolku(Solmu edeltaja, Solmu nykyinen){
        ArrayList<Solmu> polku = new ArrayList<>();
        polku.add(nykyinen);
        while(nykyinen != null){
            Solmu solmu = nykyinen.getEdeltaja();
            if(solmu != null){
                polku.add(solmu);
            }
            nykyinen = solmu;
        }
        return polku;
    }

    private ArrayList<Solmu> annaSolmunNaapurit(Solmu solmu) {
        ArrayList<Solmu> naapurit = new ArrayList<>();
        int solmuX = solmu.getX();
        int solmuY = solmu.getY();
        int minX = 0;
        int minY = 0;
        
        int maxX = this.verkko.Solmut.length;
        int maxY = maxX;
        if(minX < solmuX - 1){
            minX = solmuX - 1;
        }
        if(minY < solmuY -1){
            minY = solmuY -1;
        }
        if(maxX > solmuX + 1)
        {
            maxX = solmuX + 1;
        }
        if(maxY > solmuY + 1)
        {
            maxY = solmuY +1;
        }
        for(int i = minX; i < maxX; i++){
            for(int j = minY; j < maxY; j++){
                if(i == solmuX && j == solmuY){
                    continue; // ei lisätä solmua naapuriensa joukkoon
                }
                 naapurit.add(this.verkko.Solmut[i][j]);
            }
        }
        return naapurit;
    }

}
