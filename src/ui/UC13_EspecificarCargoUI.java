/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC13_EspecificarCargoController;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC13_EspecificarCargoUI {

    private UC13_EspecificarCargoController controller;

    public UC13_EspecificarCargoUI(Empresa empresa) {
        controller = new UC13_EspecificarCargoController(empresa);
    }

    public void run() {
        System.out.println("\nNovo cargo:");

        controller.novoCargo();

        introduzDados();

        System.out.println(apresentaDados());

        if (Utils.confirma("Confirma os dados do Cargo? (S/N)")) {
            
            if (controller.registaCargo() == true) {
                System.out.println("Cargo registado com sucesso.");
            } else {
                System.out.println("Cargo não registado. - Dados errados");
            }
            
        } else {
            System.out.println("Cargo não registado.");
        }
    }

    private void introduzDados() {
        String designacao = Utils.readLineFromConsole("Introuza a designação completa do Cargo: ");
        String sigla = Utils.readLineFromConsole("Introuza a sigla do Cargo: ");
        controller.setDados(designacao, sigla);
    }

    public String apresentaDados() {
        return controller.getCargoAsString();
    }
}
