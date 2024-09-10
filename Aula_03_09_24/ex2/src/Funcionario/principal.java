package Funcionario;

import java.util.Scanner;

public class principal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        servico servico1 = new servico();

        System.out.println("Nome do funcionário:");
        servico1.nome = sc.next();

        System.out.println("Salário do funcionário:");
        servico1.salario = sc.nextDouble();

        System.out.println("Funcionário(a): " + servico1.nome);
        System.out.println("Salário antigo: " + servico1.salario);

        servico1.aumento();

        System.out.printf("Novo salário: %.2f",servico1.salario);

        sc.close();
    }

}
