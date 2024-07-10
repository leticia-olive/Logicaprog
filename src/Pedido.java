import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> produtos;
    private double valorTotal;
    private String metodoPagamento;

    public Pedido(String metodoPagamento, Produto produtos) {
        this.metodoPagamento = metodoPagamento;
        this.valorTotal = 0.0;
        //this.produtos = produtos;  retornando erro não sei pq

    }


}
