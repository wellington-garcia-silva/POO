public class Arquibancada extends Reserva implements ValorIngresso{
    private String setor;


    public Arquibancada(String setor, int numero,Pessoa p){
        super(numero,p);
        this.setor=setor;
    }

    public String getSetor(){
        return setor;
    }

    public double getAcrescimo(){
        int acrescimo = 0;
        if(setor.equals("Arquibancada Norte")){
            acrescimo=5;
        }else if(setor.equals("Arquibancada Sul")){
            acrescimo=10;
        }else if(setor.equals("Arquibancada Leste")){
            acrescimo=15;
        }else if(setor.equals("Arquibancada Oeste")){
            acrescimo=20;
        }
        return acrescimo;
    }

    @Override
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
