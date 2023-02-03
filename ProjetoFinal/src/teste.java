

import java.util.ArrayList;
import java.util.List;

import Backend.Transacao;
import Backend.Client.Cliente;
public class teste {
    
    public static void main(String[] args) {     
        List<Cliente> listaCliente = Cliente.criarVetorCliente();
        Transacao servico_transacao = new Transacao();

        listaCliente.stream().forEach(cliente -> {
            System.out.println(cliente.getContaCorrente().getSaldo());
            System.out.println(cliente.getNome());
            System.out.println("---------------------------");
        });

        listaCliente.stream().forEach(cliente -> {
            servico_transacao.depositar(listaCliente, cliente.getContaCorrente().getConta(), 200, 1);
        });

        listaCliente.stream().forEach(cliente -> {
            System.out.println(cliente.getContaCorrente().getSaldo());
            System.out.println(cliente.getNome());
            System.out.println("---------------------------");
        });
        listaCliente.stream().forEach(cliente -> {
            servico_transacao.sacar(cliente, 10, 1);
        });
        listaCliente.stream().forEach(cliente -> {
            System.out.println(cliente.getContaCorrente().getSaldo());
            System.out.println(cliente.getNome());
            System.out.println("---------------------------");
        });
        listaCliente.stream().forEach(cliente -> {
            servico_transacao.transferir(listaCliente, cliente,"958489-9", 10, 1);
        });
         listaCliente.stream().forEach(cliente -> {
            System.out.println(cliente.getContaCorrente().getSaldo());
            System.out.println(cliente.getNome());
            System.out.println("---------------------------");
        });
        

    }
}
