/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Acessorio;
import model.Cargo;
import model.Cliente;
import model.Empresa;
import model.Escala;
import model.Funcionario;
import model.FuncionarioCargo;
import model.Miniatura;
import model.PrecoMiniatura;
import model.Tipo;
import utils.ManipulacaoFicheiros;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt> e Dulce Mota <mdm@isep.ipp.pt>
 * Classe de arranque da aplicação
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 *
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {

        Empresa emp = null;
        String resp = JOptionPane.showInputDialog(null, "Pretende que a informação seja lida de um ficheiro? <s/n>");
        if (resp.equals("s")) {
            emp = carregarDadosFicheiro();
        } else {
            emp = carregarDadosManual();
        }
        if (emp == null) {
            emp = carregarDadosManual();
        }

        resp = JOptionPane.showInputDialog(null, "Pretende que a informação seja guardada num ficheiro? <s/n>");
        if (resp.equals("s")) {
            gravarDadosFicheiro(emp);
        }
        
        MenuInicial_UI uiMenu = new MenuInicial_UI(emp);
        uiMenu.run();
    }

    public static Empresa carregarDadosManual() {

        Empresa emp = new Empresa();

        Cargo c3 = new Cargo("Diretor de Recursos Humanos", "DRH");
        Cargo c1 = new Cargo("Funcionario Responsavel pelos Produtos", "FRP");
        Cargo c2 = new Cargo("Funcionario Responsavel pelas Encomendas", "FRE");

        emp.getListaCargo().add(c1);
        emp.getListaCargo().add(c2);

        // Adicionar Funcionarios
        Funcionario f4 = new Funcionario("DRH", "1234567", "Rua da Margarida 123", "mruna@gmail.com", "961347470");
        Funcionario f1 = new Funcionario("Margarida Melo", "1234567", "Rua da Margarida 123", "mruna@gmail.com", "961347470");
        Funcionario f2 = new Funcionario("Teresa Pinto", "35362737", "Rua da Teresa 456", "teresapinto@gmail.com", "939924621");
        Funcionario f3 = new Funcionario("Ines Morgado", "11526378", "Rua da Ines 789", "inesmorgado@gmail.com", "910617170");

        emp.adicionaFuncionario(f1);
        emp.adicionaFuncionario(f2);
        emp.adicionaFuncionario(f3);
        emp.adicionaFuncionario(f4);

        // Adicionar password e cargo a um funcionario
        FuncionarioCargo fC1 = new FuncionarioCargo(f1, c2, 2904);
        FuncionarioCargo fC2 = new FuncionarioCargo(f2, c1, 8601);
        FuncionarioCargo fC3 = new FuncionarioCargo(f3, c1, 2402);
        FuncionarioCargo fC4 = new FuncionarioCargo(f3, c2, 1905);
        FuncionarioCargo fC5 = new FuncionarioCargo(f4, c3, 1111);
        

        emp.addFuncionarioCargo(fC1);
        emp.addFuncionarioCargo(fC2);
        emp.addFuncionarioCargo(fC3);
        emp.addFuncionarioCargo(fC4);
        emp.addFuncionarioCargo(fC5);

        // Adicionar Tipos de Miniatura
        Tipo barco = new Tipo("barco");
        Tipo carro = new Tipo("carro");

        emp.addTipo(barco);
        emp.addTipo(carro);

        // Adicionar Escalas para as Miniaturas
        Escala esc10 = new Escala(10);
        Escala esc20 = new Escala(20);
        Escala esc30 = new Escala(30);

        emp.adicionarEscala(esc30);
        emp.adicionarEscala(esc20);
        emp.adicionarEscala(esc10);

        // Adicionar Miniaturas
        Miniatura mini1 = new Miniatura("Traineira", "navigator",
                "geral@navigator.com", "azul", "madeira", 2020, barco,
                23.0, f2);

        PrecoMiniatura pM1 = new PrecoMiniatura(mini1, esc10, 50);
        PrecoMiniatura pM2 = new PrecoMiniatura(mini1, esc20, 20);
        PrecoMiniatura pM3 = new PrecoMiniatura(mini1, esc30, 15);
        emp.addPrecoMiniatura(pM1);
        emp.addPrecoMiniatura(pM2);
        emp.addPrecoMiniatura(pM3);

        Miniatura mini2 = new Miniatura("Carocha", "navigator",
                "geral@navigator.com", "vermelho", "aluminio", 2020, carro,
                23.0, f2);

        PrecoMiniatura pM4 = new PrecoMiniatura(mini2, esc10, 20);
        PrecoMiniatura pM5 = new PrecoMiniatura(mini2, esc20, 5);
        emp.addPrecoMiniatura(pM4);
        emp.addPrecoMiniatura(pM5);

        Miniatura mini3 = new Miniatura("Tesla", "navigator",
                "geral@navigator.com", "preto", "aluminio", 2020, carro,
                23.0, f3);
        PrecoMiniatura pM6 = new PrecoMiniatura(mini3, esc10, 70);
        emp.addPrecoMiniatura(pM6);

        Acessorio acess = new Acessorio("Capacete", "navigator", "geral@navigator.com",
                15.0, 23.0, f3);

        emp.getRegItem().adicionarMiniatura(mini1);
        emp.getRegItem().adicionarMiniatura(mini2);
        emp.getRegItem().adicionarMiniatura(mini3);
        emp.getRegItem().adicionarAcessorio(acess);
        emp.getRegItem().adicionarItem(mini1);
        emp.getRegItem().adicionarItem(mini2);
        emp.getRegItem().adicionarItem(mini3);
        emp.getRegItem().adicionarItem(acess);

        // Adicionar Clientes
        Cliente cl1 = new Cliente("Joana Ferraz", "222333444", new Date(01, 02, 1995),
                "952123234", "joana@ferraz.com", "Rua de Rio Tinto, 4435-233", 1995);
        Cliente cl2 = new Cliente("João Ferraz", "222333445", new Date(01, 02, 1994),
                "952123234", "joao@ferraz.com", "Rua de Rio Tinto, 4435-233", 1994);

        emp.adicionaCliente(cl1);
        emp.adicionaCliente(cl2);

        return emp;
    }

    public static Empresa carregarDadosFicheiro() {
//        String nomeFic;
//        nomeFic = JOptionPane.showInputDialog(null, "Qual o nome do ficheiro? ");
        Empresa emp = ManipulacaoFicheiros.lerInformacaoOrganizaco("empresa.dat");
        return emp;
    }

    public static void gravarDadosFicheiro(Empresa emp) {
//        String nomeFic;
//        nomeFic = JOptionPane.showInputDialog(null, "Qual o nome quer dar ao ficheiro? ");
        boolean resp = ManipulacaoFicheiros.gravarInformacaoOrganizacao("lcf.dat", emp);
        return;
    }
}
