/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Hospede {
    String id_hospede,nome_hospede,estado_hospede,cidade_hospede,bairro_hospede,rua_hospede,numero_hospede,login_cli,senha_cli ;

    public Hospede(String id_hospede, String nome_hospede, String estado_hospede, String cidade_hospede, String bairro_hospede, String rua_hospede, String numero_hospede, String login_cli, String senha_cli) {
        this.id_hospede = id_hospede;
        this.nome_hospede = nome_hospede;
        this.estado_hospede = estado_hospede;
        this.cidade_hospede = cidade_hospede;
        this.bairro_hospede = bairro_hospede;
        this.rua_hospede = rua_hospede;
        this.numero_hospede = numero_hospede;
        this.login_cli = login_cli;
        this.senha_cli = senha_cli;
    }

    public String getId_hospede() {
        return id_hospede;
    }

    public void setId_hospede(String id_hospede) {
        this.id_hospede = id_hospede;
    }

    public String getNome_hospede() {
        return nome_hospede;
    }

    public void setNome_hospede(String nome_hospede) {
        this.nome_hospede = nome_hospede;
    }

    public String getEstado_hospede() {
        return estado_hospede;
    }

    public void setEstado_hospede(String estado_hospede) {
        this.estado_hospede = estado_hospede;
    }

    public String getCidade_hospede() {
        return cidade_hospede;
    }

    public void setCidade_hospede(String cidade_hospede) {
        this.cidade_hospede = cidade_hospede;
    }

    public String getBairro_hospede() {
        return bairro_hospede;
    }

    public void setBairro_hospede(String bairro_hospede) {
        this.bairro_hospede = bairro_hospede;
    }

    public String getRua_hospede() {
        return rua_hospede;
    }

    public void setRua_hospede(String rua_hospede) {
        this.rua_hospede = rua_hospede;
    }

    public String getNumero_hospede() {
        return numero_hospede;
    }

    public void setNumero_hospede(String numero_hospede) {
        this.numero_hospede = numero_hospede;
    }

    public String getLogin_cli() {
        return login_cli;
    }

    public void setLogin_cli(String login_cli) {
        this.login_cli = login_cli;
    }

    public String getSenha_cli() {
        return senha_cli;
    }

    public void setSenha_cli(String senha_cli) {
        this.senha_cli = senha_cli;
    }

   
}
