/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class RESOURCE_LIST {
    ///////
    
    public class Nodo{
            
        private Resources data;
        private Nodo next;

        public Nodo() {
            next = null;
            data = null;
        }

        public Nodo(Resources num) {
            this.data = num;

        }

        public void setData(Resources num) {
            this.data = num;
        }

        public Resources getData() {
            return this.data;
        }

        public Nodo getNext() {
            return this.next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }
        }
    
    
    
    private Nodo Head;
    private Nodo Tail;
    private Nodo Current;
    private int size;

    
    
    public int getsize() {
        return this.size;
    }
    
    

    public void insert(Resources num) {
        Nodo temp = new Nodo(num);
        if (Head == null) {
            Head = temp;
            Tail = temp;
            size++;
        } else {
            Tail.setNext(temp);
            Tail = temp;
            size++;
        }
    }
    
    

    public boolean findData(Resources num) {
        Nodo temp = this.Head;
        while (temp != null) {
            if (temp.getData() == num) {
                //System.out.println(temp.getData());
                return true;
            } else {
                temp = temp.getNext();
            }
        }
        return false;
    }
    
    
    

    public void seelist() {
        Nodo temp = Head;
        while (temp != null) {
            System.out.println(temp.getData().getNAME());
            temp = temp.getNext();
        }
    }
    
    
    
    
    public void elementposition(Resources num){
            Nodo temp = Head;
            int cont= 0;
            while(temp != null){
                if(temp.getData() == num){
                    System.out.println("The position of the element is: " + cont);
                    break;
                }
                else{
                    temp = temp.next;
                    cont++;
                }}
        }
    
  
    
    
    
    
}
