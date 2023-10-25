public class Caminhao extends Veiculo implements Tributavel{
    int numEixos;
    public Caminhao(String marca,String modelo,int anoFabricacao,int numEixos){
        super(marca,modelo,anoFabricacao);
        this.numEixos=numEixos;
    }
    public int getNumEixos(){
        return numEixos;
    }
    @Override
    public String toString(){
        return "Marca: " + getMarca() + "\n Modelo: " + getModelo() + "\n Ano de Fabricação: "+getAnoFabricacao()+"\n Numero de Eixos: "+getNumEixos()+"IPVA: "+calcularIPVA();
    } 
    @Override
    public double calcularIPVA(){
        return  200 * numEixos/(2023 - getAnoFabricacao());
    }
}
