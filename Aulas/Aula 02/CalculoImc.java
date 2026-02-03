package Aula02;

import java.util.Scanner;

public class CalculoImc {
    static void main() {

        Scanner sc = new Scanner(System.in);

        IO.println("Digite a sua altura");
        float altura = Float.parseFloat(sc.next());
        
        IO.println("Digite o seu peso");
        float peso = Float.parseFloat(sc.next());
        
        IO.println("Digite a sua idade");
        int idade = Integer.parseInt(sc.next());
        
        IO.println("Digite o seu nome");
        String nome = sc.next();

        IO.println(" Nome: " +nome+  " Idade: " +idade+ " Peso: " +peso+ " Altura: " +altura);
        IO.println("IMC: " +peso / (altura * altura));

    }
}
