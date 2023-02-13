package Backend.Response;

import java.util.List;

import Backend.Client.Cliente;

public class ResponseCliente {
    
    private Cliente cliente;
    private int status;
    private String messageException;
    private List<Cliente> listaClientes;

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public String getException() {
        return messageException;
    }
    public void setException(String exception) {
        this.messageException = exception;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public static ResponseCliente responseToCliente(Cliente cliente, int status, String messageException) {
        ResponseCliente response = new ResponseCliente();
        response.setCliente(cliente);
        response.setStatus(status);
        response.setException(messageException);
        return response;        
    }

    public static ResponseCliente responseToListCliente(List<Cliente> listaClientes, Cliente cliente, int status, String messageException) {
        ResponseCliente response = new ResponseCliente();
        response.setCliente(cliente);
        response.setStatus(status);
        response.setException(messageException);
        response.setListaClientes(listaClientes);

        return response;
    }
}
