package Backend;

import Backend.Client.Cliente;

public class Transacao {

    private Cliente cliente;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void depositar(String conta, double valor) {
        
    }
    public void sacar(Cliente cliente, double valor) {
        this.setCliente(cliente);
    }
    public void transferir(Cliente cliente, String conta, double valor) {
        this.setCliente(cliente);
    }
}