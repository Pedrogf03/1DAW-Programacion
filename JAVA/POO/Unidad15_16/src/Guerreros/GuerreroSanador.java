package Guerreros;

public class GuerreroSanador extends Guerrero{

    public GuerreroSanador(String nombre, String genero){
        super(nombre, genero);
    }

    public void sanar(Guerrero g){
        g.setVida(MAX_VIDA);
    }

}
