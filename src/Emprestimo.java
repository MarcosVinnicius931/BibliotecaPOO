public class Emprestimo {

    private Usuario usuario;
    private Livro livro;
    private Exemplar exemplar;
    private boolean ativo;

    public Emprestimo(Usuario usuario, Livro livro, Exemplar exemplar){
        if (!usuario.isAtivo()) {
            throw new IllegalStateException("O usuário não está ativo.");
        }

        if (!exemplar.isDisponivel()) {
            throw new IllegalStateException("O exemplar não está disponível.");
        }

        this.usuario = usuario;
        this.livro = livro;
        this.exemplar = exemplar;
        exemplar.emprestar();
        this.ativo = true;
    }

    public void devolver() {
        if (!ativo) {
            throw new IllegalStateException("Este empréstimo já foi devolvido.");
        }

        ativo = false;
        exemplar.devolver();
    }

    public void exibirDados() {
        System.out.println("Usuário: " + usuario.getNomeUsuario());
        System.out.println("Livro: " + livro.getTitulo());

        if (ativo) {
            System.out.println("Status: Empréstimo ativo");
        } else {
            System.out.println("Status: Empréstimo encerrado");
        }
    }

}
