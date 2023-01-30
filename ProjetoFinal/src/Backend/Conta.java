/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author sucod
 */
public abstract class Conta {
    private double saldo;
    private String conta;
    private String senha;
    public void depositar(String conta, double valor) {
        
    }
    public void sacar(String senha, double valor) {
        
    }
    public void transferir(String conta, double valor) {
        
    }

    public Conta(double saldo, String conta, String senha) {
        this.saldo = saldo;
        this.conta = conta;
        this.senha = senha;
    }
    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
