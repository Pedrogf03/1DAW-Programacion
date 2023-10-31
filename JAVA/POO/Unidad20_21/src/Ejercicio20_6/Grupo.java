package Ejercicio20_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Grupo {

    private String nombre;
    private List<Alumno> alumnos = new ArrayList<>();

    public Grupo(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Alumno> getAlumnos(){
        return alumnos;
    }

    public void mostrarAlumnos(){
        for(Alumno al: this.alumnos){
            System.out.println(al);
        }
    }

    public void addAlumno(Alumno a){
        this.alumnos.add(a);
    }

    public void delAlumno(String nombre){
        Iterator<Alumno> i = this.alumnos.iterator();
        int contador = 0;

        while(i.hasNext()){
            Alumno al = i.next();
            if(al.getNombre().equals(nombre)){
                i.remove();
                contador++;
            }
        }
        System.out.println("Se han eliminado "+ contador +" alumnos.");
    }

    public void delAlumno(int numExpediente){
        Iterator<Alumno> i = this.alumnos.iterator();

        while(i.hasNext()){
            Alumno al = i.next();
            if(al.getNumExpediente() == numExpediente){
                i.remove();
            }
        }
        System.out.println("Se ha eliminado el alumno.");
    }

    public void modAlumno(int numExpediente, String nombre, int edad) throws InvalidAlumnoException{
        boolean existeAlumno = false;
        for(Alumno al: alumnos){
            if(al.getNumExpediente() == numExpediente){
                al.setNombre(nombre);
                al.setEdad(edad);
                existeAlumno = true;
            }
        }

        if(!existeAlumno){
            throw new InvalidAlumnoException();
        }

    }

    public void ordenarAlumnos(){
        Collections.sort(this.alumnos);
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }
}
