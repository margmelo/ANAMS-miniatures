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
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class MenuDRH_UI {

    private Empresa empresa;

    public MenuDRH_UI(Empresa empresa) {
        this.empresa = empresa;
    }

    String op;
    String username;
    int password;

    public void run() throws IOException {
        do {
            UC14_RegistarfuncionarioUI ui1 = new UC14_RegistarfuncionarioUI(empresa);
            UC13_EspecificarCargoUI ui2 = new UC13_EspecificarCargoUI(empresa);
            UC15_AssociarCargoFuncionarioUI ui3 = new UC15_AssociarCargoFuncionarioUI(empresa);

            System.out.println("\n###### MENU DRH ######");
            System.out.println("1. Registar Funcionarios ");
            System.out.println("2. Especificar Cargos ");
            System.out.println("3. Adicionar Cargo a Funcionario");
            System.out.println("0. Sair");

            op = Utils.readLineFromConsole("Introduza opção: ");

            if (op.equals("1")) {
                ui1.runRegisto();
            } else if (op.equals("2")) {
                ui2.run();
            } else if (op.equals("3")) {
                ui3.run();
            }

        } while (!op.equals("0"));
    }
}
