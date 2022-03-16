/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC15_AssociarCargoFuncionarioController;
import java.util.Random;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class UC15_AssociarCargoFuncionarioUI {

    private UC15_AssociarCargoFuncionarioController controller;
    private UC13_EspecificarCargoUI ui;

    public UC15_AssociarCargoFuncionarioUI(Empresa empresa) {
        controller = new UC15_AssociarCargoFuncionarioController(empresa);
        ui = new UC13_EspecificarCargoUI(empresa);
    }

    public void run() {
        System.out.println("\nAdicionar Cargo a um Funcionario:");

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados do cargo do funcionario? (S/N)")) {
            if (Utils.confirma("s")) {
                System.out.println("Cargo associado com sucesso.");
                controller.adicionarFuncionarioCargo();
                controller.enviarNotificacao();
            } else {
                System.out.println("Cargo nao associado.");
            }
        }
    }

    public void introduzDados() {

        controller.listarFuncionarios();

        int opfuncionario = Utils.IntFromConsole("Selecione o Funcionario: ");
        controller.procurarFuncionario(opfuncionario);

        controller.listarCargos();
        System.out.println("0. Criar novo Cargo");

        int opCargo = Utils.IntFromConsole("\nSelecione o cargo: ");

        if (opCargo == 0) {
            ui.run();
            controller.listarCargos();
        } else {
            controller.procurarCargo(opCargo);

            int password = gerarPassword();
            controller.novoFuncionarioCargo(password);
        }

    }

    public void apresentaDados() {
        System.out.println("\nFuncionario: " + controller.getFuncionario().getNome());
        System.out.println("\nCargos do Funcionario: ");
        controller.getListaCargosAsString();
        System.out.println(" --> " + controller.getFuncionarioCargo().getCargo().getDesignacao());
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
            System.out.println("Nova password: " + password);
            int i = 0;
            while (i < controller.getListaFuncionarioCargo().size() && password != controller.getListaFuncionarioCargo().get(i).getPassword()) {
                i++;
            }
            if (i == controller.getListaFuncionarioCargo().size()) {
                pass = true;
            }
        }
        return password;
    }
}
