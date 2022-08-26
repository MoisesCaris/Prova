package prova;

import java.util.Scanner;

public class e1semvetor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3, n4, n5, menor, maior;
		System.out.println("Escolha o primeiro numero:");
		n1 = ler.nextInt();
		menor = n1;
		maior = n1;
		System.out.println("Escolha o segundo numero:");
		n2 = ler.nextInt();
		if (maior < n2) {
			maior = n2;
		}
		if (menor > n2) {
			menor = n2;
		}
		System.out.println("Escolha o terceiro numero:");
		n3 = ler.nextInt();
		if (maior < n3) {
			maior = n3;
		}
		if (menor > n3) {
			menor = n3;
		}
		System.out.println("Escolha o quarto numero:");
		n4 = ler.nextInt();
		if (maior < n4) {
			maior = n4;
		}
		if (menor > n4) {
			menor = n4;
		}
		System.out.println("Escolha o quinto numero:");
		n5 = ler.nextInt();
		if (maior < n5) {
			maior = n5;
		}
		if (menor > n5) {
			menor = n5;
		}
		System.out.println("O maior numero foi:" + maior + "\n" + "O menor numero foi:" + menor);
	}
}