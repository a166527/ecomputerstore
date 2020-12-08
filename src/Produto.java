import java.util.ArrayList;

public class Produto {
    private static ArrayList<Produto> Produtos;
    private float custo;
    private int id;
    private float margemLucro;
    private String dimensao; // no formato "AxBxCcm"

    public Produto(float custo, int id, float margemLucro, String dimensao) {
        this.custo = custo;
        this.id = id;
        this.margemLucro = margemLucro;
        this.dimensao = dimensao;
    }

    public static ArrayList<Produto> getProdutos() {
        return Produtos;
    }

    public static void setProdutos(ArrayList<Produto> produtos) {
        Produtos = produtos;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(float margemLucro) {
        this.margemLucro = margemLucro;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public float getPreco() {
        return custo * margemLucro;
    }
}
