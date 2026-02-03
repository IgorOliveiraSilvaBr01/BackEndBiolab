import java.util.Scanner;

public interface IfElseNota {
    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Digite sua primeira nota:");
        float nota = Float.parseFloat(sc.next());

        IO.println("Digite sua segunda nota:");
        float nota2 = Float.parseFloat(sc.next());

        IO.println("Digite sua terceira nota:");
        float nota3 = Float.parseFloat(sc.next());

        float media = (nota + nota2 + nota3) / 3;

        if(media < 4){
            IO.println("Nota: "+media+" Reprovado");
        } else if(media <= 6){
            IO.println("Nota: "+media+" Recuperação");
        } else if(media > 6){
            IO.println("Nota: "+media+" Aprovado");
        } else{
            IO.println("Por favor, digite uma nota válida");
        }
    }
}
