/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JFrame;

/**
 *
 * @author ronye
 */
public class Lienzo {

    public static void main(String[] args) {
        
        Arbol objArbol = new Arbol();
        lienzoarbol objLienzo = new lienzoarbol();
        
        Controlador objControl = new Controlador(objLienzo, objArbol);
        
       /* Nodo_arbol info = new Nodo_arbol();
        Nodo_arbol info2 = new Nodo_arbol();
        Nodo_arbol info3 = new Nodo_arbol();
        Nodo_arbol info4 = new Nodo_arbol();
        
        info.setID(7);
        info.setInfo("Hola");
        
        info2.setID(5);
        info2.setInfo("jejejes");
        
        info3.setID(10);
        info3.setInfo("ERYU");
        
        info4.setID(9);
        info4.setInfo("pUT");
        
        objArbol.insertar(info);
        objArbol.insertar(info2);
        objArbol.insertar(info3);
        objArbol.insertar(info4);
       
        
        objControl.iniciar();
        
        JFrame ventana = new JFrame();
        ventana.getContentPane().add(objLienzo);
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(600, 600);
        ventana.setVisible(true);*/
        
        
    }
}
