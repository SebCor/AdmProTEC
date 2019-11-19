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
public class Controlador {
    
    public lienzoarbol Objlienzo;
    public Arbol ObjArbol;

    public Controlador(lienzoarbol Objlienzo, Arbol ObjArbol) {
        this.Objlienzo = Objlienzo;
        this.ObjArbol = ObjArbol;
    }
    
    public void iniciar(){
        Objlienzo.setObjArbol(ObjArbol);
    }
}
