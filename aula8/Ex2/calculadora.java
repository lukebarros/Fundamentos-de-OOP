package Ex2;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        operacoes op = new operacoes();
        numero n1 = new numero();
        numero n2 = new numero();
        
        System.out.println("Digite a operação a ser efetuada:\n[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n");
        op.setOp(input.nextInt());
        System.out.println("Digite o primeiro número da operação:");
        n1.setValor(input.nextDouble());
        System.out.println("Digite o segundo número da operação:");
        n2.setValor(input.nextDouble());

        op.resultado(n1.getValor(), n2.getValor());
        
        input.close();
    }
}