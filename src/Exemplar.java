public class Exemplar {

    private String codigoExemplar;
    private boolean exemplarDisponivel;

    public Exemplar(String codigoExemplar) {
        setExemplar(codigoExemplar);
    }

    public void setExemplar(String codigoExemplar){
        if (codigoExemplar == null || codigoExemplar.isBlank()) {
            throw new IllegalArgumentException("Código obrigatório.");
        }
        this.codigoExemplar = codigoExemplar;
        this.exemplarDisponivel = true;


    }

    public boolean isDisponivel(){
        return exemplarDisponivel;
    }

    public void emprestar(){
        if(!exemplarDisponivel){
            throw new IllegalArgumentException("O exemplar não está disponivel!!!");
        }
        exemplarDisponivel = false;
    }

    public void devolver(){
        exemplarDisponivel = true;
    }

}
