/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Empresa;
import model.Funcionario;
import model.Cargo;
import model.FuncionarioCargo;
import model.Notificacao;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class UC15_AssociarCargoFuncionarioController {

    /**
     * A Empresa
     */
    private final Empresa empresa;

    /**
     * O Funcionario
     */
    private Funcionario funcionario;

    /**
     * O Cargo
     */
    private Cargo cargo;

    /**
     * O Funcionario Cargo
     */
    private FuncionarioCargo fC;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa A empresa
     */
    public UC15_AssociarCargoFuncionarioController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Devolve a lista de Funcionarios da Empresa
     *
     */
    public void listarFuncionarios() {
        this.empresa.getListaFuncionariosAsString();
    }

    /**
     * Devolve a lista de cargos de funcionarios da Empresa
     *
     */
    public void listarCargos() {
        this.empresa.getListaCargosAsString();
    }

    /**
     * Devolve o Funcionario escolhida a opcao
     *
     * @param op A opção inserida
     *
     * @return O funcionario associada à opção escolhida
     */
    public Funcionario procurarFuncionario(int op) {
        this.funcionario = empresa.procurarFuncionario(op);
        return this.funcionario;
    }

    /**
     * Devolve o cargo escolhida a opcao
     *
     * @param op A opção inserida
     *
     * @return O cargo associado à opção inserida
     */
    public Cargo procurarCargo(int op) {
        this.cargo = empresa.procurarCargo(op);
        return this.cargo;
    }

    /**
     * Devolve as caracteristicas de um Funcionario
     *
     */
    public String getFuncionarioAsString() {
        return empresa.getFuncionarioAsString(this.funcionario);
    }

    /**
     * Devolve a lista de cargos
     *
     */
    public void getListaCargosAsString() {
        for (int i = 0; i < empresa.getListaFuncionarioCargo().size(); i++) {
            if (empresa.getListaFuncionarioCargo().get(i).getFuncionario() == this.funcionario) {
                System.out.println("-> " + empresa.getListaFuncionarioCargo().get(i).getCargo().getDesignacao());
            }
        }
    }

    /**
     * Devolve o Funcionário
     *
     * @return O funcionário
     */
    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    /**
     * Associa um novo cargo para um determinado funcionário
     *
     * @param password A password do novo cargo
     * @return Regista a nova função do funcionário
     */
    public FuncionarioCargo novoFuncionarioCargo(int password) {
        this.fC = empresa.novoFuncionarioCargo(this.funcionario, this.cargo, password);
        return fC;
    }

    /**
     * Adiciona um novo Cargo ao funcionário
     */
    public void adicionarFuncionarioCargo() {
        empresa.addFuncionarioCargo(this.fC);
    }

    /**
     * Devolve a lista de funcionarios da Empresa
     *
     * @return A lista de Funcionarios
     */
    public List<FuncionarioCargo> getListaFuncionarioCargo() {
        return this.empresa.getListaFuncionarioCargo();
    }

    /**
     * Envia a notificação com a atualização do estado do pedido de encomenda
     * para o endereço de email do cliente
     */
    public void enviarNotificacao() {
        Notificacao not = new Notificacao(this.funcionario.getMail());
        int password = this.fC.getPassword();
        String sigla = this.fC.getCargo().getSigla();
        not.setMensagemPassword(password, sigla);
        JOptionPane.showMessageDialog(null, not.toString() + ": ", "EMAIL: ", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Devolve o cargo do funcionário
     *
     * @return
     */
    public FuncionarioCargo getFuncionarioCargo() {
        return this.fC;
    }
}
