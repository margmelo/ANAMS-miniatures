/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * Dulce Mota <mdm@isep.ipp.pt>
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class Empresa {

    /**
     * A lista de Clientes da Empresa
     */
    private final List<Cliente> listaClientes;

    /**
     * Aclista de compras da empresa
     */
    private final List<Compra> listaCompras;

    /**
     * A lista de Tipos de Miniatura da Empresa
     */
    private final List<Tipo> listaTipos;

    /**
     * A lista de Funcionarios da empresa
     */
    private final List<Funcionario> listaFuncionarios;

    /**
     * A lista de pedidos de Encomenda da empresa
     */
    private final List<PedidoEncomenda> listaEncomendas;

    /**
     * A lista de Escalas das miniaturas da empresa
     */
    private final List<Escala> listaEscalas;

    /**
     * A lista dos precos das Miniaturas da empresa
     */
    private final List<PrecoMiniatura> listaPrecoMiniatura;

    /**
     * A lista de cargos de um determinado funcionário
     */
    private final List<FuncionarioCargo> listaFuncionarioCargo;

    /**
     * A lista dos cargos da empresa
     */
    private final List<Cargo> listaCargos;

    /**
     * O Funcionario atual
     */
    private Funcionario funcionario;

    /**
     * O Cliente atual
     */
    private Cliente cliente;

    /**
     * O Registo de um Item
     */
    private RegistoItens regItem;

    /**
     * Constroi uma instância de Empresa
     *
     */
    public Empresa() {
        this.regItem = new RegistoItens();
        this.cliente = new Cliente();
        this.funcionario = new Funcionario();
        this.listaClientes = new ArrayList<>();
        this.listaTipos = new ArrayList<>();
        this.listaCompras = new ArrayList<>();
        this.listaEncomendas = new ArrayList<>();
        this.listaEscalas = new ArrayList<>();
        this.listaPrecoMiniatura = new ArrayList<>();
        this.listaFuncionarioCargo = new ArrayList<>();
        this.listaFuncionarios = new ArrayList<>();
        this.listaCargos = new ArrayList<>();
    }

    /**
     * altera o registo item
     *
     * @param r
     */
    public void setRegItem(RegistoItens r) {
        this.regItem = r;
    }

    /**
     * devolve o Funcionario atual
     *
     * @return O funcionário atual
     */
    public RegistoItens getRegItem() {
        return this.regItem;
    }

    /**
     * altera o Funcionario atual
     *
     * @param f O funcionário atual
     */
    public void setFuncionario(Funcionario f) {
        this.funcionario = f;
    }

    /**
     * devolve o Funcionario atual
     *
     * @return O funcionário atual
     */
    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    /**
     * altera o Cliente atual
     *
     * @param c O cliente atual
     */
    public void setCliente(Cliente c) {
        this.cliente = c;
    }

    /**
     * devolve o cliente atual
     *
     * @return O cliente atual
     */
    public Cliente getCliente() {
        return this.cliente;
    }

    /**
     * Adiciona um Cliente à lista do Clientes da Empresa
     *
     * @param cliente o cliente a adicionar
     */
    public boolean adicionaCliente(Cliente cliente) {
        return listaClientes.add(cliente);
    }

    /**
     * Adicionar um item à lista de itens da emoresa
     *
     * @param item O item a adicionar
     *
     * @return lista atualizada
     */
    public boolean adicionarItem(I_Item item) {
        return getRegItem().getListaItens().add(item);
    }

    /**
     * Adiciona uma compra à lista de Compras da empresa
     *
     * @param compra A compra a adicionar
     *
     * @return A lista atualizada
     */
    public boolean adicionarCompra(Compra compra) {
        return listaCompras.add(compra);
    }

    /**
     * Adiciona uma escala à lista de escalas da empresa
     *
     * @param escala A escala a adicionar
     *
     * @return A lista atualizada
     */
    public boolean adicionarEscala(Escala escala) {
        return listaEscalas.add(escala);
    }

    /**
     * Devolve a lista de Clientes da Empresa
     *
     * @return a lista de Clientes
     */
    public List<Cliente> getListaClientes() {
        return this.listaClientes;
    }

    /**
     * Devolve a lista de Funcionarios Cargo
     *
     * @return a lista
     */
    public List<FuncionarioCargo> getListaFuncionarioCargo() {
        return this.listaFuncionarioCargo;
    }

    /**
     * Devolve a lista de escalas da Empresa
     *
     * @return a lista de escalas
     */
    public List<Escala> getListaEscalas() {
        return this.listaEscalas;
    }

    /**
     * /**
     * Devolve a lista de tipos de Miniatura da Empresa
     *
     * @return a lista de Tipos
     */
    public List<Tipo> getListaTipos() {
        return this.listaTipos;
    }

    /**
     * Devolve a lista de funcionarios da Empresa
     *
     * @return a lista de Funcionarios
     */
    public List<Funcionario> getListaFuncionarios() {
        return this.listaFuncionarios;
    }

    /**
     * Devolve a lista de Tipos de Miniatura da Empresa
     *
     */
    public void getListaTiposAsString() {
        System.out.println("\nTipos: ");
        for (int i = 0; i < listaTipos.size(); i++) {
            System.out.println((i + 1) + ". " + listaTipos.get(i));
        }
    }

    /**
     * Devolve a lista de Tipos de Miniatura da Empresa
     *
     */
    public void getListaCargosAsString() {
        System.out.println("\nCargos: ");
        for (int i = 0; i < listaCargos.size(); i++) {
            System.out.println((i + 1) + ". " + listaCargos.get(i));
        }
    }

    /**
     * Devolve a lista de Escalas de Miniatura da Empresa
     *
     */
    public void getListaEscalasAsString() {
        System.out.println("\nEscalas: ");
        for (int i = 0; i < listaEscalas.size(); i++) {
            System.out.println((i + 1) + ". " + listaEscalas.get(i));
        }
    }

    /**
     * Devolve a lista de Escalas de Miniatura da Empresa
     *
     */
    public void getListaFuncionariosAsString() {
        System.out.println("\nFuncionarios: ");
        for (int i = 0; i < listaFuncionarios.size(); i++) {
            System.out.println((i + 1) + ". " + listaFuncionarios.get(i));
        }
    }

    /**
     * Devolve a lista de Tipos de Miniatura da Empresa
     *
     */
    public void getListaAcessoriosAsString() {
        System.out.println("\nAcessorios: ");
        for (int i = 0; i < getRegItem().getListaAcessorios().size(); i++) {
            System.out.println((i + 1) + ". " + getRegItem().getListaAcessorios().get(i));
        }
    }


    /**
     * Devolve a lista de Miniatura da Empresa
     *
     * @return listaMiniaturas
     */
    public List<Miniatura> getListaMiniaturas() {
        return getRegItem().getListaMiniaturas();
    }

    /**
     * Devolve a lista de acessorios da Empresa
     *
     * @return listaAcessorios
     */
    public List<Acessorio> getListaAcessorios() {
        return getRegItem().getListaAcessorios();
    }

    /**
     * Devolve a lista de Itens da Empresa
     *
     * @return listaItem
     */
    public List<I_Item> getListaItens() {
        return getRegItem().getListaItens();
    }

    /**
     * Devolve a lista de Precos de Miniatura da Empresa
     *
     * @return listaFRE
     */
    public List<PrecoMiniatura> getListaPrecoMiniatura() {
        return listaPrecoMiniatura;
    }

    /**
     * Devolve a lista de Cargos da Empresa
     *
     * @return listaCargos
     */
    public List<Cargo> getListaCargo() {
        return listaCargos;
    }

    /**
     * Devolve o tipo de Miniatura que corresponde a uma opção escolhida
     *
     * @param opTipo
     * @return o tipo de Miniatura
     */
    public Tipo procurarTipo(int opTipo) {
        Tipo tipo = listaTipos.get(opTipo - 1);
        return tipo;
    }

    /**
     * Devolve a escala de Miniatura que corresponde a uma opção escolhida
     *
     * @param opEscala
     * @return a escala de Miniatura
     */
    public Escala procurarEscala(int opEscala) {
        Escala escala = listaEscalas.get(opEscala - 1);
        return escala;
    }

    /**
     * Devolve o item que corresponde a uma opção escolhida
     *
     * @param op
     * @return o item
     */
    public I_Item procurarItem(int op) {
        I_Item item = getRegItem().getListaItens().get(op - 1);
        return item;
    }


    /**
     * Devolve o Funcionario que corresponde a uma opção escolhida
     *
     * @param opFuncionario
     * @return funcionario
     */
    public Funcionario procurarFuncionario(int opFuncionario) {
        Funcionario funcionario = listaFuncionarios.get(opFuncionario - 1);
        return funcionario;
    }

    /**
     * Devolve a Compra que corresponde a uma opção escolhida
     *
     * @param op
     * @return a compra
     */
    public Compra procurarCompra(int op) {
        Compra compra = listaCompras.get(op - 1);
        return compra;
    }

    /**
     * Devolve a Encomenda que corresponde a uma opção escolhida
     *
     * @param op
     * @return a encomenda
     */
    public PedidoEncomenda procurarEncomenda(int op) {
        PedidoEncomenda pE = listaEncomendas.get(op - 1);
        return pE;
    }

    /**
     * Constroi uma instância de Cliente
     *
     * @return o cliente
     */
    public Cliente novoCliente() {
        return new Cliente();
    }

    /**
     * Constroi uma instância de tipo
     *
     * @return o tipo
     */
    public Tipo novoTipo() {
        return new Tipo();
    }

    /**
     * Constroi uma instância de escala
     *
     * @return a escala
     */
    public Escala novaEscala() {
        return new Escala();
    }

    /**
     * Constroi uma instância de papel
     *
     * @return a papel
     */
    public Cargo novoCargo() {
        return new Cargo();
    }

    /**
     * Constroi uma instancia de compra
     *
     * @return
     */
    public Compra novaCompra(Cliente cliente) {
        return new Compra(cliente);
    }

    /**
     * Constroi uma instância de funcionario
     *
     * @return o funcionario
     */
    public Funcionario novoFuncionario() {
        return new Funcionario();
    }

    /**
     * Constroi uma instância de Miniatura
     *
     * @return a miniatura
     */
    public Miniatura novaMiniatura() {
        return new Miniatura();
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
     * Validação global dos dados do Cliente
     *
     * @param cliente o Cliente
     * @return
     */
    public boolean valida(Cliente cliente) {
        boolean bRet = true;
        if (cliente.valida()) {

            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i).getEmail().equalsIgnoreCase(cliente.getEmail())) {
                    bRet = false;
                }
            }
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
        boolean bRet = false;
        if (miniatura.valida()) {
            // Escrever aqui o código de validação
            bRet = true;
        }
        return bRet = true;
    }

    /**
     * Validação global dos dados do acessorio
     *
     * @param acessorio
     * @return
     */
    public boolean valida(Acessorio acessorio) {
        boolean bRet = false;
        if (acessorio.valida()) {
            // Escrever aqui o código de validação
            bRet = true;
        }
        return bRet = true;
    }

    /**
     * Adiciona o Cliente à lista de Clientes caso a validação seja correta
     *
     * @param cliente o Cliente
     * @return
     */
    public boolean registaCliente(Cliente cliente) {
        if (this.valida(cliente) == true) {
            return adicionaCliente(cliente);
        } else {
            return false;
        }

    }

    /**
     * Adiciona a escala à lista de escala caso a validação seja correta
     *
     * @param escala
     * @return
     */
    public boolean registaEscala(Escala escala) {
        if (this.valida(escala) == true) {
            return adicionarEscala(escala);
        } else {
            return false;
        }

    }
    /**
     * Validação global dos dados da Escala
     *
     * @param e
     * @return
     */
    public boolean valida(Escala e) {
        boolean bRet = true;
        if (e.valida()) {
            for (int i = 0; i < listaEscalas.size(); i++) {
                if (listaEscalas.get(i).getEscala() == (e.getEscala())) {
                    bRet = false;
                }
            }
        } else {
            bRet = false;
        }
        return bRet;
    }

    /**
     * Adiciona o Cargo à lista de Cargos caso a validação seja correta
     *
     * @param c
     * @return
     */
    public boolean registaCargo(Cargo c) {
        if (this.valida(c) == true) {
            return addCargo(c);
        } else {
            return false;
        }

    }

    /**
     * Validação global dos dados do Cargo
     *
     * @param c
     * @return
     */
    public boolean valida(Cargo c) {
        boolean bRet = true;
        if (c.valida()) {

            for (int i = 0; i < listaCargos.size(); i++) {
                if (listaCargos.get(i).getDesignacao().equalsIgnoreCase(c.getDesignacao())) {
                    bRet = false;
                }
            }
        } else {
            bRet = false;
        }
        return bRet;
    }
    
        /**
     * Adiciona o Tipo à lista de Tipos caso a validação seja correta
     *
     * @param t
     * @return
     */
    public boolean registaTipo(Tipo t) {
        if (this.valida(t) == true) {
            return addTipo(t);
        } else {
            return false;
        }

    }

    /**
     * Validação global dos dados do Tipo
     *
     * @param t
     * @return
     */
    public boolean valida(Tipo t) {
        boolean bRet = true;
        if (t.valida()) {

            for (int i = 0; i < listaTipos.size(); i++) {
                if (listaTipos.get(i).getTipo().equalsIgnoreCase(t.getTipo())) {
                    bRet = false;
                }
            }
        } else {
            bRet = false;
        }
        return bRet;
    }

    /**
     * Adiciona o tipo de Miniatura à lista de Tipos da Empresa
     *
     * @param tipo o tipo
     * @return 
     */
    public boolean addTipo(Tipo tipo) {
        return listaTipos.add(tipo);
    }

    /**
     * Adiciona o tipo de Miniatura à lista de Tipos da Empresa
     *
     * @param cargo
     */
    public boolean addCargo(Cargo cargo) {
        return listaCargos.add(cargo);
    }

    /**
     * Altera o tipo de Miniatura de uma Miniatura da Empresa
     *
     * @param mini a miniatura a alterar
     * @param tipo o tipo a adicionar
     */
    public void associarTipo(Miniatura mini, Tipo tipo) {
        mini.setTipo(tipo);
    }

    /**
     * Devolve as caracteristicas de uma Miniatura
     *
     * @param funcionario
     * @return
     */
    public String getFuncionarioAsString(Funcionario funcionario) {
        return funcionario.toString();
    }

    /**
     * Devolve as caracteristicas de um Funcionario
     *
     * @param mini
     * @return
     */
    public String getMiniaturaAsString(Miniatura mini) {
        return mini.toString();
    }

    /**
     * Apresenta a lista de Miniaturas
     *
     */
    public void getListaMiniaturaAsStringBase() {
        System.out.println("\nMINIATURAS: ");
        for (int i = 0; i < getRegItem().getListaMiniaturas().size(); i++) {
            System.out.println((i + 1) + ". " + getRegItem().getListaMiniaturas().get(i).toStringItem());
        }
    }

    /**
     * Devolve as caracteristicas de um Item
     *
     * @param item
     * @return
     */
    public String getItemAsString(I_Item item) {
        return item.toString();
    }

    /**
     * Apresenta a lista de Itens
     *
     */
    public void getListaItemAsStringBase() {
        System.out.println("\nITENS: ");
        for (int i = 0; i < getRegItem().getListaItens().size(); i++) {
            System.out.println((i + 1) + ". " + getRegItem().getListaItens().get(i).toStringItem());
        }
    }

    /**
     * Adiciona um Funcionario à lista de Funcionarios da empresa
     *
     * @param f
     */
    public boolean adicionarFuncionario(Funcionario f) {
        return listaFuncionarios.add(f);
    }

    /**
     * Adiciona um Funcionario à lista de Funcionarios da empresa
     *
     * @param f
     */
    public void adicionaFuncionario(Funcionario f) {
        listaFuncionarios.add(f);
    }

    /**
     * Adiciona o Funcionario à lista de funcionarios caso a validação seja
     * correta
     *
     * @param f o funcionario
     * @return
     */
    public boolean registaFuncionario(Funcionario f) {
        if (this.valida(f) == true) {
            return adicionarFuncionario(f);
        } else {
            return false;
        }
    }

    /**
     * Validação global dos dados do Funcionario
     *
     * @param f o funcionario
     * @return
     */
    public boolean valida(Funcionario f) {
        boolean bRet = true;
        if (f.valida()) {

            for (int i = 0; i < listaFuncionarios.size(); i++) {
                if (listaFuncionarios.get(i).getMail().equalsIgnoreCase(f.getMail())) {
                    bRet = false;
                }
            }
        } else {
            bRet = false;
        }
        return bRet;
    }

    /**
     * Devolve as miniaturas registadas por um certo FRP
     *
     * @param funcionario
     */
    public void listarMiniaturasFRP(Funcionario funcionario) {
        for (int i = 0; i < getRegItem().getListaMiniaturas().size(); i++) {
            if (getRegItem().getListaMiniaturas().get(i).getFuncionario() == funcionario) {
                System.out.println((i + 1) + ". " + getRegItem().getListaMiniaturas().get(i).toStringItem());
            }
        }
    }

    /**
     * Adiciona uma compra a lista de compras da empresa
     *
     * @param compra
     */
    public void guardarCompra(Compra compra) {
        this.listaCompras.add(compra);
    }

    /**
     * Apresenta a lista de compras da empresa
     *
     */
    public void listarCompras() {
        ordenarDatasCompra();
        for (int i = 0; i < listaCompras.size(); i++) {
            if (listaCompras.get(i).isPagamento() == true) {
                System.out.println((i + 1) + ". " + listaCompras.get(i).toString());
            }
        }
    }

    /**
     * Apresenta a lista de encomendas da empresa
     *
     */
    public void listarEncomendas() {
        for (int i = 0; i < listaEncomendas.size(); i++) {
            System.out.println((i + 1) + ". " + listaEncomendas.get(i).toString());
        }
    }

    /**
     * Ordena as datas de compra
     *
     */
    public void ordenarDatasCompra() {
        ComparatorDataCompra cdc = new ComparatorDataCompra() {
        };
        Collections.sort(listaCompras, cdc);
    }

    /**
     * Adiciona uma compra a lista de encomendas e remove da lista de compras
     *
     * @param compra
     * @param opEstado
     * @param data
     *
     */
    public void adicionarPedidoEncomenda(Compra compra, int opEstado, Date data) {
        PedidoEncomenda pd = new PedidoEncomenda(opEstado, data, compra);
        listaCompras.remove(compra);
        listaEncomendas.add(pd);
    }

    /**
     * Adiciona um novo preço a uma determinada miniatura com uma determinada
     * escala
     *
     * @param mini A miniatura
     * @param escala A escala da miniatura
     * @param preco O preço da miniatura
     *
     * @return O preço da miniatura
     */
    public PrecoMiniatura novoPrecoMiniatura(Miniatura mini, Escala escala, double preco) {
        return new PrecoMiniatura(mini, escala, preco);
    }

    /**
     * Adiciona uma nova password a um determinado funcionario com um
     * determinado cargo
     *
     * @param funcionario
     * @param cargo
     * @param password
     *
     * @return O preço da miniatura
     */
    public FuncionarioCargo novoFuncionarioCargo(Funcionario funcionario, Cargo cargo, int password) {
        return new FuncionarioCargo(funcionario, cargo, password);
    }

    /**
     * Adiciona o preço à lista de preços de miniaturas da empresa
     *
     * @param pM O preço
     */
    public void addPrecoMiniatura(PrecoMiniatura pM) {
        this.listaPrecoMiniatura.add(pM);
    }

    /**
     * Adiciona a password a lista de funcionarios cargo
     *
     * @param fC
     */
    public void addFuncionarioCargo(FuncionarioCargo fC) {
        this.listaFuncionarioCargo.add(fC);
    }

    /**
     * Procura o preço de uma determinada miniatura
     *
     * @param mini A miniatura
     */
    public void procurarPrecoMiniatura(Miniatura mini) {
        for (int i = 0; i < this.listaPrecoMiniatura.size(); i++) {
            if (this.listaPrecoMiniatura.get(i).getMiniatura() == mini) {
                System.out.println((i + 1) + ". Escala: [1:"
                        + this.listaPrecoMiniatura.get(i).getEscala().getEscala()
                        + "] - Preço: " + this.listaPrecoMiniatura.get(i).getPreco()
                        + " € - IVA:" + mini.getTaxaIVA() + " %");
            }

        }
    }

    /**
     * Procura o preço de uma determinada miniatura
     *
     * @param mini A miniatura
     *
     * @return O preço da miniatura
     */
    public PrecoMiniatura procurarPM(Miniatura mini) {
        int posMini = -1;
        for (int i = 0; i < this.listaPrecoMiniatura.size(); i++) {
            if (this.listaPrecoMiniatura.get(i).getMiniatura() == mini) {
                posMini = i;
            }
        }
        return listaPrecoMiniatura.get(posMini);
    }

    /**
     * Procura o preço de uma miniatura apartir de uma opção
     *
     * @param op O opção selecionada
     *
     * @return O preço da miniatura associado à opção selecionada
     *
     */
    public PrecoMiniatura procurarPMop(int op) {
        return listaPrecoMiniatura.get(op - 1);
    }

    /**
     * Procura o preço de uma miniatura apartir de uma opção
     *
     *
     */
    public void apresentarCargos() {
        for (int i = 0; i < listaCargos.size(); i++) {
            System.out.println((i + 1) + ". " + listaCargos.get(i).toString());
        }
    }

    /**
     * Devolve o cargo que corresponde a uma opção escolhida
     *
     * @param op
     * @return o cargo
     */
    public Cargo procurarCargo(int op) {
        Cargo cargo = listaCargos.get(op - 1);
        return cargo;
    }

    /**
     * Procura o cargo apartir da password inserida pelo utilizador
     *
     * @param pass
     * @return
     */
    public String procurarCargoPass(int pass) {
        int pos = -1;
        for (int i = 0; i < listaFuncionarioCargo.size(); i++) {
            if (listaFuncionarioCargo.get(i).getPassword() == pass) {
                pos = i;
            }
        }
        return listaFuncionarioCargo.get(pos).getCargo().getSigla();
    }

}
