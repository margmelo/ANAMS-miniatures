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
public class Miniatura implements I_Item {

    /**
     * A cor da Miniatura
     */
    private String cor;

    /**
     * O material da Miniatura
     */
    private String material;

    /**
     * O ano da Miniatura
     */
    private int ano;

    /**
     * O tipo da Miniatura
     */
    private Tipo tipo;

    /**
     * O preço da miniatura
     */
    private Funcionario funcionario;

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
     * Constroi uma instância de Miniatura vazia
     *
     */
    public Miniatura() {
        this.setRef();
    }

    /**
     * Constroi uma instância de Miniatura com parametros
     *
     * @param desig
     * @param marca
     * @param mailFab
     * @param cor
     * @param material
     * @param ano
     * @param tipo
     * @param taxaIVA
     * @param funcionario
     */
    public Miniatura(String desig, String marca, String mailFab,
            String cor, String material, int ano,
            Tipo tipo, double taxaIVA, Funcionario funcionario) {
        this.setRef();
        this.setDesig(desig);
        this.setMarca(marca);
        this.setMailFab(mailFab);
        this.setTaxaIVA(taxaIVA);
        this.setCor(cor);
        this.setMaterial(material);
        this.setAno(ano);
        this.setTipo(tipo);
        this.setFuncionario(funcionario);
    }

    /**
     * Construtor cópia
     *
     * @param m
     */
    public Miniatura(Miniatura m) {
        this.setRef();
        this.setDesig(m.desig);
        this.setMarca(m.marca);
        this.setMailFab(m.mailFab);
        this.setTaxaIVA(m.taxaIVA);
        this.setCor(m.cor);
        this.setMaterial(material);
        this.setAno(m.ano);
        this.setTipo(m.tipo);
        this.setFuncionario(m.funcionario);
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
     * Modifica a cor da Miniatura
     *
     * @param cor a cor
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Modifica o material da Miniatura
     *
     * @param material o material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Modifica o ano da Miniatura
     *
     * @param ano o ano
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Modifica o tipo da Miniatura
     *
     * @param tipo o tipo
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
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
     * Devolve o funcionario da Miniatura
     *
     * @return funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * Devolve a cor da Miniatura
     *
     * @return cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * Devolve o material da Miniatura
     *
     * @return material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Devolve o ano da Miniatura
     *
     * @return ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * Devolve o tipo da Miniatura
     *
     * @return tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Validação local dos dados da Miniatura
     *
     * @return
     */
    public boolean valida() {
        boolean certo = true;
        if (this.cor.length() <= 0) {
            certo = false;
        } else if (this.desig.length() <= 0) {   
            certo = false;
        } else if (this.mailFab.length() <= 5) {
            certo = false;
        } else if (this.marca.length() <= 0) {
            certo = false;
        } else if (this.material.length() <= 0) {      
            certo = false;
        } 
        return certo;
    }

    /**
     * Devolve as caracteristicas de uma Miniatura
     *
     * @return
     */
    @Override
    public String toStringCompleto() {
        StringBuffer sb = new StringBuffer();
        sb.append("Referência: " + ref + "\n");
        sb.append("Designação: " + desig + "\n");
        sb.append("Marca: " + marca + "\n");
        sb.append("E-mail do fabricante: " + mailFab + "\n");
        sb.append("Cor: " + cor + "\n");
        sb.append("Material: " + material + "\n");
        sb.append("Ano: " + ano + "\n");
        sb.append("Tipo: " + tipo + "\n");
        return sb.toString();
    }

    /**
     * Devolve as caracteristicas base de uma Miniatura
     *
     * @return
     */
    public String toStringItem() {
        StringBuffer sb = new StringBuffer();
        sb.append("Referência: " + ref + "\n");
        sb.append("Designação: " + desig + "\n");
        return sb.toString();
    }

    /**
     * Compara as caracteristicas de uma miniatura
     *
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Miniatura other = (Miniatura) obj;
        return this.cor.equalsIgnoreCase(other.cor)
                && this.ref == other.ref
                && this.desig.equalsIgnoreCase(other.desig)
                && this.marca.equalsIgnoreCase(other.marca)
                && this.mailFab.equals(other.mailFab)
                && this.ano == other.ano
                && this.material.equalsIgnoreCase(other.material)
                && this.tipo.equals(other.tipo);
    }
}
