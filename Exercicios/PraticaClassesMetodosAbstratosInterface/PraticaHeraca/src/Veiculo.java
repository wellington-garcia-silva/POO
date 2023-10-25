public class Veiculo {
    String marca;
    String modelo;
    int anoFabricacao;
    public Veiculo(String marca,String modelo,int anoFabricacao){
        this.marca=marca;
        this.modelo=modelo;
        this.anoFabricacao=anoFabricacao;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    @Override
    public String toString(){
        return " ";
    }
    
}

