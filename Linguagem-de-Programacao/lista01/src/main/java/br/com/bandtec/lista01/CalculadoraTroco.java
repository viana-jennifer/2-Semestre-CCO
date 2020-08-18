package br.com.bandtec.lista01;

/**
 *
 * @author jenni
 */
public class CalculadoraTroco {

    public static void main(String[] args) {
        
        Double valorUN = 39.99;
        Integer quantVendida = 7;
        Double valorPago = 300.00;
        Double troco = valorPago - (valorUN * quantVendida);
        
        System.out.println(String.format("Seu troco será de R$ %.2f ", troco));
    }
}
