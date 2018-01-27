/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge Diaz
 */
public class IntList extends IntDataStructure{
    private IntNode last;
    
    public IntList(){
        super();
        setLast(null);        
    }
    
    public IntNode getLast() {
        return last;
    }

    public void setLast(IntNode last) {
        this.last = last;
    }
    
    public boolean insertInteger(int pNum){
        IntNode newNode = new IntNode(pNum);
        if(newNode == null){
            return false;
        }else{
            if(isEmpty()){
                setFirst(newNode);
                setLast(newNode);
            }else{
                getLast().setNext(newNode);
                setLast(newNode);
            }
        }
        setLength(getLength() + 1);   
        return true;
    }
    
    
    public int findInteger(int pNum){
        IntNode aux = getFirst();
        for (int i = 0; aux != null; aux = aux.getNext(), i++) {
            if(aux.getNumber() == pNum) return i;
        }
        return -1;        
    }
    
    public int index(int pIndex) throws Exception{
        if(pIndex > (getLength()-1) || pIndex < 0) throw new Exception("Index out of bounds");
        IntNode aux = getFirst();
        for (int i = 1; i <= pIndex; i++) {
            aux = aux.getNext();
        }
        return aux.getNumber();
    }
    
    public boolean deleteInteger(int pNum){
        IntNode last = getFirst();
        IntNode del = getFirst();
        if(del.getNumber() == pNum){
            setFirst(last.getNext());
            setLength(getLength() - 1);
            return true;
        }
        del = del.getNext();
        while(del != null){
            if(del.getNumber() == pNum){
                last.setNext(del.getNext());
                setLength(getLength() - 1);
                return true;
            }
            del = del.getNext();
            last = last.getNext();
        }
        return false;
    }

    
    
}
