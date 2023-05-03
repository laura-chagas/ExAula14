package ExeDois;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        Cadastro.cadastrar(scan.next());


    }
}
