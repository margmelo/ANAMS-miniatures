/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mruna
 */
public interface I_Item {
    
    /**
     * Características abreviadas do Item
     * 
     * @return 
     */
    public String toStringItem();
    
    /**
     * Validação dos parâmetros de item inseridos
     * 
     * @return 
     */
    public boolean valida();
    
    /**
     * Todas as características do item
     * @return 
     */
    public String toStringCompleto();

    /**
     * Devolve a taxa de IVA aplicada
     * 
     * @return 
     */
    public double getTaxaIVA();
    
}
