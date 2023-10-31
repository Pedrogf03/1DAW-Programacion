package RPG.hechizos;

public abstract class Hechizo {

    private int multiplicadorDamage;
    private String nombre;

    public Hechizo(String nombre, int damage){
        this.nombre = nombre;
        this.multiplicadorDamage = damage;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMultiplicadorDamage() {
        return multiplicadorDamage;
    }
    public void setMultiplicadorDamage(int multiplicadorDamage) {
        this.multiplicadorDamage = multiplicadorDamage;
    }

    @Override
    public String toString() {
        return "Hechizo{" +
                "multiplicadorDamage=" + multiplicadorDamage +
                '}';
    }

}
