/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gabrielbanco;

/**
 *
 * @author aluno
 */
public class ContaMaster {

    /**
     * @return the saldoInvestimento
     */
    public float getSaldoInvestimento() {
        return saldoInvestimento;
    }

    /**
     * @param saldoInvestimento the saldoInvestimento to set
     */
    public void setSaldoInvestimento(float saldoInvestimento) {
        this.saldoInvestimento = saldoInvestimento;
    }

    /**
     * @return the limiteExtra
     */
    public float getLimiteExtra() {
        return limiteExtra;
    }

    /**
     * @param limiteExtra the limiteExtra to set
     */
    public void setLimiteExtra(float limiteExtra) {
        this.limiteExtra = limiteExtra;
    }
    
    private float saldoInvestimento;
    private float limiteExtra;
    
    
}
