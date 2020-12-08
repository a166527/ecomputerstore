import java.util.ArrayList;

public class Estoque {
    private static ArrayList<Integer> estoqueProdutos;


    public static ArrayList<Integer> getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public static void setEstoqueProdutos(ArrayList<Integer> estoqueProdutos) {
        Estoque.estoqueProdutos = estoqueProdutos;
    }
}
