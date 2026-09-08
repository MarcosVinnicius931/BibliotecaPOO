import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Livro> livros;

    public Biblioteca(){
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    public void addUsuario(Usuario user){
        usuarios.add(user);
    }
    public void addLivro(Livro livro){
        livros.add(livro);
    }

    public int getQuantidadeLivros() {
        return livros.size();
    }
    public int getQuantidadeUsuarios() {
        return usuarios.size();
    }

    public void listarLivros(){
        for(Livro livro: livros){
            livro.exibirDados();
        }
    }


}
