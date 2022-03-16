/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC08_EspecificarEscalaController;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC08_EspecificarEscalaUI {

    private UC08_EspecificarEscalaController controller;

    public UC08_EspecificarEscalaUI(Empresa empresa) {
        controller = new UC08_EspecificarEscalaController(empresa);
    }

    public void run() {
        System.out.println("\nNova escala: ");

        controller.novaEscala();

        introduzDados();

        System.out.println(apresentaDados());

        if (Utils.confirma("Confirma os dados do Escala? (S/N)")) {

            if (controller.registarEscala() == true) {
                System.out.println("Escala registada com sucesso.");
            } else {
                System.out.println("Escala não registada. - Dados errados");
            }
            System.out.println("Escala registada com sucesso.");

        } else {
            System.out.println("Escala não registada.");
        }
    }

    public String apresentaDados() {
        return controller.getEscalaAsString();
    }

    public void introduzDados() {
        int escala = Utils.IntFromConsole("Introduza a escala x: [1:x] ");
        controller.setDados(escala);
    }
}
