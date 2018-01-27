/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge Diaz
 */
public class IntNode {
    private int number;
    private IntNode next;
    
    public IntNode(int pNumber){
        setNumber(pNumber);
        setNext(null);
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the next
     */
    public IntNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(IntNode next) {
        this.next = next;
    }
}
