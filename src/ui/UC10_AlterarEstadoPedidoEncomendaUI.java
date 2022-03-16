/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.*;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC10_AlterarEstadoPedidoEncomendaUI {

    private UC10_AlterarEstadoPedidoEncomendaController controller;

    public UC10_AlterarEstadoPedidoEncomendaUI(Empresa empresa) {
        controller = new UC10_AlterarEstadoPedidoEncomendaController(empresa);
    }

    public void run() {
        System.out.println("================================");
        System.out.println("\nAlterar Esdado de uma encomenda:");

        controller.listarEncomendas();                                          // Lista Encomendas

        int opCompra = Utils.IntFromConsole("Escolha uma Encomenda:");

        controller.procurarEncomenda(opCompra);                                 // retorna Encomenda escolhida

        System.out.println("1. Encomenda enviada para o fornecedor");
        System.out.println("2. Encomenda Pronta");
        System.out.println("3. Encomenda Cancelada");

        int opEstado = Utils.IntFromConsole("Pretende alterar para: ");

        apresentarDados(opEstado);

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            controller.alterarEstadoEncomenda(opEstado);                        // Alterar Estado de Encomenda
            if (controller.getEstadoPedidoEncomenda().equals("Pronto")) {       // se a encomenda estiver pronta envia email
                controller.enviarNotificacao();
            }
            System.out.println("Encomenda alterada com sucesso.");
        } else {
            System.out.println("Encomenda não alterada.");
        }
    }

    private void apresentarDados(int opEstado) {
        controller.getCompraAsStringBase();
        if (opEstado == 1) {
            System.out.println("Alterar para: Encomenda enviada para o fornecedor");
        } else if (opEstado == 2) {
            System.out.println("Alterar para: Encomenda Pronta");
        } else if (opEstado == 3) {
            System.out.println("Alterar para: Encomenda Cancelada");
        }
    }
}
