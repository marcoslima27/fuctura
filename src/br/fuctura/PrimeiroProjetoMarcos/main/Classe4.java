/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fuctura.PrimeiroProjetoMarcos.main;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Classe4 {
    public static void main(String[]args){
        
        System.out.println("Digite qualquer nome.");
        
        Scanner scn=new Scanner(System.in);
        String nome=scn.nextLine();
        
           //int vezes=1;        
           //while (vezes <=10){
                //System.out.println(nome);
                //vezes=vezes+1;
            //}
            
            for(int vez=0;vez<=10;vez++){
                System.out.println(nome);
                if (vez == 5){
                    continue;
                }
            }
    }
    
}
