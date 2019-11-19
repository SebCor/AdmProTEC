/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ronye
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class lienzoarbol extends JPanel{
    
    private Arbol ObjArbol;
    
    public static final int DIAMETRO = 50;
    public static final int RADIO = DIAMETRO / 2;
    public static final int ANCHO = 50;

    public void setObjArbol(Arbol ObjArbol) {
        this.ObjArbol = ObjArbol;
        repaint();
    }
    
    public void paint(Graphics g){
        super.paint(g);
        pintar(g, getWidth() / 2, 40, ObjArbol.getRaiz());
    }
    
    private void pintar(Graphics g, int x, int y, Nodo n){
        if( n == null){
        }
        else{
            int Extra = n.nodosCompletos(n) +  (ANCHO / 2);
            g.drawOval(x, y, DIAMETRO,DIAMETRO);//Diametro del nodo
            g.drawString(n.elemento.toString(), x + 12 , y + 18);//Muestra la informaciòn del nodo
            if(n.getIzquierda() != null)
                g.drawLine(x + RADIO, y + RADIO, x - ANCHO - Extra + RADIO, y + ANCHO + RADIO);
            if(n.getDerecha() != null)
                g.drawLine(x + RADIO, y + RADIO, x + ANCHO + Extra + RADIO, y + ANCHO + RADIO);
            pintar(g, x - ANCHO - Extra, y + ANCHO, n.getIzquierda());
            pintar(g, x + ANCHO + Extra, y + ANCHO, n.getDerecha()); 
         
        }
    }
    
    
    
    
}
