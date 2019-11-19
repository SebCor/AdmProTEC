/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class TASKNODE {
    //////
   
    public TASK VERTEX;
    public int ACCWEIGHT;
    public TASKNODE Next;
    //public Matriz_de_adyacencia GRAPH;

    public TASKNODE() {
        VERTEX = null;
        ACCWEIGHT=0;
    }

    public TASKNODE(TASK num) {
        this.VERTEX = num;
    }
    
    public TASKNODE(TASK num, int Weight) {
        this.VERTEX = num;
        this.ACCWEIGHT= Weight;
    }

    /**
     * @return the VERTEX
     */
    public TASK getVERTEX() {
        return VERTEX;
    }

    /**
     * @param VERTEX the VERTEX to set
     */
    public void setVERTEX(TASK VERTEX) {
        this.VERTEX = VERTEX;
    }

    /**
     * @return the ACCWEIGHT
     */
    public int getACCWEIGHT() {
        return ACCWEIGHT;
    }

    /**
     * @param ACCWEIGHT the ACCWEIGHT to set
     */
    public void setACCWEIGHT(int ACCWEIGHT) {
        this.ACCWEIGHT = ACCWEIGHT;
    }

    /**
     * @return the Next
     */
    public TASKNODE getNext() {
        return Next;
    }

    /**
     * @param Next the Next to set
     */
    public void setNext(TASKNODE Next) {
        this.Next = Next;
    }

   

        
        
        
        
        
        
 }
    
    

