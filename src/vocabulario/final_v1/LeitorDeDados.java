package vocabulario.final_v1;

import java.util.Scanner;

public class LeitorDeDados {
	private Scanner scanner;

	public LeitorDeDados() {
		scanner = new Scanner(System.in);
	}

	public String pegarTextoCompleto() {
		return scanner.nextLine();
	}
	
	public String pegarTextoCurto() {
		return scanner.next();
	}
	
	public int pegarNumeroInteiro() {
		return Integer.parseInt(scanner.nextLine());
	}

	public void fecharLeitor() {
		scanner.close();
	}
}
