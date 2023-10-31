package VMServer;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import VMServer.Exceptions.MachineAlreadyExistsException;
import VMServer.Exceptions.NotEnoughException;
import VMServer.Exceptions.NotEnoughRAMException;
import VMServer.Exceptions.NotEnoughDiskException;

public class VMServer {

    private int maxRam;
    private int maxAlmacenamiento;
    private ArrayList<MaquinaVirtual> maquinas;

    public VMServer(int maxRam, int maxAlmacenamiento) {
        this.maxRam = maxRam;
        this.maxAlmacenamiento = maxAlmacenamiento;
        this.maquinas = new ArrayList<MaquinaVirtual>();
    }

    public int getMaxRam() {
        return maxRam;
    }

    public void setMaxRam(int maxRam) {
        this.maxRam = maxRam;
    }

    public int getMaxAlmacenamiento() {
        return maxAlmacenamiento;
    }

    public void setMaxAlmacenamiento(int maxAlmacenamiento) {
        this.maxAlmacenamiento = maxAlmacenamiento;
    }

    @Override
    public String toString() {
        return "VMServer{" +
                "maxRam=" + maxRam +
                ", maxAlmacenamiento=" + maxAlmacenamiento +
                ", maquinas=" + maquinas +
                '}';
    }

    //Obtener máquinas virtuales
    public ArrayList<MaquinaVirtual> getMaquinas() {
        return maquinas;
    }

    //Obtener una máquina por nombre
    public MaquinaVirtual getMaquina(String nombre) {
        if(this.getMaquinas().size() == 0) {
            return null;
        } else {
            int i = 0;
            while(!nombre.equals(this.getMaquinas().get(i).getNombre()) && i < this.getMaquinas().size() - 1) {
                i++;
            }
            if (nombre.equals(this.getMaquinas().get(i).getNombre())) {
                return this.getMaquinas().get(i);
            } else {
                return null;
            }
        }
    }

    //Devuelva ram ocupada
    public int getRamUsada(){
        int ram = 0;
        for(int i = 0; i < this.getMaquinas().size(); i++){
            ram += this.getMaquinas().get(i).getRam();
        }
        return ram;
    }

    //Devuelve almacenamiento ocupado
    public int getAlmacenamientoUsado(){
        int almacenamiento = 0;
        for(int i = 0; i < this.getMaquinas().size(); i++){
            almacenamiento += this.getMaquinas().get(i).getAlmacenamiento();
        }
        return almacenamiento;
    }

    //Añadir máquina virtual
    public void addMaquina(MaquinaVirtual vm) throws NotEnoughException, MachineAlreadyExistsException {

        if(this.getRamUsada() + vm.getRam() > this.getMaxRam()){
            throw new NotEnoughRAMException("No hay suficiente RAM");
        } else if (this.getAlmacenamientoUsado() + vm.getAlmacenamiento() > this.getMaxAlmacenamiento()){
            throw new NotEnoughDiskException("No hay suficiente espacio en disco");
        } else {
            if(this.getMaquinas().size() == 0){
                this.getMaquinas().add(vm);
            } else {
                 if (this.getMaquina(vm.getNombre()) == null){
                     this.getMaquinas().add(vm);
                } else if (vm.getNombre().equals(this.getMaquina(vm.getNombre()).getNombre())) {
                     throw new MachineAlreadyExistsException();
                 }
            }
        }

    }

    //Eliminar máquina virtual
    public void removeMaquina(String nombre){
        this.getMaquinas().remove(this.getMaquina(nombre));
    }

