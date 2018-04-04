package br.com.owl.stock.model.DataAccessObject;

public class UsuarioDAO {

    private String[] grupoUsuario;

    public UsuarioDAO() {
        super();
        this.grupoUsuario = null;
    }

    public String[] getGrupoUsuario() {
        return grupoUsuario;
    }

    public void setGrupoUsuario(String[] grupoUsuario) {
        this.grupoUsuario = grupoUsuario;
    }
}
