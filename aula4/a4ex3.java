import java.util.Scanner;
public class a4ex3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float branco, nulo, valido, prcntbra, prcntnul, prcntval, total;
        System.out.print("Quantidade de eleitores no município: ");
        total = input.nextFloat();
        System.out.print("Votos Nulos: ");
        nulo = input.nextFloat();
        System.out.print("Votos Brancos: ");
        branco = input.nextFloat();
        System.out.print("Votos Válidos: ");
        valido = input.nextFloat();
        prcntbra = (branco/total) * 100;
        prcntnul = (nulo/total) * 100;
        prcntval = (valido/total) * 100;
        System.out.printf("Percentual dos votos:\nNulos: %.2f%%\nBrancos: %.2f%%\nVálidos: %.2f%%", prcntnul, prcntbra, prcntval);
        input.close();
    }
}