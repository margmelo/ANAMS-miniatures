/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC06_RegistarCompraController;
import java.util.Date;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Dulce
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
class UC06_RegistarCompraUI {

    private UC06_RegistarCompraController controller;

    public UC06_RegistarCompraUI(Empresa empresa) {
        controller = new UC06_RegistarCompraController(empresa);
    }

    public void run() {

        controller.novaCompra();

        System.out.println("\nEfetuar compra:");

        controller.getListaItens();

        int op = Utils.IntFromConsole("\nSelecione o item:  [0 - SAIR]");
        while (op != 0) {

            procurarItem(op);

            controller.getListaItens();

            op = Utils.IntFromConsole("\nSelecione o item: [0 - SAIR]");

        }

        Date dataCompra = Utils.readDateFromConsole("\nInsira o dia da compra: [DD-MM-AAAA]");
        controller.adicionarData(dataCompra);

        System.out.println("\nA sua compra: ");
        controller.listarCompra();

        System.out.println("Valor a pagar: " + controller.getPrecoCompra() + "€");

        if (Utils.confirma("Confirma a compra? (S/N)")) {
            System.out.println("Compra efetuada");
            controller.guardarCompra();
            controller.enviarNotificacao();
        } else {
            System.out.println("Compra não efetuada");
        }
    }

    private void procurarItem(int op) {
        controller.procurarItem(op);
        double preco = 0;
        double iva = 0;

        if (controller.verificarItem() == 1) {

            controller.procurarPrecoMiniatura();
            int op1 = Utils.IntFromConsole("\nEscolha a escala: ");

            preco = controller.procurarPM(op1).getPreco();
            iva = controller.procurarItem(op).getTaxaIVA();

            controller.procurarPM();

            controller.adicionarPMCompra();

        } else if (controller.verificarItem() == 2) {

            preco = controller.getPrecoAcess();
            iva = controller.getTaxaIVA();
        }

        int qt = Utils.IntFromConsole("\nQuantas unidades deste artigo quer comprar?");

        controller.adicionarPreco(preco * qt * (100 + iva) / 100);

        apresentaDados();

        if (Utils.confirma("Confirma os dados da miniatura? (S/N)")) {          // faz return de true(s) or false(n)
            controller.adicionarItemCompra(qt);
            System.out.println("Miniatura adicionada ao carrinho com sucesso.");
        } else {                                                                // se der false entao: mini não adicionada
            System.out.println("Miniatura não adicionada.");
        }
    }

    private void apresentaDados() {
        System.out.println("\nItem:\n" + controller.getItemAsString());
    }

}
