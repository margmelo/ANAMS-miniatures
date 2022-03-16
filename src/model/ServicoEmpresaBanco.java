/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public abstract class ServicoEmpresaBanco implements I_ServicoReferenciaBancaria {

    /**
     * A referência bancária
     *
     * É nula porque é um serviço subcontratado a outra empresa
     */
    private static String ref = null;

    /**
     * Constroi uma instância Pedido de Encomenda com parametros
     *
     */
    public ServicoEmpresaBanco() {
        this.ref = ref;
    }

    /**
     * Gera a referência bancária
     * 
     * @return a referência bancária
     */
    public String gerarReferenciaBancaria() {
        return ref;
    }
}
