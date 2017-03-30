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
public class ContaCorrente extends Conta{
    
    
    public ContaCorrente(double S, int N) {
        super(S, N);
    }
    
    private double limite;

    public double getLimite() {
        return limite;
    }
    
    
}
