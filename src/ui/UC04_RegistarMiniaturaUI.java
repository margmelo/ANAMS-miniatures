/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC04_RegistarMiniaturaController;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 * 
 */
public class UC04_RegistarMiniaturaUI {

    private UC04_RegistarMiniaturaController controller;
    private UC03_EspecificarTipoUI uiTipo;
    private UC08_EspecificarEscalaUI uiEscala;
    private UC12_AdicionarEscalaEPrecoUI uiEscalaPreco;

    public UC04_RegistarMiniaturaUI(Empresa empresa) {
        controller = new UC04_RegistarMiniaturaController(empresa);
        uiEscalaPreco = new UC12_AdicionarEscalaEPrecoUI(empresa);
        uiTipo = new UC03_EspecificarTipoUI(empresa);
        uiEscala = new UC08_EspecificarEscalaUI(empresa);
    }

    public void run() {
        System.out.println("\nNova Miniatura:");

        controller.novaMiniatura();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados da miniatura? (S/N)")) {
            if (controller.registaMiniatura()== true) {
                System.out.println("Miniatura registada com sucesso.");
            } else {
                System.out.println("Miniatura não registada. - Dados errados");
            }
        } else {
            System.out.println("Miniatura não registada.");
        }
    }

    private void introduzDados() {
        String desig = Utils.readLineFromConsole("\nIntroduza a designação: ");
        String marca = Utils.readLineFromConsole("\nIntroduza a marca: ");
        String mailFab = Utils.readLineFromConsole("\nIntroduza o e-mail do fabricante: ");

        controller.getListaEscalas();
        System.out.println("0. Criar nova Escala");

        int opEscala = Utils.IntFromConsole("\nSelecione a escala: [99 - Terminar]");

        while (opEscala != 99) {
            if (opEscala == 0) {
                uiEscala.run();
                controller.getListaEscalas();
            } else {
                controller.procurarEscala(opEscala);
                double precoEscala = Utils.IntFromConsole("\nQual o preco da Miniatura com a escala [1:" + controller.getEscala() + "]: ");

                controller.novoPrecoMiniatura(precoEscala);
                controller.adicionarPrecoMiniatura();
            }
            opEscala = Utils.IntFromConsole("\nSelecione a escala: [99 - Terminar]");
        }

        String cor = Utils.readLineFromConsole("\nIntroduza a cor: ");
        String material = Utils.readLineFromConsole("\nIntroduza o material: ");
        int ano = Utils.IntFromConsole("\nIntroduza o ano: ");

        controller.getListaTipos();
        System.out.println("0. Criar novo Tipo");

        int opTipo = Utils.IntFromConsole("\nSelecione o tipo: ");

        if (opTipo == 0) {
            uiTipo.run();
            controller.getListaTipos();
            opTipo = Utils.IntFromConsole("\nSelecione o tipo: ");
        }

        double taxaIVA = Utils.IntFromConsole("\nIntroduza a taxa de IVA a aplicar: ");

        controller.setDados(desig, marca, mailFab, cor, material, ano, opTipo, taxaIVA);
    }

    private void apresentaDados() {
        System.out.println("\nMiniatura:\n" + controller.getMiniaturaAsString());
        System.out.println("Preços:");
        controller.procurarPrecoMiniatura();
    }

}
