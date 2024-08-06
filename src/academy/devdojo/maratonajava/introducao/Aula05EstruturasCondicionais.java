package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
//        int idade = 17;
//        boolean isAutorizadoBebidaAlcoolica = idade >= 18;
//        if(isAutorizadoBebidaAlcoolica){
//            System.out.println("Autorizado");
//        }else{
//            System.out.println("Não Autorizado");
//        }
//        System.out.println("Saindo...");
//
//        double salario = 3000;
//        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
//        String mensagemNaoDoar = "Não vou doar";
//
//        //Operador Ternário (condicao) ? verdadeiro : falso; opções de verdadeiro e falso devem ser do mesmo tipo
//        String resultado = salario>=5000 ? mensagemDoar : mensagemNaoDoar;
//
//        System.out.println(resultado);
        double tax;
        double salarioAnual;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salario anual: ");
        salarioAnual = sc.nextDouble();

        if (salarioAnual > 0 && salarioAnual <= 34712) {
            tax = salarioAnual * 0.097;
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            tax = salarioAnual * 0.3735;
        } else if (salarioAnual > 68507) {
            tax = salarioAnual * 0.4950;
        } else {
            tax = 0;
            System.out.println("Salario invalido!");
        }
        System.out.println("Taxa de " + tax + " para um salario anual de " + salarioAnual);


        //switch: char, byte, int, short, enum, String

        //usar break e default pra se nenhuma opção ser atingida
    }
}
