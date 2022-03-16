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
public class Escala {

    /**
     * o valor da escala 
     */
    private int escala;

    /**
     * Constroi uma instância de escala
     *
     *
     */
    public Escala() {
    }
    
    /**
     * Constroi uma instância de escala parametros
     *
     * @param escala
     *
     */
    public Escala(int escala) {
        this.setEscala(escala);
    }

    /**
     * Constroi uma instância de escala por uma escala ja existente
     *
     * @param e
     *
     */
    public Escala(Escala e) {
        this.setEscala(e.escala);
    }

    /**
     * Modifica o valor da escala
     *
     * @param escala
     *
     */
    public final void setEscala(int escala) {
        this.escala = escala;
    }

    /**
     * Devolve o valor da escala
     *
     * @return escala
     */
    public int getEscala() {
        return escala;
    }

    /**
     * valida a escala
     *
     * @return 
     *
     */
    public boolean valida() {
        boolean certo = true;
        if (this.escala == (int)this.escala){
            certo = false;
        }
        return certo;
    }

    /**
     * Compara duas instancias de escala
     *
     *
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Escala other = (Escala) obj;
        return this.escala == other.escala;
    }

    
    /**
     * Devolve as caracteristicas de uma escala
     *
     *
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Escala: [1:" + escala + "]; ");
        return sb.toString();
    }
}
