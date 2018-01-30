/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.datastructures.structures;

/**
 *
 * @author jmda9
 */
public class IntBinaryTree extends IntDataStructure{
    
    public IntBinaryTree(){
        super();        
    }
    
    public boolean insertInteger(int pNum) {
        if(isSetInteger(pNum)) return false;
        return insertRecursive(getFirst(), pNum);
    }
    
    public boolean isSetInteger(int pNum){
        return isSetIntegerRecursive(getFirst(), pNum);
    }

    private boolean isSetIntegerRecursive(IntNode pRoot, int pNum) {
        if(pRoot == null){
            return false;
        }else if(pRoot.getNumber() == pNum){
            return true;
        }else if(pNum > pRoot.getNumber()){
            return isSetIntegerRecursive(pRoot.getRight(), pNum);
        }else{
            return isSetIntegerRecursive(pRoot.getLeft(), pNum);
        }
    }

    private boolean insertRecursive(IntNode pRoot, int pNum) {
        if(getFirst() == null){
            setFirst(new IntNode(pNum));
            setLength(getLength() + 1);
            return true;
        }else if(pNum > pRoot.getNumber()){
            if(pRoot.getRight() == null){
                pRoot.setRight(new IntNode(pNum));
                setLength(getLength() + 1);
                return true;
            }else{
                return insertRecursive(pRoot.getRight(), pNum);
            }
        }else{
            if(pRoot.getLeft() == null){
                pRoot.setLeft(new IntNode(pNum));
                setLength(getLength() + 1);
                return true;
            }else{
                return insertRecursive(pRoot.getLeft(), pNum);
            }
        }
    }
    
    public String printPreOrder() throws Exception{
        if(isEmpty()) throw new Exception("El arbol esta vacio");
        return printPreOrderRecursive(getFirst());
    }

    private String printPreOrderRecursive(IntNode pRoot) {
        if(pRoot == null) return "";
        return pRoot.getNumber() + ", " + printPreOrderRecursive(pRoot.getLeft()) + printPreOrderRecursive(pRoot.getRight());
    }
    
    public String printInOrder() throws Exception{
        if(isEmpty()) throw new Exception("El arbol esta vacio");
        return printInOrderRecursive(getFirst());
    }

    private String printInOrderRecursive(IntNode pRoot) {
        if(pRoot == null) return "";
        return printInOrderRecursive(pRoot.getLeft()) + pRoot.getNumber() + ", " + printInOrderRecursive(pRoot.getRight());
    }
    
    public String printPostOrder() throws Exception{
        if(isEmpty()) throw new Exception("El arbol esta vacio");
        return printPostOrderRecursive(getFirst());
    }

    private String printPostOrderRecursive(IntNode pRoot) {
        if(pRoot == null) return "";
        return printPostOrderRecursive(pRoot.getLeft()) + printPostOrderRecursive(pRoot.getRight()) + pRoot.getNumber() + ", ";
    }
}
