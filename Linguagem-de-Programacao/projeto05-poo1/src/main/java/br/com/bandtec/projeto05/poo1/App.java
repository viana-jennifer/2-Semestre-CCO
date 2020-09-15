package br.com.bandtec.projeto05.poo1;

import com.oracle.webservices.internal.api.EnvelopeStyle;

public class App {

    public static void main(String[] args) {
        
        for (Integer i = 0; i <= 10; i++) {
            
            if (i % 2 == 0) {
                System.out.println(String.format("%d é par", i));
            } else {
                System.out.println(String.format("%d é impar", i));
            }
        }
        
        Integer numero = 0;
        
        while (numero <= 10) {            
            System.out.println(numero);
            numero ++;
        }
    }
}
