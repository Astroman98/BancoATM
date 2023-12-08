package bancoATM;

public class Usuario {
	private double saldo;
	private int numeroCuenta;
	private int NIP;
	
	
	public Usuario(double saldo, int numeroCuenta, int NIP) {
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
		this.NIP = NIP;
	}
	
	public void establecerSaldo(double saldo) {
		saldo = 0.0;	
	}
	
	public double obtenerSaldo() {
		return saldo;
	}
	
	public void establecernumeroCuenta(int numeroCuenta) {
		numeroCuenta = 0;
	}
	
	public int obtenernumeroCuenta() {
		return numeroCuenta;
	}
	
	public void establecerNIP(int NIP) {
		NIP = 0;
	}
	
	public int obtenerNIP() {
		return NIP;
	}
	
	public void actualizarSaldo(double nuevoSaldo) {
		this.saldo = nuevoSaldo;
	}

	@Override
	public String toString() {
		return "Usuario [saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + ", NIP=" + NIP + "]";
	}
	
	

}
