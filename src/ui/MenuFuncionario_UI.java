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

public class MenuFuncionario_UI {

    private Empresa empresa;
    private String opcao;

    public MenuFuncionario_UI(Empresa empresa) {
        this.empresa = empresa;
    }

    public void run(int pass) throws IOException {
        String sigla = empresa.procurarCargoPass(pass);
        System.out.println(sigla);

        if (sigla.equals("FRP")) {
            do {
                System.out.println("\n###### MENU FRP ######");
                System.out.println("1. Registar miniatura");
                System.out.println("2. Atualizar tipo de uma miniatura ");
                System.out.println("3. Criar novo tipo de miniatura ");
                System.out.println("4. Visualizar listas de miniaturas ");
                System.out.println("5. Criar nova Escala ");
                System.out.println("6. Registar Acessório ");
                System.out.println("7. Adicionar Escala e Preço a Miniatura");
                System.out.println("0. Sair");

                opcao = Utils.readLineFromConsole("Introduza opção: ");

                if (opcao.equals("1")) {
                    UC04_RegistarMiniaturaUI ui = new UC04_RegistarMiniaturaUI(empresa);
                    ui.run();
                } else if (opcao.equals("2")) {
                    UC05_AssociarTipoMiniaturaUI ui = new UC05_AssociarTipoMiniaturaUI(empresa);
                    ui.run();
                } else if (opcao.equals("3")) {
                    UC03_EspecificarTipoUI ui = new UC03_EspecificarTipoUI(empresa);
                    ui.run();
                } else if (opcao.equals("4")) {
                    UC07_ConsultarMiniaturaFRPUI ui = new UC07_ConsultarMiniaturaFRPUI(empresa);
                    ui.run();
                } else if (opcao.equals("5")) {
                    UC08_EspecificarEscalaUI ui = new UC08_EspecificarEscalaUI(empresa);
                    ui.run();
                } else if (opcao.equals("6")) {
                    UC11_RegistarAcessorioUI ui = new UC11_RegistarAcessorioUI(empresa);
                    ui.run();
                } else if (opcao.equals("7")) {
                    UC12_AdicionarEscalaEPrecoUI ui = new UC12_AdicionarEscalaEPrecoUI(empresa);
                    ui.run();
                }
                
            } while (!opcao.equals("0"));

        } else if (sigla.equals("FRE")) {
            do {
                System.out.println("\n###### MENU FRE ######");
                System.out.println("1. Processar Pedido de Encomenda");
                System.out.println("2. Alterar Pedido de Encomenda ");

                System.out.println("0. Sair");

                opcao = Utils.readLineFromConsole("Introduza opção: ");

                if (opcao.equals("1")) {
                    UC09_ProcessarPedidoEncomendaUI ui = new UC09_ProcessarPedidoEncomendaUI(empresa);
                    ui.run();
                } else if (opcao.equals("2")) {
                    UC10_AlterarEstadoPedidoEncomendaUI ui = new UC10_AlterarEstadoPedidoEncomendaUI(empresa);
                    ui.run();
                }
            } while (!opcao.equals("0"));
        }

    }

}
