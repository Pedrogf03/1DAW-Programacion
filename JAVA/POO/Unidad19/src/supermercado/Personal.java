package supermercado;

public abstract class Personal extends Persona{

    public enum Turno{
        M, T, N;
    }

    private String num_ss;
    private int salario;
    private Turno turno;

    public Personal(String nombre, String apellido1, String apellido2, String DNI, String direccion, String telefono, String num_ss, int salario, Turno turno) {
        super(nombre, apellido1, apellido2, DNI, direccion, telefono);
        this.num_ss = num_ss;
        if(turno == Turno.N){
            salario+=150;
        }
        this.salario = salario;
        this.turno = turno;
    }

    public String getNum_ss() {
        return num_ss;
    }

    public void setNum_ss(String num_ss) {
        this.num_ss = num_ss;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {

        if(this.turno == Turno.N){
            salario+=150;
        }

        this.salario = salario;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {

        if(this.getTurno() != Turno.N){
            if(turno == Turno.N){
                this.setSalario(this.getSalario()+150);
                this.setTurno(turno);
            }
        } else if (this.getTurno() == Turno.N){
            if(turno != Turno.N){
                this.setTurno(turno);
                this.setSalario(this.getSalario()-150);
            }
        }

    }

    @Override
    public String toString() {
        return super.toString() +" Personal{" +
                "num_ss='" + num_ss + '\'' +
                ", salario=" + salario +
                ", turno=" + turno +
                '}';
    }
}
