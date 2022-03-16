/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC07_ConsultarMiniaturaFRPController;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC07_ConsultarMiniaturaFRPUI {

    private UC07_ConsultarMiniaturaFRPController controller;

    public UC07_ConsultarMiniaturaFRPUI(Empresa empresa) {
        controller = new UC07_ConsultarMiniaturaFRPController(empresa);

    }

    public void run() {
        String opcao;
        do {
            System.out.println("\n###### MENU ######");
            System.out.println("1. Lista Completa de Miniaturas ");
            System.out.println("2. Lista de Miniaturas Pessoal ");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if (opcao.equals("1")) {
                int op;
                System.out.println("\n");
                controller.listarMiniaturasBase();
                op = Utils.IntFromConsole("Escolha uma Miniatura: [99 - Para Sair]");
                while (op != 99) {
                    controller.procurarMiniatura(op);
                    System.out.println("\n" + controller.getMiniaturaAsString());

                    System.out.println("Preços:");
                    controller.procurarPrecoMiniatura();

                    op = Utils.IntFromConsole("Escolha uma Miniatura: [99 - Para Sair]");
                }

            } else if (opcao.equals("2")) {
                System.out.println("\n");
                controller.listarMiniaturasFRP();
                int op;
                op = Utils.IntFromConsole("Escolha uma Miniatura: [99 - Para Sair]");
                while (op != 99) {
                    controller.procurarMiniatura(op);
                    System.out.println("\n" + controller.getMiniaturaAsString());

                    System.out.println("Preços:");
                    controller.procurarPrecoMiniatura();

                    op = Utils.IntFromConsole("Escolha uma Miniatura: [99 - Para Sair]");
                }
            }
        } while (!opcao.equals("0"));
    }

}
