void main() {
    Pessoa igor = new Pessoa("Oliveira", "Masculino", 17);   // cria um novo objeto através do "molde" da classe nomeada Pessoa
//    igor.idade = 17;            // atribui 17 à variável idade
//    igor.sexo = "Masculino";    // atribui "Masculino" à variável sexo
//    igor.nome = "Oliveira";         // atribui "Oliveira" à variável nome

    Pessoa marcos =  new Pessoa("Oliveira", "Feminino", 17);
//    marcos.idade = 17;
//    marcos.sexo = "Feminino";
//    marcos.nome = "Marcão";

    //IO.println(igor.nome + " " + igor.idade + " " + igor.sexo ); // busca a variável do local de armazenamento heap

    IO.println(igor.toString()); // exibe todos os dados atribuídos
    IO.println(marcos.toString());















}
