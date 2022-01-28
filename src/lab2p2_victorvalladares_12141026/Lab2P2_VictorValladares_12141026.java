package lab2p2_victorvalladares_12141026;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2P2_VictorValladares_12141026 {
    
    public static ArrayList<Animales> lista = new ArrayList();
    public static Scanner lea = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            realizar( menu() );
        }while(true);
    }
    public static int menu(){
        System.out.println("-----------------------------------------------");
        System.out.println("0. Salir");
        System.out.print("1. Ingresar un animal\n" +
                        "2. Editar datos\n" +
                        "3. Imprimir los animales por posicion\n" +
                        "4. Imprimir lista completa\n" +
                        "5. Imprimir nombre por nombre cientifico\n" +
                        "6. Alimentar\n" +
                        "Ingrese la opcion: ");
        return lea.nextInt();
    }
    public static void realizar(int op){
        if (op == 0){
            System.exit(0);
        }else if (op == 1){
            
        }else if (op == 2){
            
        }else if (op == 3){
            
        }else if (op == 4){
            
        }else if (op == 5){
            
        }else if (op == 6){
            
        }
    }
}
