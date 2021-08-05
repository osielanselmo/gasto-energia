package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Calc;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o preço do Kw Hora");
		double kh=sc.nextDouble();		
		
		System.out.println("Digite a quantidade consumida");
		int quantidade=sc.nextInt();
		
		Calc c= new Calc( kh, quantidade);
		
		System.out.println("O Seu consumo desse mês foi de : "+c.calcular());
		
		
	}

}
