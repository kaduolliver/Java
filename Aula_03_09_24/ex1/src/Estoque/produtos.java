package Estoque;

public class produtos {

	String nome;
	float preco;
	int estoque;
	
	public void addestoque(int qtddAdd) {
		estoque += qtddAdd;
	}
	
	public void remove(int qtddrem) {
		if(qtddrem > estoque) {
			System.out.println("Erro!");
		}else {
			estoque -= qtddrem;
		}
	}
}
