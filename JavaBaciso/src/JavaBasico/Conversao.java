package JavaBasico;

import java.util.Scanner;


public class Conversao {

    public static void main(String[] args) {

		 System.out.println(" BEM VINDO  \n\n\n");
		 
		 
		 /*ENTRADA DE DADOS*/
		 
		 Scanner  entrada = new Scanner(System.in);
		 
		 
		 System.out.println("Digite seu nome : ");
		 String nome = entrada.nextLine();
		 
		 System.out.println("Digite seu salario do primeiro mes :  ");
		 String salario1= entrada.next().replace(".", ".");
		 
		 System.out.println("Digite o salario do segundo mes : ");
		 String salario2 = entrada.next().replace(",", ".");
		 
		 System.out.println("Digite o salario do terceiro mes : ");
		 String salario3 =entrada.next().replace(",", ".");
		 
		 /* USANDO .REPLECE O PROGRAMA VAI LER TANTO A , OU . QUANDO USUARIO DIGITE UM NUMERO FRACIONADO*?
		 
		 /*TRANSFORMANDO STRING EM DOUBLE*/
		 
		 double valor1 = Double.parseDouble(salario1);
		 double valor2 = Double.parseDouble(salario2);
		 double valor3 = Double.parseDouble(salario3);
		 
		 
		 double soma = valor1 + valor2 + valor3;
		 
		 double media = soma /3;
		 
		 /*MOSTRANDO OS DADOS RESOLVIDOS*/
		 
		 System.out.println(" O funcionário "+ nome.toUpperCase() + " teve a soma de : " + soma + " em Salarios\n");
		 System.out.println(" A media salarial é de : " + media);
		 
		
		 entrada.close();
		 
		}

}