package bancoATM;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	Scanner scanner = new Scanner(System.in);
	// private ArrayList<Usuario> usuarios;
	private int usuario;
	private int NIP;
	private Cuenta cuenta;
	private int opcion;
    private double retiro, deposito;
    private Transaccion transaccion;
    private Retiro retirar;
    private Deposito depositar;
    private SolicitudSaldo balance;
    private int usuarioID;
    private ATM atm;
    private Cajero dispensador;

    
        public ATM() {
         cuenta = new Cuenta();
         this.atm = this;
         dispensador = new Cajero();
      }

        public boolean validar() {
        	System.out.println("----------------------------");
        	
        	ArrayList<Usuario> usuarios = cuenta.obtenerUsuarios();
            //System.out.println(usuarios.get(0));
            //System.out.println(usuarios.get(0).obtenernumeroCuenta() + "-------------");
            //System.out.println(usuario);
            
            boolean verificador = false;
            boolean verificadorNIP = false;
            for (Usuario userindividual : usuarios) {
            	
            	if (usuario == userindividual.obtenernumeroCuenta() && NIP == userindividual.obtenerNIP()) {
            		System.out.println("Son numeros iguales");
            		verificador = true;
            		verificadorNIP = true;
            		// break;
            		//System.out.println(usuario);
            		//System.out.println(userindividual.obtenernumeroCuenta());
            		usuarioID = usuarios.indexOf(userindividual);
            		return true;

            	}

                //userindividual.obtenernumeroCuenta();
                
                //System.out.println(userindividual.obtenernumeroCuenta());
                //System.out.println(usuarios.get(contador));
				
                	
            }
        	if(!verificador && !verificadorNIP) {
        		System.out.println("El usuario o el NIP ingresados son incorrectos. Vuelva a intentarlo.");
        		return false;
        	}
            
            System.out.println("-------------------------");
            	return false;
        }
    
	
    public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}




	public int getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(int usuarioID) {
		this.usuarioID = usuarioID;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}




	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	
	

	
	public void mostrarMenu() {
        System.out.println("Bienvenido al cajeto automático ATM");
        int longitud, longitud2;
        //do {
        	//int opcion = 00;
		do {
        	System.out.print("Ingrese su número de cuenta: ");
        	
            usuario = scanner.nextInt();
            String usuarioComoCadena = String.valueOf(usuario);
            longitud = usuarioComoCadena.length();
            
            //usuarioComoCadena = Integer.toString(usuario);
            //longitud = usuarioComoCadena.length();
            
            System.out.print("Ingrese su NIP: ");
            
            NIP = scanner.nextInt();
            String NIPComoCadena = String.valueOf(NIP);
            longitud2 = NIPComoCadena.length();
            
            
            if (usuarioComoCadena.length() != 5 || NIPComoCadena.length() != 5) {
            	System.out.println("La longitud del usuario o el NIP son incorrectos. Vuelva a intentarlo.");
            }
            
            
        } while(longitud != 5 || longitud2 != 5 || validar() == false);
   

        do {
            System.out.println("Bienvenido, usuario " + usuario + ", seleccione una opción:");
            System.out.println("1. Retirar efectivo");
            System.out.println("2. Depositar efectivo");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            
//        	ArrayList<Usuario> usuarios = cuenta.obtenerUsuarios();
//            // System.out.println(usuarios.get(0));
//        	
//            System.out.println(usuarios.get(0).obtenernumeroCuenta() + "-------------");
//            System.out.println("Lo que elegiste del usuario es: " + usuario);


            switch (opcion) {
                case 1:
                	// retirar = new Retiro(deposito, null);
                    System.out.println("Ingrese la cantidad a retirar: ");
                    retiro = scanner.nextDouble();
                    retirar = new Retiro(retiro, this.atm, this.cuenta, this.dispensador);
                    retirar.ejecutar(retiro);
//                  System.out.println("Ha retirado " + retiro + " con éxito.");
//                  System.out.println("Su saldo actual es de: " + cuenta.obtenerUsuarios().get(atm.getUsuarioID()).obtenerSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    deposito = scanner.nextDouble();
                    depositar = new Deposito(deposito, this.atm, this.cuenta, this.dispensador);
                    depositar.ejecutar(deposito);
                    // System.out.println("Ha depositado " + deposito + " con éxito.");
                    //System.out.println("Su saldo actual es de: " + cuenta.obtenerUsuarios().get(atm.getUsuarioID()).obtenerSaldo());
                    break;
                case 3:
                	System.out.println("Su saldo es de : " );
                	balance = new SolicitudSaldo(0, this.atm, this.cuenta);
                	balance.ejecutar();
                	//System.out.println("Su saldo es de: " + balance);
                	//System.out.println("Su saldo actual es de: " + cuenta.obtenerUsuarios().get(atm.getUsuarioID()).obtenerSaldo());
                	break;
                case 4:
                    System.out.println("Gracias por usar nuestro cajero.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);
        
        //}while(true);
    }
}