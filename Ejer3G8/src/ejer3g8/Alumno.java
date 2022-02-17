
package ejer3g8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Rapp
 */
public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;
//////////////////////
    public Alumno() {
    }
///////////////////// 
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
/////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
     
    public double notaFinal(){
        
        int prom=0;
        Iterator<Integer> iterator=this.notas.iterator();
        while (iterator.hasNext()) {
            Integer nota2=iterator.next();
            prom+=nota2;
        }
        return prom/3;
        
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    
}
