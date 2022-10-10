/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Cristian González
 */
public class nave_tripuladas extends NaveEspacial {
    private String mision;//Mision lunares, experimento,mantenimiento

    public nave_tripuladas() {

    }

    public nave_tripuladas(String Nombre, String descripcion, int potencia, String mision) {
        super(Nombre, descripcion, potencia);
        this.mision = mision;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }
    
}
