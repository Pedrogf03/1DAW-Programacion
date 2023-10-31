import java.util.ArrayList;
import java.util.Collection;

public class Ejercicio20_1 {

    public static void main(String[] args) {

        Collection<String> alumnos = new ArrayList<>();
        alumnos.add("Pedro");
        alumnos.add("Manu");
        alumnos.add("Borja");
        alumnos.add("Celia");
        alumnos.add("Santi");
        alumnos.add("Manuel");

        for(String alumno: alumnos){
            System.out.println(alumno);
        }

    }

}
