package Application;

public class Main {

	public static void main(String[] args) {
		
		Elemento elem = new Elemento(0);
		
		Arvore arvore = new Arvore(new Elemento(10));
		arvore.inserir(new Elemento(5));
		arvore.inserir(new Elemento(1));
		arvore.inserir(new Elemento(8));
		arvore.inserir(new Elemento(15));
		arvore.inserir(new Elemento(12));
		arvore.inserir(new Elemento(17));
		arvore.inserir(new Elemento(30));
        arvore.inserir(new Elemento(25));
        arvore.inserir(new Elemento(22));
        arvore.inserir(new Elemento(28));
        arvore.inserir(new Elemento(35));
        arvore.inserir(new Elemento(32));
        arvore.inserir(new Elemento(38));
		
        //Busncado um elemento, ver se ele existe ou não
		System.out.println("O elemento 5 "+(arvore.busca(5) ?" existe": " Não existe"));
		System.out.println("O elemento 6 "+(arvore.busca(6) ?" existe": " Não existe"));
		System.out.println();
		
		//Impressões
		arvore.imprimirInOrdem();
		System.out.println();
		
		arvore.imprimirPreOrdem();
		System.out.println();
		
		arvore.imprimirPosOrdem();
		System.out.println();
		
		//Remoções
		elem.setValor(10);
		arvore = arvore.remover(elem);
		arvore = arvore.remover(new Elemento(25));
		arvore = arvore.remover(new Elemento(12));
		arvore = arvore.remover(new Elemento(38));

		//Novas ordens
		System.out.println();
		System.out.println("Novas ordens: ");
		System.out.println();
		
		arvore.imprimirInOrdem();
		System.out.println();
		
		arvore.imprimirPreOrdem();
		System.out.println();
		
		arvore.imprimirPosOrdem();
		System.out.println();
		
		
		
	}

}
