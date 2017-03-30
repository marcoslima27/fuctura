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
public class Classe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor digite seu nome: ");
                
        String nome = scanner.next();
               
	System.out.println("Por favor digite sua Idade: ");
	int idade = scanner.nextInt();
        
        System.out.println("Nome: " + (nome )); 
	System.out.println("Idade: " + (idade));
        
        if ((idade%2) == 0){ 
            System.out.println("A idade é par");
        }
            else{
            System.out.println("A idade é ímpar");
            }        
        }
    }
