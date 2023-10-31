package Ejercicio2;

public class Aplicacion {

    public static void main(String[] args) {

        Serie s1 = new Serie("Stranger Things", 3,"Terror" , "Los hermanos Duffer");
        Serie s2 = new Serie("La casa de papel", 5,"Policiaca" , "Atresmedia");
        Serie s3 = new Serie("You", 3,"Psicológica" , "Netflix");
        Serie s4 = new Serie("Rick y Morty", 5,"Ciencia Ficción" , "Justin Roiland");
        Serie s5 = new Serie("Outer Banks", 2,"Misterio" , "Josh Pate");
        Serie[] s = {s1, s2, s3, s4, s5};

        Videojuego v1 = new Videojuego("Minecraft", 97, "Sandbox", "Mojang");
        Videojuego v2 = new Videojuego("Valorant", 0, "FPS", "Riot Games");
        Videojuego v3 = new Videojuego("GTAV", 32, "Acción-Aventura", "Rockstar Games");
        Videojuego v4 = new Videojuego("Fortnite", 0, "Battle Royale", "Epic Games");
        Videojuego v5 = new Videojuego("Rust", 0, "Supervivencia", "Facepunch Studios");
        Videojuego[] v = {v1, v2, v3, v4, v5};

        s[0].entregar();
        v[1].entregar();
        s[2].entregar();
        v[3].entregar();
        s[4].entregar();

        System.out.println(contarEntregados(s));
        System.out.println(contarEntregados(v));

        Serie maxTemps = null;
        for(int i = 0; i < s.length; i++){
            if(i == 0){
                maxTemps = s[i];
            } else if(s[i].compareTo(maxTemps) == 1){
                maxTemps = s[i];
            }
        }
        System.out.println(maxTemps);

        Videojuego maxHoras = null;
        for(int i = 0; i < v.length; i++){
            if(i == 0){
                maxHoras = v[i];
            } else if(v[i].compareTo(maxHoras) == 1){
                maxHoras = v[i];
            }
        }
        System.out.println(maxHoras);

    }

    public static int contarEntregados(Entregable[] e){
        int contador = 0;
        for(Entregable o: e){
            if (o.isEntregado()){
                contador++;
            }
        }
        return contador;
    }

}
