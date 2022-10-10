/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

import Interface.InterfaceEspacial;
import Logica.Controlador_Naves;

/**
 *
 * @author Cristian González
 */
public class Fabrica {
    
    private static Fabrica instancia;
    
    private Fabrica() {
    }


    public static Fabrica getInstance() {
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }
    
     

    public InterfaceEspacial getIControladorEspacial() {
        InterfaceEspacial Controlador = Controlador_Naves.getinstancia();
        return Controlador;

    }
    
}
