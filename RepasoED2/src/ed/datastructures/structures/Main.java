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
        try {
            lista.insertInteger(9);
            lista.insertInteger(5);
            lista.insertInteger(2);
            lista.insertInteger(4);
            lista.insertInteger(3);
            
            System.out.println(lista.index(4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
