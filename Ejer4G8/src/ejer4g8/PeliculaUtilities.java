package ejer4g8;

import java.util.Comparator;

/*
 • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo 
 en pantalla.
 • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo 
 en pantalla.
 • Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
 • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
/**
 *
 * @author Rapp
 */
public class PeliculaUtilities {
 
    //////////descendente
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }

    };
    //////////ascendente
    public static Comparator<Pelicula> compararDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracion().compareTo(p2.getDuracion());
        }

    };
    //////////titulo
    public static Comparator<Pelicula> titulos = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }

    };
    //////////director
    public static Comparator<Pelicula> directores = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }

    };
    
    
    
    
    
}
