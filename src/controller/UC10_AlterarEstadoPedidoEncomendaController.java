/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Compra;
import model.Empresa;
import model.Notificacao;
import model.PedidoEncomenda;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC10_AlterarEstadoPedidoEncomendaController {

    /**
     * A Empresa
     */
    private final Empresa empresa;

    /**
     * O pedido de Encomenda
     */
    private PedidoEncomenda pE;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa A empresa
     */
    public UC10_AlterarEstadoPedidoEncomendaController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Lista as encomendas da empresa
     */
    public void listarEncomendas() {
        empresa.listarEncomendas();
    }

    /**
     * Procura uma encomenda apartir da opção inserida
     *
     * @param op O opção inserida
     *
     * @return A encomenda associada à opção inserida
     */
    public PedidoEncomenda procurarEncomenda(int op) {
        this.pE = this.empresa.procurarEncomenda(op);
        return pE;
    }

    /**
     * Altera o estado da encomenda apartir da opção inserida
     *
     * @param opEstado A opção inserida
     */
    public void alterarEstadoEncomenda(int opEstado) {
        this.pE.setEstado(opEstado);
    }

    /**
     * Devolve o estado do Pedido de Encomenda
     *
     * @return O estado do pedido
     */
    public String getEstadoPedidoEncomenda() {
        return this.pE.getEstado();
    }

    /**
     * Devolve a compra
     *
     * @return A compra
     */
    public Compra getCompra() {
        return this.pE.getCompra();
    }

    /**
     * Devolve as características da compra
     *
     * @return As características da compra
     */
    public String getCompraAsStringBase() {
        return this.pE.getCompra().toStringBase();
    }

    /**
     * Envia a notificação com a atualização do estado do pedido de encomenda
     * para o endereço de email do cliente
     */
    public void enviarNotificacao() {
        Compra c = this.pE.getCompra();
        Notificacao not = new Notificacao(c.getCliente().getEmail());
        not.setMensagemPronto();
        JOptionPane.showMessageDialog(null, not.toString() + ": ", "EMAIL: ", JOptionPane.PLAIN_MESSAGE);
    }
}
