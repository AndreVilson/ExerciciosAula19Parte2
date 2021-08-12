package ExerciciosAula19;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C, onde cada elemento de C é a divisão dos respectivos
elementos em A e B, ou seja:	 
C[i] = A[i] / float(B[i]).*/

public class Ex09 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		double [] vetorA = new double [2];
		double [] vetorB = new double [vetorA.length];
		double [] vetorC = new double [vetorA.length];
		
		System.out.println("vetorA");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorA [i] = scan.nextDouble();
		}
		System.out.println("");
		System.out.println("vetorB");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorB [i] = scan.nextDouble();
		}
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.println("");
		System.out.println("vetorC");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
			System.out.println("posição " + i + " : " + df.format(vetorC[i]));
		}
		
	}

}
