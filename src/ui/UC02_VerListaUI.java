/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC02_VerListaController;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC02_VerListaUI {

    private UC02_VerListaController controller;

    public UC02_VerListaUI(Empresa empresa) {
        controller = new UC02_VerListaController(empresa);
    }

    public void run() {
        System.out.println("\nConsultar lista de Miniaturas:");
        controller.listarMiniaturas();

        int op = Utils.IntFromConsole("Escolha uma Miniatura: ");
        controller.procurarMiniatura(op);

        System.out.println(controller.getMiniaturaAsString());

        System.out.println("Preços:");
        controller.procurarPrecoMiniatura();

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            System.out.println("Operação concluida com sucesso.");
        } else {
            System.out.println("Opção não concluida.");
        }
    }
}
