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
public class Tipo {

    /**
     * O codigo do Tipo
     *
     */
    private int codigoTipo;

    /**
     * O a designacao do tipo
     *
     */
    private String tipo;

    /**
     * A o contador de tipos
     *
     */
    private static int contador = 0;

    /**
     * Construtor vazio
     *
     *
     */
    public Tipo() {
        codigoTipo = contador + 1;
        contador = contador + 1;
    }

    /**
     * Construtor por parametros
     *
     * @param tipo
     *
     */
    public Tipo(String tipo) {
        codigoTipo = contador + 1;
        contador = contador + 1;
        this.setTipo(tipo);
    }

    /**
     * Construtor copia
     *
     * @param t
     *
     */
    public Tipo(Tipo t) {
        this.setCodigoTipo(t.codigoTipo);
        this.setTipo(t.tipo);
    }

    /**
     * Modifica o codigo do Tipo
     *
     * @param codigoTipo
     *
     */
    public final void setCodigoTipo(int codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    /**
     * Modifica a designacao do Tipo
     *
     * @param tipo
     *
     */
    public final void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devolve o codigo do Tipo
     *
     * @return codigoTipo
     *
     */
    public int getCodTipo() {
        return codigoTipo;
    }

    /**
     * Devolve a designacao do tipo
     *
     * @return tipo
     *
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * valida o tipo
     *
     * @return
     *
     */
    public boolean valida() {
        boolean certo = true;
        if (this.tipo.length() <= 0){
            certo = false;
        }
        return certo;
    }

    /**
     * Compara duas instancias de tipo
     *
     * @return
     *
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Tipo other = (Tipo) obj;
        return this.tipo.equals(other.tipo)
                && this.codigoTipo == other.codigoTipo;
    }

    /**
     * Devolve as caracteristicas de um tipo
     *
     * @return sb
     *
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Tipo: " + tipo + ";\n");
        return sb.toString();
    }

}
