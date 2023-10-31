package supermercado;

public class Dependiente extends Personal{

    public enum Especialidad{
        FRUTERIA, PANADERIA, CARNICERIA, PESCADERIA, CAJA;
    }

    private Especialidad especialidad;

    public Dependiente(String nombre, String apellido1, String apellido2, String DNI, String direccion, String telefono, String num_ss, int salario, Turno turno, Especialidad especialidad) {
        super(nombre, apellido1, apellido2, DNI, direccion, telefono, num_ss, salario, turno);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() +" Dependiente{" +
                "especialidad=" + especialidad +
                '}';
    }
}
