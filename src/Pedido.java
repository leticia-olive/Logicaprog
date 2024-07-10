import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private ArrayList<Produto> produtos;
    private double valorTotal;
    private String metodoPagamento;

    public Pedido(String metodoPagamento,ArrayList produtos) {
        this.metodoPagamento = metodoPagamento;
        this.valorTotal = 0.0;
        this.produtos = produtos;

    }

}
