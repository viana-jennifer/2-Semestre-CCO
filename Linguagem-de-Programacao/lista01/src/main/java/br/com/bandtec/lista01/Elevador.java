package br.com.bandtec.lista01;

/**
 *
 * @author jenni
 */
public class Elevador {

    public static void main(String[] args) {
        
        Double pesoLimite = 500.0;
        Integer limiteDePessoas = 6;
        Double pessoa1 = 50.20;
        Double pessoa2 = 75.0;
        Double pessoa3 = 42.85;
        
        Double pesoTotal = pessoa1 + pessoa2 + pessoa3;
        System.out.println
            (String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas.", limiteDePessoas));
        System.out.println(String.format
                ("O peso total no elevador é de %.2f Kg, sendo que ele suporta %.2f Kg", 
                pesoTotal, pesoLimite));
    }
}
