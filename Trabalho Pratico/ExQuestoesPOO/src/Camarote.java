public class Camarote extends Reserva implements ValorIngresso{
    private String tipo;

    private double acrescimo;
    public Camarote(String tipo,int numero, char coluna,Pessoa p,Data d){
        super(numero,coluna,p,d);
        this.tipo=tipo;
    }

    public double getAcrescimo() {

        if (tipo.equals("Vip")) {
            acrescimo = 30;
        } else if (tipo.equals("Premium")){
            acrescimo = 60;
        }
        return acrescimo;
    }

    public double calcularIngresso(int idade){
        if(idade>65){
            return 72.5+acrescimo;
        }else if(idade>10){
            return 145+acrescimo;
        }else{
            return 72.5+acrescimo;
        }
    }

    public String getTipo(){
        return tipo;
    }

    @Override
    public String toString(){
        return super.toString()+"\n"+
                "Tipo: "+getTipo()+"\n";
    }
}
