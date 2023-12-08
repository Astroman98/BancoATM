package bancoATM;

import java.util.ArrayList;
//eliminar scanner luego
import java.util.Scanner;

public class Retiro extends Transaccion {

	public Retiro(double monto,ATM atm, Cuenta cuenta, Cajero dispensador) {
		super(monto);
		this.atm = atm;
		this.cuenta = cuenta;
		this.dispensador = dispensador;
	}


	public Cuenta getCuenta() {
		return cuenta;
	}


	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	

	@Override
	public double ejecutar(double cantidad) {
		// TODO Auto-generated method stub

		try {
			//System.out.println("EJECUTA EL METODO EJECUTAR de la clase Retiro:");
			//ArrayList<Usuario> usuarios = cuenta.obtenerUsuarios();
			// crea una nueva instancia de la clase Usuario
			//verifica si hay dinero en el cajero
			
			
			Usuario usuarioActual = cuenta.obtenerUsuarios().get(atm.getUsuarioID());
			double operacion = usuarioActual.obtenerSaldo() - cantidad;
			double operacion2 = dispensador.getDispensador() - cantidad;
			if (operacion2 < 0.0) 
				throw new IllegalArgumentException("No hay suficiente dinero en el dispensador.");
			else if (operacion2 > 0.0 && cantidad > 0.0 && usuarioActual.obtenerSaldo() >= cantidad) {
					usuarioActual.actualizarSaldo(operacion);
					dispensador.actualizarDispensador(operacion2);
					
				}else {
					throw new IllegalArgumentException("No tiene saldo suficiente o ha ingresado un número inválido.");
				}
			

			
			//double operacion = cuenta.obtenerUsuarios().get(atm.getUsuarioID()).obtenerSaldo() - cantidad;
			System.out.println(operacion);
            System.out.println("Ha retirado " + cantidad + " con éxito.");
            System.out.println("Su saldo actual es de: " + cuenta.obtenerUsuarios().get(atm.getUsuarioID()).obtenerSaldo());
			
			dispensador.actualizarDispensador(operacion2);
			System.out.println(operacion2);
			System.out.println("Dispensador actual: " + dispensador.getDispensador());
			
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		//System.out.println(cuenta.obtenerUsuarios().get(atm.getUsuarioID()));
		//Obtenes el numero de usuario ingresado en clase ATM
		//System.out.println(atm.getUsuario());
		return cantidad;

	}



	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		
	}


	

}
