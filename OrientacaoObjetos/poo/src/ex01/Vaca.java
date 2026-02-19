package ex01;

public class Vaca {

    // Atributos
    public String nome;
    private String leite;
    protected int filhos;

    // Metodo vazio sem assinatura
    public Vaca(){

    }

    //Metodo com uma assinatura
    public Vaca(String nome, String leite, int filhos) {
        this.nome = nome;
        this.leite = leite;
        this.filhos = filhos;
    }

    //
    @Override
    public String toString() {
        return "Vaca{" +
                "nome='" + nome + '\'' +
                ", leite='" + leite + '\'' +
                ", filhos=" + filhos +
                '}';
    }

    public void mugir(){
        IO.println("Muuuuhhhhhhrrrrr");
    }

    public int bezerros(int filho){
        filhos = filhos + filho;
        return filhos;
    }
}
