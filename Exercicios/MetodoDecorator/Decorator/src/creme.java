public class creme extends adicionais {
    public creme(Sorvete s){
        super(s);
    }
    @Override
    public double preco(){
        return 3.5 + getSorvete().preco();
    }
}
