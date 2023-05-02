package ExeDois;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Cadastro usuario = new Cadastro();

        System.out.println("Qual seu nome? ");
        usuario.cadastrar(scan.next());


    }
}
