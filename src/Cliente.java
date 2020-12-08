import java.util.ArrayList;

public class Cliente {
    private static int quantClient;
    private float saldo;
    private ArrayList<Produto> carrinho;
    private int id;
    private String nome;

    public Cliente(float saldo, ArrayList<Produto> carrinho, int id, String nome) {
        this.saldo = saldo;
        this.carrinho = carrinho;
        this.id = id;
        this.nome = nome;
    }

    public static int getQuantClient() {
        return quantClient;
    }

    public static void setQuantClient(int quantClient) {
        Cliente.quantClient = quantClient;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
