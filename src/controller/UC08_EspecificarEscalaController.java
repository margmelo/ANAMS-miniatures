/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Empresa;
import model.Escala;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC08_EspecificarEscalaController {

    /**
     * A Empresa
     */
    private final Empresa empresa;
    
    /**
     * A Escala
     */
    private Escala escala;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa A empresa
     *
     */
    public UC08_EspecificarEscalaController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Adiciona um novo tipo de Escala à Empresa
     *
     *
     * @return 
     */
    public boolean registarEscala() {
        return empresa.registaEscala(this.escala);
        //empresa.adicionarEscala(this.escala);
    }

    /**
     * Regista uma nova escala à empresa
     * 
     * @return A escala registada
     */
    public Escala novaEscala(){
        this.escala = empresa.novaEscala();
        return this.escala;
    }
    
    /**
     * Atribui uma escala
     * 
     * @param escala 
     */
    public void setDados(int escala){
        this.escala.setEscala(escala);
    }
    
    /**
     * Devolve a lista de escalas de Miniatura da Empresa
     *
     * @return A lista de escalas
     */
    public String getEscalaAsString() {
        return this.escala.toString();
    }

}
