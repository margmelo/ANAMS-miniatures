/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Empresa;
import model.Cargo;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC13_EspecificarCargoController {

    /**
     * A Empresa
     */
    private final Empresa empresa;

    /**
     * A Escala
     */
    private Cargo cargo;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa A empresa
     *
     */
    public UC13_EspecificarCargoController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Atribui um novo tipo à miniatura da empresa
     *
     * @return O novo tipo da miniatura
     */
    public Cargo novoCargo() {
        this.cargo = empresa.novoCargo();
        return this.cargo;
    }

    /**
     * Atribui os dados a um Cargo
     *
     * @param designacao
     * @param sigla
     */
    public void setDados(String designacao, String sigla) {
        this.cargo.setDesignacao(designacao);
        this.cargo.setSigla(sigla);
    }

    /**
     * Adiciona um novo cargo à lista de cargos da empresa
     * @return 
     */
    public boolean registaCargo() {
        return this.empresa.registaCargo(this.cargo);
        
    }

    /**
     * Devolve a lista de Tipos de Miniatura da Empresa
     *
     * @return
     */
    public String getCargoAsString() {
        return this.cargo.toString();
    }
}
