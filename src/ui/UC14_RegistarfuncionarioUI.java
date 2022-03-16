/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC14_RegistarFuncionarioController;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC14_RegistarfuncionarioUI {

    private UC14_RegistarFuncionarioController controller;

    public UC14_RegistarfuncionarioUI(Empresa empresa) {
        controller = new UC14_RegistarFuncionarioController(empresa);
    }

    public void runRegisto() {
        System.out.println("\nNovo Funcionario:");

        controller.novoFuncionario();
        
        introduzDadosRegisto();

        apresentaDados();

        if (Utils.confirma("Confirma os dados do Funcionario? (S/N)")) {
            
            if (controller.registaFuncionario() == true) {
                System.out.println("Funcionario registado com sucesso.");
            } else {
                System.out.println("Funcionario não registado. - Dados errados");
            }
            
        } else {
            System.out.println("Funcionario não registado.");
        }
    }

    public int runLogin() {
        System.out.println("\nLOGIN:");

        int pass = introduzDadosLogin();
        
        return pass;
    }

    private int introduzDadosLogin() {
        int login = -1;
        String mail;
        int password = 0;

        controller.novoFuncionario();

        while (login == -1) {
            mail = Utils.readLineFromConsole("Email: ");
            password = Utils.IntFromConsole("Password: ");

            login = controller.comparaDados(mail, password);
        }
        return password;
    }

    private void introduzDadosRegisto() {
        String nome = Utils.readLineFromConsole("Introduza o nome completo: ");
        String mail = Utils.readLineFromConsole("Introduza o mail: ");
        String telef = Utils.readLineFromConsole("Introduza o nº de telefone: ");
        String nif = Utils.readLineFromConsole("Introduza o NIF: ");
        String endPostal = Utils.readLineFromConsole("Introduza o endereço Postal: ");   

        controller.setDados(nome, nif, endPostal, mail, telef);
    }

    private void apresentaDados() {
        System.out.println("\nFuncionario:\n" + controller.getFuncionarioAsString());
    }
}
