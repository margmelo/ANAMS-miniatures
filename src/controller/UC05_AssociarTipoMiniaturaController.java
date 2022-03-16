/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Empresa;
import model.Miniatura;
import model.RegistoItens;
import model.Tipo;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class UC05_AssociarTipoMiniaturaController {

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
     * O Tipo
     */
    private Tipo tipo;


    /**
     * Constroi uma instancia de controller
     *
     * @param empresa A empresa
     */
    public UC05_AssociarTipoMiniaturaController(Empresa empresa) {
        this.empresa = empresa;
        this.regItem = empresa.getRegItem();
    }

    /**
     * Devolve a lista de Miniaturas da Empresa
     *
     */
    public void listarMiniaturas() {
        this.regItem.getListaMiniaturasAsString();
       // this.empresa.getListaMiniaturasAsString();
    }

    /**
     * Devolve a lista de tipos de Miniatura da Empresa
     *
     */
    public void listarTipos() {
        this.empresa.getListaTiposAsString();
    }

    /**
     * Devolve a Miniaturas escolhida a opcao
     *
     * @param op A opção inserida
     * 
     * @return A miniatura associada à opção escolhida
     */
    public Miniatura procurarMiniatura(int op) {
        this.miniatura = regItem.procurarMiniatura(op);
        //this.miniatura = empresa.procurarMiniatura(op);
        return this.miniatura;
    }

    /**
     * Devolve o tipo escolhida a opcao
     *
     * @param op A opção inserida
     * 
     * @return O tipo associado à opção inserida
     */
    public Tipo procurarTipo(int op) {
        this.tipo = empresa.procurarTipo(op);
        return this.tipo;
    }

    /**
     * Associa um tipo novo a uma Miniatura
     */
    public void associarTipo() {
        empresa.associarTipo(this.miniatura, this.tipo);
    }

    /**
     * Regista uma miniatura
     *
     * @return O registo da mniatura na empresa
     */
    public boolean registaMiniatura() {
        return this.empresa.getRegItem().registarMiniatura(this.miniatura);
    }

    /**
     * Devolve as caracteristicas de uma Miniatura
     *
     */
    public String getMiniaturaAsString() {
        return this.miniatura.toStringCompleto();
    }
    
    /**
     * Devolve as características do Tipo
     * 
     * @return 
     */
    public String getTipoAsString(){
        return this.tipo.toString();
    }
}
