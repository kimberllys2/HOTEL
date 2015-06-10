/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Quarto {
    String disponibilidade_quarto,localizacao_quarto,descricao_quarto,preco_quarto;

    public Quarto(String disponibilidade_quarto, String localizacao_quarto, String descricao_quarto, String preco_quarto) {
        this.disponibilidade_quarto = disponibilidade_quarto;
        this.localizacao_quarto = localizacao_quarto;
        this.descricao_quarto = descricao_quarto;
        this.preco_quarto = preco_quarto;
    }

    public String getDisponibilidade_quarto() {
        return disponibilidade_quarto;
    }

    public void setDisponibilidade_quarto(String disponibilidade_quarto) {
        this.disponibilidade_quarto = disponibilidade_quarto;
    }

    public String getLocalizacao_quarto() {
        return localizacao_quarto;
    }

    public void setLocalizacao_quarto(String localizacao_quarto) {
        this.localizacao_quarto = localizacao_quarto;
    }

    public String getDescricao_quarto() {
        return descricao_quarto;
    }

    public void setDescricao_quarto(String descricao_quarto) {
        this.descricao_quarto = descricao_quarto;
    }

    public String getPreco_quarto() {
        return preco_quarto;
    }

    public void setPreco_quarto(String preco_quarto) {
        this.preco_quarto = preco_quarto;
    }

    
}
