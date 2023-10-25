public class GEM {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        DVD dvd = new DVD("FTFD",34,false,"wellington");
        CD cd = new CD("lost Souls",54,true,"Caskets",10);
        System.out.printf(dvd.getDescricaoDvd());
        System.out.printf(cd.getDescricaoCd());
    }
}
