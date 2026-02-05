public class For {

    static void main() {

        // 1 - Indica a variável
        // 2 - condição
        // 3 - alteração da variável

        // 0 a 5
        for (int i1 = 0; i1 <= 5; i1++) {
            IO.println("O valor de i é: " +i1);
        }
        IO.println();

        // 0 a 10 pares
        for (int i2 = 0; i2 <= 10; i2++) {
            IO.println("O valor de i é: " +i2);
            i2++;
        }
        IO.println();

        // 0 a 10 ímpares
        for (int i3 = 1; i3 <= 10; i3++) {
            IO.println("O valor de i é: " + i3);
            i3++;
        }
        IO.println();
    }
}


