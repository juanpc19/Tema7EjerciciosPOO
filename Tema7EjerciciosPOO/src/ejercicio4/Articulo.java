package ejercicio4;

public class Articulo {

	String nombre;
	
	double precio;
	
	final int iva=21;
	
	int cuantosQuedan;
	
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}
	
	void imprimir() {
		System.out.println(nombre + " " + precio + " " + cuantosQuedan);
	}
	
	double getPVP() {
		double pvp;
		pvp=precio/100*iva;
		return pvp;
	}
	
	double getPVPDescuento(int descuento) {
		double pvpDescuento;
		pvpDescuento=precio/100*iva;
		return pvpDescuento;
	}
	
}
