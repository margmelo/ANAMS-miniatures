/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC01_RegistarClienteController;
import java.util.Date;
import java.util.Random;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt> e e Dulce Mota <mdm@isep.ipp.pt>
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC01_RegistarClienteUI {

    private UC01_RegistarClienteController controller;

    public UC01_RegistarClienteUI(Empresa empresa) {
        controller = new UC01_RegistarClienteController(empresa);
    }

    public void run() {
        System.out.println("\nNovo Cliente:");

        controller.novoCliente();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados do Cliente? (S/N)")) {

            if (controller.registaCliente() == true) {
                controller.enviarNotificacao();
                System.out.println("Cliente registado com sucesso.");
            } else {
                System.out.println("Cliente não registado. - Dados errados");
            }
        } else {
            System.out.println("Cliente não registado.");
        }

    }

    public void runLogin() {
        System.out.println("\nLogin");
        introduzDadosLogin();
    }

    private void introduzDadosLogin() {
        int login = -1;
        String email;
        int password;

        controller.novoCliente();

        while (login == -1) {
            email = Utils.readLineFromConsole("Email: ");
            password = Utils.IntFromConsole("Password: ");

            login = controller.compararDados(email, password);
        }
    }

    private void introduzDados() {
        String nomeComp = Utils.readLineFromConsole("Introduza o nome Completo: ");
        String NIF = Utils.readLineFromConsole("\nIntroduza o NIF: ");
        Date dataNasc = Utils.readDateFromConsole("\nIntroduza a data de nascimento(dd-MM-aaaa): ");
        String telef = Utils.readLineFromConsole("\nIntroduza o contacto telefónico: ");
        String email = Utils.readLineFromConsole("\nIntroduza o email: ");
        String endPostal = Utils.readLineFromConsole("\nIntroduza o endereço postal: ");

        int password = gerarPassword();

        System.out.println("\n ------> A sua password para aceder ao site é:" + password + "<------");

        controller.setDados(nomeComp, NIF, dataNasc, telef, email, endPostal, password);
    }

    private void apresentaDados() {
        System.out.println("\nCliente:\n" + controller.getClienteAsString());
    }

    public int gerarPassword() {
        boolean pass = false;
        int password = 0;
        while (pass == false) {
            Random rand = new Random();
            // Generating random integers in range 1000 to 9999
            while (password < 1000) {
                password = rand.nextInt(9999);
            }
            System.out.println("Nova pass " + password);
            int i = 0;
            while (i < controller.getListaClientes().size() && password != controller.getListaClientes().get(i).getPassword()) {
                i++;
            }
            if (i == controller.getListaClientes().size()) {
                pass = true;
            }
        }
        return password;
    }

}
