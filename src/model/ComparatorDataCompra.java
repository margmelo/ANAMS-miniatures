/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public abstract class ComparatorDataCompra implements Comparator<Compra> {

    /**
     * Ordena a lista de pedidos de encomenda com base na data
     *
     * @param a 
     * @param b
     * @return A lista de encomendas ordenadas
     */
    public int compare(Compra a, Compra b) {
        if (a.getDataCompra() == b.getDataCompra()) {
            return 0;
        } else if (a.getDataCompra().before(b.getDataCompra())) {
            return -1;
        } else {
            return 1;
        }
    }
}
