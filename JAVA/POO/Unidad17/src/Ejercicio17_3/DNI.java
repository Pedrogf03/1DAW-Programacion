package Ejercicio17_3;

import javax.swing.*;
import java.time.DateTimeException;
import java.time.LocalDate;

public class DNI {

    private String apellidos;
    private String nombre;
    private String sexo;
    private String nacionalidad;
    private String fecha_nac;
    private String num_soport;
    private String validez;
    private String dni;

    public DNI(String dni, String nombre, String apellidos, String nacionalidad, int diaNac, int mesNac, int anhoNac, int diaVal, int mesVal, int anhoVal, boolean sexo, String num_soport) throws InvalidIDCardException, DateTimeException{

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;


        if(!isDni(dni)){
            throw new InvalidIDCardException("Formato de DNI inválido.");
        } else {
            this.dni = dni;
        }

        if(!isFecha(diaNac, mesNac, anhoNac)){
            throw new DateTimeException("Fecha de nacimiento inválida.");
        } else {
            this.fecha_nac = diaNac +"-"+ mesNac +"-"+ anhoNac;
        }

        if(!isFecha(diaVal, mesVal, anhoVal)){
            throw new DateTimeException("Fecha de validez inválida.");
        } else {
            this.validez = diaVal +"-"+ mesVal +"-"+ anhoVal;
        }

        if (sexo){
            this.sexo = "M";
        } else {
            this.sexo = "F";
        }

        if(!isNumSoporte(num_soport)){
            throw new InvalidIDCardException("Número de soporte inválido.");
        } else {
            this.num_soport = num_soport;
        }

    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNum_soport() {
        return num_soport;
    }

    public void setNum_soport(String num_soport) {
        this.num_soport = num_soport;
    }

    public String getValidez() {
        return validez;
    }

    public void setValidez(String validez) {
        this.validez = validez;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    static public boolean isDni(String dni){
        boolean esDni = true;
        if(dni.length() != 9){
            esDni = false;
        } else {
            for(int i = 0; i < 9; i++){
                if(i < 8){
                    if(Character.isAlphabetic(dni.charAt(i))){
                        esDni = false;
                    }
                } else {
                    if(Character.isDigit(dni.charAt(i))){
                        esDni = false;
                    }
                }
            }
        }
        return esDni;
    }

    static public boolean isFecha(int dia, int mes, int anho){
        boolean esFecha = true;
        try{
            LocalDate.of(anho, mes, dia);
        } catch (DateTimeException e){
            esFecha = false;
        }
        return esFecha;
    }

    static public boolean isNumSoporte(String num_soport){
        boolean esNumSuport = true;
        if (num_soport.length() != 9){
            esNumSuport = false;
        } else {
            for(int i = 0; i < 9; i++){
                if(i < 3){
                    if (Character.isDigit(num_soport.charAt(i))){
                        esNumSuport = false;
                    }
                } else {
                    if(Character.isAlphabetic(num_soport.charAt(i))){
                        esNumSuport = false;
                    }
                }
            }
        }
        return esNumSuport;
    }

    @Override
    public String toString() {
        return "DNI{" +
                "apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fecha_nac='" + fecha_nac + '\'' +
                ", num_soport='" + num_soport + '\'' +
                ", validez='" + validez + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public static void main(String[] args) {

        String dni = JOptionPane.showInputDialog("Introduzca su DNI");
        String nombre = JOptionPane.showInputDialog("Introduzca su nombre");
        String apellidos = JOptionPane.showInputDialog("Introduzca sus apellidos");
        int sexOption = JOptionPane.showConfirmDialog(null, "¿Es usted hombre?");
        boolean sexo = sexOption != 1;
        String nacionalidad = JOptionPane.showInputDialog("Introduza su nacionalidad");
        String num_soport = JOptionPane.showInputDialog("Introduzca su numero de soporte");
        String diaNacS = JOptionPane.showInputDialog("Introduzca su dia de nacimiento");
        int diaNac = Integer.parseInt(diaNacS);
        String mesNacS = JOptionPane.showInputDialog("Introduzca su mes de nacimiento");
        int mesNac = Integer.parseInt(mesNacS);
        String anhoNacS = JOptionPane.showInputDialog("Introduzca su año de nacimiento");
        int anhoNac = Integer.parseInt(anhoNacS);
        String diaValS = JOptionPane.showInputDialog("Introduzca el dia de validez");
        int diaVal = Integer.parseInt(diaValS);
        String mesValS = JOptionPane.showInputDialog("Introduzca el mes de validez");
        int mesVal = Integer.parseInt(mesValS);
        String anhoValS = JOptionPane.showInputDialog("Introduzca el año de validez");
        int anhoVal = Integer.parseInt(anhoValS);

        DNI d;

        try{
            d = new DNI(dni, nombre, apellidos, nacionalidad, diaNac, mesNac, anhoNac, diaVal, mesVal, anhoVal, sexo, num_soport);
            System.out.println(d);
        } catch (InvalidIDCardException | DateTimeException e){
            e.printStackTrace();
        }

    }

}