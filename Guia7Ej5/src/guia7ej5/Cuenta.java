package guia7ej5;

import java.util.Locale;
import java.util.Scanner;

//Atributos
public class Cuenta {

    private String nombreCliente;
    private long numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    private double ingreso;
    private double retiro;

    //Respositorio Vacio
    public void Cuenta() {
    }

    //Repositorio parametrizado
    public void Cuenta(String nombreCliente, long numeroCuenta, long dniCliente, double saldoActual, double ingreso, double retiro) {

        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.ingreso = ingreso;
        this.retiro = retiro;
    }

    //SET - GET   
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
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

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    //Metodo para crear la cuenta del usuario
    public void crearCuenta() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Bienvenidos a la red de bancos Stiko, para ser parte de esta gran comunidad por favor ingrese los siguientes datos ");
        System.out.print("Nombre completo: ");
        nombreCliente = leer.next();
        System.out.print("DNI asociado a la cuenta: ");
        dniCliente = leer.nextInt();
        System.out.print("Numero de cuenta: ");
        numeroCuenta = leer.nextInt();
        System.out.println("");
        System.out.println("Ingrese el saldo que posee ");
        System.out.println("Por favor, corrobore bien los datos antes de continuar");
        System.out.println("Saldo: ");
        saldoActual = leer.nextDouble();
        System.out.println("Saldo cargado exitosamente");
    }

    //Metodo registro del saldo / ingreso de un nuevo monto
    public void registro(double ingreso) {
        System.out.println("El monto que usted posee actualmente es de: " + (saldoActual = saldoActual + ingreso));
    }

    //Metodo retiro de dinero
    public void extraccion(double retiro) {
        System.out.println("El monto que usted posee actualmente es de: " + (saldoActual = saldoActual - retiro));
    }

    //Metodod extraccion rapida
    public void extraccionRapida(double interes) {
        if (interes > ((saldoActual * 20) / 100)) {
            System.out.println("El monto que desea extraer supera el tope permitido de extraccion, el cual es del 20%");
            System.out.println("Por favor ingrese otro monto");
        } else {
            System.out.println("Carga exitosa");
            System.out.println("El monto de extraccion es de: " + interes);
            System.out.println("El monto que le queda es de: " + (saldoActual - interes));
        }
    }

    //Metodo Consultar saldo
    public void consultarSaldo() {
        System.out.println("Su saldo actual es de: " + saldoActual);
    }

    //Metodo consultar datos
    public void consultarDatos() {
        System.out.print("Nombre completo: " + nombreCliente);
        System.out.print("Numero de DNI: " + dniCliente);
        System.out.print("Numero de cuenta con el cual esta registrado: " + numeroCuenta);
    }

}
