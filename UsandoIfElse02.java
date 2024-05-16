package Aula04;

import java.util.Scanner;

public class UsandoIfElse02 {

	public static void main(String[] args) {
		double valor;
		double bolsa = 500.00;
		double cartao = 3600;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Comprando a bolsa da Larissa");
		System.out.println("A Larissa tem $:");
		valor = ler.nextDouble();

		if(valor > bolsa) {
			System.out.println("Missão comprida!");
		} else if(cartao >= bolsa) {
			System.out.println("Comprei com o cartão");
		} else {
			System.out.println("Xiiii");
		}
		
	}

}
