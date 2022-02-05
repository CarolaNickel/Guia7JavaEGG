package guia7ej6;

//Atributos
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    //Repositorio vacio
    public void Cafetera() {
    }

    //Repositorio parametrizado
    public void Cafetera(int capacidadMaxima, int cantidadActual) {
        this.cantidadActual = 0;
        this.capacidadMaxima = 1000;
    }

    //SET - GET
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //Metodo llenar cafetera. Hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera() {
        cantidadActual = 1000;
    }

    /* Metodo servirTaza(int): se pide el tamaño de una taza vacía, el método 
    recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza. */
    public void servirTaza(String opcion) {
        int chico;
        int mediano;
        int grande;

        switch (opcion) {
            case "C":
                System.out.println("Tamaño chico (60 ml)");

                if (cantidadActual < 60) {
                    System.out.println("Por favor, recargue la cafetera, el contenido que posee actualmente es insuficiente para completar el pedido");
                } else {
                    chico = (cantidadActual = cantidadActual - 60);
                    System.out.println("Quedan " + cantidadActual + " ml en la cafetera");
                }
                break;
            case "M":
                System.out.println("Tamaño mediano(200 ml)");
                if (cantidadActual < 200) {
                    System.out.println("Por favor, recargue la cafetera, el contenido que posee actualmente es insuficiente para completar el pedido");
                } else {
                    mediano = (cantidadActual = cantidadActual - 200);
                    System.out.println("Quedan " + cantidadActual + " ml en la cafetera");
                }
                break;
            case "G":
                System.out.println("Tamaño grande (300 ml)");
                if (cantidadActual < 300) {
                    System.out.println("Por favor, recargue la cafetera, el contenido que posee actualmente es insuficiente para completar el pedido");
                } else {
                    grande = (cantidadActual = cantidadActual - 300);
                    System.out.println("Quedan " + cantidadActual + " ml en la cafetera");
                }
                break;
        }
    }

    //metodo para vaciar cafetera
    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("La cafetera fue vaciada");
    }
    //llenado progresivo de cafetera

    public void agregarCafe(int cantidad) {
        cantidadActual = cantidadActual + cantidad;
        System.out.println("Se recargo la cafetera a " + cantidadActual + " ml");

    }

}
