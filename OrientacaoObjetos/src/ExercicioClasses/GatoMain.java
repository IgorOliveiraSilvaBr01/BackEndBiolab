package ExercicioClasses;

import java.util.Scanner;

public class GatoMain {
    static void main() {
        Scanner sc = new Scanner (System.in);

        Gato gato1 = new Gato();

        IO.println("Digite o nome do seu gato:");
        gato1.nome = sc.next();
        IO.println("Digite a raça do seu gato:");
        gato1.raca =  sc.next();
        IO.println("Digite a idade do seu gato:");
        gato1.idade = sc.nextInt();
        IO.println("Digite o sexo do seu gato:");
        gato1.sexo = sc.next();

        IO.println(gato1.toString());
    }
}
