package ExercicioClasses;

public class Cachorro {
    public String nome;
    public String raca;
    public String sexo;
    public int idade;

    public Cachorro() {
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}

