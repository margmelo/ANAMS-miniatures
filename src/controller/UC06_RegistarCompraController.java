/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import javax.swing.JOptionPane;
import model.Acessorio;
import model.Compra;
import model.Empresa;
import model.I_Item;
import model.Miniatura;
import model.Notificacao;
import model.PrecoMiniatura;
import model.ServicoEmpresaBanco;

/**
 *
 * @author Dulce
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class UC06_RegistarCompraController {

    /**
     * A empresa
     */
    private Empresa empresa;

    /**
     * A compra
     */
    private Compra compra;

    /**
     * O item
     */
    private I_Item item;

    /**
     * A miniatura
     */
    private Miniatura miniatura;

    /**
     * O preço da miniatura
     */
    private PrecoMiniatura pM;

    /**
     * O acessório
     */
    private Acessorio acess;

    /**
     * Constroi uma instancia de controller
     *
     * @param empresa
     */
    public UC06_RegistarCompraController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Regista uma nova compra no sistema
     *
     * @return O registo da compra
     */
    public Compra novaCompra() {
        this.compra = this.empresa.novaCompra(empresa.getCliente());
        return this.compra;
    }

    /**
     * Devolve a lista de itens da empresa
     */
    public void getListaItens() {
        this.empresa.getListaItemAsStringBase();
    }

    /**
     * Procura um item na empresa apartir de uma opção inserida
     *
     * @param op A opção inserida
     *
     * @return O item associado à opção inserida
     */
    public I_Item procurarItem(int op) {
        this.item = empresa.procurarItem(op);
        return this.item;
    }

    /**
     * A quantidade de um detrminado Item a adicionar á compra
     *
     * @param qt A quantidade inserida
     */
    public void adicionarItemCompra(int qt) {
        this.compra.adicionarItemCompra(this.item, qt);
    }

    /**
     * A data de compra
     *
     * @param data A data
     */
    public void adicionarData(Date data) {
        this.compra.setDataCompra(data);
    }

    /**
     * Lista os itens da compra
     */
    public void listarCompra() {
        this.compra.listarCompra();
    }

    /**
     * Devolve o preço total da compra
     *
     * @return O preço total da compra
     */
    public double getPrecoCompra() {
        return this.compra.getPrecoCompra();
    }

    /**
     * Devolve a taxa de IVA aplicada a determinado item
     *
     * @return A tava de IVA aplicada
     */
    public double getTaxaIVA() {
        return this.item.getTaxaIVA();
    }

    /**
     * Guarda a informção da compra na empresa
     */
    public void guardarCompra() {
        this.empresa.guardarCompra(this.compra);
    }

    /**
     * Devolve as características do Item
     *
     * @return
     */
    public String getItemAsString() {
        return this.item.toStringItem();
    }

    /**
     * Procura o preço da Miniatura apartir da opção inserida
     *
     * @param op A opção inserida
     *
     * @return O preço associado à opção inserida
     */
    public PrecoMiniatura procurarPM(int op) {
        return empresa.procurarPMop(op);
    }

    /**
     * Procura o preço de uma miniatura
     *
     * @return O preço da miniatura
     */
    public PrecoMiniatura procurarPM() {
        this.pM = empresa.procurarPM((Miniatura) this.item);
        return pM;
    }

    /**
     * Adiciona o preço de uma miniatura à compra
     */
    public void adicionarPMCompra() {
        this.compra.adicionarPMCompra(this.pM);
    }

    /**
     * Procura o preço de uma miniatura
     */
    public void procurarPrecoMiniatura() {
        empresa.procurarPrecoMiniatura(this.miniatura);
    }

    /**
     * Recalcula o preço total de uma compra ao adicionar uma nova miniatura à
     * compra
     *
     * @param preco O preço da nova miniatura
     */
    public void adicionarPreco(double preco) {
        this.compra.setPrecoCompra(this.compra.getPrecoCompra() + preco);
    }

    /**
     * Gera uma notificação para o utilizador
     *
     */
    public void enviarNotificacao() {
        Notificacao not = new Notificacao(this.compra.getCliente().getEmail());
        not.setMensagemReferencia();
        ServicoEmpresaBanco sb = new ServicoEmpresaBanco() {
        };
        JOptionPane.showMessageDialog(null, not.toString() + ": " + sb.gerarReferenciaBancaria(), "EMAIL: ", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Verifica se o item é uma miniatura ou um acessório
     * 
     * @return
     */
    public int verificarItem() {
        int aux;
        if (this.item instanceof Miniatura) {
            this.miniatura = (Miniatura) item;
            aux = 1;
        } else {
            this.acess = (Acessorio) item;
            aux = 2;
        }
        return aux;
    }

    /**
     * Devolve o preço de um acessório
     * 
     * @return O preço de um acessório
     */
    public double getPrecoAcess() {
        return this.acess.getPrecoAcess();
    }
}
