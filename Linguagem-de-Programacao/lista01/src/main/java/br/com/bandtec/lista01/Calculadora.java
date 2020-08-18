package br.com.bandtec.lista01;

/**
 *
 * @author jenni
 */
public class Calculadora {

    public static void main(String[] args) {
        
        Double num1 = 9.75;
        Double num2 = 5.0;
        
        System.out.println(String.format("Digite um número: \n %.2f", num1));
        System.out.println(String.format("Digite outro número: \n %.0f", num2));
        
        System.out.println(String.format("Resultado da soma: \n %.2f", (num1 + num2)));
        System.out.println(String.format("Resultado da subtração: \n %.2f", (num1 - num2)));
        System.out.println(String.format("Resultado da multiplicação: \n %.2f", (num1 * num2)));
        System.out.println(String.format("Resultado da divisão: \n %.2f", (num1 / num2)));
    }
}
