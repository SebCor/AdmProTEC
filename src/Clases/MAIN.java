/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;
//

public class MAIN {
    
     public static void main(String[] args) {
         
         RESOURCE_LIST listarecurso = new RESOURCE_LIST();
         TASKSLIST TaskList = new TASKSLIST();
        
           // DEFINIR EL SZE DEL GRAFO
         
         ////
         
         
         Resources recurso1 = new Resources ();
         recurso1.setAVAILABLE(17);
         recurso1.setCAPABILITY("ALTA");
         recurso1.setID(989);
         recurso1.setNAME("MESAS");
         recurso1.setTYPE("Material");
         
         Resources recurso2 = new Resources ();
         recurso2.setAVAILABLE(91);
         recurso2.setCAPABILITY("ALTA");
         recurso2.setID(234);
         recurso2.setNAME("SILLAS");
         recurso2.setTYPE("Material");
         
         Resources recurso3 = new Resources ();
         recurso3.setAVAILABLE(81);
         recurso3.setCAPABILITY("ALTA");
         recurso3.setID(754);
         recurso3.setNAME("PROGRAMADOR");
         recurso3.setTYPE("");
         
         Resources recurso4 = new Resources ();
         recurso4.setAVAILABLE(79);
         recurso4.setCAPABILITY("ALTA");
         recurso4.setID(26387);
         recurso4.setNAME("CONTADOR");
         recurso4.setTYPE("Recurso Humano");
         
         Resources recurso5 = new Resources ();
         recurso5.setAVAILABLE(15);
         recurso5.setCAPABILITY("ALTA");
         recurso5.setID(732);
         recurso5.setNAME("DISEÑADOR");
         recurso5.setTYPE("Recurso Humano");
         
         System.out.println();
         System.out.println();
         
         listarecurso.insert(recurso5);
         listarecurso.insert(recurso4);
         listarecurso.insert(recurso3);
         listarecurso.insert(recurso2);
         listarecurso.insert(recurso1);
         
         listarecurso.seelist();
         
         
         
        TASK tarea1 = new TASK();
        tarea1.setIDTK(1);
        tarea1.setDESCRIPTION("Ganar el curso de Datos");
        tarea1.setCOMPLEXITY(" Dificil");
        tarea1.setPRIORITY(99);

        
        TASK tarea2 = new TASK();
        tarea2.setIDTK(2);
        tarea2.setDESCRIPTION("Estudiar Algoritmos");
        tarea2.setCOMPLEXITY("Media");
        tarea2.setPRIORITY(20);

        TASK tarea3 = new TASK();
        tarea3.setIDTK(3);
        tarea3.setDESCRIPTION("Ganar las progras");
        tarea3.setCOMPLEXITY("Facil con trampa");
        tarea3.setPRIORITY(81);

        
        TASK tarea4 = new TASK();
        tarea4.setIDTK(4);
        tarea4.setDESCRIPTION("Hacer los LABS");
        tarea4.setCOMPLEXITY("Facil copiando codigo de stack overflow");
        tarea4.setPRIORITY(30);

        
        TASK tarea5 = new TASK();
        tarea5.setIDTK(5);
        tarea5.setDESCRIPTION("Hacer trampa en todas las progras como un puto mentiroso");
        tarea5.setCOMPLEXITY("Facil si es Anjelica la que revisa");
        tarea5.setPRIORITY(98);
        
        TASK tarea6= new TASK();
        tarea6.setIDTK(6);
        tarea6.setDESCRIPTION("TAREA CON GRAFO INTERNO");
        tarea6.setCOMPLEXITY("Media, el segundo examen es una picha");
        tarea6.setPRIORITY(48);

       
        

        
        TaskList.insert(tarea5);
        TaskList.insert(tarea4);
        TaskList.insert(tarea3);  // montar la lista con todas las tareas del grafo  sin un orden de prioridad 
        TaskList.insert(tarea2);
        TaskList.insert(tarea1);
        TaskList.insert(tarea6);
        
         System.out.println("----------------------------------------------------");
         TaskList.seelist();
         System.out.println("*                                                  *");
         System.out.println(" Verdadero orden de tareas para ganar algoritmos");
         TaskList.sort();
         TaskList.seelist();
         System.out.println("----------------------------------------------------");
        
        
     //   Matriz_de_adyacencia matriz = new Matriz_de_adyacencia(TaskList.getsize());
        
        TASKNODE tareaNodo = new TASKNODE();
        TASKNODE tareaNodo2 = new TASKNODE();
        TASKNODE tareaNodo3 = new TASKNODE();
        TASKNODE tareaNodo4 = new TASKNODE();
        TASKNODE tareaNodo5 = new TASKNODE();
        TASKNODE tareaNodo6 = new TASKNODE();
        

        // Aca se mete la tarea (DATA) dentro del nodo asociado a la tarea     
        tareaNodo.setVERTEX(tarea1);                           
        tareaNodo2.setVERTEX(tarea2);
        tareaNodo3.setVERTEX(tarea3);
        tareaNodo4.setVERTEX(tarea4);
        tareaNodo5.setVERTEX(tarea5);
        tareaNodo6.setVERTEX(tarea6);
        
        
        
        
        
        // Asociar las tareas con su respectivo peso/arista entre si
      /*  matriz.agregar(tareaNodo,tareaNodo2, 2);
        matriz.agregar(tareaNodo2,tareaNodo, 2);
        matriz.agregar(tareaNodo,tareaNodo5 , 11);
        matriz.agregar(tareaNodo5, tareaNodo, 11);
        matriz.agregar(tareaNodo2,tareaNodo4 , 6);
        matriz.agregar(tareaNodo4, tareaNodo2, 6);
        matriz.agregar(tareaNodo3,tareaNodo5 , 4);
        matriz.agregar(tareaNodo5,tareaNodo3 , 4);
        matriz.agregar(tareaNodo3,tareaNodo2, 7);
        matriz.agregar(tareaNodo2,tareaNodo3 , 7);
        matriz.agregar(tareaNodo4,tareaNodo3 , 1);
        matriz.agregar(tareaNodo3,tareaNodo4 , 1);
        matriz.agregar(tareaNodo,tareaNodo4 , 9);
        matriz.agregar(tareaNodo4,tareaNodo , 9);
        
       
        matriz.imprimir();        // VER LOS VERTICES QUE SE ENCIUENTRAN EN EL GRAFO
        
        Prims prims = new Prims(TaskList.getsize());
        prims.primsAlgorithm(matriz);
        
        System.out.println("ARBOL DE EXPAN MIN DE LA VARA");
        prims.printMST(matriz);
        
        
         System.out.println(" DIJSKTRA DEL GRAFO : MATRIZ ");
        DijkstrasAlgorithm minPath = new DijkstrasAlgorithm();
        minPath.dijkstra(matriz, 1);*/
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //********************************************************************************************************************************
        //-------------------------------------
        // meterle el grafo creado (matriz) a una tarea en especifico es decir, la tarea6
//        tarea6.setGrafo(matriz);
        
        
        
        
        
        // FUNCION 3.3------------------------- NO TOTALMENTE TERMINADA---------------------------------------------------------------------------------------------------
        // TEST DEL ARBOL DE LA FUNCION 3.3   
        
        WBSTREE EDT = new WBSTREE();
        
        EDT.ADDTASKStoTREE(TaskList, EDT);
        System.out.println("WBS DEL PROYECTO JUNTO CON SUS TAREAS MADRE");
        EDT.InOrden(EDT.root);
        
        //   INTERFAZ PARA OBTENER EL NODO ESPECIFICO DE LA TAREA Y DE ESA FORMA ACCEDER AL GRAFO Y TORARLE EL PRIM 
        // Y LUEGO PASAR EL ARBOL DE LA TAREA ESPECIFICA A INTERFAZ
        
        
        
        
        
        
        
        
	}
        
        
        
    }
    

