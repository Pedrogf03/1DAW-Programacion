package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;

public class EjemploArrayList {

    static void imprimirNotas(Collection<String> a){

        /* ForEach */
        for(String alumnoActual: a){
            int nota = (int)(Math.random()*10);
            System.out.println(alumnoActual +": "+ nota);
        }

        /* Iterador */
        Iterator<String> i = a.iterator();

        while(i.hasNext()){
            String alumnoActual = i.next();
            i.remove();
            int nota = (int)(Math.random()*10);
            System.out.println(alumnoActual +": "+ nota);
        }

    }

    public static void main(String[] args) {

        List<String> alumnos = new ArrayList<String>();

        alumnos.add("Pedro");
        alumnos.add("Borja");
        alumnos.add("Manuel");
        alumnos.add("Santiago");

        System.out.println(alumnos);

        imprimirNotas(alumnos);

    }

}
