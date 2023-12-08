package bancoATM;

public class Cajero {
	private double dispensador;
	
	public Cajero() {
		this.dispensador = 10000;
	}

	public double getDispensador() {
		return dispensador;
	}

	public void setDispensador(double dispensador) {
		this.dispensador = dispensador;
	}
	
	public void actualizarDispensador(double nuevoDispensador) {
		this.dispensador = nuevoDispensador;
	}
	
//	public boolean verificarCantidadDispensador() {
//
//			System.out.println("PRUEBA 1");
//			System.out.println("Dispensador en el metodo verificarcantidad es: " + dispensador);
//			if (this.dispensador < 0.0)  {
//				System.out.println("No hay dinero suficiente en el dispensador");
//				return false;
//			}
//			return true;
//
//}
	
}