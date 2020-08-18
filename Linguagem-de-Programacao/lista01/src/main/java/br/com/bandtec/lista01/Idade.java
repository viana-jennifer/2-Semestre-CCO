package br.com.bandtec.lista01;

/**
 *
 * @author jenni
 */
public class Idade {

    public static void main(String[] args) {
        
        Integer anoNasc = 2005; 
        System.out.println(String.format("Olá, Jorge! Qual o ano do seu nascimento? \n %d", anoNasc));
        System.out.println(String.format("Em 2030 você terá %d anos", (2030 - anoNasc)));
    }
}
