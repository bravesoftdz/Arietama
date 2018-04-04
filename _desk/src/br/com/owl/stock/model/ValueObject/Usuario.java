package br.com.owl.stock.model.ValueObject;

public class Usuario {

    private String[] grupoUsuario;

    public Usuario() {
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
