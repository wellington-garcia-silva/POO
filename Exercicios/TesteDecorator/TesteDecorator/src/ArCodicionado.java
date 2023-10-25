public class ArCondicionado extends Acessorios {
    public ArCondicionado(Veiculo v){
        super(v);
    }
    @Override
    public double preco(){
        return 3500 + getVeiculo().preco();
    }
}
