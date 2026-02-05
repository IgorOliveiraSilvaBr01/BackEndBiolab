public class While {

    static void main() {

        int i = 10;
        while (i < 11){
            IO.println("Hello World!");
            i++;
        }

        // Mostrar todos os números pares de 1 a 10
        int i1 = 0;
        while(i1 <= 10){
            IO.println("Pares: "+i1++);
            i1++;
        }

        // Mostrar todos os números impares de 1 a 10
        int i2 = 1;
        while (i2 <=10){
            IO.println("Ímpares: "+i2++);
            i2++;
        }
    }
}
