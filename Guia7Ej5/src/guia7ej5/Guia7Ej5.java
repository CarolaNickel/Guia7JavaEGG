/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo y número de cuenta.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package guia7ej5;

import java.util.Locale;
import java.util.Scanner;

public class Guia7Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int opcion;
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();

        do {
            System.out.print("Seleccione la opcion que desea ejecutar ");
            System.out.println("");
            System.out.println("1) Registro de saldo e ingreso de un nuevo monto");
            System.out.println("2) Extraccion de dinero");
            System.out.println("3) Extraccion rapida");
            System.out.println("4) Consulta de saldo");
            System.out.println("5) Consulta datos");
            System.out.println("6) Cerrar sesion");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingreso y registro de saldo");
                    System.out.println("Escriba el monto que desea ingresar");
                    System.out.print("Monto: ");
                    cuenta.registro(leer.nextDouble());
                    break;
                case 2:
                    System.out.println("Extraccion de dinero");
                    System.out.println("Ingrese el monto que desea extraer");
                    System.out.print("Monto: ");
                    cuenta.extraccion(leer.nextDouble());
                    break;
                case 3:
                    System.out.println("Extraccion rapida de dinero");
                    System.out.println("El sistema de extraccion rapida es un sistema que le permite extraer unicamente hasta un 20% del monto total de su cuenta");
                    System.out.println("Por favor, ingrese el monto que desea extraer");
                    cuenta.extraccionRapida(leer.nextDouble());
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                case 5:
                    System.out.print("Datos cargados al sistema: ");
                    cuenta.consultarDatos();
                    break;
            }
        } while (opcion != 6);
        System.out.println("Gracias por usar nuestros servicios");
    }
}
