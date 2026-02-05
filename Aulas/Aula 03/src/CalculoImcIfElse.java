import java.util.Scanner;

public class CalculoImcIfElse {
    static void main() {
        Scanner sc = new Scanner(System.in);

        IO.println("Digite a sua altura");
        float altura = Float.parseFloat(sc.next());

        IO.println("Digite o seu peso");
        float peso = Float.parseFloat(sc.next());

        float calc = (peso / (altura * altura));

        if (calc < 18.5) {
            IO.println("Abaixo do peso - IMC:" +calc);
        } else if (calc >= 18.5 && calc < 24.9){
            IO.println("Peso normal");
        } else if(calc >= 25 && calc < 29.9){
            IO.println("Sobrepeso");
        } else if(calc >= 30 && calc < 34.9){
            IO.println("Obesidade grau I");
        } else if(calc >= 35 && calc <39.9){
            IO.println("Obesidade grau II");
        } else{
            IO.println("Obesidade grau III");
        }
    }
    }

