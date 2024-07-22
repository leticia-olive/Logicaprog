import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Produto produto1 = new Produto(1,"Cafe", 53.0);
        Produto produto2 = new Produto(2,"Sabao em po", 36.0);
        Produto produto3 = new Produto(3,"Caixa de Leite", 82.0);
        Produto produto4 = new Produto(4,"Refrigerante", 8.50);


        ArrayList<ProdutoPedido> produtos = new ArrayList<>();

        Pedido pedido = new Pedido ("Dinheiro",produtos);
        System.out.println(pedido);



}}