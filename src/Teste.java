public class Teste {
    public static void main(String[] agrs){
        int soma = somarValores();
        System.out.println(soma);
    }

    public static int somarValores(int... colecao){

    int soma = 0;

    for(int valor : colecao) {
        soma += valor;
        }

        return soma;
    }
}

//For each no Java
//Utilizando varargs
