package VMServer;

public class LinuxVM extends MaquinaVirtual{

    private String distribucion;
    private String kernel;

    public LinuxVM(String nombre, int ram, int almacenamiento, String distribucion, String kernel) {
        super(nombre, ram, almacenamiento);
        this.distribucion = distribucion;
        this.kernel = kernel;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    public String getKernel() {
        return kernel;
    }

    public void setKernel(String kernel) {
        this.kernel = kernel;
    }

    @Override
    public String toString() {
        return "LinuxVM{Nombre = "+ this.getNombre() +", RAM(GB) = "+ this.getRam() +", Almacenamiento(GB) = "+ this.getAlmacenamiento() +", Distribucion = "+ this.getDistribucion() +", Kernel = "+ this.getKernel() +"}";
    }

}
