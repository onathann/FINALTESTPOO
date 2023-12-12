public class Livro implements Imprimivel {

    private String titulo;

    public Livro (String titulo){

        this.titulo = titulo;

    }

    public void imprimirDetalhes(){

        System.err.println("Titulo: "+titulo);

    }

}
