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
public class Funcionario {

    /**
     * O nome do Funcionario
     */
    private String nome;

    /**
     * O NIF do Funcionario
     */
    private String NIF;

    /**
     * O nº de telefone do Funcionario
     */
    private String telef;

    /**
     * O endereço Postal do Funcionario
     */
    private String endPostal;

    /**
     * O mail do Funcionario
     */
    private String mail;

    /**
     * O codigo do Funcionario
     */
    private int codigo;

    /**
     * O contador de funcionarios
     */
    private static int contador = 0;

    /**
     * Constroi uma instância de Funcionario vazia
     *
     */
    public Funcionario() {
    }

    /**
     * Constroi uma instância de Funcionario
     *
     * @param nome
     * @param nif
     * @param endPostal
     * @param mail
     * @param telef
     *
     */
    public Funcionario(String nome, String nif, String endPostal, String mail, String telef) {
        this.setNome(nome);
        this.setNIF(nif);
        this.setEndPostal(endPostal);
        this.setMail(mail);
        this.setTelef(telef);
        this.setCodigo();
    }

    /**
     * Devolve o nº de telefone do funcionario
     *
     * @return telef
     */
    public String getTelef() {
        return telef;
    }

    /**
     * Devolve o mail do funcionario
     *
     * @return mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * Devolve o endereço Postal do funcionario
     *
     * @return endPostal
     */
    public String getEndPostal() {
        return endPostal;
    }

    /**
     * Devolve o nif do funcionario
     *
     * @return NIF
     */
    public String getNIF() {
        return NIF;
    }

    /**
     * Devolve o nome do funcionario
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve o codigo do funcionario
     *
     * @return codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Modifica o nome do funcionario
     *
     * @param nome
     */
    public final void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Modifica o nif do funcionario
     *
     * @param NIF
     */
    public final void setNIF(String NIF) {
        this.NIF = NIF;
    }

    /**
     * Modifica o endereco postal do funcionario
     *
     * @param endPostal
     */
    public final void setEndPostal(String endPostal) {
        this.endPostal = endPostal;
    }

    /**
     * Modifica o mail do funcionario
     *
     * @param mail
     */
    public final void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Modifica o telef do funcionario
     *
     * @param telef
     */
    public final void setTelef(String telef) {
        this.telef = telef;
    }

    /**
     * Modifica o codigo do funcionario
     */
    public final void setCodigo() {
        this.codigo = contador + 1;
        contador = contador + 1;
    }

    /**
     * Validação local dos dados do Funcionario
     *
     * @return
     */
    public boolean valida() {
        boolean certo = true;
        if (this.nome.length() <= 0) {
            certo = false;
        } else if (this.NIF.length() <= 0) {        // pode haver regras diferentes noutros paises
            certo = false;
        } else if (this.mail.length() <= 5) {
            certo = false;
        } else if (this.endPostal.length() <= 0) {
            certo = false;
        } else if (this.telef.length() <= 0) {       // pode haver regras diferentes noutros paises
            certo = false;
        }
        return certo;
    }

    /*
     * Devolve as caracteristicas de um Funcionario
     *
     * @return sb
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nome: " + nome + "\n");
        sb.append("Email: " + mail + "\n");
        sb.append("Telefone: " + telef + "\n");
        sb.append("Endereço Postal: " + endPostal + "\n");
        sb.append("NIF: " + NIF + "\n");
        return sb.toString();
    }

}
