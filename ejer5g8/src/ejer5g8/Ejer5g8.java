/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen
 repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
 guardará el país en el conjunto y después se le preguntará al usuario si quiere
 guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
 guardados en el conjunto.
 Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
 recordar como se ordena un conjunto.
 Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
 se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
 ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
 se le informará al usuario.
 */
package ejer5g8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Ejer5g8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        HashSet<String> paises = new HashSet();
        ArrayList<String> lista;
        int opc;
        String paisCargar, paisEliminar;
        do {
            System.out.println("------------------Menu--------------------");
            System.out.println("--.1 Cargar  Pais                       --");
            System.out.println("--.2 Mostrar Paises                     --");
            System.out.println("--.3 Eliminar Pais                      --");
            System.out.println("--.4 Salir                              --");
            System.out.println("------------------------------------------");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese un pais");
                    paisCargar = leer.next();
                    paises.add(paisCargar);
                    break;
                case 2:
                    System.out.println("--Lista de paises--");
                    for (String p : paises) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el pais a eliminar");
                    paisEliminar = leer.next();
                    Iterator<String> iterator = paises.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().equals(paisEliminar)) {
                            iterator.remove();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo......");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opc != 4);
        System.out.printf("\n\nPaises ordenados alfabeticamente\n");
        lista = new ArrayList(paises);
        Collections.sort(lista);
        for (String p : lista) {
            System.out.println(p);
        }
    }

}
