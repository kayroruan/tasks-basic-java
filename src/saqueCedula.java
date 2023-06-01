import java.util.Scanner;

public class saqueCedula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor desejado: ");
        int valor = scanner.nextInt();

        int[] cedulas = {200, 100, 50, 20, 10, 5, 2};
        int[] quantidadeCedulas = new int[cedulas.length];

        for (int i = 0; i < cedulas.length; i++) {
            quantidadeCedulas[i] = valor / cedulas[i];
            valor %= cedulas[i];
        }

        boolean erro = false;
        for (int i = 0; i < cedulas.length; i++) {
            if (valor % cedulas[i] == 1 || valor % cedulas[i] == 3) {
                erro = true;
                break;
           }
        }


        if (erro) {
            System.out.println("Erro no saque, não temo cédulas nos valores de 1 e/ou 3 para completar o saque desejado!");
        } else {
            for (int i = 0; i < cedulas.length; i++) {
                if (quantidadeCedulas[i] > 0) {
                    System.out.println("Quantidade de cédulas de " + cedulas[i] + ": " + quantidadeCedulas[i]);
                }
            }
        }
    }
}

