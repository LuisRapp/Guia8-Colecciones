/*

 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
 El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
 decide salir, se mostrará todos los perros guardados en el ArrayList.
 2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
 pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
 Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
 la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
 se mostrará la lista ordenada.


 ArrayList<String> razaPerros = new ArrayList();
 Iterator<String> it = razaPerros.iterator();
 while (it.hasNext()) {
 if (it.next().equals(rDeleate)) { // Borramos si está la palabra Hola
 it.remove();
 } 
 } 

 */
package ejer1g8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Ejer1G8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razaPerros = new ArrayList<>();
        boolean salir = true;
        int opc;
        while (salir) {
            System.out.println("------------------");
            System.out.println("-1.Agregar Razas -");
            System.out.println("-2.Mostrar Razas -");
            System.out.println("-3.Eliminar Razas-");
            System.out.println("-4.Salir         -");
            System.out.println("------------------");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese una raza de Perro: ");
                    String raza = leer.next();
                    razaPerros.add(raza);
                    break;
                case 2:
                    System.out.printf("\n --- Las  razas de perros son: ---\n");
                    for (String elemento : razaPerros) {
                        System.out.println(elemento);
                    }
                    break;
                case 3:
                    System.out.printf("\n --- Las razas de perros son: ---\n");
                    for (String elemento : razaPerros) {
                        System.out.println(elemento);
                    }
                    System.out.printf("\n Ingrese cual desea eliminar: \n");
                    String rDeleate = leer.next();
                    Iterator<String> iterator = razaPerros.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().equals(rDeleate)) { // Borramos si está la palabra Hola
                            iterator.remove();
                        }
                    }
                    break;
                case 4:
                    salir = false;
                    System.out.println("Vuelva pronto");

            }
        }

    }
}
