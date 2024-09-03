import javax.swing.JOptionPane;

public class Exercicio_3 {

    public static void main(String[] args) {
        
        String entrada1 = JOptionPane.showInputDialog("Horas trabalhadas no mês: ");
        String entrada2 = JOptionPane.showInputDialog("Valor recebido por hora: ");

        int tempo = Integer.parseInt(entrada1);
        double porhora = Double.parseDouble(entrada2);

        double salario = tempo * porhora;

        JOptionPane.showMessageDialog(null, "Seu salario é: R$" + salario);

    }
    
}
