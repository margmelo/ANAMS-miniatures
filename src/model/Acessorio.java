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
public class Acessorio implements I_Item {

    /**
     * A referencia da Miniatura
     */
    private int ref;

    /**
     * A designacao da Miniatura
     */
    private String desig;

    /**
     * A marca da Miniatura
     */
    private String marca;

    /**
     * O identificador de Fabricante da Miniatura
     */
    private String mailFab;

    /**
     * A taxa de de IVA aplicada
     */
    private double taxaIVA;

    /**
     * Contador gerador da referência do Item
     */
    public static int contador = 0;

    /**
     * O preco do acessorio
     */
    private double precoAcess;

    /**
     * O funcionario que registou do acessorio
     */
    private Funcionario funcionario;

    /**
     * Constroi uma instancia de acessorio vazio
     */
    Acessorio() {
        this.setRef();
    }

    /**
     * Constroi uma instancia de acessorio com parametros
     *
     * @param desig
     * @param marca
     * @param mailFab
     * @param precoAcess
     * @param taxaIVA
     * @param funcionario
     */
    public Acessorio(String desig, String marca, String mailFab, double precoAcess,
            double taxaIVA, Funcionario funcionario) {
        this.setRef();
        this.setDesig(desig);
        this.setMarca(marca);
        this.setMailFab(mailFab);
        this.setTaxaIVA(taxaIVA);
        this.setPrecoAcess(precoAcess);
        this.setFuncionario(funcionario);
    }

    /**
     * Construtor cópia
     *
     * @param a
     */
    public Acessorio(Acessorio a) {
        this.setRef();
        this.setDesig(a.desig);
        this.setMarca(a.marca);
        this.setMailFab(a.mailFab);
        this.setTaxaIVA(a.taxaIVA);
        this.setPrecoAcess(a.precoAcess);
        this.setFuncionario(a.funcionario);
    }

    /**
     * Modifica a referencia da Miniatura
     *
     */
    public void setRef() {
        ref = contador + 1;
        contador = contador + 1;
    }

    /**
     * Modifica a designacao da Miniatura
     *
     * @param desig a designacao
     */
    public void setDesig(String desig) {
        this.desig = desig;
    }

    /**
     * Modifica a marca da Miniatura
     *
     * @param marca a marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Modifica o identificador do Fabricante do item
     *
     * @param mailFab o idetificador do Fabricante
     */
    public void setMailFab(String mailFab) {
        this.mailFab = mailFab;
    }

    /**
     * Modifica a taxa de iva de um item
     *
     * @param taxaIVA
     *
     */
    public void setTaxaIVA(double taxaIVA) {
        this.taxaIVA = taxaIVA;
    }

    /**
     * Devolve a referencia do item
     *
     * @return ref
     */
    public int getRef() {
        return ref;
    }

    /**
     * Devolve a designacao do item
     *
     * @return desig
     */
    public String getDesig() {
        return desig;
    }

    /**
     * Devolve a marca do item
     *
     * @return marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Devolve a taxa de iva de um item
     *
     * @return taxaIVA
     */
    public double getTaxaIVA() {
        return taxaIVA;
    }

    /**
     * Devolve o identificador do Fabricante do item
     *
     * @return idFab
     */
    public String getMailFab() {
        return mailFab;
    }

    /**
     * Modifica o preco da Miniatura
     *
     * @param precoAcess
     */
    public void setPrecoAcess(double precoAcess) {
        this.precoAcess = precoAcess;
    }

    /**
     * Modifica o funcionarioda Miniatura
     *
     * @param funcionario
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * Devolve o preco do acessorio
     *
     * @return precoAcess
     */
    public double getPrecoAcess() {
        return precoAcess;
    }

    /**
     * Devolve o funcionario que registou o acessorio
     *
     * @return funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * Devolve as caracteristicas de umacessorio
     *
     * @return sb
     */
    public String toStringCompleto() {
        super.toString();
        StringBuffer sb = new StringBuffer();
        sb.append("Referência: " + ref + "\n");
        sb.append("Designação: " + desig + "\n");
        sb.append("Marca: " + marca + "\n");
        sb.append("E-mail do fabricante: " + mailFab + "\n");
        sb.append("Preço: " + precoAcess + "€ +IVA " + taxaIVA + "% ");
        return sb.toString();
    }

    public String toStringItem() {
        StringBuffer sb = new StringBuffer();
        sb.append("Referência: " + ref + " - ");
        sb.append("" + desig + "\n");
        return sb.toString();
    }

    /**
     * Compara dois acessorios
     *
     * @return
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Acessorio other = (Acessorio) obj;
        return this.precoAcess == other.precoAcess
                && this.ref == other.ref
                && this.desig.equalsIgnoreCase(other.desig)
                && this.marca.equalsIgnoreCase(other.marca)
                && this.mailFab.equals(other.mailFab);
    }

    /**
     * Validação local dos dados do Acessorio
     *
     * @return
     */
    public boolean valida() {
        boolean certo = true;
        if (this.marca.length() <= 0) {
            certo = false;
        } else if (this.desig.length() <= 0) {
            certo = false;
        } else if (this.mailFab.length() <= 5) {
            certo = false;
        } 
        return certo;
    }
}
