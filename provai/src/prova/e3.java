/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class e3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float peso;
		int tempo = 0;
		System.out.println("Qual o peso do material:");
		peso = ler.nextFloat();
		float peso2 = peso;
		while (peso2 > 0.5) {
			peso2 = peso2 / 2;
			tempo++;
		}
		tempo = tempo * 50;
		float tempoh = tempo / 60;
		float tempu = tempoh / 60;
		tempo = tempo % 60;
		tempoh = tempoh % 60;
		System.out.println("Massa inicial: " + peso + "\n" + "Peso final:" + peso2 + "\n" + "Levou:" + tempu
				+ " Horas e " + tempoh + " Minutos e " + tempo + " Segundos para o elemento atingir 0,5 gramas");
	}
}
