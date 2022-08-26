package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();
		System.out.println("Digite os valores de Largura e Altuta:");
		rectangle.larg = sc.nextDouble();
		rectangle.alt = sc.nextDouble();

		System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
		System.out.println("PERIMETRO = " + String.format("%.2f", rectangle.perimetro()));
		System.out.printf("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));
		sc.close();

	}

}
