package TratamentoExcecao;
import javax.swing.JOptionPane;

public class DiminuirLetras {
    public static void lowCase() throws NullPointerException{

        String word = null;
        String newWord = null;

        word = JOptionPane.showInputDialog(null, "Digite um nome: ");

        newWord = word.toLowerCase();
        System.out.println("A palavra informada é: " + word);
        System.out.println("A nova palavra é: " + newWord);
    }
}
