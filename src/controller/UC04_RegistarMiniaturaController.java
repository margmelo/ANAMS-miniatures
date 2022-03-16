/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Empresa;
import model.Escala;
import model.Funcionario;
import model.Miniatura;
import model.PrecoMiniatura;
import model.Tipo;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class UC04_RegistarMiniaturaController {

    /**
     * A Empresa
     */
    private final Empresa empresa;

    /**
     * A Miniatura
     */
    private Miniatura miniatura;

    /**
     * A Escala
     */
    private Escala escala;

    /**
     * O Preço da Miniatura
     */
    private PrecoMiniatura pM;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa A empresa
     */
    public UC04_RegistarMiniaturaController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Cria uma nova Miniatura
     *
     * @return A nova miniatura
     */
    public Miniatura novaMiniatura() {
        this.miniatura = empresa.getRegItem().novaMiniatura();
        return this.miniatura;
    }

    /**
     * Modifica os dados de uma Miniatura
     *
     * @param desig A designação da miniatura
     * @param marca A marca da miniatura
     * @param mailFab O e-mail do fabricante da miniatura
     * @param cor A cor da miniatura
     * @param material O material da miniatura
     * @param ano O ano da miniatura
     * @param tipo O tipo da miniatura
     * @param taxaIVA A taxa de IVA aplicada ao preço da miniatura
     */
    public void setDados(String desig, String marca, String mailFab,
            String cor, String material, int ano, int tipo,
            double taxaIVA) {
        setDesig(desig);
        setMarca(marca);
        setMailFab(mailFab);
        setCor(cor);
        setMaterial(material);
        setAno(ano);
        setTipo(tipo);
        setTaxaIVA(taxaIVA);
        setFuncionario(empresa.getFuncionario());
    }

    /**
     * Modifica a designacao da Miniatura
     *
     * @param desig A designação
     */
    public void setDesig(String desig) {
        this.miniatura.setDesig(desig);
    }

    /**
     * Modifica a marca da Miniatura
     *
     * @param marca A marca
     */
    public void setMarca(String marca) {
        this.miniatura.setMarca(marca);
    }

    /**
     * Modifica o email do Fabricante da Miniatura
     *
     * @param mailFab O email do fabricante
     */
    public void setMailFab(String mailFab) {
        this.miniatura.setMailFab(mailFab);
    }

    /**
     * Modifica a cor da Miniatura
     *
     * @param cor A cor
     */
    public void setCor(String cor) {
        this.miniatura.setCor(cor);
    }

    /**
     * Modifica o material da Miniatura
     *
     * @param material O material
     */
    public void setMaterial(String material) {
        this.miniatura.setMaterial(material);
    }

    /**
     * Modifica o ano da Miniatura
     *
     * @param ano O ano
     */
    public void setAno(int ano) {
        this.miniatura.setAno(ano);
    }

    /**
     * Modifica o tipo da Miniatura
     *
     * @param opTipo A opção numérica associada ao tipo
     */
    public void setTipo(int opTipo) {
        Tipo tipo = empresa.procurarTipo(opTipo);
        this.miniatura.setTipo(tipo);
    }

    /**
     * Modifica a taxa de iva da Miniatura
     *
     * @param taxaIVA A taxa de IVA aplicada
     */
    public void setTaxaIVA(double taxaIVA) {
        this.miniatura.setTaxaIVA(taxaIVA);
    }

    /**
     * Modifica funcionario da Miniatura
     *
     * @param funcionario O funcionário
     */
    public void setFuncionario(Funcionario funcionario) {
        this.miniatura.setFuncionario(funcionario);
    }

    /**
     * Devolve a lista de tipos de Miniatura da Empresa
     */
    public void getListaTipos() {
        this.empresa.getListaTiposAsString();
    }

    /**
     * Devolve a lista de escalas de Miniatura da Empresa
     */
    public void getListaEscalas() {
        this.empresa.getListaEscalasAsString();
    }

    /**
     * Regista a Miniaturas na Empresa
     *
     * @return O registo da miniatura
     */
    public boolean registaMiniatura() {
        return this.empresa.getRegItem().registarMiniatura(this.miniatura);
    }

    /**
     * Devolve as caracteristicas de uma Miniatura
     *
     * @return As características da miniatura
     */
    public String getMiniaturaAsString() {
        return this.miniatura.toStringCompleto();
    }

    /**
     * Constroi um nova instancia de PrecoMiniatura
     *
     * @param preco O preço inserido
     *
     * @return pM O preço aplicado à miniatura
     */
    public PrecoMiniatura novoPrecoMiniatura(double preco) {
        this.pM = empresa.novoPrecoMiniatura(this.miniatura, this.escala, preco);
        return pM;
    }

    /**
     * Devolve uma escala dada uma opcao
     *
     * @param opEscala A opção inserida
     *
     * @return escala A escala associada à opção inserida
     */
    public Escala procurarEscala(int opEscala) {
        this.escala = empresa.procurarEscala(opEscala);
        return this.escala;
    }

    /**
     * Devolve a escala da miniatura
     *
     * @return A escala da miniatura
     */
    public int getEscala() {
        return this.escala.getEscala();
    }

    /**
     * Procura o preço associado a uma miniatura
     */
    public void procurarPrecoMiniatura() {
        empresa.procurarPrecoMiniatura(this.miniatura);
    }

    /**
     * Adiciona um novo preco de Miniatura à empresa
     */
    public void adicionarPrecoMiniatura() {
        empresa.addPrecoMiniatura(this.pM);
    }
}
