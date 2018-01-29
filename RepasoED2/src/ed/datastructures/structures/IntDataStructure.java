package ed.datastructures.structures;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge Diaz
 */
public abstract class IntDataStructure {    
    private IntNode first;
    private int length;
    
    public IntDataStructure(){
        setFirst(null);
        setLength(0);
    }

    /**
     * @return the first
     */
    public IntNode getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(IntNode first) {
        this.first = first;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    protected void setLength(int length) {
        this.length = length;
    }
    
    public boolean isEmpty(){
        return getLength() == 0;
    }
    
}
