package Backend.Client;

import Backend.ContaCorrente;
import Backend.ContaPoupanca;

public class Cliente implements Usuarios {
    
    private ContaCorrente conta_corrente;
    private ContaPoupanca conta_poupanca;
    /**
     * 0 - Off
     * 1 - Conta Corrente
     * 2 - Conta poupança
     */
    private int conta_selecionada = 0;

    private String nome;
    private String cpf;
    private String data_nascimento;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }

    public void setDataNascimento(String data_nascimento){
        this.data_nascimento = data_nascimento;
    }
    public String getDataNascimento(){
        return this.data_nascimento;
    }

    @Override
    public void cadastrarUsuario(String nome, String cpf, String data_nascimento, double saldo, String senha) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataNascimento(data_nascimento);

        cadastrarConta(saldo, "sdusdu", senha);
    }

    public void cadastrarConta(double saldo, String conta, String senha) {
        implementarContaCorrente(saldo, conta, senha);
        implementarContaPoupanca(saldo, conta, senha);
    }

    public void implementarContaCorrente(double saldo, String conta, String senha) {
        this.conta_corrente = new ContaCorrente(saldo, conta, senha);
    }
    public void implementarContaPoupanca(double saldo, String conta, String senha) {
        this.conta_poupanca = new ContaPoupanca(saldo, conta, senha);
    }
}
