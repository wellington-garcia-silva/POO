public class Arquibancada extends Reserva implements ValorIngresso{
    private String setor;

    private double acrescimo;

    public Arquibancada(String setor,int numero, char coluna,Pessoa p,Data d){
        super(numero,coluna,p,d);
        this.setor=setor;
    }

    public String getSetor(){
        return setor;
    }

    public double getAcrescimo(){
        if(setor.equals("Norte")){
            double acrescimo=5;
        }else if(setor.equals("Sul")){
            double acrescimo=10;
        }else if(setor.equals("Leste")){
            double acrescimo=15;
        }else if(setor.equals("Oeste")){
            double acrescimo=20;
        }
        return acrescimo;
    }

    public double calcularIngresso(int idade){
        if(idade>65){
            return 30.5+getAcrescimo();
        }else if(idade>10){
            return 61+getAcrescimo();
        }else{
            return 30.5+getAcrescimo();
        }
    }

    @Override
    public String toString(){
        return super.toString()+"\n"+
               "Setor: "+getSetor()+"\n";
    }

}
