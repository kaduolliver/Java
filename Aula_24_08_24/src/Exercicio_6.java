import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio_6 {

    public static void main(String[] args) {
        
        String entrada1 = JOptionPane.showInputDialog("Informe seu salário: ");

        double num1 = Double.parseDouble(entrada1);
        double aumento = num1 + (num1 * 15 / 100);
        DecimalFormat df = new DecimalFormat("#.##");
        String salario = df.format(aumento);

        JOptionPane.showMessageDialog(null, "Seu antigo salário de: R$" + entrada1 + "\nterá um aumento de 15% e será reajustado para: R$" + salario);
    }
    
}
