package VMServer;

public class MaquinaVirtual {

    private String nombre;
    private int ram;
    private int almacenamiento;

    public MaquinaVirtual(String nombre, int ram, int almacenamiento) {
        this.nombre = nombre;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "MaquinaVirtual{Nombre = "+ this.getNombre() +", RAM(GB) = "+ this.getRam() +", Almacenamiento(GB) = "+ this.getAlmacenamiento() +"}";
    }

}
