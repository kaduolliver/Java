package triangulo;

public class calculo {

    int A1, B1, C1;
    int A2, B2, C2;
    double p1, p2, area1, area2;
    
    public void area(){
        p1 = (A1 + B1 + C1) / 2;
        area1 = Math.sqrt(p1 * (p1 - A1) * (p1 - B1) * (p1 - C1));

        p2 = (A2 + B2 + C2) / 2;
        area2 = Math.sqrt(p2 * (p2 - A2) * (p2 - B2) * (p2 - C2));

        if (area1 > area2) {
            System.out.println("O primeiro triângulo é maior!");
        }else{
            System.out.println("O segundo triangulo é maior!");
        }
    }

}
