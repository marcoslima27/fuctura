/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fuctura.PrimeiroProjetoMarcos.main;

import java.util.Scanner;

/**
 *
 * @author Marcos Lima
 */
    public class Classe2 {
        public static void main(String[]args){
    
            Scanner scanner=new Scanner(System.in);
            System.out.println("Digite o primeiro número:");
            
            int num1 = scanner.nextInt();
            
            System.out.println("Digite o segundo número:");
            
            int num2 = scanner.nextInt();
            int soma = num1+num2;
            int multiplicacao = num1*num2;
            
            if (soma==multiplicacao) {
                System.out.println("A soma é igual a multiplicação!");
            }
            else {
                System.out.println("A soma não é igual a multiplicação!");
            }
            
        }
            
            
    
    }

