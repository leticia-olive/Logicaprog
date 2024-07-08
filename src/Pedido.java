import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private ArrayList<Produto> produtos;
    private double valorTotal;
    private String metodoPagamento;

    public Pedido(int numeroPedido, String metodoPagamento) {
        this.numeroPedido = numeroPedido;
        this.metodoPagamento = metodoPagamento;
        this.valorTotal = 0.0;
        this.produtos = ArrayList<Produto>; // como??
    }

}
