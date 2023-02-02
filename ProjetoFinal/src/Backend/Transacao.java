package Backend;

import Backend.Client.Cliente;
import Backend.*;

public class Transacao {

    private Cliente cliente;
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
    public void depositar(Cliente[] listaCliente, String conta, double valor, int tipo) {
       Cliente clienteSele = null; 
        if (tipo == 1) {
            depositarCorrente(listaCliente, conta, valor);
        } else if (tipo == 2) {
            depositarPoupanca(listaCliente, conta, valor);
        }
        if (clienteSele != null) {
            
        }
    }

    public Cliente depositarCorrente(Cliente[] listaCliente, String conta, double valor) { 
        for (int x=0; x< listaCliente.length; x++) {
            if (listaCliente[x].getContaCorrente().getConta().equals(conta)) {
                return listaCliente[x];
            }
        }
        return null;
    }
    public Cliente depositarPoupanca(Cliente[] listaCliente, String conta, double valor) { 
        for (int x=0; x< listaCliente.length; x++) {
            if (listaCliente[x].getConta_poupanca().getConta().equals(conta)) {
                return listaCliente[x];
            }
        }
        return null;
    }
    public void sacar(Cliente cliente, double valor) {
        this.setCliente(cliente);
    }
    public void transferir(Cliente[] listaCliente, Cliente cliente, String conta, double valor) {
        this.setCliente(cliente);
    }
}