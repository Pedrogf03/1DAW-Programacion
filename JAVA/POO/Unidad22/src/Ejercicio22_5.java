import java.util.*;

public class Ejercicio22_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine().toLowerCase(Locale.ROOT);

        String[] palabras = string.toString().split(" ");
        string = "";
        for (String palabra: palabras) {
            string += palabra;
        }

        HashMap<String, Integer> contarCaracteres = new HashMap<>();
        for(int i = 0; i < string.length(); i++){
            String caracter = string.substring(i, i+1);
            if(contarCaracteres.containsKey(caracter)){
                contarCaracteres.put(caracter, contarCaracteres.get(caracter) + 1);
            } else {
                contarCaracteres.put(caracter, 1);
            }
        }

        Object masRepetido = Collections.max(contarCaracteres.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println("El caracter que más se repite es \""+ masRepetido +"\".");

    }

}
