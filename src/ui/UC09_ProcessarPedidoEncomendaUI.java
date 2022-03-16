/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC09_ProcessarPedidoEncomendaController;
import java.util.Date;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC09_ProcessarPedidoEncomendaUI {

    private UC09_ProcessarPedidoEncomendaController controller;

    public UC09_ProcessarPedidoEncomendaUI(Empresa empresa) {
        controller = new UC09_ProcessarPedidoEncomendaController(empresa);
    }

    public void run() {
        int op;
        System.out.println("================================");
        System.out.println("\nProcessar pedido de Encomenda:");

        controller.listarCompras();                                             // Lista Compras ordenadas por data

        op = Utils.IntFromConsole("Escolha uma compra para processar:");
        controller.procurarCompra(op);                                          // retorna Compra escolhida

        Date data = new java.util.Date();
        System.out.println(data);

        int opEstado = 1;                                                       // 1 - Encomenda enviada para o fornecedor

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            controller.adicionarPedidoEncomenda(opEstado, data);                 // Adicionar Compra a lista de Encomendas e remove da Lista de Compras
            System.out.println("Pedido de Encomenda processado com sucesso.\n");
        } else {
            System.out.println("Pedido de encomenda não processado.\n");
        }
    }
}
