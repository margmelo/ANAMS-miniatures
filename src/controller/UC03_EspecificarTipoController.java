/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Empresa;
import model.Tipo;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class UC03_EspecificarTipoController {

    /**
     * A Empresa
     */
    private final Empresa empresa;

    /**
     * O Tipo
     */
    private Tipo tipo;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa A enpresa
     *
     */
    public UC03_EspecificarTipoController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Atribui um novo tipo à miniatura da empresa
     *
     * @return O novo tipo da miniatura
     */
    public Tipo novoTipo() {
        this.tipo = empresa.novoTipo();
        return this.tipo;
    }

    /**
     * Atribui uma designação a um Tipo
     *
     * @param desigTipo
     */
    public void setDados(String desigTipo) {
        this.tipo.setTipo(desigTipo);
    }

    /**
     * Adiciona um novo tipo à lista de tipos da empresa
     * @return 
     */
    public boolean registaTipo() {
        return this.empresa.registaTipo(this.tipo);
        //this.empresa.addTipo(this.tipo);
    }

    /**
     * Devolve a lista de Tipos de Miniatura da Empresa
     */
    public String getTipoAsString() {
        return this.tipo.toString();
    }

}
