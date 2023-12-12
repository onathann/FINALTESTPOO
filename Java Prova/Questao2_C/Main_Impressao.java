public class Main_Impressao {

    public static void main(String[] args) {
        
        Livro livro = new Livro( "Fundamentos da matematica");
        Pessoa pessoa = new Pessoa( "Gabriel");

        Impressao.imprimirDetalhes(livro);
        Impressao.imprimirDetalhes(pessoa);

    }

}
