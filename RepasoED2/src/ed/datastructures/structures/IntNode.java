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
public class IntNode {

   
    private int number;
    private IntNode right;
    private IntNode left;
    
    public IntNode(int pNumber){
        setNumber(pNumber);
        setRight(null);
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
    public IntNode getRight() {
        return right;
    }

    /**
     * @param right the next to set
     */
    public void setRight(IntNode right) {
        this.right = right;
    }
    
     /**
     * @return the left
     */
    public IntNode getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(IntNode left) {
        this.left = left;
    }
}
