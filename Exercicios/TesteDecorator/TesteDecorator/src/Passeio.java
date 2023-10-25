public class Passeio extends Veiculo {
    public Passeio(String descricao){
       setDescricao(descricao);
    }
    
    @Override
    public double preco(){
        return 30000;
    }
}
