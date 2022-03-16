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
public class PrecoMiniatura {

    /**
     * A Miniatura
     *
     */
    private Miniatura miniatura;

    /**
     * A Escala
     *
     */
    private Escala escala;

    /**
     * O Preco
     *
     */
    private double preco;

    /**
     * Construtor vazio
     *
     */
    public PrecoMiniatura() {
    }

    /**
     * Constroi uma instância Preço de Miniatura
     *
     * @param miniatura
     * @param escala
     * @param preco
     */
    public PrecoMiniatura(Miniatura miniatura, Escala escala, double preco) {
        this.miniatura = miniatura;
        this.escala = escala;
        this.preco = preco;
    }

    /**
     * Devolve a miniatura 
     * 
     * @return 
     */
    public Miniatura getMiniatura() {
        return miniatura;
    }

    /**
     * Modifica a miniatura
     * 
     * @param miniatura 
     */
    public void setMiniatura(Miniatura miniatura) {
        this.miniatura = miniatura;
    }

    /**
     * Devolve a escala
     * 
     * @return 
     */
    public Escala getEscala() {
        return escala;
    }

    /**
     * Modifica a escala
     * 
     * @param escala 
     */
    public void setEscala(Escala escala) {
        this.escala = escala;
    }

    /**
     * Devolve o preço 
     * 
     * @return 
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Modifica o preço
     * 
     * @param preco 
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Devolve as caracteristicas de um preco Miniatura
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Miniatura: " + miniatura + "\n");
        sb.append("Escala: [1:" + escala.getEscala() + "]\n");
        sb.append("Preço: " + preco + "€\n");
        return sb.toString();
    }

}
