package br.com.bandtec.lista01;

/**
 *
 * @author jenni
 */
public class Login {
    
    public static void main(String[] args) {
        
        String login = "Lolita";
        String senha = "@Pass01";
        Integer limiteTentativas = 3;
        
        System.out.println(String.format
        ("Seu login é %s e sua senha é %s. Você tem %d tentativas antes de ser bloqueado.",
                login, senha, limiteTentativas));
        
    }
    
}
