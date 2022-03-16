/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Empresa;
import model.Miniatura;
import model.RegistoItens;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class UC02_VerListaController {

    /**
     * A Empresa
     */
    private final Empresa empresa;
    
    /**
     * O Registo de Itens
     */
    private RegistoItens regItem;

    /**
     * A Miniatura
     */
    private Miniatura miniatura;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa A empresa
     */
    public UC02_VerListaController(Empresa empresa) {
        this.regItem = empresa.getRegItem();
        this.empresa = empresa;
    }

    /**
     * Devolve a lista de Miniaturas da Empresa
     *
     */
    public void listarMiniaturas() {
        this.regItem.getListaMiniaturaAsStringBase();
    }

    /**
     * Devolve a Miniaturas escolhida a opcao
     *
     * @param op A opção escolhida
     * 
     * @return A miniatura associada à opção escolhida
     */
    public Miniatura procurarMiniatura(int op) {
        this.miniatura = regItem.procurarMiniatura(op);
        return this.miniatura;
    }

    /**
     * Procura o preço de uma determinada miniatura da empresa
     */
    public void procurarPrecoMiniatura() {
        empresa.procurarPrecoMiniatura(this.miniatura);
    }

    /**
     * Devolve a informação da miniatura
     * 
     * @return A informação da miniatura
     */
    public String getMiniaturaAsString() {
        return this.miniatura.toStringCompleto();
    }

}
