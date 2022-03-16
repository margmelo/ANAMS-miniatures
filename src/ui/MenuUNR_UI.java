/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;
import model.Empresa;
import utils.Utils;

/**
 *
 * Dulce Mota <mdm@isep.ipp.pt>
 * 
 * 
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */

public class MenuUNR_UI {

    private Empresa empresa;
    private String opcao;

    public MenuUNR_UI(Empresa empresa) {
        this.empresa = empresa;
    }

    public void run() throws IOException {
        do {
            System.out.println("\n###### MENU ######");
            System.out.println("1. Efetuar registo de utilizador");
            System.out.println("2. Consultar lista de miniaturas ");

            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if (opcao.equals("1")) {
                UC01_RegistarClienteUI ui = new UC01_RegistarClienteUI(empresa);
                ui.run();
                opcao = "0";
            }

            if (opcao.equals("2")) {
                UC02_VerListaUI ui = new UC02_VerListaUI(empresa);
                ui.run();
            }

        } while (!opcao.equals("0"));
    }
}
