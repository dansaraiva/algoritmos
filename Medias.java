package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Medias {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double op, n1, n2, media, diferenca = 0, produto, divisao;
		
		String sexo;
		
		sexo = "M";
		
		if(sexo.equals("M")) {
			System.out.println("Homem");
		}else {
			System.out.println("Mulher");
		}

		
		
		System.out.println("Informe o 1� n�mero: ");
		n1 = sc.nextDouble();

		System.out.println("Informe o 2� n�mero: ");
		n2 = sc.nextDouble();

		System.out
				.println("Voc� deseja: \n(1) m�dia entre os n�meros informados" + "\n(2) Diferen�a do maior pelo menor"
						+ "\n(3) Produto entre os n�meros informados " + "\n\nA op��o que deseja �: ");
		op = sc.nextInt();

		media = (n1 + n2) / 2;
		if (n1 > n2) {
			diferenca = n1 - n2;
		}
		if (n1 < n2) {
			diferenca = n2 - n1;
		}
		produto = n1 * n2;
		divisao = n1 / n2;

		if (op == 1) {
			System.out.print("A m�dia �: " + media);
		}
		if (op == 2) {
			System.out.print("A diferen�a do maior para o menor �: " + diferenca);
		}
		if (op == 3) {
			System.out.print(" O produto dos n�meros informados �: " + produto);
		}
		if (op == 4) {
			if (op == 0)
				System.out.print(" Op��o inv�lida, atr�bua outro valor ao 2� n�mero");
		} else {
			System.out.print("A divis�o do primeiro pelo segundo �: " + divisao);
		}
		if (op > 4) {
			System.out.print("Op��o inv�lida, erro de execu��o");
		}
		sc.close();
	}
}
