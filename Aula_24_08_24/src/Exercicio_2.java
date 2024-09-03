import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio_2 {

    public static void main(String[] args) {
        
        String entrada1 = JOptionPane.showInputDialog("Informe o valor do Raio: ");

        double num1 = Double.parseDouble(entrada1);

        double pi = 3.1415;
        DecimalFormat df = new DecimalFormat("#.####");
        String area = df.format(pi * num1 * num1);


        JOptionPane.showMessageDialog(null, "A area do circulo é: " + area);
          

    }
    
}
