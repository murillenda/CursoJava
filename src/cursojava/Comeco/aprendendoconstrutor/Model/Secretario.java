package cursojava.Comeco.aprendendoconstrutor.Model;

import cursojava.Comeco.aprendendoconstrutor.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
    private String registro;
    private String nivelCargo;
    private String experiencia;
    private String login;
    private String senha;

    public Secretario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    public Secretario() {
    }


    @Override
    public double salario() {
        return 1800.80 * 0.9;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Esse é o método do contrato de autenticação

    @Override
    public Boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }

    @Override
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha;
        return autenticar();
    }
}
