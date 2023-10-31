package Guerreros;

public abstract class Personaje {

    static final int MAX_VIDA = 100;

    private String nombre;
    private int fuerza;
    private int defensa;
    private int destreza;
    private int vida;
    private String genero;

    public Personaje(String nombre, boolean genero){
        this.nombre = nombre;
        this.fuerza = (int)(Math.random()*5+6);
        this.defensa = (int)(Math.random()*5+6);
        this.destreza = (int)(Math.random()*5+6);
        this.vida = MAX_VIDA;
        if(genero){
            this.genero = "M";
        } else {
            this.genero = "F";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getDestreza() {
        return destreza;
    }
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
        if(this.vida < 0){
            this.vida = 0;
        } else if (this.vida > MAX_VIDA){
            this.vida = MAX_VIDA;
        }
    }

    public String getGenero() {
        return genero;
    }

    public boolean isVivo(){
        return this.vida > 0;
    }

    public abstract Personaje atacar(Personaje p);

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", defensa=" + defensa +
                ", destreza=" + destreza +
                ", vida=" + vida +
                ", genero='" + genero + '\'' +
                '}';
    }
}
