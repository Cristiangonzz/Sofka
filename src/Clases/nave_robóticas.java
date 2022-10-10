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
public class nave_robóticas extends NaveEspacial {
    
    private String Planeta_a_Estudiar;//satélite artificial, una sonda o una nave tripulada.
    private String Tipo_combustible;//combustible químico sólido o bien propelente líquido, o ambos.

    public nave_robóticas() {

    }

    public nave_robóticas(String Nombre, String descripcion, int potencia,String Planeta_a_Estudiar,String combustible ) {
        super(Nombre, descripcion, potencia);
        this.Planeta_a_Estudiar = Planeta_a_Estudiar;
        this.Tipo_combustible = combustible;
    }

    public String getPlaneta_a_Estudiar() {
        return Planeta_a_Estudiar;
    }

    public void setPlaneta_a_Estudiar(String Planeta_a_Estudiar) {
        this.Planeta_a_Estudiar = Planeta_a_Estudiar;
    }

    public String getTipo_combustible() {
        return Tipo_combustible;
    }

    public void setTipo_combustible(String Tipo_combustible) {
        this.Tipo_combustible = Tipo_combustible;
    }
    
}
