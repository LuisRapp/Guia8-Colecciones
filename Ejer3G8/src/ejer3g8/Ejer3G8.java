/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de
 distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
 tipo Integer con sus 3 notas.
 En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
 información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 pregunta al usuario si quiere crear otro Alumno o no.
 Después de ese bluce tendremos el siguiente método en la clase Alumno:
 Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
 nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
 Dentro del método se usará la lista notas para calcular el promedio final de alumno.
 Siendo este promedio final, devuelto por el método y mostrado en el main.
 Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo
 */
package ejer3g8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Rapp
 */
public class Ejer3G8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Alumno alumno = new Alumno();
        boolean salir = true;
        int opc;
        while (salir) {
            System.out.println("------------------------");
            System.out.println("-1.Agregar alumno      -");
            System.out.println("-2.Mostrar alumno      -");
            System.out.println("-3.Calcular el promedio-");
            System.out.println("-4.Salir               -");
            System.out.println("------------------------");
            opc = leer.nextInt();

            switch (opc) {
                case 1:

                    ArrayList<Integer> notas = new ArrayList();

                    System.out.println("ingrese nombe del alumno");
                    String nombre = leer.next();
                    for (int i = 0; i < 3; i++) {
                        System.out.println("ingrese nota ");
                        int num = leer.nextInt();
                        notas.add(num);
                    }
                    alumno = new Alumno(nombre, notas);

                    alumnos.add(alumno);
                    break;
                case 2:
                    System.out.printf("\n --- Lista de alumnos: ---\n");
                    for (Alumno elemento : alumnos) {
                        System.out.println(elemento.getNombre());
                        System.out.println(elemento.getNotas());
                    }
                    break;
                case 3:
                    System.out.println("--Ingrese un nombre para conocer su promedio--");
                    String buscador = leer.next();
                    boolean comprobador = false;
                    Iterator<Alumno> iterator = alumnos.iterator();
                    while (iterator.hasNext()) {
                        Alumno alumno1 = iterator.next();
                        if (alumno1.getNombre().equals(buscador)) {
                            System.out.println("El promedio es " + alumno1.notaFinal());
                            comprobador = true;
                        }

                    }
                    if (comprobador) {
                        System.out.println("no se encontro el nombre");
                    }
                    break;
                  
                case 4:
                    salir = false;
                    System.out.println("Saliendo...");

            }
        }

    }

}
