/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_clase;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Ejercicio_clase {

    /**Scanner teclado = new Scanner(System.in);
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ICrudResgistroAlojamiento Registro = new ImpMap();
        
        int opc = 0;
        int opc2 = 0;
        
        while (opc != 5) {
            System.out.println("DIGITE LA OPCION DEL MENU");
            System.out.println("1.AGREGAR");
            System.out.println("2.BUSCAR");
            System.out.println("3.MOSTRAR");
            System.out.println("4.ELIMINAR");
            System.out.println("5.SALIR");
            opc = teclado.nextInt();
            switch (opc) {
                case 1 -> {
                   System.out.println("DIGITE LA OPCION");
                   System.out.println("Que tipo de alojamiento desesa agregar: ");
                   System.out.println("1.Cabanas");
                   System.out.println("2.Habitacion");
                   System.out.println("3.SALIR");
                   opc2 = teclado.nextInt();
            
                   switch (opc2)
                   {
                       case 1 -> {
                       System.out.println("Ingrese el número de cuartos:");
                       int numCuartos = teclado.nextInt();
                       teclado.nextLine();
                       System.out.println("Ingrese el código:");
                       int codigo = teclado.nextInt();
                       teclado.nextLine();
                       System.out.println("Ingrese la dirección:");
                       String direccion = teclado.nextLine();
                       System.out.println("Ingrese la ciudad:");
                       String ciudad = teclado.nextLine();
                       System.out.println("Ingrese el país:");
                       String pais = teclado.nextLine();
                       Alojamiento Cab = new Cabaña(numCuartos, codigo, direccion, ciudad, pais);
                       Registro.agregarAlojamiento(Cab);  
                       System.out.println(Cab + "Registrado en el sistema");
                       }
                       
                       case 2 -> {
                       System.out.println("Ingrese el número de personas (Maximo 3:");
                       int numPer = teclado.nextInt();
                       teclado.nextLine();
                       System.out.println("Ingrese el código:");
                       int codigo = teclado.nextInt();
                       teclado.nextLine();
                       System.out.println("Ingrese la dirección:");
                       String direccion = teclado.nextLine();
                       System.out.println("Ingrese la ciudad:");
                       String ciudad = teclado.nextLine();
                       System.out.println("Ingrese el país:");
                       String pais = teclado.nextLine();
                       Alojamiento Hab = new Habitación(numPer, codigo, direccion, ciudad, pais);
                       Registro.agregarAlojamiento(Hab);
                       System.out.println(Hab + "\nRegistrado en el sistema");
                       }
                   }
                 }
                case 2 -> {
                    System.out.println("Digite el codigo que desea buscar");
                    int Busc = teclado.nextInt();
                    Alojamiento buscando = Registro.buscar(Busc);
                    if (buscando != null) {
                    Cotización CotiHab = new Cotización(LocalDate.now(), LocalDate.of(2024, Month.APRIL, 22), buscando);
                    System.out.println(CotiHab);
                    } else {
                    System.out.println("El alojamiento no se encuentra registrado");
                    }
                }
                
                case 3 -> {
                    System.out.println("\tTodos los alojamientos presentes:");
                    for (Alojamiento a : Registro.obtenerAlojamientos()) {
                    Cotización Coti = new Cotización(LocalDate.now(), LocalDate.of(2024, Month.APRIL, 22), a);
                    System.out.println(Coti);                
                    }
                }
                
                case 4 -> {
                    System.out.println("Digite el codigo que desea eliminar");
                    int Busc2 = teclado.nextInt();                  
                    Alojamiento eliminando = Registro.buscar(Busc2);
                    Registro.eliminar(eliminando);
                    eliminando = Registro.buscar(Busc2);
                    if (eliminando != null) {
                        Cotización CotHab = new Cotización(LocalDate.now(), LocalDate.of(2024, Month.APRIL, 22), eliminando);
                        System.out.println(CotHab);
                    } else {
                        System.out.println("El alojamiento no encuentrado registrado / Ha sido eliminado con exito ");
                    }
                }
                    
            }
        }
    }


    
}
