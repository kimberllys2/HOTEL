/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Reserva {
    String dataincial_reserva,datafinal_reserva,codigo_reserva ;

    public Reserva(String dataincial_reserva, String datafinal_reserva, String codigo_reserva) {
        this.dataincial_reserva = dataincial_reserva;
        this.datafinal_reserva = datafinal_reserva;
        this.codigo_reserva = codigo_reserva;
    }

    public String getDataincial_reserva() {
        return dataincial_reserva;
    }

    public void setDataincial_reserva(String dataincial_reserva) {
        this.dataincial_reserva = dataincial_reserva;
    }

    public String getDatafinal_reserva() {
        return datafinal_reserva;
    }

    public void setDatafinal_reserva(String datafinal_reserva) {
        this.datafinal_reserva = datafinal_reserva;
    }

    public String getCodigo_reserva() {
        return codigo_reserva;
    }

    public void setCodigo_reserva(String codigo_reserva) {
        this.codigo_reserva = codigo_reserva;
    }

   
}
