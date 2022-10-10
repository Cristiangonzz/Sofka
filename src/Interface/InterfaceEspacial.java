/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Clases.NaveEspacial;
import java.util.ArrayList;

/**
 *
 * @author Cristian González
 */
public interface InterfaceEspacial {
    
    public abstract ArrayList<NaveEspacial> inventario();
    public abstract int Encontrar_Nave(String nombre);
    public abstract ArrayList<NaveEspacial> InventarioNaves (String nom);
    public abstract String CreandoNaveTripulada(String nombre,String Descripcion,int potencia,String mision);
    public abstract String CreandoNaveRobotica(String nombre,String Descripcion,int potencia,String planeta,String tipoCombustible);
    public abstract String CreandoNaveLanzadera(String nombre,String Descripcion,int potencia,String  carga,String combustible);
    public abstract String CreandoNaveViajera(String nombre,String Descripcion,int potencia,int max,String destino,int costo);
}
