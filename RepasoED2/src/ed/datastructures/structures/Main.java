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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntList lista = new IntList();
        IntBinaryTree arbin = new IntBinaryTree();
        try {
            arbin.insertInteger(18);
            arbin.insertInteger(35);
            arbin.insertInteger(5);
            arbin.insertInteger(1);
            arbin.insertInteger(99);
            arbin.insertInteger(22);
            arbin.insertInteger(15);
            arbin.insertInteger(30);
            System.out.println(arbin.printInOrder());
            System.out.println(arbin.printPreOrder());
            System.out.println(arbin.printPostOrder());
            System.out.println(arbin.getLength());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
