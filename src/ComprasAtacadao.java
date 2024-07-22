import java.util.ArrayList;
import java.util.Scanner;

public class ComprasAtacadao {

    Scanner input = new Scanner(System.in);
// ler o pedido do usuario/


    public double descontoQtd(double valor,int quantidade){
        double valorTotal;
        if (quantidade <= 5){
            valorTotal = valor * quantidade;
        } else if (quantidade <=15){
            valorTotal = valor * quantidade * 0.9;
        } else if(quantidade <=25){
            valorTotal = valor * quantidade *0.8;
        } else {
            valorTotal = valor * quantidade * 0.75;
        }
        return valorTotal;
    }
    public double descontoMetodo(double valorTotal, String metodoPagamento){
        double valorFinal = 0;
        if("dinheiro".equals(metodoPagamento)){
            valorFinal = valorTotal*0.95;

        }else if ("credito".equals(metodoPagamento)){
            valorFinal = valorTotal*1.03;
        }
        return valorFinal;
    }


}