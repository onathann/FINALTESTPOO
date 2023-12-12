public class Pessoa implements Imprimivel {

    private String nome;

    public Pessoa(String nome){

        this.nome=nome;

    }

    public void imprimirDetalhes(){

        System.out.println("Nome: "+nome);

    }

}
