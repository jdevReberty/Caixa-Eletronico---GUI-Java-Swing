/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Backend.Client.Cliente;
import java.util.List;

/**
 *
 * @author Digim
 */
public class AuthLogin {
    

    public static Cliente autenticar(List<Cliente> listaCliente, String cpf, String senha) {
        Cliente cliente_selecionado = null;
        
        System.out.println(listaCliente.isEmpty());
        
        for(Cliente cliente: listaCliente){
            if(cliente.getCpf().equals(cpf) && cliente.getContaCorrente().getSenha().equals(senha)) {
                cliente_selecionado = cliente;
                break;
            }
        }
        
        return cliente_selecionado;
    }
}
