package Ejercicio20_6;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ColaAlumnos {

    private LinkedList<Alumno> cola = new LinkedList<>();

    public ColaAlumnos(){
    }

    public LinkedList<Alumno> getCola() {
        return cola;
    }

    public void llegarAlInstituto(Alumno al){
        this.getCola().addFirst(al);
    }

    public void entrarEnClase() throws ColaVaciaException{
        try{
            this.getCola().removeLast();
        } catch (NoSuchElementException e){
            throw new ColaVaciaException();
        }
    }

    public void mostrarCola(){
        System.out.println(this.getCola());
    }

}
