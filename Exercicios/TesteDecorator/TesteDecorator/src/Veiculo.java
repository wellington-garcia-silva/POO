public abstract class Veiculo {
    private String descricao;

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao=descricao;
    }

    public abstract double preco();
}
