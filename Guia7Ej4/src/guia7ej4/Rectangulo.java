package guia7ej4;

import java.util.Locale;
import java.util.Scanner;

//incializacion atributos
public class Rectangulo {

    private int Base;
    private int Altura;

    //Constructor vacio
    public void Rectangulo() {
    }

    //Contructor parametrizado   
    public void Rectangulo(int Base, int Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    //SET - GET
    public int getBase() {
        return Base;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    //Metdo para crear rectangulo
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Por favor ingrese los siguientes datos: ");
        System.out.print("Base: ");
        this.Base = leer.nextInt();
        System.out.print("Altura: ");
        this.Altura = leer.nextInt();
        System.out.println("Los datos fueron cargado correctamente ");
    }

    //Metodo para calcular la superficie del rectangulo
    public void superficie() {
        System.out.println("La superficie del rectangulo es " + (Base * Altura));
    }

    //Metodo para calcular el perímetro del rectangulo
    public void perimetro() {
        System.out.println("El perimetro del rectangulo es " + ((Base + Altura) * 2));
    }

    //Dibujo del rectangulo
    public void dibujo() {
        for (int i = 0; i < Base; i++) {
            for (int j = 0; j < Base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
