package ejercicio1;

public class CuentaCorriente {

	String dni;// atributo que guardara el dni

	String nombre;// atributo que guardara el nombre

	double saldo;// atributo que guardara el saldo

	/**
	 * constructor con 2 datos de entrada
	 * 
	 * @param dni   guardara el dni de la cuenta
	 * @param saldo guardara el saldo de la cuenta
	 */
	CuentaCorriente(String dni, double saldo) {
		this.dni = dni;
		this.saldo = saldo;
	}

	/**
	 * constructor con 3 datos de entrada
	 * 
	 * @param dni    dni guardara el dni de la cuenta
	 * @param nombre dni guardara el nombre de la cuenta
	 * @param saldo  guardara el saldo de la cuenta
	 */
	CuentaCorriente(String dni, String nombre, double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	/**
	 * metodo que sacara dinero si existe saldo suficiente para ello
	 * 
	 * @param dineroSolicitado guardara la cantidad de dinero a extraer
	 */
	void sacarDinero(double dineroSolicitado) {
		// si el atributo saldo actual es mayor o igual que el dinero a extraer
		if (saldo >= dineroSolicitado) {
			// se llevara a cabo la extraccion restandole dineroSolicitado a atributo saldo
			saldo -= dineroSolicitado;
			// y se le comunicara al usuario mediante mensaje por pantalla
			System.out.println("Su transaccion es posible y se ha llevado a cabo. ");

			// de lo contrario no se llevara a cabo la operacion
			// y se le comunicara al usuario mediante mensaje por pantalla
		} else {
			System.out.println("Su transaccion no es posible, no tiene suficiente saldo. ");
		}
	}

	/**
	 * metodo que añadira el valor del dinero ingresado a saldo
	 * 
	 * @param dineroIngresar
	 */
	void ingresarDinero(double dineroIngresar) {
		// añado el valor de dineroIngresar a atributo saldo
		saldo += dineroIngresar;
	}

	/**
	 * metodo que mostrara los datos de la cuenta especificada asociada con su
	 * propio objeto
	 */
	void mostrarInformacion() {
		// print de pantalla de los atributos con los valores del objeto con el que se
		// usa el metodo
		System.out.println(dni + " " + nombre + " " + saldo);
	}

}
