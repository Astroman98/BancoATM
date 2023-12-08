package bancoATM;

public class SolicitudSaldo extends Transaccion {

	public SolicitudSaldo(double monto, ATM atm, Cuenta cuenta) {
		super(monto);
		this.atm = atm;
		this.cuenta = cuenta;
	}
	
	public Cuenta getCuenta() {
		return cuenta;
	}


	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	
	@Override
	public void ejecutar() {
		System.out.println("Ejecuta metodo ejecutar de clase solicitudSaldo");
		Usuario usuarioActual = cuenta.obtenerUsuarios().get(atm.getUsuarioID());
		double operacion = usuarioActual.obtenerSaldo();
		usuarioActual.actualizarSaldo(operacion);
		System.out.println("Su saldo es de: " + operacion);
		
	}


}
