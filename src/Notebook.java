import java.util.ArrayList;

public class Notebook {
    private ArrayList<Produto> listaPecas;

    public Notebook(ArrayList<Produto> listaPecas) {
        this.listaPecas = listaPecas;
    }

    public ArrayList<Produto> getListaPecas() {
        return listaPecas;
    }

    public void setListaPecas(ArrayList<Produto> listaPecas) {
        this.listaPecas = listaPecas;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "listaPecas=" + listaPecas +
                '}';
    }
}
