import java.util.ArrayList;

public class Pedido {
    private static int quantPedidos;

    private int id;
    private Cliente cliente;
    private ArrayList<Produto> carrinho;
    private float custoTotal;

    public Pedido(int id, Cliente cliente, ArrayList<Produto> carrinho, float custoTotal) {
        this.id = id;
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.custoTotal = custoTotal;
    }

    public static int getQuantPedidos() {
        return quantPedidos;
    }

    public static void setQuantPedidos(int quantPedidos) {
        Pedido.quantPedidos = quantPedidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public float getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(float custoTotal) {
        this.custoTotal = custoTotal;
    }
}
