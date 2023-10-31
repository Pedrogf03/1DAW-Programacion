package VMServer;

public class WindowsVM extends MaquinaVirtual{

    private String version;

    public WindowsVM(String nombre, int ram, int almacenamiento, String version) {
        super(nombre, ram, almacenamiento);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "WindowsVM{Nombre = "+ this.getNombre() +", RAM(GB) = "+ this.getRam() +", Almacenamiento(GB) = "+ this.getAlmacenamiento() +", Version = "+ this.getVersion() +"}";
    }

}
