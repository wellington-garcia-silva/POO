import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* 
 import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import lava.io.FileInputStream;
import java.io.ObjectInputStream;
*/



/**
 * Classe Reserva, que representa uma reserva de assento num estádio.
 */
public class Reserva {
    private int numero;
    private char coluna;

    private Pessoa p;

    private Data d;
    /**
     * Construtor para inicializar os atributos da classe Reserva.
     * @param numero Número do assento.
     * @param coluna Coluna do assento.
     */
    public Reserva(int numero, char coluna,Pessoa p,Data d) {
        this.numero = numero;
        this.coluna = coluna;
        this.p=p;
        this.d=d;
    }

    public Pessoa getP(){
        return p;
    }

    public Data getD(){
        return d;
    }
    /**
     * Método que retorna o número do assento.
     * @return Número do assento.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método que retorna a coluna do assento.
     * @return Coluna do assento.
     */
    public char getColuna() {
        return coluna;
    }

    public String toString(){
        return  "Pessoa"+getP()+"\n"+
                "Data"+getD()+"\n"+
                "Numero"+getNumero()+"\n"+
                "Coluna"+getColuna();

    }
}

/* 
public static void salvarEmArquivo(Reserva reserva, String ArquivoBinario.bin){
    try{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ArquivoBinario.bin));
        oos.writeObject(reserva);
        oos.close();
    
    
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    //return ag;
}
public static Reserva lerDoArquivo(String ArquivoBinario.bin){
    Reserva reserva = null;
    try{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ArquivoBinario.bin));
        reserva = (Reserva)ois.readObject();
        ois.close();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    return reserva;
}
*/