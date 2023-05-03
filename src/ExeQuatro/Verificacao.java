package ExeQuatro;

import java.util.Scanner;

public class Verificacao {
    public int x[] = new int[3];
    Scanner scan = new Scanner(System.in);

    public void solicitarNumero() {

        for (int i = 0; i < x.length; i++) {

            System.out.println("Informe um número: ");
            x[i] = scan.nextInt();

        }
    }

    public void verificarNumero() {

        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < x.length; i++) {
            if (x[i] < menorValor) {
                menorValor = x[i];
            }

        }
        System.out.println(menorValor);


    }

}
