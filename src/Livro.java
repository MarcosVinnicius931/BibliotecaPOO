import java.util.ArrayList;

public class Livro {

    private String isbn;
    private String titulo;
    private int anoPublicacao;
    private Autor autor;
    private ArrayList<Exemplar> exemplares;



    public Livro(String isbn, String titulo, int anoPublicacao, Autor autor){
        if(isbn == null || isbn.isBlank()){
            throw new IllegalArgumentException("O código ISBN é obrigatório");
        }
        if(titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("O título é obrigatório");
        }
        if(autor == null){
            throw new IllegalArgumentException("O autor é obrigatório");
        }
        if(anoPublicacao <= 0){
            throw new IllegalArgumentException("Digite um ano válido");
        }

        exemplares = new ArrayList<>();

        this.isbn = isbn;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public String getISBN(){
        return isbn;
    }
    public int getAnoP(){
        return anoPublicacao;
    }
    public String getTitulo(){
        return titulo;
    }

    public void exibirDados() {
        System.out.println(titulo + " ( " + anoPublicacao + " )");
        System.out.println("Autor: " + autor.getNomeAutor());
    }

    public void addExemplar(String codigoExemplar){
        Exemplar exemplar = new Exemplar(codigoExemplar);
        exemplares.add(exemplar);
    }

    public int getQuantidadeExemplares() {
        return exemplares.size();
    }

    public Exemplar buscarExemplarDisponivel() {
        for (Exemplar exemplar : exemplares) {
            if (exemplar.isDisponivel()) {
                return exemplar;
            }
        }

        return null;
    }

}

