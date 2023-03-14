package ejercicio3;

public class Punto {

	int x;

	int y;

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	void imprime() {
		System.out.println("(" + x + "," + y + ")");
	}

	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void desplaza(int dx, int dy) {
		x += dx;
		y += dy;
	}

	void distancia(Punto p) {
		double distancia = 0;

		Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
		System.out.println(distancia);
	}
}
