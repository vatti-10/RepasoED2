/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge Diaz
 */
public class IntQueue extends IntDataStructure{
    private IntNode last;
    
    public IntQueue(){
        super();
        setLast(null);
    }

    public IntNode getLast() {
        return last;
    }

    public void setLast(IntNode last) {
        this.last = last;
    }
    
    
    
}
