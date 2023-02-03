package Backend;

import Backend.Client.Cliente;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import Backend.*;

public class Transacao {

    private Cliente cliente;
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void depositar(List<Cliente> listaCliente, String conta, double valor, int tipo) {
       Cliente clienteSele = null; 
        if (tipo == 1) {
            clienteSele = checarClienteContaCorrente(listaCliente, conta, valor);
            if (clienteSele != null) {
                clienteSele.getContaCorrente().sumSaldo(valor);
            }
        } else if (tipo == 2) {
            clienteSele = checarClienteContaPoupanca(listaCliente, conta, valor);
            if (clienteSele != null) {
                clienteSele.getContaPoupanca().sumSaldo(valor);
            }
        } 
    }

    public Cliente checarClienteContaCorrente(List<Cliente> listaCliente, String conta, double valor) { 
        for(Cliente cliente : listaCliente) {
            if(cliente.getContaCorrente().getConta().equals(conta)) {
                return cliente;
            }
        }
        return null;
    }
    public Cliente checarClienteContaPoupanca(List<Cliente> listaCliente, String conta, double valor) { 
        for(Cliente cliente : listaCliente) {
            if(cliente.getContaPoupanca().getConta().equals(conta)) {
                return cliente;
            }
        }
        return null;
    }

    public void sacar(Cliente cliente, double valor, int tipo) {
        this.setCliente(cliente);
        if (tipo == 1) {
            if (this.cliente.getContaCorrente().getSaldo() >= valor) {
                this.cliente.getContaCorrente().subSaldo(valor);
            }
        } else if( tipo == 2) {
            if (this.cliente.getContaPoupanca().getSaldo() >= valor) {
                this.cliente.getContaPoupanca().subSaldo(valor);
            }
        }
    }
    public void transferir(List<Cliente> listaCliente, Cliente cliente, String conta, double valor, int tipo) {
        this.setCliente(cliente);
        for (Cliente clienteTransferencia : listaCliente) {
            if (tipo == 1) {
                if (clienteTransferencia.getContaCorrente().getConta().equals(conta)) {
                    clienteTransferencia.getContaCorrente().sumSaldo(valor);
                    cliente.getContaCorrente().subSaldo(valor);
                }
            } else if (tipo == 2) {
                if (clienteTransferencia.getContaPoupanca().getConta().equals(conta)) {
                    clienteTransferencia.getContaPoupanca().sumSaldo(valor);
                    clienteTransferencia.getContaPoupanca().subSaldo(valor);
                }
            }
        }
    }
}
