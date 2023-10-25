public abstract class Acessorios extends Veiculo{
    private Veiculo v;

    public Acessorios(Veiculo v){
        this.v = v;
        setDescricao(v.getDescricao());
    }

    public Veiculo getVeiculo(){
        return v;
    }
}
