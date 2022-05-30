import java.util.Scanner;
public class a4ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int var1, var2, varAux;
        System.out.print("Var 1: ");
        var1 = input.nextInt();
        System.out.print("Var 2: ");
        var2 = input.nextInt();
        System.out.printf("\n--Sem Variavel Auxiliar--\nVar 1: %d\nVar 2: %d", var1-(var1-var2), var1-(var1-var2) + (var1-var2));
        varAux = var1;
        var1 = var2;
        var2 = varAux;
        System.out.printf("\n--Com Variavel Auxiliar--\nVar 1: %d\nVar 2: %d", var1, var2);
        input.close();
    }    
}
