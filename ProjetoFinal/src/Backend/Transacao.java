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

    /* -------------------------------------------------------------------------- */
    /*                             Bloco de Depositar                             */
    /* -------------------------------------------------------------------------- */
    public void depositar(List<Cliente> listaCliente, String conta, double valor) {
        Cliente clienteSele = null; 
        try {
            clienteSele = checarClienteContaCorrente(listaCliente, conta, valor);
            if (clienteSele != null) {
                clienteSele.getContaCorrente().sumSaldo(valor);
            } else {
                throw new NullPointerException("Conta não encontrada!");
            }
        } catch (Exception e) {
            e.printStackTrace();
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

    /* -------------------------------------------------------------------------- */
    /*                               Bloco de Sacar                               */
    /* -------------------------------------------------------------------------- */
    public void sacar(Cliente cliente, double valor) {
        this.setCliente(cliente);
        try {
            if (this.cliente.getContaCorrente().getSaldo() >= valor) {
                this.cliente.getContaCorrente().subSaldo(valor);
            } else {
                throw new ArithmeticException("Saldo Insuficiente!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }

    /* -------------------------------------------------------------------------- */
    /*           Bloco de Transferir Conta corrente para conta corrente           */
    /* -------------------------------------------------------------------------- */
    public void transferir(List<Cliente> listaCliente, Cliente cliente, String conta, double valor) {
        this.setCliente(cliente);
        try {
            Cliente clienteFinal = null;

            for (Cliente clienteTransferencia : listaCliente) {
                if (clienteTransferencia.getContaCorrente().getConta().equals(conta)) {
                    clienteFinal = clienteTransferencia;
                    break;
                }
            }

            if(clienteFinal == null) {
                throw new NullPointerException("Cliente não encontrado");
            } 

            clienteFinal.getContaCorrente().sumSaldo(valor);
            cliente.getContaCorrente().subSaldo(valor);
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }

    /* -------------------------------------------------------------------------- */
    /*                            *Guardar e resgatar*                            */
    /* -------------------------------------------------------------------------- */
    public void guardar(Cliente cliente, double valor) {
        try {
            if(cliente.getContaPoupanca().getSaldo() == 0) {
                throw new ArithmeticException("Não há saldo para resgatar");
            }

            if(cliente.getContaPoupanca().getSaldo() >= valor) {
                cliente.getContaPoupanca().subSaldo(valor);
                cliente.getContaCorrente().sumSaldo(valor);
            } else {
                throw new ArithmeticException("O valor solicitado é superior ao saldo!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void resgatar(Cliente cliente, double valor) {
        try {
            if(cliente.getContaCorrente().getSaldo() == 0) {
                throw new ArithmeticException("Não há saldo para guardar");
            }

            if(cliente.getContaCorrente().getSaldo() >= valor) {
                cliente.getContaCorrente().subSaldo(valor);
                cliente.getContaPoupanca().sumSaldo(valor);
            } else {
                throw new ArithmeticException("O valor solicitado é superior ao saldo!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
