/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC03_EspecificarTipoController;
import model.Empresa;
import utils.Utils;

/**
 *
 * @author Margarida Melo
 * @author Teresa Pinto
 * @author Inês Morgado
 */
public class UC03_EspecificarTipoUI {

    private UC03_EspecificarTipoController controller;

    public UC03_EspecificarTipoUI(Empresa empresa) {
        controller = new UC03_EspecificarTipoController(empresa);
    }

    public void run() {
        System.out.println("\nNovo tipo:");

        controller.novoTipo();       
        
        introduzDados();
        
        System.out.println(apresentaDados()); 
                
        if (Utils.confirma("Confirma os dados do Tipo? (S/N)")) {
            
            if (controller.registaTipo() == true) {
                System.out.println("Tipo registado com sucesso.");
            } else {
                System.out.println("Tipo não registado. - Dados errados");
            }
            
        } else {
            System.out.println("Tipo não registado.");
        }    
    }

    private void introduzDados() {
        String desigTipo = Utils.readLineFromConsole("Introuza o tipo: ");
        controller.setDados(desigTipo);
    }

    public String apresentaDados() {
        return controller.getTipoAsString();
    }
}
