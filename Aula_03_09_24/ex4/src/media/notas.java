package media;

import java.util.Scanner;

public class notas {

    Scanner sc = new Scanner(System.in);

    String nome;
    int nota1, nota2, nota3, total, faltante;

    public void entrada1(){
        if (nota1 < 0 || nota1 > 30) {
            do {
                System.out.println("Fora do intervalo, digite novamente:");
                nota1 = sc.nextInt();
            } while (nota1 < 0 || nota1 > 30);
        }
    }
    public void entrada2(){
        if (nota2 < 0 || nota2 > 35) {
            do {
                System.out.println("Fora do intervalo, digite novamente:");
                nota2 = sc.nextInt();
            } while (nota2 < 0 || nota2 > 35);
        }
    }
    public void entrada3(){
        if (nota3 < 0 || nota3 > 35) {
            do {
                System.out.println("Fora do intervalo, digite novamente:");
                nota3 = sc.nextInt();
            } while (nota3 < 0 || nota3 > 35);
        }
    }

    public void somatorio(){

        total = nota1 + nota2 + nota3;

        if (total >= 70) {
            System.out.println("Aprovado!");
        }else{
            faltante = 70 - total;
            System.out.println("Reprovado!");
        }
    }
}
