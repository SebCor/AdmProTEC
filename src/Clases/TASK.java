/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class TASK {
    
    ///////
    
    private int IDTK;
    private String DESCRIPTION;
    private String COMPLEXITY;        
    private String TKMANAGER;
    private String TKTYPE;
    private int PRIORITY;
    private TASKSLIST SUBTASKLIST;
    
    public TASK(){}
    

    /**
     * @return the IDTK
     */
    public int getIDTK() {
        return IDTK;
    }

    /**
     * @param IDTK the IDTK to set
     */
    public void setIDTK(int IDTK) {
        this.IDTK = IDTK;
    }

    /**
     * @return the DESCRIPTION
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * @param DESCRIPTION the DESCRIPTION to set
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    /**
     * @return the COMPLEXITY
     */
    public String getCOMPLEXITY() {
        return COMPLEXITY;
    }

    /**
     * @param COMPLEXITY the COMPLEXITY to set
     */
    public void setCOMPLEXITY(String COMPLEXITY) {
        this.COMPLEXITY = COMPLEXITY;
    }

    /**
     * @return the TKMANAGER
     */
    public String getTKMANAGER() {
        return TKMANAGER;
    }

    /**
     * @param TKMANAGER the TKMANAGER to set
     */
    public void setTKMANAGER(String TKMANAGER) {
        this.TKMANAGER = TKMANAGER;
    }

    /**
     * @return the TKTYPE
     */
    public String getTKTYPE() {
        return TKTYPE;
    }

    /**
     * @param TKTYPE the TKTYPE to set
     */
    public void setTKTYPE(String TKTYPE) {
        this.TKTYPE = TKTYPE;
    }

    /**
     * @return the PRIORITY
     */
    public int getPRIORITY() {
        return PRIORITY;
    }

    /**
     * @param PRIORITY the PRIORITY to set
     */
    public void setPRIORITY(int PRIORITY) {
        this.PRIORITY = PRIORITY;
    }

    /**
     * @return the Grafo
     */
    /*public Matriz_de_adyacencia getGrafo() {
        return Grafo;
    }*/

    /**
     * @param Grafo the Grafo to set
     */
    /*public void setGrafo(Matriz_de_adyacencia Grafo) {
        this.Grafo = Grafo;
    }*/

    /**
     * @return the SUBTASKLIST
     */
    public TASKSLIST getSUBTASKLIST() {
        return SUBTASKLIST;
    }

    /**
     * @param SUBTASKLIST the SUBTASKLIST to set
     */
    public void setSUBTASKLIST(TASKSLIST SUBTASKLIST) {
        this.SUBTASKLIST = SUBTASKLIST;
    }
    
    
    
    
}
