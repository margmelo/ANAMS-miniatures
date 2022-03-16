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
public class Notificacao {

    /**
     * O destinatário da notificação
     */
    private String destinatario;

    /**
     * A mensagem da notificação
     */
    private String mensagem;

    /**
     * Constrói uma instancia de miniatura com prâmetros
     *
     * @param destinatario
     * @param mensagem
     */
    public Notificacao(String destinatario) {
        this.destinatario = destinatario;
        this.mensagem = " ";
    }

    /**
     * Envia uma mensagem quando a encomenda está pronta
     */
    public void setMensagemPronto() {
        this.mensagem = "A sua encomenda está pronta. Será entregue brevemente.";
    }

    /**
     * Envia uma mensagem com a referência bancária
     */
    public void setMensagemReferencia() {
        this.mensagem = "A referência bancária para o pagamento.";
    }

    /**
     * Envia uma mensagem com a password de um determinado cargo
     */
    public void setMensagemPassword(int pass, String sigla) {
        this.mensagem = "A sua password para o cargo de " + sigla + " é: " + pass;
    }

    /**
     * Envia uma mensagem com a password quando o novo cliente é registado
     */
    public void setMensagemCliente(int pass) {
        this.mensagem = "Bem vindo! A sua password é: " + pass;
    }

    /**
     * Devolve as características da notificação
     *
     * @return
     */
    public String toString() {
        return "Destinatario: " + destinatario + "\nMensagem: " + mensagem;
    }

}
