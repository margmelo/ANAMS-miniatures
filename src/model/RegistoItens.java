/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */

public class RegistoItens {

    /**
     * A lista de acessórios da empresa
     */
    private final List<Acessorio> listaAcessorios;

    /**
     * A lista de miniaturas da empresa
     */
    private final List<Miniatura> listaMiniaturas;

    /**
     * A lista de itens da empresa
     */
    private final List<I_Item> listaItens;

    /**
     * Constroi uma instância de Registo de Acessorio
     *
     */
    public RegistoItens() {
        this.listaAcessorios = new ArrayList<>();
        this.listaMiniaturas = new ArrayList<>();
        this.listaItens = new ArrayList<>();
    }

    /**
     * Devolve a lista de acessorios da Empresa
     *
     * @return listaAcessorios
     */
    public List<Acessorio> getListaAcessorios() {
        return listaAcessorios;
    }

    /**
     * Devolve a lista de miniaturas da Empresa
     *
     * @return listaMiniaturas
     */
    public List<Miniatura> getListaMiniaturas() {
        return listaMiniaturas;
    }

    /**
     * Devolve a lista de itens da Empresa
     *
     * @return listaMiniaturas
     */
    public List<I_Item> getListaItens() {
        return listaItens;
    }

    /**
     * Constroi uma instância de Acessorio
     *
     * @return o acessorio
     */
    public Acessorio novoAcessorio() {
        return new Acessorio();
    }

    /**
     * Constroi uma instância de Acessorio
     *
     * @return o acessorio
     */
    public Miniatura novaMiniatura() {
        return new Miniatura();
    }

    /**
     * Adiciona uma Acessoório à lista de Acessórios comercializados pela da
     * Empresa
     *
     * @param acessorio Acessório a adicionar
     *
     * @return a lista atualizada
     */
    public boolean adicionarAcessorio(Acessorio acessorio) {
        return listaAcessorios.add(acessorio);
    }

    /**
     * Adiciona uma Miniatura à lista de Miniaturas comercializados pela da
     * Empresa
     *
     * @param miniatura a Miniatura a adicionar
     *
     * @return a lista atualizada
     */
    public boolean adicionarMiniatura(Miniatura miniatura) {
        return listaMiniaturas.add(miniatura);
    }

    /**
     * Apresenta a lista de Miniaturas
     *
     */
    public void getListaMiniaturaAsStringBase() {
        System.out.println("\nMINIATURAS: ");
        for (int i = 0; i < listaMiniaturas.size(); i++) {
            System.out.println((i + 1) + ". " + listaMiniaturas.get(i).toStringItem());
        }
    }

    /**
     * Devolve a lista de Tipos de Miniatura da Empresa
     *
     */
    public void getListaMiniaturasAsString() {
        System.out.println("\nMiniaturas: ");
        for (int i = 0; i < listaMiniaturas.size(); i++) {
            System.out.println((i + 1) + ". " + listaMiniaturas.get(i).toStringItem());
        }
    }

    /**
     * Apresenta a lista de acessorios
     *
     */
    public void getListaAcessoriosAsString() {
        System.out.println("\nAcessorios: ");
        for (int i = 0; i < listaAcessorios.size(); i++) {
            System.out.println((i + 1) + ". " + listaAcessorios.get(i));
        }
    }

    /**
     * Validação global dos dados do acessorio
     *
     * @param acessorio
     * @return
     */
    public boolean valida(Acessorio acessorio) {
        boolean bRet = true;
        if (acessorio.valida()) {

        } else {
            bRet = false;
        }
        return bRet;
    }

    /**
     * Validação global dos dados da Miniatura
     *
     * @param miniatura a Miniatura
     * @return
     */
    public boolean valida(Miniatura miniatura) {
        boolean bRet = true;
        if (miniatura.valida() == true) {

        } else {
            bRet = false;
        }
        return bRet;

    }

    /**
     * Adiciona a Acesssório à lista de Acessório caso a validação seja correta
     *
     * @param acessorio
     * @return
     */
    public boolean registarAcessorio(Acessorio acessorio) {
        if (this.valida(acessorio)) {
            adicionarItem(acessorio);
            return adicionarAcessorio(acessorio);
        } else {
            return false;
        }
    }

    /**
     * Adiciona a Miniatura à lista de Miniaturas caso a validação seja correta
     *
     * @param miniatura a Miniatura
     * @return
     */
    public boolean registarMiniatura(Miniatura miniatura) {
        if (this.valida(miniatura) == true) {
            adicionarItem(miniatura);
            return adicionarMiniatura(miniatura);
        } else {
            return false;
        }
    }

    /**
     * Adicionar um item à lista de itens da emoresa
     *
     * @param item O item a adicionar
     *
     * @return lista atualizada
     */
    public boolean adicionarItem(I_Item item) {
        return listaItens.add(item);
    }

    /**
     * Devolve a Miniatura que corresponde a uma opção escolhida
     *
     * @param op
     * @return a Miniatura
     */
    public Miniatura procurarMiniatura(int op) {
        Miniatura mini = getListaMiniaturas().get(op - 1);
        return mini;
    }
}
