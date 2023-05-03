package ExeSeis;

import java.util.Scanner;

public class Conversor {

    Scanner scan = new Scanner(System.in);

    public double celcius;
    public double fahrenheit;

    public void converter(){

        System.out.println("Digite a temperatura em Celcius: ");
        celcius = scan.nextDouble();

        fahrenheit = ((9 * celcius) + 160) /5;

        System.out.println("A temperatura " + celcius + " em Fahrenheit é: " + fahrenheit);

    }
}
