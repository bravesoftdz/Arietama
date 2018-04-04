package br.com.owl.utils;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propriedades {

    public static Properties getProp() {
        Properties props = new Properties();
        FileInputStream file = null;
        try {
            file = new FileInputStream ("./ppd/databaseConnection.properties");
            props.load(file);
        } catch (FileNotFoundException e) {
            System.out.println ("Arquivo de configuração não encontrado!");
            JOptionPane.showConfirmDialog (null,"Arquivo de configuração não encontrado!","ERRO!",JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }

        return props;
    }
}
