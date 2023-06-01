public class Robo {
    String nome;
    String cor;

    public static void main(String args[]){
        Robo obj1 = new Robo();

        obj1.nome = "R-801";
        obj1.cor = "azul";

        System.out.println("Nome: " + obj1.nome);
        System.out.println("Cor: " + obj1.cor);
    }
}
