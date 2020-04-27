package view;

import java.util.Scanner;

public class Testes_curso {
	public static void main(String[] args) {
		//matrizes
		Scanner sc = new Scanner(System.in);
		System.out.println("Tamanho do vetor: ");
		int n = sc.nextInt();
		int [][] mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.printf("Enter a number: [%d]x[%d] ", i,j);
			
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
				System.out.println(" ");
			
			}
		}
		
		System.out.println("main diagonal");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int count = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]< 0) {
					count++;
				}
			}
		}
		System.out.println(" ");
		System.out.println("Negative numbers: " + count);
		
		
		sc.close();
		
	}
}
