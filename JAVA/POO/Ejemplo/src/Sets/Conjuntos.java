package Sets;

import javax.print.attribute.HashPrintServiceAttributeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Conjuntos{

    public static void main(String[] args) {

        Set<String> alumnos = new HashSet<>();
        alumnos.add("Manuel");
        alumnos.add("Adrián");
        alumnos.add("Pedro");
        alumnos.add("Celia");

        System.out.println(alumnos);

        Set<String> conA = new HashSet<>();
        conA.add("Manuel");
        conA.add("Adrián");
        conA.add("Celia");
        conA.add("Maria");

        System.out.println(conA);

        /*
        alumnos.addAll(conA);

        System.out.println(alumnos);
        */

        /*
        alumnos.retainAll(conA);

        System.out.println(alumnos);
        */

        /*
        alumnos.removeAll(conA);

        System.out.println(alumnos);
        */

        for(String a: alumnos){
            System.out.println(a);
        }

        Iterator<String> i = alumnos.iterator();
        while(i.hasNext()){
            String a = i.next();
            System.out.println(a);
        }

    }

}
