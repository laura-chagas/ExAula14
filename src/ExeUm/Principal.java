
package ExeUm;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Soma conta = new Soma();

        // conta.somarNumero(scan.nextInt());

        System.out.println("Digite um número: ");
        int numeroDigitado = scan.nextInt();

        conta.somarNumero(numeroDigitado);

        System.out.println(conta.resultado);

    }
}

