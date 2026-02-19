package ex03;

public class Carro {

    // Atributos
    public String modelo;
    public double velocidade;

    // Metodos

    public void acelerar(){
        IO.println("VRUNNNNNNNNNNNNNNNN");
    }

    public Carro(String modelo, double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
}
