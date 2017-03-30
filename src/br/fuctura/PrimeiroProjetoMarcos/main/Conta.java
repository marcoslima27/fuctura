/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fuctura.PrimeiroProjetoMarcos.main;

/**
 *
 * @author marco
 */
public class Conta {
    private double saldo;
    private int numero;


        public Conta(double S, int N){
        saldo=S;
        numero=N;
        }
        
        public double getSaldo() {
            return saldo;
        }

       
        public int getNumero() {
            return numero;
        }

          
}
        

    

