import java.util.Scanner;
public class Calcula {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        numero n1 = new numero();
        numero n2 = new numero();
        numero soma = new numero();
        numero subtracao = new numero();
        numero mult = new numero();
        numero divisao = new numero();
        
        System.out.print("Calculos:\nNumero 1: ");
        n1.setValor(input.nextDouble());
        System.out.print("Numero 2: ");
        n2.setValor(input.nextDouble());
        soma.setValor(n1.getValor() + n2.getValor());
        subtracao.setValor(n1.getValor() - n2.getValor());
        mult.setValor(n1.getValor() * n2.getValor());
        divisao.setValor(n1.getValor() / n2.getValor());

        System.out.printf("\nResultados\n\nSoma: %.0f\nSubtração: %.0f\nMultiplicação: %.0f\nDivisão: %.2f", soma.getValor(), subtracao.getValor(), mult.getValor(), divisao.getValor());
        input.close();
    }   
}
