/*
  Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ejer6g8;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Ejer6g8 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList <Producto> producto =new ArrayList();
        ProductoUtilidades metodosProducto= new ProductoUtilidades();
        boolean salir=true;
        int opcM;
        while (salir) {
            while (salir) {
            System.out.println("------------------Menu--------------------");
            System.out.println("--.1 Introducir un producto             --");
            System.out.println("--.2 Modificar precio                   --");
            System.out.println("--.3 Eliminar un producto               --");
            System.out.println("--.4 Mostrar lista de productos         --");
            System.out.println("--.5 Salir                              --");
            System.out.println("------------------------------------------");
            opcM = leer.nextInt();
            switch (opcM) {
                case 1:
                    metodosProducto.cargarProducto();
                    break;
                case 2:
                    metodosProducto.modificarProducto();
                    break;
                case 3:
                    metodosProducto.borrarProducto();
                    break;
                case 4:
                    metodosProducto.mostrarProducto();
                    break;
                case 5:
                    salir=false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");;
            }
            
            
            
        }
        
        
        
        
        
        
    }
    
}
}
