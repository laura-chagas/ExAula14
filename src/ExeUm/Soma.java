package ExeUm;

public class Soma {

    int resultado;

    public void somarNumero(int numero) { // metodo somar possu parametro numero

        for (int i = 1; i <= numero; i++) { //laço que se repete de acordo com o numero que o usuario colocar
            resultado += i; // mesma coisa que resultado = resultado + i (contador)
        }

    }
}
