import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array {

    static void main() {

        List<String> nomes = new ArrayList<>();
        nomes.add("Fiama");
        nomes.add("Nicollas");
        nomes.add("Lucas");

        IO.println(nomes);
        IO.println(nomes.get(0)); // puxa um nome especifíco de acordo com a sua posição


    }
}
