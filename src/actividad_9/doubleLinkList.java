/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_9;

/**
 *
 * @author Daniel Salinas
 */
public class doubleLinkList {
    nodeClass first;
    nodeClass last;
   public void insertFirst(int d){
       nodeClass nodo = new nodeClass(d);
       if(isEmpty()) {
          this.first=nodo;
          this.last=nodo;
       
       } else {
           nodo.next = first;
           first.prev = nodo;
           first = nodo;
       }
   
   }
   public boolean isEmpty(){
       if(first == null && last == null){
           return true;
       } else {
           return false;
       }
   } 
}
