package tpa;

import java.util.Scanner;
public class maiorM {
	
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			String resposta = "sim";
			int anoNasc, anoAtual, idade;
			


			while(resposta.equalsIgnoreCase("sim")) {
				System.out.println("insira o ano de nascimento:");
				anoNasc = sc.nextInt();
				
				System.out.println("insira o ano atual:");
				anoAtual = sc.nextInt();
				
				idade = anoAtual-anoNasc;
				
			
				if(idade>18) {
					System.out.println("maior de idade");
				}else if(idade<18) {
					System.out.println("menor de idade");
				}
				
				System.out.println("deseja calcular outra idade?");
				resposta = sc.next();
				
				}
}
	}