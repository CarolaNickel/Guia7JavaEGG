/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
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
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();
        System.out.print("Seleccione la opcion que desea ejecutar ");
        System.out.println("");
        System.out.println("1) Registro de saldo e ingreso de un nuevo monto");
        System.out.println("2) Extraccion de dinero");
        System.out.println("3) Extraccion rapida");
        System.out.println("4) Consulta de saldo");
        System.out.println("5) Consulta datos");
        System.out.println("6) Cerrar sesion");

        int opcion = leer.nextInt();
        
        //Pense que que posia hacer bucle asi pero parece que no
        if (opcion == 6) {
            System.out.println("Gracias por usar nuestros servicios");
        } else {
            switch (opcion) {
                case 1:
                    cuenta.registro();
                    break;
                case 2:
                    cuenta.extraccion();
                    break;
                case 3:
                    cuenta.extraccionRapida();
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                case 5:
                    cuenta.consultarDatos();
                    break;
            }
        }
    }

}
