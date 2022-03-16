/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC05_AssociarTipoMiniaturaController;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class UC05_AssociarTipoMiniaturaUI {

 
    private UC05_AssociarTipoMiniaturaController controller;
    private UC03_EspecificarTipoUI ui;


    public UC05_AssociarTipoMiniaturaUI(Empresa empresa) {
        controller = new UC05_AssociarTipoMiniaturaController(empresa);
        ui = new UC03_EspecificarTipoUI(empresa);
    }

    public void run() {
        System.out.println("\nAtualizar tipo de uma miniatura:");

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados do tipo de miniatura? (S/N)")) {
            if (Utils.confirma("s")) {
                controller.associarTipo();
                System.out.println("Tipo associado com sucesso.");
            } else {
                System.out.println("Tipo nao associado.");
            }
        }
    }

    public void introduzDados() {
        controller.listarMiniaturas();

        int opMini = Utils.IntFromConsole("Selecione a miniatura: ");
        controller.procurarMiniatura(opMini);

        controller.listarTipos();
        System.out.println("0. Criar novo tipo");

        int opTipo = Utils.IntFromConsole("\nSelecione o tipo: ");

        if (opTipo == 0) {
            ui.run();
            controller.listarTipos();
            opTipo = Utils.IntFromConsole("\nSelecione o tipo: ");
        }
        controller.procurarTipo(opTipo);
    }

    public void apresentaDados() {
        System.out.println("\nMiniatura: " + controller.getMiniaturaAsString());
        System.out.println("Novo tipo da miniatura: " + controller.getTipoAsString());
    }

}
