package br.com.bandtec.lista01;

/**
 *
 * @author jenni
 */
public class SalarioLiquido {
    
    public static void main(String[] args) {
        
        Double salarioBruto = 5200.0;
        Double conducaoIda = 4.5;
        
        Double inss = salarioBruto * 0.1;
        Double ir = salarioBruto * 0.2;
        Double vt = conducaoIda * 2 * 22;
        Double descontos = inss + ir + vt;
        
        Double salarioLiq = salarioBruto - descontos;
        
        System.out.println(String.format
            ("Seu bruto é R$ %.2f, tem um total de R$ %.2f em descontos e receberá um líquido de R$ %.2f",
                    salarioBruto, descontos, salarioLiq));
        
    }
    
}
