/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC11_RegistarAcessorioController;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC11_RegistarAcessorioUI {

    private UC11_RegistarAcessorioController controller;

    public UC11_RegistarAcessorioUI(Empresa empresa) {
        controller = new UC11_RegistarAcessorioController(empresa);
    }

    public void run() {
        System.out.println("\nNovo Acessório:");

        controller.novoAcessorio();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados do Acessório? (S/N)")) {
            if (controller.registaAcessorio()) {
                System.out.println("Acessório registada com sucesso.");
            } else {
                System.out.println("Acessório não registada. - Dados errados");
            }
        } else {
            System.out.println("Acessório não registado.");
        }
    }

    private void introduzDados() {
        String desig = Utils.readLineFromConsole("\nIntroduza a designação: ");
        String marca = Utils.readLineFromConsole("\nIntroduza a marca: ");
        String mailFab = Utils.readLineFromConsole("\nIntroduza o e-mail do fabricante: ");
        double precoAcess = Utils.IntFromConsole("\nIntroduza o preço da Miniatura: ");
        float taxaIVA = Utils.IntFromConsole("\nIntroduza a taxa de IVA a aplicar: ");

        controller.setDados(desig, marca, mailFab, precoAcess, taxaIVA);
    }

    private void apresentaDados() {
        System.out.println("\nAcessorio:\n" + controller.getAcessorioAsString());
    }
}
