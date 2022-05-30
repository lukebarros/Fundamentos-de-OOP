import java.util.Scanner;
public class a6ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int vidas;
        System.out.print("Quantidade de vidas do jogador 1: ");
        vidas = input.nextInt();
        new jogador(vidas);
        input.close();
    }
}