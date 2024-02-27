package JavaBasico;

import java.util.Scanner;

public class JavaScaner {

   
	
	public static void main(String[] args) {
	
	
	
	Scanner entrada = new Scanner(System.in);
	
	/* ENTRADA DE DADOS*/
	
	System.out.println(" BEM VINDO !!!\n\n");
	
	System.out.println("Digite seu nome : ");
	String nome = entrada.nextLine(); /* o cursor vai ficar esperando a entrada dos dados inseridos pelo usuario*/

	
	System.out.println("Digite seu sobrenome : ");
	String sobrenome = entrada.nextLine();
	
	
	System.out.println("Digite sua idade");
	int idade = entrada.nextInt();
	
	
	System.out.println("Digite seu salario");
    int salario = entrada.nextInt();
	
	
	
	System.out.printf("%s %s tem %d anos e ganha R$%d reais !!", nome.toUpperCase(), sobrenome.toUpperCase(), idade ,salario);
	/* 
	 * 
	 * usando o .toupcase gera letras maiusculas na impressao dos dados
	 * 
	 * */
	
	
	
	
	entrada.close();
}

}