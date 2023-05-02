package ExeSete;
/*Elaborar um programa que efetue a apresentação do valor da
conversão em real (R$) de um valor lido em dólar (US$). O algoritmo
deverá solicitar o valor da cotação do dólar e também a quantidade
de dólares disponíveis com o usuário.*/

public class Principal {
    public static void main(String[] args) {

        ConversorDol real = new ConversorDol();

        real.solicitacao();

        real.converter();

    }
}
