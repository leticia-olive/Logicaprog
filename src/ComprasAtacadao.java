import java.util.ArrayList;
import java.util.Scanner;

public class ComprasAtacadao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Produto produto1 = new Produto(1, "Cafe", 53.0);
        Produto produto2 = new Produto(2, "Sabao em po", 36.0);
        Produto produto3 = new Produto(3, "Caixa de Leite", 82.0);
        Produto produto4 = new Produto(4, "Refrigerante", 8.50);


        ArrayList<ProdutoPedido> produtos = new ArrayList<>();
        ProdutoPedido aux = new ProdutoPedido(produto1, 2);
        produtos.add(aux);


        Pedido pedido = new Pedido("Dinheiro", produtos);
        System.out.println(pedido);

        double valorTotal = 0;
        for (ProdutoPedido p : produtos){
            valorTotal += descontoQtd(p.getValorTotal(),p.getQuantidade());
        }
        System.out.println(valorTotal);
        System.out.println(descontoMetodo(valorTotal,pedido.getMetodoPagamento()));



    }

    Scanner input = new Scanner(System.in);

    public static double descontoQtd(double valor,int quantidade){
        double valorTotal;
        if (quantidade <= 5){
            valorTotal = valor * quantidade;
        } else if (quantidade <=15){
            valorTotal = valor * quantidade * 0.9;
        } else if(quantidade <=25){
            valorTotal = valor * quantidade * 0.8;
        } else {
            valorTotal = valor * quantidade * 0.75;
        }
        return valorTotal;
    }
    public static double descontoMetodo(double valorTotal, String metodoPagamento){
        double valorFinal = 0;
        if("dinheiro".equals(metodoPagamento)){
            valorFinal = valorTotal * 0.95;

        }else if ("credito".equals(metodoPagamento)){
            valorFinal = valorTotal * 1.03;
        }
        return valorFinal;
    }


}