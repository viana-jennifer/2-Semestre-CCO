package br.com.bandtec.lista01;

/**
 *
 * @author jenni
 */
public class CalculadoraDeCalorias {
    
    public static void main(String[] args) {
        
        Integer tempoAquec = 5;
        Integer tempoAero = 30;
        Integer tempoMusc = 15;
        Integer tempoTotal = tempoAquec + tempoAero + tempoMusc;
        Integer calPerdidas = (tempoAquec * 12) + (tempoAero * 20) + (tempoMusc * 25);
        
        System.out.println(String.format
            ("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias",
                    tempoTotal, calPerdidas));
        
    }
    
}
