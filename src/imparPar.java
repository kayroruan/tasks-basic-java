import java.util.Scanner;

public class imparPar {
    public static void main(String[] args){
        Scanner valor = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int numero = valor.nextInt();

            if(numero % 2 == 0){
                System.out.println("Este número é par!");
            } else {
                System.out.println("Este número é ímpar!");
            }
            System.exit(0);
    }
}
