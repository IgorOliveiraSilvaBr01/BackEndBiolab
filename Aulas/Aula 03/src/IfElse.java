public interface IfElse{
    static void main() {

        int idade = 17;

        if(idade < 18){
            IO.println("Acesso negado");
        } else {
            IO.println("Acesso permitido");
        }
    }
}
