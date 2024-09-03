import javax.swing.JOptionPane;

public class Exercicio_4 {

    public static void main(String[] args) {
        
        String entrada1 = JOptionPane.showInputDialog("Seu nome: ");
        String entrada2 = JOptionPane.showInputDialog("Ano de nascimento: ");

        int num1 = Integer.parseInt(entrada2);
        
        int idade = 2024 - num1;

        JOptionPane.showMessageDialog(null, "Seu nome é: " + entrada1 + "\nE sua idade é: " + idade );
    }
    

}
