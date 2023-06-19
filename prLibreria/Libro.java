// Ignacio Ortiz Alonzua Programacion ciclo:Online
public class Libro {
	private static double porcIVA=0.21;
	private String autor;
	private String titulo;
	private double precioBase;
	
	public Libro(String autor, String titulo, double precioBase) {
		this.autor = autor;
		this.titulo = titulo;
		this.precioBase = precioBase;
	}

	public static double getIVA() {
		return porcIVA;
	}

	public static void setIVA(double porcIVA) {
		Libro.porcIVA = porcIVA;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPrecioFinal() {
		return precioBase + (precioBase*porcIVA); 
	}
	
	public String toString() {
		return titulo + " precio final de: " + this.getPrecioFinal();
	}
}
