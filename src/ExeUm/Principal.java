
package ExeUm;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //criei um scanner
        Soma conta = new Soma(); // instanciei a classe soma

        // conta.somarNumero(scan.nextInt());


        System.out.println("Digite um número: ");
        int numeroDigitado = scan.nextInt(); // receber o valor do usuario

        conta.somarNumero(numeroDigitado); // atribuir o valor para o parametro do metodo somarNumero

        System.out.println(conta.resultado);

    }
}

