/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Empresa;
import model.Cliente;
import model.Notificacao;

/**
 *
 * Dulce Mota <mdm@isep.ipp.pt>
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class UC01_RegistarClienteController {

    /**
     * A Empresa
     */
    private final Empresa empresa;

    /**
     * O Cliente
     */
    private Cliente cliente;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa A enpresa
     */
    public UC01_RegistarClienteController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Cria um novo Cliente
     *
     */
    public void novoCliente() {
        this.cliente = empresa.novoCliente();
    }

    /**
     * Modifica os dados de um Cliente
     *
     * @param nomeComp O nome completo do cliente
     * @param NIF O número de identificação fiscal do cliente
     * @param dataNasc A data de nascimento do cliente
     * @param telef O número de telefone do cliente
     * @param email
     * @param endPostal
     * @param password
     */
    public void setDados(String nomeComp, String NIF, Date dataNasc, String telef, String email, String endPostal, int password) {
        setNomeComp(nomeComp);
        setNIF(NIF);
        setDataNasc(dataNasc);
        setTelef(telef);
        setEmail(email);
        setEndPostal(endPostal);
        setPassword(password);
    }

    /**
     * Modifica o nome completo do Cliente
     *
     * @param nomeComp O nome completo do Cliente
     */
    public void setNomeComp(String nomeComp) {
        this.cliente.setNomeComp(nomeComp);
    }

    /**
     * Modifica o NIF do Cliente
     *
     * @param NIF O NIF do Cliente
     */
    public void setNIF(String NIF) {
        this.cliente.setNIF(NIF);
    }

    /**
     * Modifica a data de Nascimento do Cliente
     *
     * @param dataNasc A data de Nascimento do Cliente
     */
    public void setDataNasc(Date dataNasc) {
        this.cliente.setDataNasc(dataNasc);
    }

    /**
     * Modifica o contacto telefonico do Cliente
     *
     * @param telef O contacto telefonico do Cliente
     */
    public void setTelef(String telef) {
        this.cliente.setTelef(telef);
    }

    /**
     * Modifica o email do Cliente
     *
     * @param email O email do Cliente
     */
    public void setEmail(String email) {
        this.cliente.setEmail(email);
    }

    /**
     * Modifica o email do Cliente
     *
     * @param endPostal O endereço Postal do Cliente
     */
    public void setEndPostal(String endPostal) {
        this.cliente.setEndPostal(endPostal);
    }

    /**
     * Modifica a password do Cliente
     *
     * @param password A password Cliente
     */
    public void setPassword(int password) {
        this.cliente.setPassword(password);
    }

    /**
     * Devolve a lista de Clientes da Empresa
     *
     * @return a lista de Clientes
     */
    public List<Cliente> getListaClientes() {
        return this.empresa.getListaClientes();
    }

    /**
     * Regista o Cliente na Empresa
     *
     * @return o registo do cliente
     */
    public boolean registaCliente() {
        return this.empresa.registaCliente(this.cliente);
    }

    /**
     * Devolve as caracteristicas de um Cliente
     *
     * @return as características do cliente
     */
    public String getClienteAsString() {
        return this.cliente.toString();
    }

    /**
     * Verifica se há algum cliente registado com o endereço de email inserido,
     * e se a password inserida é a correta (atribuida automaticamente pelo
     * sistema anteriormente.
     *
     * @param email
     * @param password
     * @return login
     */
    public int compararDados(String email, int password) {
        int login = -1;
        for (int i = 0; i < empresa.getListaClientes().size(); i++) {
            Cliente c = empresa.getListaClientes().get(i);
            if (c.getEmail().equalsIgnoreCase(email)) {
                if (password == c.getPassword()) {
                    login = i;
                }
            }
        }
        if (login != -1) {
            empresa.setCliente(empresa.getListaClientes().get(login));
        }
        return login;
    }
    
    /**
     * Envia a notificação com a atualização a password do cliente
     */
    public void enviarNotificacao() {
        Notificacao not = new Notificacao(this.cliente.getEmail());
        int password = this.cliente.getPassword();
        not.setMensagemCliente(password);
        JOptionPane.showMessageDialog(null, not.toString() + ": ", "EMAIL: ", JOptionPane.PLAIN_MESSAGE);
    }
}
