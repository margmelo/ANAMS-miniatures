/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * Dulce Mota <mdm@isep.ipp.pt>
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class Cliente {

    /**
     * O nome completo do Cliente
     */
    private String nomeComp;

    /**
     * O NIF do Cliente
     */
    private String NIF;

    /**
     * A data de Nascimento do Cliente
     */
    private Date dataNasc;

    /**
     * O contacto telefonico do Cliente
     */
    private String telef;

    /**
     * O email do Cliente
     */
    private String email;

    /**
     * O endereço postal
     */
    private String endPostal;

    //gerar password automaticamente
    private int password;

    /**
     * Constroi uma instância de Cliente vazia
     */
    public Cliente() {
    }

    /**
     * Constroi uma instância de Cliente com o nome completo, o NIF, a data de
     * Nascimento, o contacto telefonico e o email por parametro
     *
     * @param nomeComp o nome completo do cliente
     * @param NIF o nif do cliente
     * @param dataNasc a data de Nascimento do cliente
     * @param telef o contacto telefonico do cliente
     * @param email o email do cliente
     * @param endPostal o endereço postal do cliente
     * @param password a password do Cliente
     */
    public Cliente(String nomeComp, String NIF, Date dataNasc, String telef,
            String email, String endPostal, int password) {
        this.setNomeComp(nomeComp);
        this.setNIF(NIF);
        this.setDataNasc(dataNasc);
        this.setTelef(telef);
        this.setEmail(email);
        this.setEndPostal(endPostal);
        this.setPassword(password);
    }

    /**
     * Construtor cópia
     * 
     * @param c O Cliente a copiar
     */
    public Cliente(Cliente c) {
        this.setNomeComp(c.nomeComp);
        this.setNIF(c.NIF);
        this.setDataNasc(c.dataNasc);
        this.setTelef(c.telef);
        this.setEmail(c.email);
        this.setEndPostal(c.endPostal);
        this.setPassword(c.password);
    }

    /**
     * Modifica o nome completo do Cliente
     *
     * @param nomeComp O nome completo do Cliente
     */
    public final void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }

    /**
     * Modifica o NIF do Cliente
     *
     * @param NIF O NIF do Cliente
     */
    public final void setNIF(String NIF) {
        this.NIF = NIF;
    }

    /**
     * Modifica a data de Nascimento do Cliente
     *
     * @param dataNasc A data de Nascimento do Cliente
     */
    public final void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * Modifica o contacto telefonico do Cliente
     *
     * @param telef O contacto telefonico do Cliente
     */
    public final void setTelef(String telef) {
        this.telef = telef;
    }

    /**
     * Modifica o email do Cliente
     *
     * @param email O email do Cliente
     */
    public final void setEmail(String email) {
        this.email = email;
    }

    /**
     * Modifica o endereço Postal do Cliente
     *
     * @param endPostal o endereço de postal do cliente
     */
    public final void setEndPostal(String endPostal) {
        this.endPostal = endPostal;
    }

    /**
     * Modifica a pass do Cliente
     *
     * @param password a password do Cliente
     */
    public final void setPassword(int password) {
        this.password = password;
    }

    /**
     * Devolve o nome completo do Cliente
     *
     * @return O nomeComp do Cliente
     */
    public String getNomeComp() {
        return nomeComp;
    }

    /**
     * Devolve o NIF do Cliente
     *
     * @return O NIF do Cliente
     */
    public String getNIF() {
        return NIF;
    }

    /**
     * Devolve a data de Nascimento do Cliente
     *
     * @return A dataNasc do Cliente
     */
    public Date getDataNasc() {
        return dataNasc;
    }

    /**
     * Devolve o contacto telefonico do Cliente
     *
     * @return O telef do Cliente
     */
    public String getTelef() {
        return telef;
    }

    /**
     * Devolve o email do Cliente
     *
     * @return O email do Cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Devolve o endereço postal do Cliente
     *
     * @return o endereço postal do Cliente
     */
    public String getEndPostal() {
        return endPostal;
    }

    public int getPassword() {
        return password;
    }

    /**
     * Validação local dos dados do Cliente
     *
     * @return
     */
    public boolean valida() {
        boolean certo = true;
        if (this.nomeComp.length() <= 0) {
            certo = false;
        } else if (this.NIF.length() <= 0) {        // pode haver regras diferentes noutros paises
            certo = false;
        } else if (this.email.length() <= 5) {
            certo = false;
        } else if (this.endPostal.length() <= 0) {
            certo = false;
        } else if (this.telef.length() <= 0){       // pode haver regras diferentes noutros paises
            certo = false;
        }
        return certo;
    }

    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return this.nomeComp.equalsIgnoreCase(other.nomeComp)
                && this.NIF == other.NIF
                && this.dataNasc.equals(other.dataNasc)
                && this.email.equals(other.email)
                && this.endPostal.equalsIgnoreCase(other.endPostal)
                && this.telef == other.telef;
    }

    /**
     * Devolve as caracteristicas de um Cliente
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Nome completo: " + nomeComp + "\n");
        sb.append("NIF: " + NIF + "\n");
        sb.append("Data de nascimento:" + dataNasc + "\n");
        sb.append("Contacto telefónico: " + telef + "\n");
        sb.append("Endereço de email: " + email + "\n");
        sb.append("Endereço postal: " + endPostal + "\n");
        return sb.toString();
    }

}
