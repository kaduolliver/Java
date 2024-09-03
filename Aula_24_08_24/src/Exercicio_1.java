import javax.swing.JOptionPane;

public class Exercicio_1 {

    public static void main(String[] args) {

        String entrada1 = JOptionPane.showInputDialog("N1: ");
        String entrada2 = JOptionPane.showInputDialog("N2: ");
        String entrada3 = JOptionPane.showInputDialog("N3: ");
        String entrada4 = JOptionPane.showInputDialog("N4: ");
        String entrada5 = JOptionPane.showInputDialog("N5: ");

        int num1 = Integer.parseInt(entrada1);
        int num2 = Integer.parseInt(entrada2);
        int num3 = Integer.parseInt(entrada3);
        int num4 = Integer.parseInt(entrada4);
        int num5 = Integer.parseInt(entrada5);

        int media = (num1 + num2 + num3 + num4 + num5)/5;

        JOptionPane.showMessageDialog(null, "A media é: " + media);
    }
    
}
