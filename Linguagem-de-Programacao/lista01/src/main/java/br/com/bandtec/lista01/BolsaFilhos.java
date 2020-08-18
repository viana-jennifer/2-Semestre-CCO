package br.com.bandtec.lista01;

/**
 *
 * @author jenni
 */
public class BolsaFilhos {
    
    public static void main(String[] args) {
        
        Integer filhos0a3 = 3;
        Integer filhos4a16 = 2;
        Integer filhos17a18 = 1;
        Integer totalFilhos = filhos0a3 + filhos4a16 + filhos17a18;
        Double valorBolsa = (filhos0a3 * 25.12) + (filhos4a16 * 15.88) + (filhos17a18 * 12.44);
        
        System.out.println(String.format
            ("Você tem um total de %d filhos e vai receber R$ %.2f de bolsa", totalFilhos, valorBolsa));
    }
    
}
