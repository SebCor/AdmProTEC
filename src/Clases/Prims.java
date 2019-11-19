package Clases;

import java.util.InputMismatchException;
import java.util.Scanner;
 

////
public class Prims
{
    public boolean unsettled[];
    public boolean settled[];
    public int numberofvertices;
    public int adjacencyMatrix[][];
    public int key[];
    public static final int INFINITE = 999;
    public int parent[];
 
    
    public Prims(int numberofvertices)
    {
        this.numberofvertices = numberofvertices;
        unsettled = new boolean[numberofvertices + 1];
        settled = new boolean[numberofvertices + 1];
        adjacencyMatrix = new int[numberofvertices + 1][numberofvertices + 1];
        key = new int[numberofvertices + 1];
        parent = new int[numberofvertices + 1];
    }
 
    public int getUnsettledCount(boolean unsettled[])
    {
        int count = 0;
        for (int index = 0; index < unsettled.length; index++)
        {
            if (unsettled[index])
            {
                count++;
            }
        }
        return count;
    }
 
   /* public void primsAlgorithm(Matriz_de_adyacencia matriz)
    {
        int evaluationVertex;
        for (int source = 0; source < numberofvertices; source++){
            for (int destination = 0; destination < numberofvertices; destination++){
                try{
                    this.adjacencyMatrix[source][destination] = matriz.matriz[source][destination];
                }catch(Exception e){
                    
                }
            }
        }
 
        for (int index = 1; index <= numberofvertices; index++)
        {
            key[index] = INFINITE;
        }
        key[1] = 0;
        unsettled[1] = true;
        parent[1] = 1;
 
        while (getUnsettledCount(unsettled) != 0)
        {
            evaluationVertex = getMimumKeyVertexFromUnsettled(unsettled);
            unsettled[evaluationVertex] = false;
            settled[evaluationVertex] = true;
            evaluateNeighbours(evaluationVertex);
        }
    } */
 
    private int getMimumKeyVertexFromUnsettled(boolean[] unsettled2)
    {
        int min = Integer.MAX_VALUE;
        int node = 0;
        for (int vertex = 1; vertex <= numberofvertices; vertex++)
        {
            if (unsettled[vertex] == true && key[vertex] < min)
            {
                node = vertex;
                min = key[vertex];
            }
        }
        return node;
    }
 
    public void evaluateNeighbours(int evaluationVertex)
    {
 
        for (int destinationvertex = 1; destinationvertex <= numberofvertices; destinationvertex++)
        {
            if (settled[destinationvertex] == false)
            {
                if (adjacencyMatrix[evaluationVertex][destinationvertex] != INFINITE)
                {
                    if (adjacencyMatrix[evaluationVertex][destinationvertex] < key[destinationvertex])
                    {
                        key[destinationvertex] = adjacencyMatrix[evaluationVertex][destinationvertex];
                        parent[destinationvertex] = evaluationVertex;
                    }
                    unsettled[destinationvertex] = true;
                }
            }
        }
    }
 
/*    public void printMST(Matriz_de_adyacencia matriz)
    {
        System.out.println("SOURCE  : DESTINATION = WEIGHT");
        for (int vertex = 2; vertex <= numberofvertices; vertex++)
        {
            System.out.println(vertex + "\t:\t" + parent[vertex] +"\t=\t"+ adjacencyMatrix[vertex - 1][parent[vertex]-1]);
        }
    }*/

}