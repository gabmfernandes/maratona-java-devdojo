package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.tests;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        //Estudante estudante --> Variavel de referência do tipo Estudante
        //new Estudante() --> Objeto do tipo estudante

        estudante.idade = 12;
        estudante.nome = "tobi";
        estudante.sexo = 'A';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        // Quando o objeto é inicializado, seus atributos são inicializados de forma padrão dependendo do tipo.

        //Coesão: Propósito das classes --> As classes não devem misturar seus propósitos entre elas (Independetes)
        //Um propósito por classe é o mais coeso possível (melhor)


    }
}
