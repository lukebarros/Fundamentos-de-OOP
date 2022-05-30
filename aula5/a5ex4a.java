public class a5ex4a {
    public static void main(String[] args){
        float n1, soma=0;
        for (n1 = 1; n1 < 1000; n1++){
            soma += n1/(n1+2);
        }
        System.out.printf("S = %.2f", soma);
    }
}
