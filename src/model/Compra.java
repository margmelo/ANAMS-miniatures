/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class Compra {

    /**
     * A lista de Itens de uma compra
     */
    private final List<I_Item> listaItens;

    /**
     * A lista de precos das Miniaturas de uma compra
     */
    private final List<PrecoMiniatura> listaPrecosMiniatura;

    /**
     * O Cliente da compra
     */
    private Cliente cliente;

    /**
     * A data de compra
     */
    private Date dataCompra;

    /**
     * O preco da compra
     */
    private double precoCompra;

    /**
     * O estado de pagamento da compra
     *
     * Assumiu-se que os pagamentos estão todos pagos para poder processar as
     * encomendas porque ainda não há caso de uso para mudar o estado de um
     * pagamento
     */
    private boolean pagamento = true;

    /**
     * Constroi instancia de Compra vazia
     */
    public Compra() {
        this.listaItens = new ArrayList<>();
        this.listaPrecosMiniatura = new ArrayList<>();
    }

    /**
     * Constroi instancia de Compra com o cliente
     *
     * @param cliente
     */
    public Compra(Cliente cliente) {
        this.listaItens = new ArrayList<>();
        this.listaPrecosMiniatura = new ArrayList<>();
        this.cliente = cliente;
        this.dataCompra = dataCompra;
        this.precoCompra = precoCompra;
        this.pagamento = pagamento;
    }

    /**
     * Devolve o cliente da compra
     *
     * @return cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Altera o cliente da compra
     *
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Altera a data da compra
     *
     * @param data
     */
    public void setDataCompra(Date data) {
        this.dataCompra = data;
    }

    /**
     * Devolve a lista de Itens da Compra
     *
     * @return listaItens
     */
    public List<I_Item> getListaItens() {
        return listaItens;
    }

    /**
     * Devolve a lista de Itens da Compra
     *
     * @return listaItens
     */
    public List<PrecoMiniatura> getListaPrecosMiniatura() {
        return listaPrecosMiniatura;
    }

    /**
     * Devolve a data da compra
     *
     * @return dataCompra
     */
    public Date getDataCompra() {
        return dataCompra;
    }

    /**
     * Devolve o preco da compra
     *
     * @return precoCompra
     */
    public double getPrecoCompra() {
        return precoCompra;
    }

    /**
     * Modifica o preco da compra
     *
     * @param precoCompra
     */
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    /**
     * Devolve o estado do pagamento da compra
     *
     * @return pagamento
     */
    public boolean isPagamento() {
        return pagamento;
    }

    /**
     * Modifica o estado de pagamento da compra
     *
     * @param pagamento
     */
    public void setPagamento(boolean pagamento) {
        this.pagamento = pagamento;
    }

    /**
     * Adiciona um item à compra
     *
     * @param item
     * @param qt
     */
    public void adicionarItemCompra(I_Item item, int qt) {
        for (int i = 0; i < qt; i++) {
            this.listaItens.add(item);
        }
    }

    /**
     * Apresenta a lista de itens da Compra
     *
     */
    public void listarCompra() {
        for (int i = 0; i < listaItens.size(); i++) {
            System.out.println((i + 1) + ". " + listaItens.get(i).toStringItem());
        }
    }

    /**
     * Devolve todas as caracteristicas de uma Compra
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Itens: " + listaItens + "\n");
        sb.append("Cliente: " + cliente + "\n");
        sb.append("Data de compra: " + dataCompra + "\n");
        sb.append("Pagamento: " + pagamento);
        return sb.toString();
    }

    /**
     * Devolve o cliente (nome e email) e a data de uma Compra
     *
     * @return
     */
    public String toStringBase() {
        StringBuffer sb = new StringBuffer();
        sb.append("Cliente: " + cliente.getNomeComp() + " - " + cliente.getEmail() + "\n");
        sb.append("Data de compra: " + dataCompra + "\n");
        return sb.toString();
    }

    /**
     * Adiciona o preço de uma miniatura à lista de preços
     * 
     * @param pM 
     */
    public void adicionarPMCompra(PrecoMiniatura pM) {
        this.listaPrecosMiniatura.add(pM);
    }

}
