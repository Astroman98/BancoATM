package bancoATM;

import java.util.ArrayList;

public class Cuenta {
	private ArrayList<Usuario> usuarios;
	private Usuario usuario;

	public Cuenta() {
		usuarios = new ArrayList<>();
	}

	
	public void agregarUsuario(double saldo, int numeroCuenta, int NIP) {
		usuarios.add(new Usuario(saldo, numeroCuenta, NIP));
		
	}


	public ArrayList<Usuario> obtenerUsuarios() {
		return usuarios;
	}

	@Override
	public String toString() {
		return "Cuenta [usuarios=" + usuarios + "]";
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	//Prueba
//	public void imprimir() {
//		int usuario1 = usuarios.get(2).obtenernumeroCuenta();
//		System.out.println(usuario1 + "----------------------");
//	}
	




}
