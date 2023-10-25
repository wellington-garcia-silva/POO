public abstract class Sorvete {
    private String descricao;
    // private double preco;

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public abstract double preco();

}
