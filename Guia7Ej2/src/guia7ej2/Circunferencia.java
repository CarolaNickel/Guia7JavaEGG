package guia7ej2;

import java.util.Locale;
import java.util.Scanner;

//Inicializacion de los atributos
public class Circunferencia {
    private double Radio;

    //Constructor vacio
    public Circunferencia() {
    }

    //Constructor parametrizado
    public void Circunferencia(double Radio) {
        this.Radio = Radio;
    }

    //GET - SET
    public double getRadio() {
        return Radio;
    }

    public void setRadio(int Radio) {
        this.Radio = Radio;
    }

    //Metodo de crear circunferencia
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Metodo para determinar circunferencias");
        System.out.println("Por favor, ingrese el radio");
        this.Radio = leer.nextInt();
    }

    //Metodo visualizacion del Radio
    public void visualizacionRadio() {
        System.out.println("El Radio ingresado es " + Radio);
    }
    
    //Metodo para calcular/mostrar el Area
    public void crearArea() {
        System.out.println("El area es de " + Math.PI * Radio);
    }

    //Metodo para calcular/mostrar el Perimetro
    public void crearperimetro() {
        System.out.println("El perimetro es de " + Math.PI * 2 * Radio);
    }


}
