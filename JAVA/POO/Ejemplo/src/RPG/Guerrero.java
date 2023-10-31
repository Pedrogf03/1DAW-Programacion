package RPG;

public class Guerrero {

    //Constante
    static final int MAX_VIDA = 100;
    static final int MIN_ATRIBUTO = 10;
    static final int MIN_ATAQUE = 20;


    //Atributos
    private String nombre;
    private int fuerza;
    private int destreza;
    private int defensa;
    private int vida;

    //Constructores
    public Guerrero(String nombre, int fuerza, int destreza, int defensa) throws PersonajeInvalidoException{

        if (fuerza < 0 || destreza < 0 || defensa < 0){
                throw new PersonajeInvalidoException("Valor negativo");
        }

        this.nombre = nombre;
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.defensa = defensa;
        this.vida = MAX_VIDA;
    }
    public Guerrero(String nombre){
        this.nombre = nombre;
        this.fuerza = MIN_ATRIBUTO + (int)(Math.random()*8);
        this.destreza = MIN_ATRIBUTO + (int)(Math.random()*8);
        this.defensa = MIN_ATRIBUTO + (int)(Math.random()*8);
        this.vida = MAX_VIDA;
    }


    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public int getDefensa() {
        return defensa;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
    public int getDestreza() {
        return destreza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public int getFuerza() {
        return fuerza;
    }

    public void setVida(int vida) {
        this.vida = vida;
        if(this.vida < 0){
            this.vida = 0;
        }
        if(this.vida > MAX_VIDA){
            this.vida = MAX_VIDA;
        }
    }
    public int getVida() {
        return vida;
    }

    public boolean isVivo(){
        return this.getVida() > 0;
    }

    //Métodos
    public Guerrero atacar(Guerrero villano){
        int ataque = MIN_ATAQUE + this.fuerza - villano.getDefensa();
        if (ataque < 0) {
            ataque = 0;
        }
        villano.setVida(villano.getVida()-ataque);
        return villano;
    }

    //toString
    @Override
    public String toString() {
        return "Guerrero{" +
                "nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", destreza=" + destreza +
                ", defensa=" + defensa +
                ", vida=" + vida +
                '}';
    }

    public static void main(String[] args) {
        Guerrero pedro = null;
        try {
            pedro = new Guerrero("Pedro", 20, -18, 17);
        }catch (PersonajeInvalidoException e){
            System.out.println(e);
        }
        Guerrero borja = new Guerrero("Borja");

        while(pedro.isVivo() && borja.isVivo()) {
            borja = pedro.atacar(borja);
            if (borja.isVivo()) {
                pedro = borja.atacar(pedro);
            }

            System.out.println("¡Ataque!");
            System.out.println(pedro);
            System.out.println(borja);

        }

    }
}
