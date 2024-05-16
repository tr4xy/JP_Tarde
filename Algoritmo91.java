package Aula04;

import java.util.Scanner;

public class Algoritmo91 {

	public static void main(String[] args) {

		int num1, num2, num3, num4;
		int num5, num6, num7, num8;
		int div;
		int mult;
		int sub;
		int soma;
		
		System.out.println("Digite os valores abaixo: ");
		Scanner ler = new Scanner(System.in);
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		num4 = ler.nextInt();
		num5 = ler.nextInt();
		num6 = ler.nextInt();
		num7 = ler.nextInt();
		num8 = ler.nextInt();
		
		div = num1 / num2;
		mult = num3 * num4;
		sub = num5 - num6;
		soma = num7 + num8;
		
		if( div >= 10 ) {
			System.out.println("Sua divisão é: "+div);
		} else {
			System.out.println("Ops, falta números");
		} 
		
		if( mult >= 10 ) {
			System.out.println("Sua multiplicação é: "+mult);
		} else {
			System.out.println("Ops, falta números");
		}
		
		if( sub >= 10 ) {
			System.out.println("Sua subtração é: "+sub);
		} else {
			System.out.println("Ops, falta números");
		} 
		
		if( soma >= 10 ) {
			System.out.println("Sua soma é: "+soma);
		} else {
			System.out.println("Ops, falta números");
		}
	}

}
