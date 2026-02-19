package ex02;

public class Conta {

    // Atributos
    public double saldo;
    public int nConta;
    public int agencia;

    // Métodos
    public void sacar( double saque ){ // metodo void (vazio) pois apresentará mensagem
        if(saldo >= saque){
            saldo = saldo - saque;
            IO.println("Saque realizado com sucesso. Seu saldo atual é: "+saldo);
        } else {
            IO.println("Saldo insuficiente para saque");
        }
    }


    public String depositar( double deposito){
        saldo = saldo + deposito;
        return "Seu saldo atual é: "+saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", nConta=" + nConta +
                ", agencia=" + agencia +
                '}';
    }
}
