package br.com.bandtec.lista01;

/**
 *
 * @author jenni
 */
public class MediaNotas {
    
    public static void main(String[] args) {
        
        String nome = "Maria";
        Double nota1 = 7.5;
        Double nota2 = 9.25;
        Double media = (nota1 + nota2) / 2;
        
        System.out.println(String.format("Olá, %s. Sua média foi de %.1f.", nome, media));
        
    }
    
}
