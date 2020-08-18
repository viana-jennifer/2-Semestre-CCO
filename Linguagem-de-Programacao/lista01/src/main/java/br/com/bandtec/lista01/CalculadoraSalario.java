package br.com.bandtec.lista01;

/**
 *
 * @author jenni
 */
public class CalculadoraSalario {

    public static void main(String[] args) {
        
        Double salarioBruto = 2287.50;
        Double porcImposto = 20.0;
        
        Double salarioLiq = salarioBruto - ((salarioBruto * porcImposto) / 100);
        
        System.out.println(String.format("Seu salário líquido será de R$ %.2f", salarioLiq));
    }
}
