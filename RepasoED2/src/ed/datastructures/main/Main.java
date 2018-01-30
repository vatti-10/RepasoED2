package ed.datastructures.main;
import java.io.*;
import java.util.Arrays;

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
    
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static PrintStream out = System.out;
    private static DataStructureFacade facade = new DataStructureFacade();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        out.println(" ---- ---- Bienvenido ---- ----");
        String option;
        boolean end;
        do {            
            showMainMenu();
            option = readOption();
            end = executeAction(option);
        } while (!end);
        out.println("Gracias por usar este programa");        
    }
    
    private static String readOption()throws java.io.IOException{		
        String option;
        out.print("Seleccione una opción: ");
        option = in.readLine();
        return option;
    }
        
    private static void showMainMenu() {
        String menu = "\nSeleccione una opción:\n";
        menu += "1. Insertar un número en la lista.\n";
        menu += "2. Insertar un número en la pila.\n";
        menu += "3. Insertar un número en la cola.\n";
        menu += "4. Insertar un número en el árbol binario.\n";
        menu += "5. Intercambiar un número entre las diferentes estructuras.\n";
        menu += "6. Salir.\n";
        out.println(menu);
    }

    private static void showSubMenu1() {
        String menu = "Seleccione de donde desea obtener el número:\n";
        menu += "1. De la lista.\n";
        menu += "2. De la pila.\n";
        menu += "3. De la cola.\n";
        menu += "4. Salir.\n";
        out.println(menu);
    }

    private static boolean executeAction(String pOption) throws IOException {
        boolean end = false;
        switch(pOption){
                case "1":
                        insertInList();
                        break;

                case "2":
                        insertInStack();
                        break;

                case "3":
                        insertInQueue();
                        break;
                
                case "4":
                        insertInBinaryTree();
                        break;
                 
                case "5":
                        intChangeSubMenus();
                        break;
                        
                case "6":
                        end = true;
                        break;

                default:
                        out.println();
                        out.println("Opción invalida.");
                        out.println();
                        break;
        }
        return end;
    }

    private static void insertInList() throws IOException {
        int num = readNumberToInsert();
        out.println(facade.insertInList(num));
    }

    private static int readNumberToInsert() throws IOException {
        int num;
        out.println("Ingrese el número a insertar:");
        try {
            num = Integer.parseInt(in.readLine());
        } catch (NumberFormatException e) {
            out.println("Error, dato inválido.");
            return readNumberToInsert();
        }        
        return num;
    }

    private static void insertInStack() throws IOException {
        int num = readNumberToInsert();
        out.println(facade.insertInStack(num));
    }

    private static void insertInQueue() throws IOException {
        int num = readNumberToInsert();
        out.println(facade.insertInQueue(num));
    }

    private static void insertInBinaryTree() throws IOException {
        int num = readNumberToInsert();
        out.println(facade.insertInBinaryTree(num));
    }

    private static void intChangeSubMenus() throws IOException {
        String fromOption;
        String toOption = "0";
        boolean salir;
        do {            
            showSubMenu1();
            fromOption = readOption();
            if(!fromOption.equals("4")){
                showSubMenu2();
                toOption = readOption();
            }            
            salir = executeActionSubmenu(fromOption, toOption);
        } while (!salir);
    }

    private static void showSubMenu2() {
        String menu = "Seleccione a donde desea ingresar el número:\n";
        menu += "1. A la lista.\n";
        menu += "2. A la pila.\n";
        menu += "3. A la cola.\n";
        menu += "4. Al arbol binario.\n";
        menu += "5. Salir.\n";
        out.println(menu);
    }

    private static boolean executeActionSubmenu(String fromOption, String toOption) throws IOException {
        String[] validToOptions = {"1","2","3","4","5"};
        if(!Arrays.asList(validToOptions).contains(toOption)) fromOption = "0";
        boolean end = false;
        switch(fromOption){
                case "1":
                        end = fromListTo(toOption);
                        break;

                case "2":
                        end = fromStackTo(toOption);
                        break;

                case "3":
                        end = fromQueueTo(toOption);
                        break;           
                        
                case "4":
                        end = true;
                        break;

                default:
                        out.println();
                        out.println("Opción invalida.");
                        out.println();
                        break;
        }
        return end;
    }

    private static boolean fromListTo(String toOption) throws IOException {
        if(toOption.equals("5")) return true;
        out.println("La lista posee los siguientes datos:");
        out.println(facade.getList().toString());
        out.println("¿Cual valor desea intercambiar?");
        try {
            int numToExchange = Integer.parseInt(in.readLine());
            if(facade.deleteFromList(numToExchange)){
                insertIntoExchange(toOption, numToExchange);
            }else{
                out.println("Error, el numero no se encuentra en la lista");
                return fromListTo(toOption);
            }
        } catch (NumberFormatException e) {
            out.println("Error, dato inválido.");
            return fromListTo(toOption);
        } catch (Exception ex){
            out.println(ex.getMessage());
        }        
        return true;
        
    }

    private static void insertIntoExchange(String toOption, int numToExchange) {
        switch(toOption){
            case "1":
                out.println(facade.insertInList(numToExchange));
                break;
            case "2":
                out.println(facade.insertInStack(numToExchange));
                break;
            case "3":
                out.println(facade.insertInQueue(numToExchange));
                break;
            case "4":
                out.println(facade.insertInBinaryTree(numToExchange));
                break;
        }
    }

    private static boolean fromStackTo(String toOption) {
        if(toOption.equals("5")) return true;
        try {
            int numToExchange = facade.deleteFromStack();
            insertIntoExchange(toOption, numToExchange);
        } catch (Exception e) {
            out.println(e.getMessage());
        }
        return true;
    }

    private static boolean fromQueueTo(String toOption) {
        if(toOption.equals("5")) return true;
        try {
            int numToExchange = facade.dequeueFromQueue();
            insertIntoExchange(toOption, numToExchange);
        } catch (Exception e) {
            out.println(e.getMessage());
        }
        return true;
    }
    
}
