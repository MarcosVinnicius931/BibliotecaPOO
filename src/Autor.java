public class Autor{

    private String codigo;
    private String nomeAutor;
    private String nacionalidade;

    public Autor(String codigo, String nomeAutor, String nacionalidade){
        if (codigo == null || codigo.isBlank()){
            throw new IllegalArgumentException("Digite um valor válido para o código");
        }
        if (nomeAutor == null || nomeAutor.isBlank()){
            throw new IllegalArgumentException("Digite um nome válido");
        }
        if (nacionalidade == null || nacionalidade.isBlank()){
            throw new IllegalArgumentException("Digite uma nacionalidade válida");
        }
        this.codigo = codigo;
        this.nomeAutor = nomeAutor;
        this.nacionalidade = nacionalidade;
    }

    public String getCodigo(){
        return codigo;
    }
    public String getNomeAutor(){
        return nomeAutor;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }

    public void exibirDados(){
        System.out.println("Código: "+getCodigo());
        System.out.println("Nome: "+getNomeAutor());
        System.out.println("Nacionalidade: "+getNacionalidade());
    }
}

