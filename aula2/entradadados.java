import java.util.Scanner;
public class entradadados {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        System.out.print("Digite seu Nome: ");
        nome = input.nextLine();
        System.out.print("Informe o ano de seu nascimento: ");
        idade = input.nextInt();
        System.out.printf("Olá %s",nome);
        System.out.printf("\nVocê tem %d anos",2021 - idade);                        
        input.close();
    }    
}
