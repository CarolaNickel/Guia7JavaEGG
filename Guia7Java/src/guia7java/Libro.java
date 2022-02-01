
package guia7java;

import java.util.Locale;
import java.util.Scanner;

//Declaracion de atributos
public class Libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int NroPaginas;
   
    //Contructor vacio
    public Libro(){
}

    //Contructor parametrizado
    public Libro(int ISBN, String Titulo, String Autor, int NroPaginas){
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NroPaginas = NroPaginas;    
    }
            
    //Setter - Getter.

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNroPaginas() {
        return NroPaginas;
    }

    public void setNroPaginas(int NroPaginas) {
        this.NroPaginas = NroPaginas;
    }
    
    //Cargar Libro
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Sistema de carga manual de libros al sistema de datos");
        System.out.println("Ingrese el ISBN del libro");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese el titulo del libro");
        this.Titulo = leer.next();
        System.out.println("Ingrese el autor del libro");
        this.Autor = leer.next();
        System.out.println("Ingrese el numero de paginas que posee el libro");
        this.NroPaginas = leer.nextInt();
                
    }
    
    //Mostrar Libro
    public void mostrarLibro(){
    System.out.println(" ");
    System.out.println("El ISBN del libro es " + ISBN);
    System.out.println("El titulo del libro es "+ Titulo);
    System.out.println("El autor del libro es " + Autor);
    System.out.println("El numero de paginas que posee el libro es "+ NroPaginas);
        
    }
    
    
    
}
