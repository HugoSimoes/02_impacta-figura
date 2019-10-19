package oop.teste;

import java.util.Scanner;

import oop.model.Quadrado;
import oop.model.Triangulo;

public class QuadradoTeste {
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado();
		
		
		 // Triangulo triangulo = new Triangulo();
		  
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Digite a altura desejada: ");
		//  triangulo.setAltura(sc.nextInt()); 
		  quadrado.setAltura(sc.nextInt());
		  
		  System.out.println("Digite a largura desejada: ");
		 // triangulo.setLargura(sc.nextInt());  
		  quadrado.setLargura(sc.nextInt());
		  
		  sc.nextLine();
		  
		  System.out.println("Escolha o síbolo desejado: ");
		 // triangulo.setSimbolo(sc.nextLine()); triangulo.setFundo(" ");
		  quadrado.setSimbolo(sc.nextLine());
		  
		  System.out.println(quadrado.desenhar());
		 

		sc.close();
	}
}
