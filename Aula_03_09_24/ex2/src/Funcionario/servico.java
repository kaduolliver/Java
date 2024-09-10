package Funcionario;

public class servico {

    String nome;
    double salario;

    public void aumento(){
        if (salario >= 1 && salario <= 1000) {
            salario = salario * (1 + 15.0/100);
        }else if (salario >= 1001 && salario <= 1500) {
            salario = salario * (1 + 10.0/100);
        }else if (salario >= 1501 && salario <= 2000) {
            salario = salario * (1 + 5.0/100);
        }
    }

}
