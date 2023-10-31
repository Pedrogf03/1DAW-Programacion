package supermercado;

public class Reponedor extends Personal{

    private String companhia;

    public Reponedor(String nombre, String apellido1, String apellido2, String DNI, String direccion, String telefono, String num_ss, int salario, Turno turno, String companhia) {
        super(nombre, apellido1, apellido2, DNI, direccion, telefono, num_ss, salario, turno);
        this.companhia = companhia;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    @Override
    public String toString() {
        return super.toString() +" Reponedor{" +
                "companhia='" + companhia + '\'' +
                '}';
    }
}
