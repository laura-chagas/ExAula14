package ExeTres;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Imc imcUsuario = new Imc();

        System.out.println("Informe sua altura (com a vírgula)");
        Imc.altura = (scan.nextDouble());

        System.out.println("Informe seu peso ");
        Imc.peso = (scan.nextDouble());

        imcUsuario.calcularImc();

    }
}
