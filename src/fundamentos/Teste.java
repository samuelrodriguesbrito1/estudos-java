package fundamentos;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		System.out.println("a ");
		
		Scanner entrada = new Scanner(System.in);

		String s = entrada.nextLine();

        System.out.println("String: " + s);
        
        entrada.close();
	}
}
