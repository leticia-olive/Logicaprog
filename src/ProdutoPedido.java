public class ProdutoPedido {
    private Pedido pedido;
    private int quantidade;

    public ProdutoPedido(Pedido pedido, int quantidade) {
        this.pedido = pedido;
        this.quantidade = quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

