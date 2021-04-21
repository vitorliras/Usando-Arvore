package Application;

public class Arvore {

	private Elemento ele;
	private Arvore dir;
	private Arvore esq;
	
	public Arvore() {
		
	}

	public Arvore(Elemento ele) {
		this.ele = ele;
		//System.out.println("Àrvore criada com o elemento "+"("+ele.getValor()+")");
	}
	
	public Arvore remover(Elemento elem) {
		if(this.ele.getValor() == elem.getValor()) {
			if(this.dir == null && this.esq == null) {
				return null;
			}
			else {
				if(this.dir == null && this.esq != null) {
					return this.esq;
				}
				else if(this.dir != null && this.esq == null){
					return this.dir;
				}
				else {
					Arvore aux = this.esq;
					while(aux.dir != null) {
						aux = aux.dir;
					}
					this.ele = aux.getEle();
					
					aux.setEle(elem);
					this.esq = esq.remover(elem);
				}
			}
		}
		else if(elem.getValor() < this.ele.getValor()) {
			this.esq = this.esq.remover(elem);
		}
		else if(elem.getValor() > this.ele.getValor()) {
			this.dir = this.dir.remover(elem);
		}
		return this;
	}
	
	public boolean isEmpty() {
		return (this.ele == null);
	}
	
	public void imprimirPreOrdem() {
		if(!isEmpty()) {
			System.out.print(this.ele.getValor()+" ");
			if(this.esq != null) {
				this.esq.imprimirPreOrdem();
			}
			if(this.dir != null) {
				this.dir.imprimirPreOrdem();
			}
		}
	}
	
	public void imprimirInOrdem() {
		if(!isEmpty()) {
			if(this.esq != null) {
				this.esq.imprimirInOrdem();
			}
			System.out.print(this.ele.getValor()+" ");
			if(this.dir != null) {
				this.dir.imprimirInOrdem();
			}
		}		
	}
	
	public void imprimirPosOrdem() {
		if(!isEmpty()) {
			if(this.dir != null) {
				this.dir.imprimirPosOrdem();
			}
			if(this.esq != null) {
				this.esq.imprimirPosOrdem();
			}
			System.out.print(this.ele.getValor()+" ");
		}
	}
	
	public void inserir(Elemento novo) {
		if(isEmpty()) {
			this.ele = novo;
		}else {
			Arvore novaArvore = new Arvore(novo);
			if(novo.getValor() < this.ele.getValor()) {
				if(this.esq == null) {
					this.esq = novaArvore;
					//System.out.println("Elemento "+novo.getValor()+" à esquerda de "+this.ele.getValor());
				}
				else {
					this.esq.inserir(novo);
				}
			}
			else if(novo.getValor() > this.ele.getValor()){
				 if(this.dir == null) {
					 this.dir = novaArvore;
					 //System.out.println("Elemento "+novo.getValor()+" à direita de "+this.ele.getValor());
				 }
				 else {
					 this.dir.inserir(novo);
				 }
			}
		}
	}

	public boolean busca(int valor) {
		if (isEmpty()){
            return false;
        }
        if (this.ele.getValor() == valor){
            return true;
        }
        else{
            if (valor < this.ele.getValor() ){
                if (this.esq == null){
                    return false;
                }
                else{
                    return this.esq.busca(valor); 
                }
            }
            else if (valor > this.ele.getValor()){
                if (this.dir == null){
                    return false;
                }
                else{
                    return this.dir.busca(valor);
                }
            }
            return false;
        }
    }
	
	public Elemento getEle() {
		return ele;
	}

	public void setEle(Elemento ele) {
		this.ele = ele;
	}

	public Arvore getDir() {
		return dir;
	}

	public void setDir(Arvore dir) {
		this.dir = dir;
	}

	public Arvore getEsq() {
		return esq;
	}

	public void setEsq(Arvore esq) {
		this.esq = esq;
	}
	
	
	
	
	
	
}
