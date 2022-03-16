/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Empresa;
import model.Funcionario;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class UC14_RegistarFuncionarioController {

    /**
     * A Empresa
     */
    private final Empresa empresa;

    /**
     * O Funcionario
     */
    private Funcionario funcionario;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa A empresa
     */
    public UC14_RegistarFuncionarioController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Cria um novo Funcionario
     *
     * @return funcionario Novo funcionário
     */
    public Funcionario novoFuncionario() {
        this.funcionario = empresa.novoFuncionario();
        return this.funcionario;
    }

    /**
     * Modifica os dados de um Funcionario
     *
     * @param nome
     * @param nif
     * @param endPostal
     * @param mail
     * @param telef
     */
    public void setDados(String nome, String nif, String endPostal, String mail, String telef) {
        this.funcionario.setNome(nome);
        this.funcionario.setEndPostal(endPostal);
        this.funcionario.setMail(mail);
        this.funcionario.setNIF(nif);
        this.funcionario.setTelef(telef);
    }

    /**
     * Regista o Funcionario
     *
     * @return
     */
    public boolean registaFuncionario() {
        return this.empresa.registaFuncionario(this.funcionario);
    }

    /**
     * Devolve as caracteristicas do Cliente
     *
     * @return As características do cliente
     */
    public String getFuncionarioAsString() {
        return this.funcionario.toString();
    }

    /**
     * Devolve a lista de funcionarios da Empresa
     *
     * @return A lista de Funcionarios
     */
    public List<Funcionario> getListaFuncionarios() {
        return this.empresa.getListaFuncionarios();
    }

    /**
     * Compara os dados de e-mail e password inseridos de modo a fazer o login
     * do funcionário na plataforma
     *
     * @param mail O email inserido
     * @param password A password inserida
     * @return O funcionário entra no sistema
     */
    public int comparaDados(String mail, int password) {
        int login = -1;
        for (int i = 0; i < empresa.getListaFuncionarioCargo().size(); i++) {
            Funcionario f = empresa.getListaFuncionarioCargo().get(i).getFuncionario();
            if (f.getMail().equalsIgnoreCase(mail)) {
                if (empresa.getListaFuncionarioCargo().get(i).getPassword() == password) {
                    login = i;
                }
            }
        }
        if (login != -1) {
            empresa.setFuncionario(empresa.getListaFuncionarioCargo().get(login).getFuncionario());
        }
        return login;
    }

}
