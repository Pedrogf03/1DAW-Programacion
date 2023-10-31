package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Biblioteca {

    ArrayList<Libro> libros;

    public Biblioteca(){
        this.libros = new ArrayList<>();
    }

    public ArrayList<Libro> getLibros() {
        return this.libros;
    }

    @Override
    public String toString() {
        return "Biblioteca"+ this.libros;
    }

    public int contarLibros(){
        return this.libros.size();
    }

    public void addLibro(Libro l) {
        this.libros.add(l);
        Collections.sort(this.libros);
    }

    public void removeLibro(int index) {
        this.libros.remove(index);
    }

    public Libro getLibro(int index){
        return this.libros.get(index);
    }

    public int buscarLibro(String segmento){

        int i = 0;
        int posicion = - 1;

        while(i < this.libros.size()){
            if(this.libros.get(i).getTitulo().toLowerCase().contains(segmento.toLowerCase())){
                posicion = i;
            }
            i++;
        }

        return posicion ;

    }

    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        b.addLibro(new Libro("Soledades", "Antonio Machado", 115));
        b.addLibro(new Libro("La traicion de Roma", "Santiago Posteguillo", 345));
        b.addLibro(new Libro("El Quijote", "Miguel de Cervantes", 425));
        b.addLibro(new Libro("Mi vida al aire libre", "Miguel Delibes", 215));



        System.out.println("Libros: "+b);
        System.out.println("Tamaño: "+b.contarLibros());
        b.addLibro(new Libro("El arte de la guerra", "Sun Tzu", 215));
        System.out.println("Tamaño: "+b.contarLibros());
        System.out.println("Libros: "+b);
        System.out.println("Buscar: "+b.buscarLibro("noesta"));
        System.out.println("Buscar: "+b.buscarLibro("DADES"));



    }

}
