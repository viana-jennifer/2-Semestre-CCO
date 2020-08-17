package br.com.bandtec.projeto02.nivelamento;

/**
 *
 * @author jenni
 */
public class Programa3 {
    
    public static void main(String[] args) {
        String cidadao = "Jennifer";
        Integer filhos = 3;
        Double bolsaFamilia = filhos * 35.9;
        
        //Interpolação
        String mensagem =
        String.format("O(a) cidadão(ã) %s tem %d filhos e recebe R$%.2f do governo", cidadao, filhos, bolsaFamilia);
    
        /* Interpolação: String.format("texto", valor1, valor2, valor3, ... valorN)
            - Podem haver  quantos valores forem necessários após o texto
            - %s    -> valor de tipo String
            - %d    -> valor de tipo Integer
            - %.2f  -> valor de tipo Double
                    -> o ".2" indica a quantidade de casa decimais
                    -> no texto final é usado o padrão do SO (ex: "," para decimais no caso de pt-br)
       
        */
        
        System.out.println(mensagem);

    }
}
