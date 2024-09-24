package stock;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);        

        System.out.println("\n--Bem-vindo ao Controlador de Estoque--\n");

        System.out.println("Nome do fornecedor: ");
        String supplierName = sc.nextLine();

        System.out.println("Qual o CNPJ do fornecedor? ");
        String supplierCnpj = sc.nextLine();

        Supplier supplier = new Supplier(supplierName, supplierCnpj);
        supplier.validation(supplierCnpj);

        System.out.println("Produto: ");
        String productName = sc.nextLine();

        System.out.println("Quantidade em estoque: ");
        int productQuantityInStock = sc.nextInt();

        System.out.println("Preço do produto: ");
        double productPrice = sc.nextDouble();
        
        Product product = new Product(productName, productQuantityInStock, productPrice);

        System.out.println();
        System.out.println("Dados: " + supplier + product);
        System.out.println();

        System.out.println("Insira uma quantidade desse produto ao estoque: ");
        int addProduct = sc.nextInt();
        product.addStock(addProduct);

        System.out.println();
        System.out.printf("Agora o estoque possui %d %s\n", product.getQuantityInStock(), productName);
        System.out.println();
        
        System.out.println("Insira uma quantidade para retirar do estoque: ");
        int removeProduct = sc.nextInt();
        product.removeStock(removeProduct);

        System.out.println();
        System.out.printf("Agora o estoque possui %d %s\n", product.getQuantityInStock(), productName);
        System.out.println();

        System.out.println("Insira um valor inteiro para o cupom de desconto: ");
        double discount = sc.nextInt();
        product.getTotalPrice(discount);
        double totalPriceWithDiscount = product.getTotalPrice(discount);

        System.out.println("Dados: " + supplier + product);
        System.out.println();
        System.out.printf("Ao comprar todo o estoque terá um desconto de %.2f que ficará num total de R$ %.2f", discount, totalPriceWithDiscount);

        sc.close();
    }
}
