/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import model.Compra;
import model.Empresa;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC09_ProcessarPedidoEncomendaController {

    /**
     * A Empresa
     */
    private final Empresa empresa;

    /**
     * A Compra
     */
    private Compra compra;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa A empresa
     */
    public UC09_ProcessarPedidoEncomendaController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Lista as compras da empresa
     */
    public void listarCompras() {
        empresa.listarCompras();
    }

    /**
     * Procura a compra apartir da opção inserida
     *
     * @param op A opção inserida
     *
     * @return A compra associada à opção inserida
     */
    public Compra procurarCompra(int op) {
        this.compra = empresa.procurarCompra(op);
        return this.compra;
    }

    /**
     * Adiciona uma compra à lista de compras em processamento
     *
     * @param opEstado A opção selecionada associada ao estado da encomenda
     * @param data A data da encomenda
     */
    public void adicionarPedidoEncomenda(int opEstado, Date data) {
        empresa.adicionarPedidoEncomenda(this.compra, opEstado, data);
    }
}
