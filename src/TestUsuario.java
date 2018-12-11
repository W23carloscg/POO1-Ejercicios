import java.util.Scanner;

public class TestUsuario {

	public static void main (String[] a) {
		
		System.out.println("Introduce el login y password (nº entre 0 y 10)");
		java.util.Scanner sc = new Scanner(System.in);
		
		String login = sc.next();
		
		Usuario usuario = new Usuario(login);
		/**
		while (password != usuario.getpassword() ) {
			password = sc.nextInt();
			contador++;
			if (contador == 3) {
				System.out.println("Ha superdao los tres intentos");
			}
		}
		int password = sc.nextInt();
		
		sc.close();
		**/
		
 	}
}