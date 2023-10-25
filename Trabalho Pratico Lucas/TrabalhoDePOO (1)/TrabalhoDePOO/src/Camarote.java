public class Camarote extends Reserva implements ValorIngresso{
    private String tipo;


    public Camarote(String tipo,int numero,Pessoa p){
        super(numero,p);
        this.tipo=tipo;
    }

    public double getAcrescimo() {
        int acrescimo = 0;

        if (tipo.equals("Camarote Vip")) {
            acrescimo = 30;
        } else if (tipo.equals("Camarote Premium")){
            acrescimo = 60;
        }
        return acrescimo;
    }

    @Override
    public double calcularIngresso(int idade){
        if(idade>65){
            return 72.5+getAcrescimo();
        }else if(idade>10){
            return 145+getAcrescimo();
        }else{
            return 72.5+getAcrescimo();
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
