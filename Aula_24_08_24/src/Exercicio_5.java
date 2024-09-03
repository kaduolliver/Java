import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio_5 {

    public static void main(String[] args) {
        
String entrada1 = JOptionPane.showInputDialog("Digite o nome do produto: ");
String entrada2 = JOptionPane.showInputDialog("Informe o valor do produto: ");
String entrada3 = JOptionPane.showInputDialog("Informe o desconto para o produto: ");


double num1 = Double.parseDouble(entrada3);
double num2 = Double.parseDouble(entrada2);
double desconto = num2 * (num1 / 100);
double descontoresultado = num2 - desconto;
DecimalFormat df = new DecimalFormat("#.###");
String resultado = df.format(descontoresultado);

JOptionPane.showMessageDialog(null, "O produto: " + entrada1 + "\nDe valor: R$" + entrada2 + "\nSairá por: R$" + resultado + " com o desconto de: " + entrada3 + "%");

    }
    
}
