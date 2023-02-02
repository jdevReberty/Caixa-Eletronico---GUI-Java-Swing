package Backend.Client;

import java.util.ArrayList;
import java.util.List;

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

    public Cliente(String nome, String cpf, String data_nascimento) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataNascimento(data_nascimento);
    }

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

    public static List<Cliente> criarVetorCliente() {
        List<Cliente> listaCliente = new ArrayList();
        Cliente cliente01 = new Cliente("Marivelma", "123.456.789-10", "15/02/1965");
        cliente01.cadastrarConta(150, "123654-2", "123456");
        Cliente cliente02 = new Cliente("Jubiscleito", "109.876.543-21", "26/09/1980");
        cliente02.cadastrarConta(300, "654789-6", "123456");
        Cliente cliente03 = new Cliente("Xoazeniutsu", "654.312.789-25", "05/01/2000");
        cliente03.cadastrarConta(1256, "958489-9", "123456");

        listaCliente.add(cliente01);
        listaCliente.add(cliente02);
        listaCliente.add(cliente03);

        return listaCliente;
    }
}
