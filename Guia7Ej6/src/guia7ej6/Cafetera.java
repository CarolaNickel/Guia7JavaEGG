package guia7ej6;

import java.util.Locale;
import java.util.Scanner;

//Atributos
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    //Repositorio vacio
    public void Cafetera() {
    }

    //Repositorio parametrizado
    public void Cafetera(int capacidadMaxima, int cantidadActual) {
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;
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

    
    
}
