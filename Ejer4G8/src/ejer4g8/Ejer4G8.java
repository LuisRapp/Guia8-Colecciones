/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
 esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
 horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
 cuenta lo que se pide a continuación:
 19
 En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
 usuario todos sus datos y guardándolos en el objeto Pelicula.
 Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
 quiere crear otra Pelicula o no.
 Después de ese bucle realizaremos las siguientes acciones:
 • Mostrar en pantalla todas las películas.
 • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo 
 en pantalla.
 • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo 
 en pantalla.
 • Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
 • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ejer4g8;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Ejer4G8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        // Pelicula pelicula = new Pelicula();
        boolean salir = true;
        int opc, horas, minutos;
        String tituloMain, directorMain;
        LocalTime duracion;
        LocalTime hora=LocalTime.of(1,00);
        while (salir) {
            System.out.println("------------------Menu--------------------");
            System.out.println("--.1 Cargar  Peliculas                  --");
            System.out.println("--.2 Mostrar Peliculas                  --");
            System.out.println("--.3 Peliculas de mas de una hora       --");
            System.out.println("--.4 Ordenadas de mayor a menor duracion--");
            System.out.println("--.5 Ordenadas de menor a mayor duracion--");
            System.out.println("--.6 Ordenadas por Titulo               --");
            System.out.println("--.7 Ordenadas por director             --");
            System.out.println("--.8 Salir                              --");
            System.out.println("------------------------------------------");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    ArrayList<Integer> Pelicula = new ArrayList();
                    System.out.println("Ingrese el titulo de la pelicula");
                    tituloMain = leer.next();
                    System.out.println("Ingrese el director de la pelicula");
                    directorMain = leer.next();
                    System.out.println("Ingrese la duracion de la pelicula");
                    System.out.println("Ingrese las horas");
                    horas = leer.nextInt();
                    System.out.println("Ingrese los minutos");
                    minutos = leer.nextInt();
                    duracion = LocalTime.of(horas, minutos);
                    Pelicula pelicula = new Pelicula(tituloMain, directorMain, duracion);
                    peliculas.add(pelicula);
                    break;

                case 2:
                    System.out.printf("\n --- Lista de peliculas: ---\n");
                    for (Pelicula elemento : peliculas) {
                          System.out.println(elemento);
//                        System.out.println("" + elemento.getTitulo());
//                        System.out.println("" + elemento.getDirector());
//                        System.out.println("" + elemento.getDuracion());
//                        System.out.println(" --------------------");
                    }
            
                    break;
                case 3:
                    System.out.printf("\n --- Lista de peliculas: ---\n");
                    for (Pelicula elemento : peliculas) {
                        if (elemento.getDuracion().isBefore(hora)) {
                            System.out.println(elemento);
//                           System.out.println("" + elemento.getTitulo());
//                        System.out.println("" + elemento.getDirector());
//                        System.out.println("" + elemento.getDuracion());
//                        System.out.println(" --------------------"); 
                        }
                        
                    }
                    break;
                case 4:
                    System.out.printf("\n --- Lista de peliculas ordenadas orden descendente: ---\n");
                    Collections.sort(peliculas,PeliculaUtilities.compararDuracion);
                    for (Pelicula elemento : peliculas) {
                         System.out.println(elemento);
                    }
                    break;
                case 5:
                    System.out.printf("\n --- Lista de peliculas ordenadas orden ascendente: ---\n");
                    Collections.sort(peliculas,PeliculaUtilities.compararDuracionAsc);
                    for (Pelicula elemento : peliculas) {
                         System.out.println(elemento);
                    }
                    break;
                case 6:
                    System.out.printf("\n --- Lista de peliculas ordenadas por Titulos: ---\n");
                    Collections.sort(peliculas,PeliculaUtilities.titulos);
                    for (Pelicula elemento : peliculas) {
                         System.out.println(elemento);
                    }
                    break;
                case 7:
                    System.out.printf("\n --- Lista de peliculas ordenadas por Directores: ---\n");
                    Collections.sort(peliculas,PeliculaUtilities.titulos);
                    for (Pelicula elemento : peliculas) {
                         System.out.println(elemento);
                    }
                    break;
                    
                    
                case 8: 
                    salir=false;
                    System.out.println("Saliendo...");
                    
                    
                    
                    

            }

        }
    }

}
