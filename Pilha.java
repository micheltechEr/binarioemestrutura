package aula20192;
public class Pilha {
    private int[] arrayPilha;
    private int topo;
    
 
	public Pilha(int max){
		
		arrayPilha = (int[]) new int[max];
		topo = -1;
	}
	
	public boolean push(int elemento) {		
		if(!this.isFull()) {
			topo++;
			arrayPilha[topo] = elemento;
			return true;
		}
		return false;
	}

	public int remover() {		
		if(!this.isEmpty()) {			
			return arrayPilha[topo--];
		}
		return -1;
	}
	
	
	public boolean isEmpty() {		
	    return topo == -1;
	}
	
	public boolean isFull() {		
	    return topo == arrayPilha.length-1;

	}
}
