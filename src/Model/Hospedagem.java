/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Hospedagem {
    String id_hospedagem,id_hospede,numero_quarto,data_incial_hospedagem ,total_diaria,total_hospedagem;

    public Hospedagem(String id_hospedagem, String id_hospede, String numero_quarto, String data_incial_hospedagem, String total_diaria, String total_hospedagem) {
        this.id_hospedagem = id_hospedagem;
        this.id_hospede = id_hospede;
        this.numero_quarto = numero_quarto;
        this.data_incial_hospedagem = data_incial_hospedagem;
        this.total_diaria = total_diaria;
        this.total_hospedagem = total_hospedagem;
    }

    public String getId_hospedagem() {
        return id_hospedagem;
    }

    public void setId_hospedagem(String id_hospedagem) {
        this.id_hospedagem = id_hospedagem;
    }

    public String getId_hospede() {
        return id_hospede;
    }

    public void setId_hospede(String id_hospede) {
        this.id_hospede = id_hospede;
    }

    public String getNumero_quarto() {
        return numero_quarto;
    }

    public void setNumero_quarto(String numero_quarto) {
        this.numero_quarto = numero_quarto;
    }

    public String getData_incial_hospedagem() {
        return data_incial_hospedagem;
    }

    public void setData_incial_hospedagem(String data_incial_hospedagem) {
        this.data_incial_hospedagem = data_incial_hospedagem;
    }

    public String getTotal_diaria() {
        return total_diaria;
    }

    public void setTotal_diaria(String total_diaria) {
        this.total_diaria = total_diaria;
    }

    public String getTotal_hospedagem() {
        return total_hospedagem;
    }

    public void setTotal_hospedagem(String total_hospedagem) {
        this.total_hospedagem = total_hospedagem;
    }

}