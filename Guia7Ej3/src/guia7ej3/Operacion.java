package guia7ej3;

import java.util.Locale;
import java.util.Scanner;

//Definicion de atributos
public class Operacion {

    private int Numero1;
    private int Numero2;

    //Constructor parametrizado
    public void Operacion(int Numero1, int Numero2) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
    }

    //Constructor vacio
    public void Operacion() {
    }

    //SET - GET
    public int getNumero1() {
        return Numero1;
    }

    public void setNumero1(int Numero1) {
        this.Numero1 = Numero1;
    }

    public int getNumero2() {
        return Numero2;
    }

    public void setNumero2(int Numero2) {
        this.Numero2 = Numero2;
    }

    //Metodo Crear operacion
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Por favor, ingrese dos numeros");
        this.Numero1 = leer.nextInt();
        this.Numero2 = leer.nextInt();

        if (Numero1 != 0 && Numero2 != 0) {
            System.out.println("Los valores fueron cargados correctamente");
        } else {
            System.out.println("Uno de los valores ingresados es de 0, por favor ingrese otro valor");
            this.Numero1 = leer.nextInt();
            this.Numero2 = leer.nextInt();
        }
    }

    //Metodo Sumar
    public void sum() {
        System.out.println(" ");
        System.out.println("Resultados: ");
        System.out.println(" ");
        System.out.println("El resultado suma de los numeros ingresados es de " + (Numero1 + Numero2));
    }

    //Metodo Restar
    public void rest() {
        System.out.println("El resultado de la resta de los numeros ingresados es de " + (Numero1 - Numero2));
    }

    //Metodo Multiplicar
    public void multip() {

        if ((Numero1 * Numero2) != 0) {
            System.out.println("El resultado de la multiplicacion de los numeros ingresados es de " + (Numero1 * Numero2));
        } else {
            System.out.println("El resultado de la multiplicacion es de 0, por favor ingrese otros valores ");
        }
    }

    //Metodo Dividir
    public void dividir() {

        if ((Numero1 / Numero2) != 0) {
            System.out.println("El resultado de la division de los numeros ingresados es de " + (Numero1 / Numero2));
        } else {
            System.out.println("El resultado de la division de los numeros ingresados es de 0, por favor ingrese otros valores");
        }
    }
}
