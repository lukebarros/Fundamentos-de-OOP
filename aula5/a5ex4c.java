public class a5ex4c {
    public static void main(String[] args){
        float n1, soma=0;
        for (n1 = 1; n1 <= 1000; n1+=2){
            soma += n1/(n1+1);
        }
        System.out.printf("S = %.2f", soma);
    }
}
