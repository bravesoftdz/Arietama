package br.com.owl.db;

import br.com.owl.utils.Propriedades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB extends Propriedades implements $Query {

    private static final String USUARIO = getProp().getProperty ("prop.usuario");
    private static final String SENHA = getProp().getProperty ("prop.senha");
    private static final String URL = getProp().getProperty ("prop.url");
    private static final String DRIVER = getProp().getProperty ("prop.driver");

    // Conectar ao banco
    public static Connection abrir() throws Exception {
        // Registrar o driver
        Class.forName(DRIVER);
        // Capturar a conexão
        Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        // Retorna a conexao aberta
        return conn;
    }


    @Override
    public String insertSQL(String tabela, StringBuilder colunas, StringBuilder valores, String parametros) {

        try {
            Connection connection = abrir();
            PreparedStatement statement = connection.prepareStatement ("INSERT INTO "+tabela+" "+colunas+""+parametros+" " +
                    "VALUES "+valores);
            statement.execute ();

            statement.close ();
            connection.close ();

        } catch (Exception e) {
            e.printStackTrace ();
            System.out.println(e);
        }

        return null;
    }

    @Override
    public String updatetSQL(String tabela, String[] colunas, String[] valores, String condicao, String parametros) {
        return null;
    }

    @Override
    public String selectSQL(String tabela, String colunas, String parametros) {
        return null;
    }

    @Override
    public String deleteSQL(String tabela, String parametros) {
        return null;
    }
}
