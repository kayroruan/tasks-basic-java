package TratamentoExcecao;

public class ProjetoTratamento {
    public static void main(String[] args){
        try {
            DiminuirLetras letrap = new DiminuirLetras();
            letrap.lowCase();
        }catch (NullPointerException e){
            System.out.println("Execução NUllPointerExeption identificada");
            System.out.println("Método DiminuirLetras() tratado\n" +e);
        }
    }
}
