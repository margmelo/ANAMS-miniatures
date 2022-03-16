/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */
public class Utils {

    static public String readLineFromConsole(String strPrompt) {
        try {
            System.out.println(strPrompt);

            InputStreamReader converter = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(converter);

            return in.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    static public Date readDateFromConsole(String strPrompt) {
        do {
            try {
                String strDate = readLineFromConsole(strPrompt);

                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

                Date date = df.parse(strDate);

                return date;
            } catch (ParseException ex) {
                System.out.println("Formato errado.");
                //Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

    static public boolean confirma(String sMessage) {
        String strConfirma;
        do {
            strConfirma = Utils.readLineFromConsole("\n" + sMessage + "\n");
        } while (!strConfirma.equalsIgnoreCase("s") && !strConfirma.equalsIgnoreCase("n"));

        return strConfirma.equalsIgnoreCase("s");
    }

    // Apresenta uma lista de objetos e coloca uma pergunta cujo texto é passado ao argumento sHeader
    static public Object apresentaESeleciona(List list, String sHeader) {
        apresentaLista(list, sHeader);
        return selecionaObject(list);
    }

    static public void apresentaLista(List list, String sHeader) {
        System.out.println(sHeader);

        int index = 0;
        for (Object o : list) {
            index++;

            System.out.println(index + ". " + o.toString());
        }
        System.out.println("");
        System.out.println("0 - Cancelar");
    }

    static public Object selecionaObject(List list) {
        String opcao;
        int nOpcao;
        do {
            nOpcao = Utils.IntFromConsole("Introduza opção: ");

        } while (nOpcao < 0 || nOpcao > list.size());

        if (nOpcao == 0) {
            return null;
        } else {
            return list.get(nOpcao - 1);
        }
    }

    public static int IntFromConsole(String strPrompt) {
        do {
            try {
                String strInt = readLineFromConsole(strPrompt);

                int iInt = Integer.parseInt(strInt);

                return iInt;
            } catch (NumberFormatException ex) {
                //Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }
}
