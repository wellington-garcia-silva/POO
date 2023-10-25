import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

import java.io.*;

public class AppEstadio {
    public static void main(String[] args) {
        Estadio e=new Estadio("Maracana","Flamengo x Vasco",70000);
        Pessoa p=new Pessoa("Arthur","126178376","32911445",28);
        Data d=new Data(23,15,10,2022);
        Reserva r=new Arquibancada("Norte", 1,'A',p,d);

        e.salvarDadosArquivo("MeuArquivo");

        e.adicionarReserva(r);
        e.imprimirReservas();


}
/* 
    //////////////////////////////////////////Acrescentei
    public static void salvarEmArquivo(Reserva reserva, String ArquivoBinario){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ArquivoBinario));
            oos.writeObject(reserva);
            oos.close();
        
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        //return ag;
    }
    public static Reserva lerDoArquivo(String ArquivoBinario){
        Reserva reserva = null;
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ArquivoBinario));
            reserva = (Reserva)ois.readObject();
            ois.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return reserva;
    }
 */

}



