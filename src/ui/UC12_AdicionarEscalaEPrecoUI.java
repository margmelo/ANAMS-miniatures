/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC12_AdicionarEscalaEPrecoController;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */

public class UC12_AdicionarEscalaEPrecoUI {

    private UC12_AdicionarEscalaEPrecoController controller;

    private UC08_EspecificarEscalaUI uiEscala;

    public UC12_AdicionarEscalaEPrecoUI(Empresa empresa) {
        controller = new UC12_AdicionarEscalaEPrecoController(empresa);
        uiEscala = new UC08_EspecificarEscalaUI(empresa);
    }

    public void run() {
        System.out.println("\nAssociar Escala e Preco a uma Miniatura: ");

        controller.listarMiniaturas();
        int opMini = Utils.IntFromConsole("Escolha a Miniatura: ");

        introduzDados(opMini);

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            controller.adicionarPrecoMiniatura();
            System.out.println("Escala e Preco registado com sucesso.");
        } else {
            System.out.println("Escala e Preco  não registado.");
        }
    }

    public void apresentaDados() {
        System.out.println("\nMiniatura:\n" + controller.getMiniaturaAsString());
        System.out.println("Preços:");
        controller.procurarPrecoMiniatura();
        controller.getPrecoMiniatura();

    }

    public void introduzDados(int opMini) {
        controller.procurarMiniatura(opMini);
        controller.getListaEscalasAsString();
        System.out.println("0. Criar nova Escala");

        int opEscala = Utils.IntFromConsole("\nSelecione a escala: [99 - Terminar]");

        while (opEscala != 99) {
            if (opEscala == 0) {
                uiEscala.run();
                controller.getListaEscalasAsString();
            } else {
                controller.procurarEscala(opEscala);
                double precoEscala = Utils.IntFromConsole("\nQual o preco da Miniatura com a escala [1:" + controller.getEscala() + "]: ");

                controller.novoPrecoMiniatura(precoEscala);
            }
            opEscala = Utils.IntFromConsole("\nSelecione a escala: [99 - Terminar]");
        }
    }
}
