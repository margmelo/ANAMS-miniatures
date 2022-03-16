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
 */
public class UC07_ConsultarMiniaturaFRPController {

    /**
     * A Empresa
     */
    private final Empresa empresa;
    
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
    public UC07_ConsultarMiniaturaFRPController(Empresa empresa) {
        this.empresa = empresa;
        this.regItem = empresa.getRegItem();
    }

    /**
     * Devolve a lista de tipos de Miniatura da Empresa
     *
     */
    public void listarMiniaturasBase() {
        this.regItem.getListaMiniaturaAsStringBase();
        //this.empresa.getListaMiniaturaAsStringBase();
    }

    /**
     * Devolve a Miniaturas escolhida a opcao
     *
     * @param op A opção inserida
     * @return A miniatura associada à opção inserida
     */
    public Miniatura procurarMiniatura(int op) {
        this.miniatura = regItem.procurarMiniatura(op);
        //this.miniatura = empresa.procurarMiniatura(op);
        return this.miniatura;
    }

    /**
     * Lista as miniatura associadas a um determinado funcionário
     */
    public void listarMiniaturasFRP() {
        this.empresa.listarMiniaturasFRP(empresa.getFuncionario());
    }

    /**
     * Procura o preço de uma miniatura
     */
    public void procurarPrecoMiniatura() {
        empresa.procurarPrecoMiniatura(this.miniatura);
    }

    /**
     * Devolve as características de uma miniatura
     *
     * @return As características da miniatura
     */
    public String getMiniaturaAsString() {
        return this.miniatura.toStringCompleto();
    }

}
