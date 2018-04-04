package br.com.owl.stock.model.DataAccessObject;

import br.com.owl.db.$CRUD;
import br.com.owl.db.DB;
import br.com.owl.stock.model.ValueObject.Cliente;

import java.util.ArrayList;

public class ClienteDAO implements $CRUD {

    private String daoCliTabelas;
    private String[] daoCliColunas;
    private ArrayList<Cliente> daoCliValores;
    private String daoCliParamentros;

    private DB db = new DB();


    @Override
    public String createObject() {
        return null;
    }

    @Override
    public String readObject() {
        return null;
    }

    @Override
    public String updateObject() {
        return null;
    }

    @Override
    public String deleteObject() {
        return null;
    }


    public String getDaoCliTabelas() {
        return daoCliTabelas;
    }

    public void setDaoCliTabelas(String daoCliTabelas) {
        this.daoCliTabelas = daoCliTabelas;
    }

    public String[] getDaoCliColunas() {
        return daoCliColunas;
    }

    public void setDaoCliColunas(String[] daoCliColunas) {
        this.daoCliColunas = daoCliColunas;
    }

    public ArrayList<Cliente> getDaoCliValores() {
        return daoCliValores;
    }

    public void setDaoCliValores(ArrayList<Cliente> daoCliValores) {
        this.daoCliValores = daoCliValores;
    }

    public String getDaoCliParamentros() {
        return daoCliParamentros;
    }

    public void setDaoCliParamentros(String daoCliParamentros) {
        this.daoCliParamentros = daoCliParamentros;
    }

}
