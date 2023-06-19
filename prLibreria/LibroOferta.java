// Ignacio Ortiz Alonzua Programacion ciclo:Online
public class LibroOferta extends Libro {
	private double porcDescuento;
	
	public LibroOferta(String autor, String titulo, double precioBase, double porcDescuento) {
		super(autor, titulo, precioBase);
		this.porcDescuento = porcDescuento;
	}
	
	public double getDescuento() {
		return getPrecioFinal()*porcDescuento;
	}
	
	public double getPrecioFinalOferta() {
		return getPrecioFinal() - getDescuento();
	}
	
	public String toString() {
		return getTitulo() + "precio final de: " + this.getPrecioFinalOferta();
	}
}
