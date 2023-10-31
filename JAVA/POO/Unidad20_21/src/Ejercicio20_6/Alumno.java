package Ejercicio20_6;

import java.util.Objects;

public class Alumno implements Comparable{

    private int numExpediente;
    private String nombre;
    private int edad;

    public Alumno(int numExpediente, String nombre, int edad){
        this.numExpediente = numExpediente;
        this.nombre = nombre;
        this.edad = edad;
    }
    public Alumno(int numExpediente){
        this.numExpediente = numExpediente;
    }

    public int getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(int numExpediente) {
        this.numExpediente = numExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return numExpediente == alumno.numExpediente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numExpediente);
    }

    @Override
    public String toString() {
        return "Alumno "+ numExpediente +": "+ nombre +", "+ edad +" años";
    }

    @Override
    public int compareTo(Object o) {
        int valor;
        Alumno al = (Alumno)o;
        if(this.getNumExpediente() == al.getNumExpediente()){
            valor = 0;
        } else if (this.getNumExpediente() > al.getNumExpediente()){
            valor = 1;
        } else {
            valor = -1;
        }
        return valor;
    }
}
