import java.util.Scanner;
public class a2ex8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float distancia, consumo, valorGas = (float) 6.89;
        System.out.print("Digite a distancia do percurso: ");
        distancia = input.nextFloat();
        consumo = distancia/15;
        System.out.printf("O valor da gasolina para o percurso será de %.2f reais", consumo * valorGas);
        input.close();
    }    
}
