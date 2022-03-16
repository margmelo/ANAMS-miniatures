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
 */
public class Cargo {

    /**
     * A designação do Cargo
     */
    private String designacao;

    /**
     * A sigla do Cargo
     */
    private String sigla;

    /**
     * Constroi uma instância de cargo
     *
     * @param sigla
     * @param designacao
     *
     */
    public Cargo(String designacao, String sigla) {
        this.setDesignacao(designacao);
        this.setSigla(sigla);
    }

    /**
     * Construtor vazio
     *
     */
    public Cargo() {
    }

    /**
     * Devolve a designação do cargo
     *
     * @return A designação
     */
    public String getDesignacao() {
        return this.designacao;
    }

    /**
     * Devolve a Sigla do cargo
     *
     * @return A Sigla
     */
    public String getSigla() {
        return this.sigla;
    }

    /**
     * Modifica a designação do cargo
     *
     * @param desig
     */
    public void setDesignacao(String desig) {
        this.designacao = desig;
    }

    /**
     * Modifica a Sigla do cargo
     *
     * @param sigla
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * Validação local dos dados do Cargo
     *
     * @return
     */
    public boolean valida() {
        boolean certo = true;
        if (this.designacao.length() <= 0) {
            certo = false;
        } else if (this.sigla.length() >= 3 || this.sigla.length() <= 0) {        // no maximo 3 letras por sigla
            certo = false;
        }
        return certo;
    }

    /*
     * Devolve as caracteristicas de um Cargos
     *
     * @return sb
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Cargo: " + designacao + "\n");
        sb.append("Sigla: " + sigla + "\n");
        return sb.toString();
    }

}
