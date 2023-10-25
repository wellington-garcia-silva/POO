public class Carro extends Veiculo implements Tributavel{
    String categoria;
    public Carro(String marca,String modelo,int anoFabricacao,String categoria){
        super(marca,modelo,anoFabricacao);
        this.categoria=categoria;
    }
    public String getCategoria(){
        return categoria;
    }
    @Override
    public String toString(){
        return "Marca: " + getMarca() + "\n Modelo: " + getModelo() + "\n Ano de Fabricação: "+getAnoFabricacao()+"\n Categoria: "+getCategoria()+"IPVA: "+calcularIPVA();
    }
    @Override
    public double calcularIPVA(){
        if(getCategoria()=="passeio"){
            return 1500/(2023 - getAnoFabricacao());
        }
        else {
            return 1000/(2023 - getAnoFabricacao());
        }
       
    }
}
