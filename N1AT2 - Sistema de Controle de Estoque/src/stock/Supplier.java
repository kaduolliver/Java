package stock;

import java.util.Scanner;

public class Supplier {

    Scanner sc = new Scanner(System.in);

    private String name;
    private String cnpj;

    public Supplier(String name, String cnpj) {
        this.name = name;
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void validation(String cnpj) {

        while (this.cnpj.length() != 14 || !this.cnpj.matches("\\d{14}")) {

            System.out.println("Entrada inválida! O CNPJ possui 14 dígitos, digite novamente: ");
            this.cnpj = sc.nextLine();
        }
    }

    public String toString() {
        return "Fornecedor: " 
        + name
        + ", CNPJ: "
        + cnpj
        + ", ";
    }
}
