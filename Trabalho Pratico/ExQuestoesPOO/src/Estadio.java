import java.util.ArrayList;
//import java.io.*;

//import java.io.FileInputStream;
//import java.io.ObjectInputStream;

/*import java.io.BufferedReader;
import java.io.FileReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;*/

import java.io.FileWriter;
import java.io.BufferedWriter;

public class Estadio {

    private ArrayList<Reserva> reserva;
    private String nomeEstadio;
    private String Partida;
    private int Capacidade;



    public Estadio(String nomeEstadio, String Partida, int Capacidade){
        this.nomeEstadio=nomeEstadio;
        this.Partida=Partida;
        this.Capacidade=Capacidade;
        reserva= new ArrayList<>();

    }

    /**
     * Método que retorna nome do estádio.
     * @return nome do estádio
     */
    public String getNomeEstadio(){
        return nomeEstadio;
    }

    /**
     * Método que retorna a partida
     * @return partida
     */
    public String getPartida(){
        return Partida;
    }

    /**
     * Método que retorna capacidade do estádio
     * @return capacidade
     */
    public int getCapacidade(){
        return Capacidade;
    }

    /**
     * Método que adiciona reserva.
     * void .
     */
    public void adicionarReserva(Reserva r){
            if(getDisponibilidade(r)){
                System.out.println("Essa reserva ja foi preenchida, favor escolhar outra");
            }else{
                reserva.add(r);
            }
    }

    /**
     * Método que retorna a disponibilidade da reserva
     * @return boolean .
     */
    public boolean getDisponibilidade(Reserva r){
        for(Reserva rdisponivel: reserva){
            if(r.getColuna()==rdisponivel.getColuna() && r.getNumero()==rdisponivel.getNumero()){
                return true;
            }
        }
        return false;
    }

    /**
     * Método que remove reserva.
     * void .
     */
    public void removerReserva(int numero, char coluna){
        for(Reserva r: reserva){
            if(numero==r.getNumero() && coluna==r.getColuna()){
                reserva.remove(r);
            }
        }
    }

    /**
     * Método que imprimi todas as reservas
     * void
     */
    public void imprimirReservas(){
        for(Reserva r: reserva){
           System.out.println(r);
        }
    }

       ///////////////////////////////////////////////////
public void salvarDadosArquivo(String MeuArquivo){
    System.out.println("ok1");//
    try{
        FileWriter arq = new FileWriter(MeuArquivo);

        System.out.println("okK");//

        for(Reserva reservas: reserva){
            arq.write(reservas.getNumero() + ',' + reservas.getColuna());////
            System.out.println("ok2");//
        }
        arq.close();
    }
    catch(IOException e){
        System.out.println("Falha ao salvar no arquivo" + "MeuArquivo");
    }

}

/* 
public void carregarDadosContas(String MeuArquivo){
    try{
        BufferedReader arq = new BufferedReader((new FileReader("MeuArquivo.txt")));

        String linha = arq.redLine();///

        while(linha != null){
            String[] campos = linha.split(",");

            ContaBancaria conta = new ContaBancaria(Integer.parseInt(campos[0]),campos[1]);
            conta.depositar(Float.parseFloat(camos[2]));

            contas.add(conta);

            linha = arq.readLine();

        }
        arq.close();
    }
    catch(FileFoundException e){
        System.out.println("Impossivel abrir o arquivo" + "MeuArquivo.txt");
    }
    catch(IOException e){
        System.out.println("Problema na leitura do arquivo" + "MeuArquivo.txt");
    }
}
*/
}
