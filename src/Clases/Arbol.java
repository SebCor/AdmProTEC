//Es este 

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
public class Arbol{
    public Nodo raiz;
    
    public void insertar(TASKNODE elemento){
        if (raiz == null)
            raiz = new Nodo(elemento.VERTEX.getIDTK());
        else
            raiz = raiz.insertar(raiz, elemento.VERTEX.getIDTK());
        
    }
    
    public Nodo getRaiz(){
        return raiz;  
    }
    
}
