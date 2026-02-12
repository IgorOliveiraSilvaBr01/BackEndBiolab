package ExercicioClasses;

import java.util.Scanner;

public class CachorroMain {
    static void main() {
        Scanner sc = new Scanner (System.in);

        Cachorro cachorro1 = new Cachorro();

        IO.println("Digite o nome do seu cachorro:");
        cachorro1.nome = sc.next();
        IO.println("Digite a raça do seu cachorro:");
        cachorro1.raca =  sc.next();
        IO.println("Digite a idade do seu cachorro:");
        cachorro1.idade = sc.nextInt();
        IO.println("Digite o sexo do seu cachorro:");
        cachorro1.sexo = sc.next();

        IO.println(cachorro1.toString());
    }
}

