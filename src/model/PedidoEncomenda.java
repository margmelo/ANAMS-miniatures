/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class PedidoEncomenda {

    /**
     * A compra de pedido de Encomenda
     *
     */
    private int codigo;

    /**
     * A compra de pedido de Encomenda
     *
     */
    private static int contadorEncomendas = 0;

    /**
     * A compra de pedido de Encomenda
     *
     */
    private Compra compra;

    /**
     * O estado de pedido de Encomenda
     *
     */
    public String estado;

    /**
     * A data de pedido de Encomenda
     *
     */
    private Date dataPedidoEncomenda;

    /**
     * Constroi uma instância Pedido de Encomenda sem parametros
     *
     */
    public PedidoEncomenda() {
    }

    /**
     * Constroi uma instância Pedido de Encomenda com parametros
     *
     * @param opEstado
     * @param dataPedidoEncomenda
     * @param compra
     *
     */
    public PedidoEncomenda(int opEstado, Date dataPedidoEncomenda, Compra compra) {
        codigo = contadorEncomendas + 1;
        contadorEncomendas = contadorEncomendas + 1;
        setEstado(opEstado);
        this.dataPedidoEncomenda = dataPedidoEncomenda;
        this.compra = compra;
    }

    /**
     * Modifica o estado de um pedido de Encomenda
     *
     * @param opEstado
     */
    public void setEstado(int opEstado) {
        if (opEstado == 1) {
            this.estado = "Enviado para o Fornecedor";
        } else if (opEstado == 2) {
            this.estado = "Pronto";
        } else if (opEstado == 3) {
            this.estado = "Cancelado";
        }
    }

    /**
     * Devolve o estado de um pedido de Encomenda
     *
     * @return estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Devolve a compra de um pedido de Encomenda
     *
     * @return compra
     */
    public Compra getCompra() {
        return compra;
    }

    /**
     * Modifica a compra de um pedido de Encomenda
     *
     * @param compra
     */
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    /**
     * Devolve a data do pedido de um pedido de Encomenda
     *
     * @return dataPedidoEncomenda
     */
    public Date getDataPedidoEncomenda() {
        return dataPedidoEncomenda;
    }

    /**
     * Modifica a data de um pedido de Encomenda
     *
     * @param dataPedidoEncomenda
     */
    public void setDataPedidoEncomenda(Date dataPedidoEncomenda) {
        this.dataPedidoEncomenda = dataPedidoEncomenda;
    }

    /**
     * Devolve as características do Pedido de encomenda
     *
     * @return As características do Pedido de encomenda
     */
    public String toString() {
        return "\nENCOMENDA:" + " Compra: " + compra + "\nEstado=" + estado + "\nData do pedido de Encomenda: " + dataPedidoEncomenda;
    }

}
