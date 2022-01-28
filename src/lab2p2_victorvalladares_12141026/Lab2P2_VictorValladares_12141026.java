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
        lista.add(animal3);
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
                        "7. Eliminar animal\n" +
                        "Ingrese la opcion: ");
        int op = lea.nextInt();
        System.out.println("-----------------------------------------------");
        return op;
    }
    public static void realizar(int op){
        if (op == 0){
            System.exit(0);
        }else if (op == 1){
            ingresar();
        }else if (op == 2){
            editar();
        }else if (op == 3){
            imprimirPos();
        }else if (op == 4){
            imprimirCompleta();
        }else if (op == 5){
            imprimirCientifico();
        }else if (op == 6){
            alimentar();
        }else if (op == 7){
            eliminar();
        }
    }
    public static void ingresar (){
        lea.nextLine();
        System.out.print("Nombre Cientifico: ");
        String nombreC = lea.nextLine();
        for (Animales animales : lista){
            if (animales.getNombreC().equals(nombreC)){
                System.out.print("Nombre ingresado ya existe, intente de nuevo: ");
                nombreC = lea.nextLine();
            }
        }
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
    public static void editar(){
        int pos = 0;
        lea.nextLine();
        System.out.print("Ingrese el nombre cientifico del animal que desea editar: ");
        String nombre = lea.nextLine();
        for (Animales animales : lista){
            if (animales.getNombreC().equals(nombre)){
                break;
            }
            pos++;
        }
        if (pos == lista.size()){
            pos -= 1;
        }
        System.out.println("1. Todos los atributos");
        System.out.println("2. Solo una parte");
        System.out.print("Ingrese la opcion: ");
        int opcion = lea.nextInt();
        if(opcion == 1){
            editarCompleto(pos);
        }else if(opcion == 2){
            editarParte(pos);
        }
    }
    public static void imprimirPos(){
        System.out.print("Ingrese la posicion que desea imprimir: ");
        int pos = lea.nextInt();
        System.out.println("-----------------------------------------------");
        System.out.println(lista.get(pos).toString());
    }
    public static void imprimirCompleta(){
        for (Animales animales : lista){
            System.out.println(animales.toString());
            System.out.println("-----------------------------------------------");
        }
    }
    public static void imprimirCientifico(){
        int pos = 0;
        lea.nextLine();
        System.out.print("Ingrese el nombre cientifico del animal que desea imprimir: ");
        String nombre = lea.nextLine();
        System.out.println("-----------------------------------------------");
        for (Animales animales : lista){
            if (nombre.equals(animales.getNombreC())){
                break;
            }else{
               pos++; 
            }
        }
        if (pos == lista.size()){
            pos --;
        }
        System.out.println(lista.get(pos).toString());
    }
    public static void alimentar(){
        System.out.print("Ingrese la posicion del animal que va a comer: ");
        int pos1 = lea.nextInt();
        System.out.print("Ingrese la posicion del animal que va a ser comido: ");
        int pos2 = lea.nextInt();
        try{
            lista.get(pos1).setVida(lista.get(pos2).getVida()+lista.get(pos1).getVida());
            lista.remove(pos2);
        }catch(Exception e){
            System.out.println("Una de las posiciones ingresadas no son validas");
        }
    }
    public static void eliminar(){
        int pos = 0;
        lea.nextLine();
        System.out.print("Ingrese el nombre cientifico del animal que desea eliminar: ");
        String nombre = lea.nextLine();
        for (Animales animales : lista){
            if (nombre.equals(animales.getNombreC())){
                break;
            }else{
               pos++; 
            }
        }
        if (pos == lista.size()){
            pos --;
        }
        lista.remove(pos);
    }
    public static void editarCompleto(int pos){
        lea.nextLine();
        System.out.print("Nuevo nombre cientifico: ");
        lista.get(pos).setNombreC(lea.nextLine());
        System.out.print("Nuevo nombre comun: ");
        lista.get(pos).setNombreComun(lea.nextLine());
        System.out.print("Nuevo habitat: ");
        lista.get(pos).setHabitat(lea.nextLine());
        System.out.print("Nueva alimentacion: ");
        lista.get(pos).setAlimentacion(lea.nextLine());
        System.out.print("Nueva descripcion: ");
        lista.get(pos).setDescripcion(lea.nextLine());
        System.out.print("Nueva posicion geografica: ");
        lista.get(pos).setGeografica(lea.nextLine());
        System.out.print("Nueva vida: ");
        lista.get(pos).setVida(lea.nextInt());
    }
    public static void editarParte(int pos){
        lea.nextLine();
        System.out.println("1. Nombre Cientifico");
        System.out.println("2. Nombre Comun");
        System.out.println("3. Habitat");
        System.out.println("4. Alimentacion");
        System.out.println("5. Descripcion");
        System.out.println("6. Posicion Geografica");
        System.out.println("7. Vida");
        System.out.print("Ingrese la opcion: ");
        int op = lea.nextInt();
        if (op == 1){
            System.out.print("Nuevo nombre cientifico: ");
            lista.get(pos).setNombreC(lea.nextLine());
        }else if (op == 2){
            System.out.print("Nuevo nombre comun: ");
            lista.get(pos).setNombreComun(lea.nextLine());
        }
        else if (op == 3){
            System.out.print("Nuevo habitat: ");
            lista.get(pos).setHabitat(lea.nextLine());
        }
        else if (op == 4){
            System.out.print("Nueva alimentacion: ");
            lista.get(pos).setAlimentacion(lea.nextLine());
        }
        else if (op == 5){
            System.out.print("Nueva descripcion: ");
            lista.get(pos).setDescripcion(lea.nextLine());
        }
        else if (op == 6){
            System.out.print("Nueva posicion geografica: ");
            lista.get(pos).setGeografica(lea.nextLine());
        }
        else if (op == 7){
            System.out.print("Nueva vida: ");
            lista.get(pos).setVida(lea.nextInt());
        }
    }
}
