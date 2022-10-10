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
public class Nave_lanzadera extends NaveEspacial {

    private String nombre_carga;//satélite artificial, una sonda o una nave tripulada.
    private String Tipo_combustible;//combustible químico sólido o bien propelente líquido, o ambos.

    public Nave_lanzadera() {

    }

    public Nave_lanzadera(String Nombre, String descripcion, int potencia, String carga, String tipoCombustible) {
        super(Nombre, descripcion, potencia);
        this.nombre_carga = carga;
        this.Tipo_combustible = tipoCombustible;
    }

    public String getNombre_carga() {
        return nombre_carga;
    }

    public void setNombre_carga(String nombre_carga) {
        this.nombre_carga = nombre_carga;
    }

    public String getTipo_combustible() {
        return Tipo_combustible;
    }

    public void setTipo_combustible(String Tipo_combustible) {
        this.Tipo_combustible = Tipo_combustible;
    }
    

}
