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
public class nodeClass {
    int data;
    nodeClass next;
    nodeClass prev;
    public nodeClass (int data){
          this.data=data;
          this.next=null;
          this.prev=null;

    }
}
