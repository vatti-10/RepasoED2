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
public class IntList extends IntDataStructure{
    private IntNode last;
    
    public IntList(){
        super();
        setLast(null);        
    }
    
    private IntNode getLast() {
        return last;
    }

    private void setLast(IntNode last) {
        this.last = last;
    }
    
    public boolean insertInteger(int pNum) throws Exception{
        IntNode newNode = new IntNode(pNum);
        if(findInteger(pNum) != -1){
            throw new Exception("Number already exists on the list");
        }else{
            if(isEmpty()){
                setFirst(newNode);
                setLast(newNode);
            }else if(getFirst().getNumber() > pNum){
                newNode.setRight(getFirst());
                setFirst(newNode);
            }else if(getLast().getNumber() < pNum){
                getLast().setRight(newNode);
                setLast(newNode);
            }else{
                boolean found = false;
                IntNode aux = getFirst();
                while(!found){
                    if(aux.getNumber() < pNum && aux.getRight().getNumber() > pNum){
                        newNode.setRight(aux.getRight());
                        aux.setRight(newNode);
                        found = true;
                    }else{
                        aux = aux.getRight();
                    }
                }                
            }
        }
        setLength(getLength() + 1);   
        return true;
    }
    
    
    public int findInteger(int pNum){
        IntNode aux = getFirst();
        for (int i = 0; aux != null; aux = aux.getRight(), i++) {
            if(aux.getNumber() == pNum) return i;
        }
        return -1;        
    }
    
    public int index(int pIndex) throws Exception{
        if(pIndex > (getLength()-1) || pIndex < 0) throw new Exception("Index out of bounds");
        IntNode aux = getFirst();
        for (int i = 1; i <= pIndex; i++) {
            aux = aux.getRight();
        }
        return aux.getNumber();
    }
    
    public boolean deleteInteger(int pNum){
        IntNode last = getFirst();
        IntNode del = getFirst();
        if(del.getNumber() == pNum){
            setFirst(last.getRight());
            setLength(getLength() - 1);
            return true;
        }
        del = del.getRight();
        while(del != null){
            if(del.getNumber() == pNum){
                last.setRight(del.getRight());
                setLength(getLength() - 1);
                return true;
            }
            del = del.getRight();
            last = last.getRight();
        }
        return false;
    }
    
    @Override
    public String toString(){
        if(isEmpty()) return "No data stored on list";
        String resul = "";
        IntNode aux = getFirst();
        while(aux != null){
            resul = resul + aux.getNumber() + " - ";
            aux = aux.getRight();
        }
        resul = resul.substring(0, resul.length()-3);
        return resul;
    }

    
    
}
