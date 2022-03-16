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
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */

public class MenuInicial_UI {

    /**
     * A Empresa
     */
    private Empresa empresa;

    /**
     * A opcao
     */
    private String opcao;

    /**
     * Constroi uma instância de Menu
     *
     */
    public MenuInicial_UI(Empresa empresa) {
        this.empresa = empresa;
    }

    public void run() throws IOException {
        do {
            System.out.println("\n###### MENU ######");
            System.out.println("1. Utilizador não registado ");
            System.out.println("2. Cliente ");
            System.out.println("3. Funcionário");
            System.out.println("4. Diretor de Recursos Humanos");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if (opcao.equals("1")) {
                MenuUNR_UI ui = new MenuUNR_UI(empresa);
                ui.run();
            } else if (opcao.equals("2")) {
                UC01_RegistarClienteUI ui = new UC01_RegistarClienteUI(empresa);
                ui.runLogin();
                MenuCliente_UI ui2 = new MenuCliente_UI(empresa);
                ui2.run();
            } else if (opcao.equals("3")) {
                MenuRegistaFuncionario_UI ui = new MenuRegistaFuncionario_UI(empresa);
                int pass = ui.run();    
                if (pass != 0){
                    MenuFuncionario_UI ui2 = new MenuFuncionario_UI(empresa);
                    ui2.run(pass);
                }              
            } else if (opcao.equals("4")) {
                MenuDRH_UI ui = new MenuDRH_UI(empresa);
                ui.run();
            }
        } while (!opcao.equals("0"));
    }

}
