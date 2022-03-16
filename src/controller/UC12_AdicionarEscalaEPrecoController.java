/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Empresa;
import model.Escala;
import model.Miniatura;
import model.PrecoMiniatura;
import model.RegistoItens;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class UC12_AdicionarEscalaEPrecoController {

    /**
     * A Empresa
     */
    private final Empresa empresa;

    /**
     * O Registo de Itens
     */
    private RegistoItens regItem;

    /**
     * O Preço da Miniatura
     */
    private PrecoMiniatura pM;

    /**
     * A Escala
     */
    private Escala escala;

    /**
     * A Miniatura
     */
    private Miniatura miniatura;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa A empresa
     *
     */
    public UC12_AdicionarEscalaEPrecoController(Empresa empresa) {
        this.empresa = empresa;
        this.regItem = empresa.getRegItem();
    }

    /**
     * Devolve a lista de Miniatura
     */
    public void listarMiniaturas() {
        regItem.getListaMiniaturaAsStringBase();
    }

    /**
     * Procura a miniatura apartir da opção inserida
     *
     * @param op A opção inserida
     * @return A miniatura correspondente
     */
    public Miniatura procurarMiniatura(int op) {
        this.miniatura = regItem.procurarMiniatura(op);
        return this.miniatura;
    }

    /**
     * Devolve a lista de escalas
     */
    public void getListaEscalasAsString() {
        empresa.getListaEscalasAsString();
    }

    /**
     * Procura a escala apartir da opção inserida
     *
     * @param op A opção inserida
     * @return A escala correspondente
     */
    public Escala procurarEscala(int op) {
        this.escala = empresa.procurarEscala(op);
        return this.escala;
    }

    /**
     * Devolve a escala
     *
     * @return A escala
     */
    public int getEscala() {
        return this.escala.getEscala();
    }

    /**
     * Cria um novo preço para uma determinada escala de uma determinada
     * miniatura
     *
     * @param preco O preço inserido
     * @return O preço da escala da miniatura
     */
    public PrecoMiniatura novoPrecoMiniatura(double preco) {
        this.pM = empresa.novoPrecoMiniatura(this.miniatura, this.escala, preco);
        return pM;
    }

    /**
     * Adiciona um novo preco de Miniatura à empresa
     */
    public void adicionarPrecoMiniatura() {
        empresa.addPrecoMiniatura(this.pM);
    }

    /**
     * Devolve as caracteristicas de uma Miniatura
     *
     * @return As características da miniatura
     */
    public String getMiniaturaAsString() {
        return this.miniatura.toStringItem();
    }

    /**
     * Procura o preço associado a uma miniatura
     */
    public void procurarPrecoMiniatura() {
        empresa.procurarPrecoMiniatura(this.miniatura);
    }

    /**
     * Devolve o Preço da Miniatura
     * 
     * @return 
     */
    public String getPrecoMiniatura() {
        return this.pM.toString();
    }
}
