/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto02.nivelamento;

/**
 *
 * @author jenni
 */
public class Programa2 {
    
    public static void main(String[] args) {
        String passageiro = "Clementina";
        Integer viagensDia = 4;
        Double creditoBU = 119.5;
        
        // Os 4 operadores aritméticos básicos são os mesmo de JS: + - * /
        // Não existe o operador **(potência)
               
        // Considerando que a passagem é 4,40
        Double viagensPossiveis = creditoBU / 4.4;
        
        // Ex: 8.2  -> 8
        // Ex: 8.99 -> 8
        
        // Recuperando a parte inteira de um número (NÃO é arredondamento!)
        Integer viagensPossiveisInteiro =  viagensPossiveis.intValue();
        System.out.println(passageiro + "pode fazer" + viagensPossiveisInteiro + "viagens");
        
        // Calcule e exiba para quantos dias
        
        
        /* <Ctrl> + R: colocar em cima a variável que vai selecionar todas as 
        vezes que foi usada e mudar tudo ao mesmo tempo */

    }
}
