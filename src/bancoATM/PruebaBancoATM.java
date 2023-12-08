package bancoATM;

import java.util.ArrayList;

public class PruebaBancoATM {
    public static void main(String[] args) {
    	
    	//deberias crear una instancia de usuario para crear numero de cuenta y numero de identificacion personasl (NIP)
    	//deberias crear un arreglo de usuarios que contengan su numero de cuenta e identificación personal
    	
    	

        // Usuario usuario1 = new Usuario(0, 0, 0);

        // System.out.println(usuario1);
        
        //Obtenes el usuario que ingresas en el menu
        // System.out.println(cajero1.getUsuario());
        
        
        Cuenta cuentas = new Cuenta();
        cuentas.agregarUsuario(1000000.0, 12345, 12345);
        cuentas.agregarUsuario(200.0, 54321, 54321);
        cuentas.agregarUsuario(300.0, 23456, 23456);
        cuentas.agregarUsuario(400.0, 54682, 25496);
        
        // imprime todos los usuarios
        // System.out.println(cuentas);
        ArrayList<Usuario> usuarios = cuentas.obtenerUsuarios();
        
        // obtiene primer objeto de Usuario de la lista usuarios.
        //int usuario = usuarios.get(2).obtenernumeroCuenta();
        //System.out.println(usuario);
        // cuentas.imprimir();
        
        //También se accede al elemento del arraylist así
        System.out.println(usuarios.get(0).obtenerSaldo());
        System.out.println(usuarios.get(0).obtenernumeroCuenta());
        System.out.println(usuarios.get(0).obtenerNIP());

        
        for (Usuario usuario1 : usuarios) {
        	
        	System.out.println(usuario1);
        	
        }
 
    	// Instancia de la clase ATM
        ATM cajero1 = new ATM();
        // Muestra el menu
        // Asignando el objeto cuentas a la variable cuenta en el objeto cajero1.
        cajero1.setCuenta(cuentas);
        cajero1.mostrarMenu();
        // cajero1.validar();
        
        //Interactuas con la clase Retiro
        //Retiro retiro = new Retiro(0, cajero1, cuentas);
        //retiro.setCuenta(cuentas);
        //retiro.ejecutar();

     
    }
}
