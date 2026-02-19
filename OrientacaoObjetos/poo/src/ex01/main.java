package ex01;

public class main {
    static void main() {

        Vaca vaca01 =  new Vaca(); // forma de criar um objeto sem constructor
        vaca01.nome = "Odete";
        vaca01.filhos = 1;

        Vaca angus = new Vaca("Mimosa", "Qualhada", 7);
        // forma de criar um objeto com constructor

        vaca01.mugir();

        IO.println(vaca01);
    }
}
