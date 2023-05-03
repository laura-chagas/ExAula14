package ExeTres;

public class Imc {

    public static double altura;
    public static double peso;

    public static void calcularImc(){

        double imc = peso / (altura * altura);

     if (imc < 18.5){
         System.out.println("MAGREZA");
     } else if (imc >= 18.5 && imc <= 24.9) {
         System.out.println("NORMAL");
     } else if (imc >= 25.0 && imc <= 29.9) {
         System.out.println("SOBREPESO");
     } else if (imc >= 30.0 && imc <= 39.9) {
         System.out.println("OBESIDADE");
     } else if (imc > 40) {
         System.out.println("OBESIDADE GRAVE");
     }



    }

}
