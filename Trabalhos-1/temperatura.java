import java.util.Scanner;
  
public class temperatura {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  
     
    System.out.print("Digite seu peso em Kg: ");
    double peso = Double.parseDouble(input.nextLine());
    System.out.print("Digite sua altura em metros: ");
    double altura = Double.parseDouble(input.nextLine());

    double imc = peso / (altura * altura);
    System.out.println("Seu IMC = " + imc);
     
    if(imc < 16){
      System.out.println("Magreza grave");  
    }
    else if(imc < 17){
      System.out.println("Magreza moderada");  
    }
    else if(imc < 18.5){
      System.out.println("Magreza leve");  
    }
    else if(imc < 25){
      System.out.println("Saudavel");  
    }
    else if(imc < 30){
      System.out.println("Sobrepeso");  
    }
    else if(imc < 35){
      System.out.println("Obesidade Grau I (acentuada)");  
    }
    else if(imc < 40){
      System.out.println("Obesidade Grau II (severa)");  
    }
    else{
      System.out.println("Obesidade Grau III (morbida)");  
    }
    System.out.println("\n");
    input.close();
  }
}