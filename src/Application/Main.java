package Application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Arvore arvore = new Arvore(new Elemento(sc.nextInt()));
		arvore.calcularBalanceamento();
		arvore = arvore.verificaBalanceamento();
		System.out.println(arvore.printArvore(0));
		
		while(true) {
			arvore = arvore.inserir(new Elemento(sc.nextInt()));
			arvore.calcularBalanceamento();
			arvore = arvore.verificaBalanceamento();
			System.out.println(arvore.printArvore(0));
		}
	}

}
