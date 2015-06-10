/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Servico {
    String nome_servico,duracao_servico,valor_servico ;

    public Servico(String nome_servico, String duracao_servico, String valor_servico) {
        this.nome_servico = nome_servico;
        this.duracao_servico = duracao_servico;
        this.valor_servico = valor_servico;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

    public String getDuracao_servico() {
        return duracao_servico;
    }

    public void setDuracao_servico(String duracao_servico) {
        this.duracao_servico = duracao_servico;
    }

    public String getValor_servico() {
        return valor_servico;
    }

    public void setValor_servico(String valor_servico) {
        this.valor_servico = valor_servico;
    }
    
}
