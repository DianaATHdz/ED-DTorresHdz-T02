/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dtorresh.t02;

/**
 *
 * @author DianaAlessa
 */
public class Node <T> {
    T data;
    Node next;
    
    public Node (T d){
        this.data = d;
    }

    public void printS(){
        System.out.println(data + "\n ↓");
    }
}
