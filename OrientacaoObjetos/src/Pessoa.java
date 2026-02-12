public class Pessoa {

    public String nome;    // visibilidade publica
    protected String sexo;  // visibilidade protegida
    public int idade;       // visibilidade pubica

    public Pessoa(String nome, String sexo, int idade){     // construtor da classe: define regras origatórias da classe como o preenchimento obrigatório do nome, sexo e idade
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    @Override   // cria um prompt com as informações e dados da classe, e atribui seus valores através dos dados fornecidos pelo objeto
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
