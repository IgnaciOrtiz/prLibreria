// Ignacio Ortiz Alonzua Programacion ciclo:Online
import java.util.Scanner;
public class mainprLibreria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Libro Libro1;
		LibroOferta Oferta1;
		
		Libro1 = new Libro("Miguel de Cervantes", "Don Quijote de la Mancha", 15.00);
		System.out.println("Autor de Libro1: " + Libro1.getAutor());
		System.out.println("Título Libro1: " + Libro1.getTitulo());
		System.out.println("Iva Libro1: " + Libro.getIVA());
		System.out.println("Precio Base Libro1: " + Libro1.getPrecioBase());
		System.out.println("Precio Final Libro1: " + Libro1.getPrecioFinal());
		System.out.println(Libro1.toString());
		
		Oferta1 = new LibroOferta("Miguel de Cervantes", "Don Quijote de la Mancha", 15.00, 0.10);
		System.out.println("El descuento del libro será: " + Oferta1.getDescuento());
		System.out.println("El precio final del libro es: " + Oferta1.getPrecioFinalOferta());
		System.out.println(Oferta1.toString());
		
		sc.close();
	}
}