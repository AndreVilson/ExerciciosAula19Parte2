package ExerciciosAula19;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
seja: B[i] := A[i] % 2.*/

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		
		System.out.println("vetorA");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorA [i] = scan.nextInt();		
		}
		System.out.println("");
		System.out.println("vetorB");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB [i] = vetorA [i] % 2 ;
			System.out.println("posição " + i + " : " + vetorB [i]);
		}
		
		
		
		
		
		
		
		
	}

}
