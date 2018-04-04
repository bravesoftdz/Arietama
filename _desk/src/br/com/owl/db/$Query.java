package br.com.owl.db;

public interface $Query {

    String insertSQL(String tabela, StringBuilder colunas, StringBuilder valores, String parametros);
    String updatetSQL(String tabela, String[] colunas, String[] valores, String condicao, String parametros);
    String selectSQL(String tabela, String colunas, String parametros);
    String deleteSQL(String tabela, String parametros);

}
