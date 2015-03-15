/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaljittajaUI;

import jaljittaja.Solmu;
import jaljittaja.Verkko;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author jouni
 */
public class Verkkonakyma extends Frame {

    private final int PITUUS = 10;
    private final int KORKEUS = 10;

    /**
     *
     * @param verkko
     */
    public Verkkonakyma(Verkko verkko) {

        super("Jäljittaja");
        this.verkko = verkko;
        setSize(600, 800);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
    final static BasicStroke stroke = new BasicStroke(3);

    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(stroke);        
        PiirraSolmu(g2d, 40, 40);
    }

    /**
     *
     */
    public Verkko verkko;

    /**
     *
     * @return
     */
    public Verkko getVerkko() {
        return verkko;
    }

    /**
     *
     * @param verkko
     */
    public void setVerkko(Verkko verkko) {
        this.verkko = verkko;
    }

    private void PiirraSolmu(Graphics2D g2d, int x, int y) {
        g2d.setColor(Color.GREEN);
        g2d.drawRect(x, y, PITUUS, KORKEUS);
    }
}
