/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;
import model.Empresa;
import model.Funcionario;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */

public class MenuRegistaFuncionario_UI {

    private Empresa empresa;

    public MenuRegistaFuncionario_UI(Empresa empresa) {
        this.empresa = empresa;
    }

    String op;
    String username;
    int password;
    Funcionario funcionario;

    public int run() throws IOException {
        int pass = 0;
        do {
            UC14_RegistarfuncionarioUI ui = new UC14_RegistarfuncionarioUI(empresa);

            System.out.println("\n###### MENU FUNCIONARIO ######");
            System.out.println("1. Entrar ");
            System.out.println("0. Sair");

            op = Utils.readLineFromConsole("Introduza opção: ");

            if (op.equals("1")) {
                pass = ui.runLogin();
                op = "0";
            }
        } while (!op.equals("0"));
        return pass;
    }

}
