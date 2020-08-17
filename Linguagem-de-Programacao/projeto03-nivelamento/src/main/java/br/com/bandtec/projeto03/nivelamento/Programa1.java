package br.com.bandtec.projeto03.nivelamento;

/**
 *
 * @author jenni
 */
public class Programa1 {
    
    public static void main(String[] args) {
        
        Integer num1 = 5;
        
        
        // As estruturas de decisão "if, else if, else" funcionam da mesma forma que JS
        if (num1 > 10) {
            System.out.println("É maior");
        }else if (num1 == 8){
            System.out.println("É igual");
        } else {
            System.out.println("É menor");
        }
        
        
        // Para comparar texto(String) sempre utilizar o ".equals"
        String nome = "Jennifer";
        String nome2 = "jennifer";
        
        
        if (nome.equals("Jennifer")){
            System.out.println("Nome está correto!!");
        } else {
            System.out.println("O nome está  errado");
        }
        
        
        // Podemos utilizar ".equals" para número também
    
        String usuario = "Marquito";
        String senha = "senha123";
        
        if (usuario.equals("Marquito") && senha.equals("senha123")){
            System.out.println("Acesso garantido");
        } else {
            System.out.println("Usuário e/ou senha inválidos");
        }
        
        // O operador "or" ou "ou" funciona da mesma maneira que o JS
        Integer idade = 27;
        if (usuario.equals("Marquito") || idade.equals(27)){
            System.out.println("Passou");
        } else {
            System.out.println("Não passou");
        }
        
        Integer par = 32;
        if (par % 2 == 0){
            System.out.println("É par");
        } else {
            System.out.println("Não é par");
        }
    }
}
