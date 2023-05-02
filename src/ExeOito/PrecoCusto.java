package ExeOito;

import java.util.Scanner;

public class PrecoCusto {

    Scanner scan = new Scanner(System.in);

    public static double percentual;
    public static double precoCusto;

    public double venderProduto(){

        System.out.println("Informe o preço de custo:  ");
        precoCusto = scan.nextDouble();

        System.out.println("Informe o percentual do acréscimo: ");
        percentual = scan.nextDouble();

        percentual = (percentual/100) * precoCusto;

        double valorVenda = percentual + precoCusto;

        System.out.println("Valor de venda do produto é " + valorVenda);

        return 0;
    }


}
