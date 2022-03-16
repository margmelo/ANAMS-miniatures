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

public class FuncionarioCargo {
    
    /**
     * A Miniatura
     *
     */
    private Funcionario funcionario;

    /**
     * A Escala
     *
     */
    private Cargo cargo;

    /**
     * O Preco
     *
     */
    private int password;

    /**
     * Construtor vazio
     *
     */
    public FuncionarioCargo() {
    }

    /**
     * Constroi uma instância Preço de Miniatura
     *
     * @param funcionario
     * @param cargo
     * @param password
     */
    public FuncionarioCargo(Funcionario funcionario, Cargo cargo, int password) {
        this.funcionario = funcionario;
        this.cargo = cargo;
        this.password = password;
    }

    /**
     * Devolve o funcionario 
     * 
     * @return 
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * Modifica o funcionario
     * 
     * @param funcionario
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * Devolve a cargo
     * 
     * @return cargo
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * Modifica o cargo
     * 
     * @param cargo
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    /**
     * Devolve o password
     * 
     * @return password
     */
    public int getPassword() {
        return password;
    }

    /**
     * Modifica o preço
     * 
     * @param password
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * Devolve as caracteristicas de um funcionario cargo
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Funcionario: " + funcionario + "\n");
        sb.append("Cargo: " + cargo.getDesignacao() + "]\n");
        sb.append("Password: " + password + "\n");
        return sb.toString();
    }
}
