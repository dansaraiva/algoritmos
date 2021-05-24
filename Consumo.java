package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int km;
		double comb, media;
		
		System.out.print("Dist�ncia percorrida: ");
		km = sc.nextInt();
		System.out.print("Combust�vel gasto: ");
		comb = sc.nextDouble();
		
		media = km / comb;		
		
		System.out.print("Consumo m�dio = " + String.format("%.3f", media));
		
		sc.close();
	}

}
