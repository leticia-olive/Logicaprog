import java.util.ArrayList;

public class Pedido {
    private ArrayList<ProdutoPedido> produtos ;
    private double valorTotal;
    private String metodoPagamento;

    public Pedido(String metodoPagamento,ArrayList<ProdutoPedido> produtos) {
        this.metodoPagamento = metodoPagamento;
        this.produtos = new ArrayList<>();
    }

   // criar o produtopedido e adicionar na lista

    public void adicionarProduto(Produto produto, int quantidade){
        produtos.add(new ProdutoPedido(produto,quantidade));
    }

    public ArrayList<ProdutoPedido> getProdutos() {
        return produtos;
    }
    public void setProdutos(ArrayList<ProdutoPedido> produtos) {
        this.produtos = produtos;
    }
}

