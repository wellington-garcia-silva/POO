public class Bicicleta extends Veiculo{
    int marchas;
    public Bicicleta(String marca,String modelo,int anoFabricacao,int marchas){
        super(marca,modelo,anoFabricacao);
        this.marchas=marchas;
    }
    public int getMarchas(){
        return marchas;
    }
    @Override
    public String toString(){
        return "Marca: " + getMarca() + "\n Modelo: " + getModelo() + "\n Ano de Fabricação: "+getAnoFabricacao()+"\n Marchas: "+getMarchas();
    }
}

