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
public class IntQueue extends IntDataStructure{
    private IntNode last;
    
    public IntQueue(){
        super();
        setLast(null);
    }
    
    public boolean enqueueInteger(int pNum){
        IntNode newNode = new IntNode(pNum);
        if(isEmpty()){
            setFirst(newNode);            
        }else{
            getLast().setRight(newNode);            
        }
        setLast(newNode);
        setLength(getLength() + 1);
        return true;
    }
    
    public int dequeue() throws Exception{
        if(isEmpty()) throw new Exception("La cola está vacia");
        int num = getFirst().getNumber();
        setFirst(getFirst().getRight());
        if(getFirst() == null){
            setLast(null);
        }
        setLength(getLength() - 1);
        return num;
    }

    public IntNode getLast() {
        return last;
    }

    public void setLast(IntNode last) {
        this.last = last;
    }
    
    
    
}
