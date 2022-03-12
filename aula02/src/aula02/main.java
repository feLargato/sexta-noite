package aula02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		
		exemplo01();
		exercicio01();
		
	}
	
	public static void exemplo01() {
		
//		int valor = 110;
//		int valor2 = 200;
//		int resultado = valor + valor2;
//		System.out.println(resultado);
//		
//		char letraA = 'A';
//		System.out.println(letraA);;
//		
//		double decimal1 = 200.34;
//		float decimal2 = 200.35f;
		
//		double[] notas = {5.5, 10, 8.7};
		
//		for(int i = 0; i < 3; i++) {
//			System.out.println(notas[i]);
//		}
//		int i = 0;
//		
//		while (i < 3){
//			System.out.println(notas[i]);
//			i++;
//		}
		
//		String nota = "10";
//		int nota2 = 5;
//		int soma = nota2 + Integer.parseInt(nota);
//		System.out.println(soma);
//		
//		String resultadoString = nota + nota2;
//		
//		System.out.println(resultadoString);
		
//		String frase = "Um texto";
//		System.out.println(frase);
//		System.out.println(frase.length());
//		System.out.println(frase.charAt(5));
		
	}
	
	
	public static void exercicio01() throws FileNotFoundException { 
		File file = new File("C:\\Users\\03682535209\\Documents\\notas.txt");
		Scanner notas = new Scanner(file);
		int notasTotais = 0;
		String notasIndividuaisString;
		int notasIndividuais = 0;
		
		while(notas.hasNext()) {
			
			notasIndividuaisString = notas.nextLine().replaceAll("[^0-9]", "");
			
			
			System.out.println(notasIndividuaisString);
		
	
		}

	}
}
