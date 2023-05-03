package ExeCinco;

import java.util.Scanner;

public class Vendedor {
    Scanner scan = new Scanner(System.in);

    public static String nome;
    public static double salarioFixo;
    public static double vendasEfetuadas;


    public void registrarUsuario(){

        System.out.println("Informe seu nome: ");
        nome = scan.next();

        System.out.println("Informe seu salário fixo: ");
        salarioFixo = scan.nextDouble();

        System.out.println("Quantos reais ao todo foram efetuados nas vendas desse mês? ");
        vendasEfetuadas = scan.nextInt();
      
    }

    public void acrescimo(){

        double salarioAtual;
        double comissao = vendasEfetuadas * ((double) 15 / 100);
        
        salarioAtual = comissao + salarioFixo;
        System.out.println("Nome: " + nome  + "\n Valor de vendas: " + vendasEfetuadas + "\n Salário: " + salarioFixo + "\n Salário no final do mês: " + salarioAtual);

    }
}
