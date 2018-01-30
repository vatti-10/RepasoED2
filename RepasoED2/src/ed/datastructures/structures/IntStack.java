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
public class IntStack extends IntDataStructure{
    
    public IntStack(){
        super();
    }
    
    public boolean push(int pNum){
        IntNode newNode = new IntNode(pNum);
        if(newNode == null){
            return false;
        }else{
            if(isEmpty()){
                setFirst(newNode);
            }else{
                newNode.setRight(getFirst());
                setFirst(newNode);
            }            
        }    
        setLength(getLength() + 1);
        return true;
    }
    
    public int pop() throws Exception{
        if(isEmpty()) throw new Exception("La pila esta vacia");
        IntNode toPop = getFirst();
        setFirst(toPop.getRight());
        setLength(getLength() - 1);
        return toPop.getNumber();
    }
}
