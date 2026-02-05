import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lacin2 {
    static void main() {
        Scanner sc1 = new Scanner(System.in);

        List<Integer> numeros1 = new ArrayList();

        IO.println("Digite um número:");
        int num1 = sc1.nextInt();

        IO.println("Digite outro número:");
        int num2 = sc1.nextInt();
        numeros1.add(num1);
        numeros1.add(num2);

        double soma = (numeros1.get(0)+numeros1.get(1));
        IO.println(soma);
    }
}
