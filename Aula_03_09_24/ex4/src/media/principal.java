package media;

import java.util.Scanner;

public class principal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        notas nota1 = new notas();

        System.out.println("\n--Programa de calculo de notas--\n");

        System.out.println("Digite o nome do aluno:");
        nota1.nome = sc.next();

        System.out.println("Digite a nota do primeiro trimestre:");
        nota1.nota1 = sc.nextInt();
        nota1.entrada1();

        System.out.println("Digite a nota do segundo trimestre:");
        nota1.nota2 = sc.nextInt();
        nota1.entrada2();

        System.out.println("Digite a nota do terceiro trimestre:");
        nota1.nota3 = sc.nextInt();
        nota1.entrada3();

        nota1.somatorio();

        System.out.println("O total é: " + nota1.total + " pontos.");
        System.out.println("Faltou " + nota1.faltante + " pontos para ser aprovado.");
        

        sc.close();
    }

}
