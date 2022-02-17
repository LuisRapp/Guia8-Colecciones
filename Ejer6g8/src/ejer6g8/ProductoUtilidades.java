/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer6g8;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Rapp
 */
public class ProductoUtilidades {

    HashMap<String, Integer> productos = new HashMap();

    /////////
    public void cargarProducto() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String nombreProducto;
        int precioProducto;
        System.out.println("Ingrese el nombre del producto");
        nombreProducto = leer.next();
        System.out.println("Ingrese el precio del producto");
        precioProducto = leer.nextInt();
        productos.put(nombreProducto, precioProducto);

    }

    ////////////////////////
    public void mostrarProducto() {
        productos.entrySet().stream().forEach((entry) -> {
            System.out.println("Producto: " + entry.getKey()+
                   "\n" + " Precio: " + entry.getValue());
        });

    }

    /////////////////////
    public void modificarProducto() {
        String productoModificar;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el producto a modificar");
        productoModificar = leer.next();
        if (productos.containsKey(productoModificar)){
            System.out.println("Ingrese el nuevo precio del producto");
            productos.put(productoModificar,leer.nextInt());
        } else {
            System.out.println("El producto no existe");
        }
    }
    ///////////////////////////
     public void borrarProducto() {
        String productoModificar;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el producto a eliminar");
        productoModificar = leer.next();
        if (productos.containsKey(productoModificar)){
            productos.remove(productoModificar);
        } else {
            System.out.println("El producto no existe");
        }
    }
    
    
    
    
    
    

}
