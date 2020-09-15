package br.com.bandtec.projeto06.poo1;

import java.util.concurrent.ThreadLocalRandom;

public class App {
    
    public static void main(String[] args) {
        
        Integer numeroInteiro = ThreadLocalRandom.current().nextInt(0, 10);
        Double numeroReal = ThreadLocalRandom.current().nextDouble(0, 5);

        System.out.println(String.format("Numero inteiro: %d", numeroInteiro));
        System.out.println(String.format("Numero real: %.2f", numeroReal));
        
        System.out.println("----------------------");
        
        System.out.println("\n 10 números aleatórios inteiros");
        
        for (int i = 0; i < 10; i++) {
            numeroInteiro = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println(String.format("Numero inteiro: %d", numeroInteiro));
        }


        System.out.println("\n 10 números aleatórios reais");        
        for (int i = 0; i < 10; i++) {
            numeroReal = ThreadLocalRandom.current().nextDouble(0, 5);
            System.out.println(String.format("Numero real: %.2f", numeroReal));
        }
    }
    
}
