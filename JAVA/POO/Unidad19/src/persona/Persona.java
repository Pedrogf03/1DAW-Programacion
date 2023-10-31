package persona;

public class Persona {

    public enum Nacionalidad{
        ES, COM, EXCOM;
    }

    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String DNI;
    private Nacionalidad nacionalidad;

    public Persona(String nombre, String apellido1, String apellido2, int edad, String DNI, Nacionalidad nacionalidad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.DNI = DNI;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public String mostrar() {
        return "  Nombre: "+ this.nombre +" "+ this.apellido1 +" "+ this.apellido2
                +"\n  DNI: "+ this.DNI
                +"\n  Edad: "+ this.edad
                +"\n  Nacionalidad: "+ this.nacionalidad;
    }

    public static void main(String[] args) {

        Persona p1 = new Persona("Pedro", "González", "Fernández", 18, "45150452A", Nacionalidad.ES);
        Persona p2 = new Persona("Borja", "Fernández", "Correa", 23, "12345678A", Nacionalidad.COM);
        Persona p3 = new Persona("Manuel", "Gómez", "Lora", 15, "12345678B", Nacionalidad.EXCOM);

        Cuenta c1 = new Cuenta(p1, 400.50);
        CuentaJoven c2 = new CuentaJoven(p2, 300.50, 5);
        CuentaJoven c3 = new CuentaJoven(p3, 500.00, 7);

        System.out.println(c1.mostrar());
        System.out.println("Pedro es mayor de edad = "+ p1.esMayorDeEdad());
        c1.ingresar(250);
        System.out.println(c1.mostrarDinero());
        c1.retirar(250);
        System.out.println(c1.mostrarDinero());
        System.out.println("-----------------------------------");
        System.out.println(c2.mostrar());
        System.out.println("Borja es mayor de edad = "+p2.esMayorDeEdad());
        c2.ingresar(250);
        System.out.println(c2.mostrarDinero());
        c2.retirar(250);
        System.out.println(c2.mostrarDinero());
        System.out.println("-----------------------------------");
        System.out.println(c3.mostrar());
        System.out.println("Manuel es mayor de edad = "+p3.esMayorDeEdad());
        c3.ingresar(250);
        System.out.println(c3.mostrarDinero());
        c3.retirar(250);
        System.out.println(c3.mostrarDinero());
        System.out.println("-----------------------------------");

    }

}
