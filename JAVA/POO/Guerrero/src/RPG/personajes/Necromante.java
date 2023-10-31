package RPG.personajes;

public class Necromante extends Mago{

    public Necromante(String nombre, String genero) {
        super(nombre, genero);
    }

    public void sanar(Personaje p){
        p.setVida(MAX_VIDA);
    }

}