    public static void main(String[] args) {

        VMServer server = new VMServer(32, 2048);

        Scanner sc = new Scanner(System.in);
        int option;
        boolean salir = false;

        do{
            System.out.println("""
                    Opciones disponibles:
                    1.-Añadir máquina.
                    2.-Obtener todas las máquinas.
                    3.-Obtener una máquina por nombre.
                    4.-Obtener RAM usada.
                    5.-Obtener almacenamiento usado.
                    6.-Eliminar máquina virtual por nombre.
                    7.-Salir""");

            option = Integer.parseInt(sc.nextLine());

            while(option < 1 || option > 7){
                System.out.println("Opción inválida.");
                option = Integer.parseInt(sc.nextLine());
            }

            switch (option){
                case 1:
                    System.out.println("Introduzca el tipo de máquina (Windows, Linux, Otro): ");
                    String tipo = sc.nextLine().toLowerCase(Locale.ROOT);
                    while(!tipo.equals("windows") && !tipo.equals("linux") && !tipo.equals("otro")) {
                        System.out.println("Introduzca el tipo de máquina (Windows, Linux, Otro): ");
                        tipo = sc.nextLine().toLowerCase(Locale.ROOT);
                    }
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("RAM (en GB): ");
                    int ram = Integer.parseInt(sc.nextLine());
                    System.out.print("Almacenamiento (en GB): ");
                    int almacenamiento = Integer.parseInt(sc.nextLine());
                    switch (tipo){
                        case "windows":
                            System.out.print("Versión: ");
                            String version = sc.nextLine();
                            WindowsVM wvm = new WindowsVM(nombre, ram, almacenamiento, version);
                            try {
                                server.addMaquina(wvm);
                            } catch (MachineAlreadyExistsException e){
                                System.out.println("Esa máquina ya existe (nombre).");
                            } catch (NotEnoughException e) {
                                if(e instanceof NotEnoughRAMException) {
                                    System.out.println("El servidor no tiene suficiente RAM.");
                                } else if (e instanceof NotEnoughDiskException) {
                                    System.out.println("El servidor no tiene suficiente espacio de almacenamiento.");
                                }
                            }
                            break;
                        case "linux":
                            System.out.print("Distribución: ");
                            String distribucion = sc.nextLine();
                            System.out.println();
                            System.out.print("Kernel: ");
                            String kernel = sc.nextLine();
                            System.out.println();
                            LinuxVM lvm = new LinuxVM(nombre, ram, almacenamiento, kernel, distribucion);
                            try {
                                server.addMaquina(lvm);
                            } catch (MachineAlreadyExistsException e){
                                System.out.println("Esa máquina ya existe (nombre).");
                            } catch (NotEnoughException e) {
                                if(e instanceof NotEnoughRAMException) {
                                    System.out.println("El servidor no tiene suficiente RAM.");
                                } else if (e instanceof NotEnoughDiskException) {
                                    System.out.println("El servidor no tiene suficiente espacio de almacenamiento.");
                                }
                            }
                            break;
                        default:
                            MaquinaVirtual vm = new MaquinaVirtual (nombre, ram, almacenamiento);
                            try {
                                server.addMaquina(vm);
                            } catch (MachineAlreadyExistsException e){
                                System.out.println("Esa máquina ya existe (nombre).");
                            } catch (NotEnoughException e) {
                                if(e instanceof NotEnoughRAMException) {
                                    System.out.println("El servidor no tiene suficiente RAM.");
                                } else if (e instanceof NotEnoughDiskException) {
                                    System.out.println("El servidor no tiene suficiente espacio de almacenamiento.");
                                }
                            }
                            break;
                    }
                    System.out.println();

                    break;
                case 2:
                    System.out.println(server.getMaquinas());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Introduce el nombre de la máquina: ");
                    String nombreVM = sc.nextLine();
                    if (server.getMaquina(nombreVM) == null) {
                        System.out.println("Esa máquina no existe.");
                    } else {
                        System.out.println(server.getMaquina(nombreVM));
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Hay "+ server.getRamUsada() +"GB en uso de "+ server.getMaxRam() +"GB disponibles.");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Hay "+ server.getAlmacenamientoUsado() +"GB en uso de "+ server.getMaxAlmacenamiento() +"GB disponibles.");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Introduce el nombre de la máquina: ");
                    String nombreEliminar = sc.nextLine();
                    server.removeMaquina(nombreEliminar);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (!salir);

    }

}
