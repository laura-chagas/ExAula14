package ExeQuatro;

import java.util.Scanner;

public class Verificacao {
   public int x[] = new int[3];
    Scanner scan = new Scanner(System.in);
   public int solicitarNumero() {

       for (int i = 0; i < x.length; i++) {

           System.out.println("Informe um número: ");
           x[i] = scan.nextInt();

       }

        return 0;
    }

    public int verificarNumero(){

        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < x.length; i++) {
            if (x[i] < menorValor){
                menorValor = x[i];
            }

        }
        System.out.println(menorValor);
        return 0;


    }

}
