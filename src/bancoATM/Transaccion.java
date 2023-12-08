package bancoATM;
// Clase abstracta Transaccion
public abstract class Transaccion {
	protected double monto;
	protected Cuenta cuenta;
	protected ATM atm;
	protected Cajero dispensador;
	
	public Transaccion(double monto) {
		this.monto = monto;
	}
	
	public abstract void ejecutar();

	public double ejecutar(double cantidad) {
		return cantidad;
		
	}
	
}

// Clase Usuario atributos: saldo, numero de cuenta (de 5 digitos), NIP(numero
// de identificacion personal), transaccion (ya sea 
// retirar efectivo y depositar, y consultar saldo),


// ATM atributos: cuentas (aqui seran guardadas las cuentas creadas
// en la clase usuario), 