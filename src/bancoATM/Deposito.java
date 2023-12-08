package bancoATM;

public class Deposito extends Transaccion {

	public Deposito(double monto, ATM atm, Cuenta cuenta, Cajero dispensador) {
		super(monto);
		this.atm = atm;
		this.cuenta = cuenta;
		this.dispensador = dispensador;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double ejecutar(double cantidad) {

		try {
			Usuario usuarioActual = cuenta.obtenerUsuarios().get(atm.getUsuarioID());
			
			
			double operacion2 = dispensador.getDispensador() + cantidad ;
			
			if (operacion2 < 0.0) 
				throw new IllegalArgumentException("No hay suficiente dinero en el dispensador.");
			
			else if (cantidad > 0.0) {
				System.out.println("Ejecuta el metodo ejecutar de la clase Deposito:");
				double operacion = usuarioActual.obtenerSaldo() + cantidad;
				usuarioActual.actualizarSaldo(operacion);
				System.out.println(operacion);
				System.out.println("Ha depositado " + cantidad + " con éxito.");
				System.out.println("Su saldo actual es de: " + cuenta.obtenerUsuarios().get(atm.getUsuarioID()).obtenerSaldo());
				
				dispensador.actualizarDispensador(operacion2);
				System.out.println(operacion2);
				System.out.println("Dispensador actual: " + dispensador.getDispensador());
				
			} else {
				throw new IllegalArgumentException("No puede ingresar números negativos.");
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		return cantidad;
	}
	
	
	



	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		
	}

}
