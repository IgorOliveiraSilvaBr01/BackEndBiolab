package ExercicioClasses;

import java.util.Scanner;

public class AnimalMain {
    static void main() {
    Scanner sc = new Scanner(System.in);

    Animal animal1 = new Animal();

        IO.println("Seu animal é um gato ou cachorro?");
        animal1.animal = sc.next();
        IO.println("Qual a raça do seu " +animal1.animal+ "?");
        animal1.raca = sc.next();
        IO.println("Qual o sexo do seu "+animal1.animal+ "?");
        animal1.sexo = sc.next();
        IO.println("Qual o nome do seu "+animal1.animal+ "?");
        animal1.nome = sc.next();

        IO.println(animal1);
    }
}
