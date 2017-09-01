/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class ContaMaster extends Conta {
    public ContaMaster () {
        super();
        
    }
    float limiteextra, saldoInvestimento;
    @Override
    public boolean sacar (float valor) {
        if (this.getSaldo() +this.getLimite() + this.limiteextra >= valor) {
            super.sacar(valor);
            return true;
            
        } else {
            return false;
            
        }
    }
    public void setlimitextra (float limite) {
            this.limiteextra=limite;
            
    }
    public float getlimite() {
        return this.getLimite() + this.limiteextra;
    }
    public boolean investir (float valor) {
        if (this.getSaldo()>=valor) {
            super.sacar (valor);
            this.saldoInvestimento = this.saldoInvestimento + valor;
            return true;
            
        } else {
            return false;
            
        }
        
    }
    public boolean resgatar (float valor) {
        if (this.saldoInvestimento >= valor) {
            this.saldoInvestimento = this.saldoInvestimento - valor;
            this.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    private float getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
