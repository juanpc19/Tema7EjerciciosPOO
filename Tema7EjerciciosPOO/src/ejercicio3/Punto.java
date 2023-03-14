package ejercicio3;

/**
 * clase que contiene metodos para crear y manipular puntos con coordenadas
 * 
 * @author juanpesca19
 *
 */
public class Punto {

	int x;// atributo que guardara la coordenada longitud del punto

	int y;// atributo que guardara la coordenada latitud del punto

	/**
	 * constructor con 2 parametros de entrada
	 * 
	 * @param x contendra valor que se asignara a atributo x
	 * @param y contendra valor que se asignara a atributo y
	 */
	public Punto(int x, int y) {
		super();
		// doy a atributo x valor de parametro de entrada x
		this.x = x;
		// doy a atributo y valor de parametro de entrada y
		this.y = y;
	}

	/**
	 * funcion que imprimira las coordenadas del objeto dado en un mensaje
	 * personalizado
	 */
	void imprime() {
		System.out.println("(" + x + "," + y + ")");
	}

	/**
	 * funcion que reasignara los valores de los atributos x e y
	 * 
	 * @param x contendra valor que se asignara a atributo x
	 * 
	 * @param y contendra valor que se asignara a atributo y
	 */
	void setXY(int x, int y) {
		// doy a atributo x valor de parametro de entrada x
		this.x = x;
		// doy a atributo x valor de parametro de entrada y
		this.y = y;
	}

	/**
	 * funcion que desplazara el punto segun la distancia proporcionada en dx y dy
	 * 
	 * @param dx contendra valor que se sumara a atributo x
	 * @param dy contendra valor que se sumara a atributo y
	 */
	void desplaza(int dx, int dy) {
		// sumo a atributo x valor de parametro de entrada x
		x += dx;
		// sumo a atributo x valor de parametro de entrada y
		y += dy;
	}

	/**
	 * funcion que calcula la distancia entre el punto asociado al objeto que llama
	 * a la funcion y el punto asociado al parametro de entrada
	 * 
	 * @param p objeto con atributos x e y que tendran valores concretos
	 * @return distancia contendra la distancia entre los 2 puntos
	 */
	double distancia(Punto p) {
		double distancia = 0;// declaro varibale que contendra distancia entre los 2 puntos y la inicializo a
								// 0 para usarla como return

		// doy a distancia valor igual a la distancia entre 2 puntos calculada usando el
		// teorema de pitagoras aplicado a coordenadas de los objetos punto

		// this.x seria la x del objeto con el que llamo a la clase y p.x seria la x del
		// objeto usado como parametro de entrada
		distancia = Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
		return distancia;
	}
}
