package br.com.bandtec.projeto02.nivelamento;

/**
 *
 * @author jenni
 */
public class Programa1 {
    
    public static void main(String[] args) {
        // Variáveis e tipos em Java
        // Em Java, usamos a tipagem ESTÁTICA
        // Diferente de JS, que usa tipagem DINÂMICA
        
        // Ex: variáveis de texto(ou alfanuméricos): String
        String fruta = "abacate";
        String bairro =  "Vila Prudente";
        
        // Variáveis de número Inteiro: Integer
        Integer idade = 20;
        Integer filhos = 2;
        
        // Variáveis de número Real: Double
        Double preço = 7.99;
        Double altura = 1.52;
        
        // Variáveis lógicas (boolenas): Boolean
        Boolean alto = false;
        Boolean jovem = true;
        Boolean palmeirasTemMundial = false;
        
        
        // Conversão de tipos
        String alunosTxt = "60";
        
        // Ex: String p/ Integer
        Integer alunos =  Integer.valueOf(alunosTxt);
        
        String mediaTxt = "8.75";
        
        // Ex: String p/ Double
        Double media = Double.valueOf(mediaTxt);
        
        
    }
    
}
