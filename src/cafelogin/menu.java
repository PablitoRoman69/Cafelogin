/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafelogin;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class menu {
    //método para menú
    public void listamenu (){
     System.out.println ("Bienvenido al menú escoge una opción");
     System.out.println ("1 Dulcería");
     System.out.println ("2 Comida");
     System.out.println ("3 Bebidas");
     System.out.println("");
     //deacuerdo a la selección se muestra un nuevo menu
    Scanner sc=new Scanner (System.in);
    int opc = sc.nextInt();
     switch(opc){
            case 1:
           System.out.println(" Bienvenido a dulceria");
           dulceria ();
            break;
            case 2:
            System.out.println(" Bienvenido a Comida");
           comida ();
            break;
            case 3:
            System.out.println(" Bienvenido a Bebidas");
           bebidas ();
            break;
            default:
            System.out.println(" Elige una opcion válida");
            break;
            
        }
    }
    
    public void dulceria (){
    Queue coladulceria= new LinkedList();
   //Inserta datos en la cola
   coladulceria.offer("Sharon");
   coladulceria.offer("Pablo");
   coladulceria.offer("Cami");
   // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

   // Pedir al usuario que ingrese su nombre
        System.out.println("Por favor, ingresa tu nombre para agregarte en la cola:");
        System.out.println("");
        String nombre = scanner.nextLine();
        System.out.println("");

   // Agregar el nombre a la cola
        coladulceria.add(nombre);
        
   // Obtener la posición del nombre en la cola
        int posicion = coladulceria.size() - 1;

        // Mostrar la posición del nombre
        System.out.println("Nombre agregado en la posición: " + posicion);

        // Cerrar el Scanner
        scanner.close();
   
   System.out.println("");
    System.out.println("La cola contiene " +coladulceria.size()+" clientes");
    //Imprimir el primer elemento de la cola
    System.out.println("El primer cliente es: " +coladulceria.peek());
    System.out.println("");
    //Mientras no está vaciá se cumple el siguiente ciclo
    while (coladulceria.peek()!=null) {
       //retirar el último elemento y lo imprime
       System.out.println(coladulceria.poll());
    }
    System.out.println("");
   System.out.println("Has sido agregado a la cola espera tu turno...");
    }
    
    public void comida (){
    Queue colacomida= new LinkedList();
   //Inserta datos en la cola
   colacomida.offer("Cliente 1");
   colacomida.offer("Cliente 2");
   colacomida.offer("Cliente 3");
   // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

   // Pedir al usuario que ingrese su nombre
        System.out.println("Por favor, ingresa tu nombre para agregarte en la cola," + " por ejemplo: (Cliente X)");
        System.out.println("");
        String nombre = scanner.nextLine();
        System.out.println("");

   // Agregar el nombre a la cola
        colacomida.add(nombre);
        
   // Obtener la posición del nombre en la cola
        int posicion = colacomida.size() - 1;

   // Mostrar la posición del nombre
        System.out.println("Nombre agregado en la posición: " + posicion);

   // Cerrar el Scanner
        scanner.close();
   
    System.out.println("");
    System.out.println("La cola contiene " +colacomida.size()+" clientes");
    //Imprimir el primer elemento de la cola
    System.out.println("El primer cliente es: " +colacomida.peek());
    System.out.println("");
    //Mientras no está vaciá se cumple el siguiente ciclo
    while (colacomida.peek()!=null) {
       //retirar el último elemento y lo imprime
       System.out.println(colacomida.poll());
    }
    System.out.println("");
   System.out.println("Has sido agregado a la cola espera tu turno...");
    }
    
    public void bebidas (){
    Queue colabebidas= new LinkedList();
   //Inserta datos en la cola
   colabebidas.offer("Cliente 1");
   colabebidas.offer("Cliente 2");
   colabebidas.offer("Cliente 3");
   // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

   // Pedir al usuario que ingrese su nombre
        System.out.println("Por favor, ingresa tu nombre para agregarte en la cola," + " por ejemplo: (Cliente X)");
        System.out.println("");
        String nombre = scanner.nextLine();
        System.out.println("");

   // Agregar el nombre a la cola
        colabebidas.add(nombre);
        
   // Obtener la posición del nombre en la cola
        int posicion = colabebidas.size() - 1;

   // Mostrar la posición del nombre
        System.out.println("Nombre agregado en la posición: " + posicion);

   // Cerrar el Scanner
        scanner.close();
   
    System.out.println("");
    System.out.println("La cola contiene " +colabebidas.size()+" clientes");
    //Imprimir el primer elemento de la cola
    System.out.println("El primer cliente es: " +colabebidas.peek());
    System.out.println("");
    //Mientras no está vaciá se cumple el siguiente ciclo
    while (colabebidas.peek()!=null) {
       //retirar el último elemento y lo imprime
       System.out.println(colabebidas.poll());
    }
    System.out.println("");
   System.out.println("Has sido agregado a la cola espera tu turno...");
    }
    
}
