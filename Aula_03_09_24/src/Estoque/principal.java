package Estoque;
//import javax.swing.JOptionPane;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		
		//String entrada1 = JOptionPane.showInputDialog("Digite o nome do produto: ");
		
		Scanner sc = new Scanner(System.in);
		
		//chamar o objeto

		produtos produto1 = new produtos();
		
		//
		System.out.println("Nome do produto:\n");
		produto1.nome = sc.next();
		
		System.out.println("Preço do produto:\n");
		produto1.preco = sc.nextFloat();
		
		System.out.println("Quantidade em estoque:\n");
		produto1.estoque = sc.nextInt();
		
		System.out.println("O produto " + produto1.nome);
		System.out.println("De preço: " + produto1.preco);
		System.out.println("Possui um estoque de: " + produto1.estoque);
		
//		System.out.println("Digite uma quantidade para adicionar ao estoque: ");
//		produto1.add = sc.nextInt();
//		
//		System.out.println("Novo estoque: " + produto1.addestoque());
//		
//		System.out.println("Agora digite uma quantidade para retirar do estoque: ");
//		produto1.remov = sc.nextInt();
		
		System.out.println("Digite uma quantidade para adicionar ao estoque: ");
		int qtddAdd = sc.nextInt();
		produto1.addestoque(qtddAdd);
		
		System.out.println("Possui um estoque de: " + produto1.estoque);
		
		System.out.println("Agora digite uma quantidade para retirar do estoque: ");
		int qtddrem = sc.nextInt();
		produto1.remove(qtddrem);
		
		System.out.println("Novo estoque: " + produto1.estoque);
		
		sc.close();

	}

}