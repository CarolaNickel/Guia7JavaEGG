/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
 */
package guia7ej6;

import java.util.Locale;
import java.util.Scanner;

public class Guia7Ej6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String opcion;
        int cantidad;
        int seleccion;

        Cafetera cafetera = new Cafetera();
        System.out.println("Bienvenido a Resto Cafeteria");

        do {
            System.out.println(" ");
            System.out.println("Por favor seleccione la opcion con la cual desearia continuar ");
            System.out.println("1) Llenar cafetera ");
            System.out.println("2) Seleccion del tamaño del cafe ");
            System.out.println("3) Vaciar la cafetera ");
            System.out.println("4) Para ingresar manualmente cuanto cafe agregar a la cafetera");
            System.out.println("5) Salir");

            seleccion = leer.nextInt();
            switch (seleccion) {
                case 1:
                    cafetera.llenarCafetera();
                    System.out.println("Cafetera llena ");
                    break;
                case 2:
                    //Metodo de servir taza, eleccion
                    System.out.println("Por favor, seleccione el tamaño del cafe que desea ");
                    System.out.println("Poseemos 3 tamaños: Grande, Mediano y Chico");
                    System.out.println("Para seleccionar el tamaño ingrese la inicial que corresponda (G, M, C)");
                    opcion = leer.next();
                    cafetera.servirTaza(opcion);

                    break;
                case 3:
                    cafetera.vaciarCafetera();
                    break;
                case 4:
                    //metodo agregarCafe
                    System.out.println("Seleccione la cantidad de ml que desea cargar, recuerde que la cafetera tiene una capacidad maxima de 1000 ml");
                    cantidad = leer.nextInt();
                    cafetera.agregarCafe(cantidad);
            }

        } while (seleccion != 5);
        System.out.println("Gracias por su compra, sesion cerrada");
    }

}
