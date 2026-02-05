import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lacin {
    static void main() {

        Scanner sc = new Scanner(System.in); // Declarando um novo scanner com o nome "sc"

        List<Integer> numeros = new ArrayList(); // Declarando uma nova Array List com o nome "numeros"

        IO.println("Digite um número:");
        int num = sc.nextInt(); // Cria uma variável que recebe o valor atribuido ao scanner com o print acima
        numeros.add(num); // Adiciona o valor da variavel "num" à lista "numeros"

        IO.println(numeros); //Exibe o valor adicionado a lista
                            //Numeros = exibe todos os itens / (0,1,2,3...) = exibe o item indicado


        Scanner sc1 = new Scanner(System.in);

        List<Integer> numeros1 = new ArrayList();

        IO.println("Digite um número:");
        int num1 = sc1.nextInt();

        IO.println("Digite outro número:");
        int num2 = sc.nextInt();
        numeros1.add(num1, num2);

        int soma = (numeros1.get(0+1));
        IO.println(soma);
    }
}
