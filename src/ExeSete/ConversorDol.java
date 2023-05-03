package ExeSete;

import java.util.Scanner;

public class ConversorDol {

    Scanner scan = new Scanner(System.in);
    public double dolar;
    public double real;
    public double cotacao;

    public void solicitacao(){

        System.out.println("Qual a cotação do dolar hoje? ");
        cotacao = scan.nextDouble();


    }

    public void converter(){

        System.out.println("Informe quantos dolares você tem disponível: ");
        dolar = scan.nextDouble();

        real = dolar * cotacao;

        System.out.println("Você tem R$" + real + " em real");


    }

}
