package Aula04;

import java.util.Scanner;

public class UsandoifElse {

	public static void main(String[] args) {

		int sn;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Teste para modelo");
		System.out.println("Perguntando a idade:");
		sn = ler.nextInt();
		
		if(sn >= 14 && sn <= 20) {
			System.out.println("Opa! Ai sim! Aprovada");
		} else {
			System.out.println("Reprovada!");
		}
		
	}

}
