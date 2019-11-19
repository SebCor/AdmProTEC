/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Sebastian
 */
public class WBSTREE {
    
    /////
    
    
    public class Node{
        public TASK data;
        public Node right;
        public Node left;
        
        
        
        public Node(){};
        
        
        public Node(TASK data){
            this.data= data;
        }

        /**
         * @return the data
         */
        public TASK getData() {
            return data;
        }

        /**
         * @param data the data to set
         */
        public void setData(TASK data) {
            this.data = data;
        }

        /**
         * @return the right
         */
        public Node getRight() {
            return right;
        }

        /**
         * @param right the right to set
         */
        public void setRight(Node right) {
            this.right = right;
        }

        /**
         * @return the left
         */
        public Node getLeft() {
            return left;
        }

        /**
         * @param left the left to set
         */
        public void setLeft(Node left) {
            this.left = left;
        }
    }
        
        
        //Atributos del arbol
        
        Node root;
        int size;
        
        public void add(TASK data){ 
            Node nuevo = new Node(data);
            
            
            if(root == null){
                root= nuevo;
                size++;
            }
            else{

                ubicar(root,nuevo);
                size++;

            }
            
              
        }
        
        public void ADDTASKStoTREE(TASKSLIST List,WBSTREE tree){
         
            TASKNODE temp= List.Head;
            
            while(temp!= null){
                tree.add(temp.VERTEX);
                temp= temp.Next;
            }
              
        }
        
        
        
        
        
        
        
        
        
        public void ubicar (Node nodocurr, Node nodonuevo){
            
        if(nodocurr.data.getPRIORITY() > nodonuevo.data.getPRIORITY()){   // si el dato del current es menor que le dato que voy a agregar
            
            if(nodocurr.left == null){
                nodocurr.left = nodonuevo;   // si el current tiene espacio a la izq libre entonces se le setea
            }
            else{ 
            ubicar(nodocurr.left,nodonuevo);}   // sino entonces se manda el codigo de nuevo desde el left del current
        }
        
        else if(nodocurr.data.getPRIORITY() < nodonuevo.data.getPRIORITY()){  // si el dato del current es mayor que le dato que voy a agregar
            
            if(nodocurr.right == null){
                nodocurr.right = nodonuevo;   // si el current tiene espacio a la der libre entonces se le setea
            }
            else{
            
            ubicar(nodocurr.right,nodonuevo);   // se manda el codigo desde el right del current 
        }
        
        }
        }
        
        
        
public void recorrerInOrden(){
            
    if(root.left != null && root.right != null){
        
        Node temp= root;
        
        if (temp.left != null){
            InOrden(temp.left);
        } 
        if(temp.right != null){
            InOrden(temp.right);
        }
    }   
    else{
        System.out.println(root.data);
    }
}





public void recorrerPreOrden(){
            
    if(root.left != null && root.right != null){
        
        Node temp= root;
        
        if (temp.left != null){
                PreOrden(temp.left);
        } 
        if(temp.right != null){
            PreOrden(temp.right);
        }
    }   
    else{
        System.out.println(root.data);
    }
}




public void recorrerPostOrden(){
            
    if(root.left != null && root.right != null){
        
        Node temp= root;
        
        if (temp.left != null){
            PostOrden(temp.left);
        } 
        if(temp.right != null){
            PostOrden(temp.right);
        }
    }   
    else{
        System.out.println(root.data);
    }
}




public void InOrden(Node temp){ 
    if (temp.left != null){     // mientras el arbol tenga un nodo a la izquierda
        InOrden(temp.left);     // se llama al metodo recursivamente para recorrer desde ese nodo izq existente
    }
    // Hasta que ya llegue al final del camino izq del nodo entonces se imprime la data del nodo 
    System.out.println(temp.data.getDESCRIPTION());  
    if (temp.right != null){     // mientras el arbol tenga un nodo a la izquierda
        InOrden(temp.right);     // se llama al metodo recursivamente para recorrer desde ese nodo izq existente
    }
       
}


public void PreOrden(Node temp){ 
    
    System.out.println(temp.data);
 
    if (temp.left != null){     
        PreOrden(temp.left);    
    }      
    if (temp.right != null){     
        PreOrden(temp.right);     
    }
       
}




public void PostOrden(Node temp){ 
    if (temp.left != null){     
        PostOrden(temp.left);     
    }
    
    if (temp.right != null){     
        PostOrden(temp.right);     
    }
    
    System.out.println(temp.data);
       
}
    
    
    
    
    
    
    
    
    
    
}
