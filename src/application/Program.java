package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String aluno;
		double idade;
		double serie;
		
		System.out.print("Digite o nome do aluno   :");
		aluno = sc.next();
		System.out.print("Digite a idade do aluno  :");
		idade = sc.nextDouble();
		System.out.print("Digite a série           :");
		serie = sc.nextDouble();
		
		
		
	}

}
