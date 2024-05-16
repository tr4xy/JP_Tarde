package Aula04;

import java.util.Scanner;

public class Algoritmo90 {

	public static void main(String[] args) {
		int numero;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número:");
		numero = ler.nextInt();
		
		if( numero >= 25) { 
			System.out.println("Sim, é maior.");
		} else { 
			System.out.println("Não é maior.");
		}

	}

}
