package triangulo;

import java.util.Scanner;

public class principal {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        calculo calculo1 = new calculo();

        System.out.println("\n--Calculo da área de 2 triângulos usando a Fórmula de Heron--\n");
        System.out.println("Insira os valores dos lados A/B/C de um triângulo:");

        System.out.println("Lado A do primeiro triângulo:");
        calculo1.A1 = sc.nextInt();

        System.out.println("Lado B do primeiro triângulo:");
        calculo1.B1 = sc.nextInt();

        System.out.println("Lado C do primeiro triângulo:");
        calculo1.C1 = sc.nextInt();

        System.out.println("Lado A do segundo triângulo:");
        calculo1.A2 = sc.nextInt();

        System.out.println("Lado B do segundo triângulo:");
        calculo1.B2 = sc.nextInt();

        System.out.println("Lado C do segundo triângulo:");
        calculo1.C2 = sc.nextInt();

        calculo1.area();

        System.out.println("Área do primeiro triângulo: " + calculo1.area1);
        System.out.println("Área do segundo triângulo: " + calculo1.area2);

        sc.close();
    }
}
