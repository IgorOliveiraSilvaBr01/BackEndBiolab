import java.util.ArrayList;
import java.util.List;

public class ForEach {

    static void main() {

        List<Integer> numeros = new ArrayList();
        numeros.add(5);
        numeros.add(2);
        numeros.add(3);

        //utilize o forEach para imprimir os numeros impares e pares

        for (int num : numeros){
            IO.println();
        }
    }
}
