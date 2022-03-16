/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Empresa;
import model.Funcionario;
import model.Acessorio;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class UC11_RegistarAcessorioController {

    /**
     * A Empresa
     */
    private final Empresa empresa;
    
    /**
     * A Miniatura
     */
    private Acessorio acessorio;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa
     * @param regItem
     * 
     */
    public UC11_RegistarAcessorioController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Cria um novo Acessorio
     *
     * @return O novo acessório
     *
     */
    public Acessorio novoAcessorio() {
        this.acessorio = empresa.getRegItem().novoAcessorio();
        return this.acessorio;
    }

    /**
     * Modifica os dados do Acessório
     *
     * @param desig A designação
     * @param marca A marca
     * @param mailFab O email do fabricante
     * @param precoAcess O preço
     * @param taxaIVA A Taxa de IVA aplicada
     */
    public void setDados(String desig, String marca, String mailFab, double precoAcess, float taxaIVA) {
        setRef();
        setDesig(desig);
        setMarca(marca);
        setMailFab(mailFab);
        setTaxaIVA(taxaIVA);
        setPrecoAcess(precoAcess);
        setFuncionario(this.empresa.getFuncionario());
    }

    /**
     * Modifica a referência do Acessório
     *
     */
    public void setRef() {
        this.acessorio.setRef();
    }

    /**
     * Modifica a designacao do Acessório
     *
     * @param desig A designação 
     */
    public void setDesig(String desig) {
        this.acessorio.setDesig(desig);
    }

    /**
     * Modifica a marca do Acessório
     *
     * @param marca A marca
     */
    public void setMarca(String marca) {
        this.acessorio.setMarca(marca);
    }

    /**
     * Modifica o identificador do Fabricante do Acessorio
     *
     * @param mailFab O endereço de email do fabricante
     */
    public void setMailFab(String mailFab) {
        this.acessorio.setMailFab(mailFab);
    }

    /**
     * Modifica a taxa de IVA do acessório
     *
     * @param taxaIVA A taxa de IVA aplicada
     */
    public void setTaxaIVA(float taxaIVA) {
        this.acessorio.setTaxaIVA(taxaIVA);
    }

    /**
     * Modifica o preço do acessório
     *
     * @param precoAcess O preço
     */
    public void setPrecoAcess(double precoAcess) {
        this.acessorio.setPrecoAcess(precoAcess);
    }

    /**
     * Modifica o funcionário do acessório
     *
     * @param funcionario O funcionário
     */
    public void setFuncionario(Funcionario funcionario) {
        this.acessorio.setFuncionario(funcionario);
    }

    /**
     * Devolve a lista de Acessórios da Empresa
     *
     */
    public void getListaAcessorios() {
        this.empresa.getRegItem().getListaAcessoriosAsString();
//        this.empresa.getListaAcessoriosAsString();
    }

    /**
     * Regista o Acessório na Empresa
     *
     * @return O registo do acessório
     */
    public boolean registaAcessorio() {
        return this.empresa.getRegItem().registarAcessorio(this.acessorio);
    }

    /**
     * Devolve as caracteristicas de uma Miniatura
     *
     * @return As características da Miniatura
     */
    public String getAcessorioAsString() {
        return this.acessorio.toStringCompleto();
    }

}
