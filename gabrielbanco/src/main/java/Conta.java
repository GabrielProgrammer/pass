/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Conta {
    public Conta () {}
    float saldo; protected float limite;
    int agencia, membro;
    
    public float depositar (float valor) {
        this.saldo = this.saldo + valor;
        return this.saldo;
        
    }
    
    public boolean sacar (float valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo =this.saldo - valor;
            return true;
            
        } else  {
            return false;
        }
    }
            
}

