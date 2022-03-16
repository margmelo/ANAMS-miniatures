package ui;

import java.io.IOException;

import model.Empresa;
import model.Miniatura;
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

public class MenuCliente_UI {

    private Empresa empresa;
    private Miniatura miniatura;
    private String opcao;

    public MenuCliente_UI(Empresa empresa) {
        this.empresa = empresa;
    }

    public void run() throws IOException {
        do {
            System.out.println("\n###### MENU #####");
            System.out.println("1. Efetuar compra");
            System.out.println("2. Consultar lista de miniaturas ");

            System.out.println("0. Sair");



            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if (opcao.equals("1")) {
                UC06_RegistarCompraUI ui = new UC06_RegistarCompraUI(empresa);
                ui.run();

            } else if (opcao.equals("2")) {
                UC02_VerListaUI ui = new UC02_VerListaUI(empresa);
                ui.run();
            }

        } while (!opcao.equals("0"));
    }
}
