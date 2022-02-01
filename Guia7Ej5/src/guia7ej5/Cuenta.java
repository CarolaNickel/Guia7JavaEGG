package guia7ej5;

import java.util.Locale;
import java.util.Scanner;

//Atributos
public class Cuenta {

    private int numeroCuenta;
    private int dniCliente;
    private double saldoActual;
    private double interes;

    //Respositorio Vacio
    public void Cuenta() {
    }

    //Repositorio parametrizado
    public void Cuenta(int numeroCliente, int dniCliente, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    // SET - GET   
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    //Metodo para crear la cuenta del usuario
    public void crearCuenta() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Bienvenidos a la red de bancos Stiko, para ser parte por favor ingrese los siguientes datos ");
        System.out.print("Numero de cuenta: ");
        this.numeroCuenta = leer.nextInt();
        System.out.println("DNI asociado a la cuenta: ");
        this.dniCliente = leer.nextInt();
        System.out.println("");
        System.out.println("Registro exitoso");
    }

    //Metodo ingreso y registro del saldo
    public void registro() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingreso y registro de saldo");
        System.out.println("Por favor, corrobore bien los datos antes de continuar");
        System.out.println("Su saldo actual es de $40000");
        System.out.println("Escriba el monto que desea ingresar");
        System.out.print("Monto: ");
        this.saldoActual = leer.nextInt();
        
    }

}
