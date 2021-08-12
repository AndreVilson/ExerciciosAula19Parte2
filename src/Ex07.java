package ExerciciosAula19;

import java.util.Scanner;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a subtração dos respectivos
elementos em A e B, ou seja:
C[i] = A[i] – B[i].*/

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		System.out.println("vetorA");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + " = ");
			vetorA[i] = scan.nextInt();
		}
		System.out.println("vetorB");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Digite a posição " + i + " = ");
			vetorB[i] = scan.nextInt();
		}
		System.out.print("vetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		System.out.println("");
		System.out.print("vetorB = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(" " + vetorB[i]);
		}
		System.out.println("");
		System.out.print("vetorC = ");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
			System.out.print(vetorC[i] + " ");

		}

	}

}
