package Ejercicio20_6;

public class Clase {

    public static void main(String[] args) {

        Alumno a1 = new Alumno(2, "Pedro", 18);
        Alumno a2 = new Alumno(4, "Borja", 29);
        Alumno a3 = new Alumno(1, "Manuel", 34);
        Alumno a4 = new Alumno(3, "Manuel", 20);

        Grupo g = new Grupo("1DAW");

        ColaAlumnos c = new ColaAlumnos();

        g.addAlumno(a1);
        g.addAlumno(a2);
        g.addAlumno(a3);
        g.addAlumno(a4);

        g.mostrarAlumnos();
        System.out.println();

        g.delAlumno("Manuel");
        System.out.println();

        g.mostrarAlumnos();
        System.out.println();

        g.addAlumno(a3);
        g.addAlumno(a4);

        g.delAlumno(3);
        System.out.println();

        g.mostrarAlumnos();
        System.out.println();

        try{
            g.modAlumno(3, "Pepe", 23);
        } catch (InvalidAlumnoException e){
            System.out.println("Ese num. de expediente no existe.");
        }
        System.out.println();

        g.mostrarAlumnos();
        g.addAlumno(a4);
        System.out.println();

        System.out.println(g.getAlumnos().contains(new Alumno(3)));
        System.out.println();

        g.ordenarAlumnos();
        g.mostrarAlumnos();
        System.out.println();

        c.mostrarCola();
        c.llegarAlInstituto(a1);
        c.mostrarCola();
        c.llegarAlInstituto(a2);
        c.mostrarCola();
        /*try{
            c.entrarEnClase();
        } catch (ColaVaciaException e){
            System.out.println("La cola está vacía");
        }
        c.mostrarCola();
        c.llegarAlInstituto(a3);
        c.mostrarCola();
        try{
            c.entrarEnClase();
        } catch (ColaVaciaException e){
            System.out.println("La cola está vacía");
        }
        c.mostrarCola();
        try{
            c.entrarEnClase();
        } catch (ColaVaciaException e){
            System.out.println("La cola está vacía");
        }
        c.mostrarCola();
        try{
            c.entrarEnClase();
        } catch (ColaVaciaException e){
            System.out.println("La cola está vacía");
        }
        c.mostrarCola();*/

        System.out.println(c.getCola().getLast());
    }

}
