package JavaBasico;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		
		System.out.println("       Bem Vindo    \n\n");
		
		

		double media = 7 ;// Estabeleça a nota que será comparada !
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		//Entrada de Dados, sempre prestar atenção  com o tipo de dados, para não ter erro , caso o resultado tiver  um numero fracionado. 
		
		System.out.println("Digite o nome do aluno : ");
		String aluno = entrada.next();
		
		System.out.println("Quantos % de falta o aluno teve : ");
		double faltas = entrada.nextDouble();
		
                System.out.println("Digite a primeira  nota : ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota : ");
		double nota2 = entrada.nextDouble();
		
		
		
		
		double resultado = (nota1 + nota2)/2; //Estabeleça o calculo, 
		
		
		
               if(faltas >25) {
			
			System.out.println("O aluno "+aluno.toUpperCase()+ " Foi reprovado por faltas");// Usando uma estrutura de controle, caso ultrapasse as faltas, o codigo termina aqui ! 
		
	
		}else if(resultado >= media ){// Se não continua aqui !
			
			
			System.out.println("O aluno "+ aluno.toUpperCase()+" foi Aprovado ");// Usando touppercase a impressao do nome sera em maiusculo
			
		}else 
		
		System.out.println("O aluno " + aluno.toUpperCase()+" foi Reprovado ");
		
        entrada.close();// Fechando a entrada do scanner!
		
	}

}
