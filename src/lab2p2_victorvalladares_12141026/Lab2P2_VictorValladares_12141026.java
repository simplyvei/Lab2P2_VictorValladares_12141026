package lab2p2_victorvalladares_12141026;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2P2_VictorValladares_12141026 {
    
    public static ArrayList<Animales> lista = new ArrayList();
    public static Scanner lea = new Scanner(System.in);
    
    public static Animales animal1 = new Animales();
    public static Animales animal2 = new Animales();
    public static Animales animal3 = new Animales();
    
    
    public static void main(String[] args) {
        animal1 = new Animales("Trochilidae", "Colibri", "Bosque", "Semillas", "Pajaro verde normalmente pequeño", "America", 5);
        lista.add(animal1);
        animal2 = new Animales("Panthera onca", "Jaguar", "Selvas", "Carne", "Un carnivoro pariente de las panteras, uno de los animales mas rapidos del mundo", "America", 15);
        lista.add(animal2);
        animal3 = new Animales("Orcinus orca", "Orca", "Oceanos", "Variedad de peces", "Animal maritimo que es de la familia de los delfines", "Alrededor del mundo pero especialmente en aguas frias", 30);
        lista.add(animal2);
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
            ingresar();
        }else if (op == 2){
            
        }else if (op == 3){
            
        }else if (op == 4){
            
        }else if (op == 5){
            
        }else if (op == 6){
            
        }
    }
    public static void ingresar (){
        lea.nextLine();
        System.out.print("Nombre Cientifico: ");
        String nombreC = lea.nextLine();
        System.out.print("Nombre Comun: ");
        String nombreComun = lea.nextLine();
        System.out.print("Habitat: ");
        String habitat = lea.nextLine();
        System.out.print("Alimentacion del animal: ");
        String alimentacion = lea.nextLine();
        System.out.print("Descripcion del animal: ");
        String descripcion = lea.nextLine();
        System.out.print("Posicion geografica: ");
        String geografica = lea.nextLine();
        System.out.print("Ingrese la vida del animal: ");
        int vida = lea.nextInt();
        lista.add(new Animales(nombreC, nombreComun, habitat, alimentacion, descripcion, geografica, vida));
    }
}
