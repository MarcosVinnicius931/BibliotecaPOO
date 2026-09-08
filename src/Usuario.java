public class Usuario {

    private String matricula;
    private String nomeUsuario;
    private String email;
    private boolean ativo;


    public Usuario(String matricula, String nomeUsuario, String email){
        if (matricula == null || matricula.isBlank()){
            throw new IllegalArgumentException("Digite uma matricula existente!");
        }
        if (nomeUsuario == null || nomeUsuario.isBlank()){
            throw new IllegalArgumentException("Nome do usuário não pode ficar em branco!");
        }
        if (email == null || email.isBlank()){
            throw new IllegalArgumentException("Email do usuário não pode ficar em branco!");
        }

        this.matricula = matricula;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.ativo = true;

    }

    public String getMatricula(){
        return matricula;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public boolean isAtivo(){
        return ativo;
    }

    public void ativarUsuario(){
         ativo = true;
    }

    public void desativarUsuario(){
         ativo = false;
    }

    public void exibirDados(){
        System.out.println("Matricula: "+getMatricula());
        System.out.println("Nome: "+getNomeUsuario());
        if(isAtivo()) {
            System.out.println("A conta está atualmente ativa!!!");
        }else{
            System.out.println("A conta está atualmente desativada!!!");

        }
    }

}
