/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.datastructures.main;

import ed.datastructures.structures.IntBinaryTree;
import ed.datastructures.structures.IntList;
import ed.datastructures.structures.IntQueue;
import ed.datastructures.structures.IntStack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jmda9
 */
public class DataStructureFacade {
    private IntList list;
    private IntStack stack;
    private IntQueue queue;
    private IntBinaryTree binaryTree;
    
    public DataStructureFacade(){
        setList(new IntList());
        setStack(new IntStack());
        setQueue(new IntQueue());
        setBinaryTree(new IntBinaryTree());
    }

    /**
     * @return the list
     */
    public IntList getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(IntList list) {
        this.list = list;
    }

    /**
     * @return the stack
     */
    public IntStack getStack() {
        return stack;
    }

    /**
     * @param stack the stack to set
     */
    public void setStack(IntStack stack) {
        this.stack = stack;
    }

    /**
     * @return the queue
     */
    public IntQueue getQueue() {
        return queue;
    }

    /**
     * @param queue the queue to set
     */
    public void setQueue(IntQueue queue) {
        this.queue = queue;
    }

    /**
     * @return the tree
     */
    public IntBinaryTree getBinaryTree() {
        return binaryTree;
    }

    /**
     * @param binaryTree the tree to set
     */
    public void setBinaryTree(IntBinaryTree binaryTree) {
        this.binaryTree = binaryTree;
    }

    public String insertInList(int num) {
        try {
            getList().insertInteger(num);
        } catch (Exception ex) {
            return ex.getMessage();
        }
        return "Dato agregado a la lista";
    }

    public String insertInStack(int num) {
        getStack().push(num);
        return "Dato agregado a la pila";
    }

    public String insertInQueue(int num) {
        getQueue().enqueueInteger(num);
        return "Dato agregado a la cola";
    }

    public String insertInBinaryTree(int num) {
        return getBinaryTree().insertInteger(num) ? "Dato agregado al arbol" : "El numero ya existe en el arbol";
    }

    public boolean deleteFromList(int num) {
        return getList().deleteInteger(num);
    }

    public int deleteFromStack() throws Exception {
        return getStack().pop();
    }

    int dequeueFromQueue() throws Exception {
        return getQueue().dequeue();
    
    }

    
}
