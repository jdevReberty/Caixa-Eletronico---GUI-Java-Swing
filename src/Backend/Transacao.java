package Backend;

import Backend.Client.Cliente;
import Backend.Response.ResponseCliente;

import java.util.List;

public class Transacao {

    private Cliente cliente;
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public Cliente getClienteDestinatario(List<Cliente> listaClientes, String conta) {
        for(Cliente clienteAtual : listaClientes) {
            if(clienteAtual.getContaCorrente().getConta().equals(conta)) {
                return clienteAtual;
            }
        }
        return null;
    }

    /* -------------------------------------------------------------------------- */
    /*                             Bloco de Depositar                             */
    /* -------------------------------------------------------------------------- */
    public ResponseCliente depositar(Cliente cliente, double valor, String senha) {
        this.setCliente(cliente);
        try {

            if(!cliente.getContaCorrente().getSenha().equals(senha)) {
                throw new StringIndexOutOfBoundsException("Senha incorreta!");
            }

            cliente.getContaCorrente().sumSaldo(valor);
            
            return ResponseCliente.responseToCliente(cliente, 200, "");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseCliente.responseToCliente(cliente, 403, e.getMessage());
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
    public ResponseCliente sacar(Cliente cliente, double valor, String senha) {
        this.setCliente(cliente);
        try {

            if (this.cliente.getContaCorrente().getSaldo() < valor) {
                throw new ArithmeticException("Saldo Insuficiente!");
            } 
            if(valor <= 0) {
                throw new ArithmeticException("O valor deve ser maior que 0!");
            }
            if(!cliente.getContaCorrente().getSenha().equals(senha)) {
                throw new StringIndexOutOfBoundsException("Senha incorreta!");
            }

            this.cliente.getContaCorrente().subSaldo(valor);

            return ResponseCliente.responseToCliente(this.cliente, 200, "");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseCliente.responseToCliente(this.cliente, 403, e.getMessage());
        }        
    }

    /* -------------------------------------------------------------------------- */
    /*           Bloco de Transferir Conta corrente para conta corrente           */
    /* -------------------------------------------------------------------------- */
    public ResponseCliente transferir(List<Cliente> listaCliente, Cliente cliente, String conta, String senha, double valorTransferencia) {
        this.setCliente(cliente);
        try {
            Cliente clienteFinal = this.getClienteDestinatario(listaCliente, conta);
            double saldoDisponivel = cliente.getContaCorrente().getSaldo();

            if(clienteFinal == null) {
                throw new NullPointerException("Não foi encontrado um destinatário com a conta: " + conta);
            }
            if(saldoDisponivel < valorTransferencia) {
                throw new ArithmeticException("Saldo insuficiente!");
            }
            if(!cliente.getContaCorrente().getSenha().equals(senha)) {
                throw new StringIndexOutOfBoundsException("Senha incorreta!");
            } 

            clienteFinal.getContaCorrente().sumSaldo(valorTransferencia);
            cliente.getContaCorrente().subSaldo(valorTransferencia);

            listaCliente = Cliente.updateList(listaCliente, cliente);

            return ResponseCliente.responseToListCliente(listaCliente, cliente, 200, "");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseCliente.responseToListCliente(listaCliente, cliente, 403, e.getMessage());
        }   
    }

    /* -------------------------------------------------------------------------- */
    /*                            *Guardar e resgatar*                            */
    /* -------------------------------------------------------------------------- */
    
    public ResponseCliente guardar(Cliente cliente, double valor, String senha) {
        this.setCliente(cliente);
        
        try {
            if(cliente.getContaCorrente().getSaldo() == 0) {
                throw new ArithmeticException("Não há saldo para guardar");
            }
            if(valor <= 0) {
                throw new ArithmeticException("O valor deve ser maior que 0!");
            }
            if(cliente.getContaCorrente().getSaldo() < valor) {
                throw new ArithmeticException("O valor solicitado é superior ao saldo!");
            }
            if(!cliente.getContaCorrente().getSenha().equals(senha)) {
                throw new StringIndexOutOfBoundsException("Senha incorreta!");
            }

            cliente.getContaCorrente().subSaldo(valor);
            cliente.getContaPoupanca().sumSaldo(valor);

            return ResponseCliente.responseToCliente(this.cliente, 200, "");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseCliente.responseToCliente(this.cliente, 403, e.getMessage());
        }
    }
    
    public ResponseCliente resgatar(Cliente cliente, double valor, String senha) {
        this.setCliente(cliente);

        try {
            if(cliente.getContaPoupanca().getSaldo() == 0) {
                throw new ArithmeticException("Não há saldo para resgatar");
            }
            if(valor <= 0) {
                throw new ArithmeticException("O valor deve ser maior que 0!");
            }
            if(cliente.getContaPoupanca().getSaldo() < valor) {
                throw new ArithmeticException("O valor solicitado é superior ao saldo!");
            }
            if(!cliente.getContaCorrente().getSenha().equals(senha)) {
                throw new StringIndexOutOfBoundsException("Senha incorreta!");
            }

            cliente.getContaPoupanca().subSaldo(valor);
            cliente.getContaCorrente().sumSaldo(valor);

            return ResponseCliente.responseToCliente(this.cliente, 200, "");

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseCliente.responseToCliente(this.cliente, 403, e.getMessage());
        }
    }
}
