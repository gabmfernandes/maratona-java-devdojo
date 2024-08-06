package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula07Arrays {
    public static void main(String[] args) {
        //Arrays

        //Variável do tipo reference -> Não é primitivo --> Object
        int[] numeros = null; // -> Não faz referência em memória para nenhum objeto
        int[] array = new int[5]; //-> Declarar quanto de espaço será utilizado
                                    //Inicializado como os 5 indices como 0, pois é array do tipo int
                                    //Se fosse String seria null
        String[] palavras = new String[100];

        System.out.println(palavras[0]);

        //Arrays não podem mudar dinamicamente de tamanho durante a execução

        //Formas de inicializar um array

        int[] array1 = new int[5];
        int[] array2 = {1,2,3,4,5};
        int[] array3 = new int[]{1,2,3,4,5};

        //Tipo| var | estrutura
        for(int x: array2){ //Foreach
            System.out.println(x);
        }

    }
}
