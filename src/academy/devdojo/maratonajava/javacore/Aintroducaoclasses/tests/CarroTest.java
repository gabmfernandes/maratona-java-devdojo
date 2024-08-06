package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.tests;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Gol";
        carro1.modelo = "Duster";
        carro1.ano = 2016;

        Carro carro2 = new Carro();
        carro2.nome = "Lin";
        carro2.modelo = "oil";
        carro2.ano = 2020;

        System.out.println("Carro 1 - Nome: "+carro1.nome+" Modelo: "+carro1.modelo+" Ano: "+carro1.ano);
        System.out.println("Carro 2 - Nome: "+carro2.nome+" Modelo: "+carro2.modelo+" Ano: "+carro2.ano);
    }
}
