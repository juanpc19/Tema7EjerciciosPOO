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

	void sacarDinero(double dineroSolicitado) {
		if (saldo > dineroSolicitado) {
			saldo -= dineroSolicitado;
			System.out.println("Su transaccion es posible y se ha llevado a cabo. ");

		} else {
			System.out.println("Su transaccion no es posible, no tiene suficiente saldo. ");
		}
	}

	void ingresarDinero(double dineroIngresar) {
		saldo += dineroIngresar;
	}

	//void mostrarInformacion
	
	
	
}
