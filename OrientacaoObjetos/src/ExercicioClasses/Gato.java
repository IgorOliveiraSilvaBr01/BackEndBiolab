package ExercicioClasses;

public class Gato {
    public String nome;
    public String raca;
    public String sexo;
    public int idade;

    public Gato() {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "gato{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}


