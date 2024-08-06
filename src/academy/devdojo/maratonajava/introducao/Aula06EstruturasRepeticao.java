package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasRepeticao {
    public static void main(String[] args) {
        // while, do-while (executa pelo menos uma vez), for

        //condição de parada
/*        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count <= 5);*/


        //TABUADA

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para verificar a sua tabuada");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" x "+num+" = "+i*num);

        }

        //Break e Continue(Ignora o que tem abaixo e vai para a próxima iteração)
    }
}
