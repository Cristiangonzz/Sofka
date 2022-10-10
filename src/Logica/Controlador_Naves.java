/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.NaveEspacial;
import Clases.Nave_Viajera;
import Clases.Nave_lanzadera;
import Clases.nave_robóticas;
import Clases.nave_tripuladas;
import Interface.InterfaceEspacial;
import Servicios.Servicio_Espacial_DB;
import java.util.ArrayList;

/**
 *
 * @author Cristian González
 */
public class Controlador_Naves implements InterfaceEspacial {
    private static Controlador_Naves instancia;
    private Servicio_Espacial_DB ServicioEspacial;
   

    public Controlador_Naves() {
        this.ServicioEspacial = new Servicio_Espacial_DB();
       
    }

    

    public static Controlador_Naves getinstancia() {
        if (instancia == null) {
            instancia = new Controlador_Naves();
        }
        return instancia;
    }
    
    public String CreandoNaveViajera(String nombre,String Descripcion,int potencia,int max,String destino,int costo) {

        boolean veriNombre = true;
       
        String valido = "E";//Error si es que no se ejecuta

        veriNombre = ServicioEspacial.validarNave(nombre);
        

        if (veriNombre == false) {
            NaveEspacial u = new NaveEspacial(nombre,Descripcion,potencia);
            Nave_Viajera v = new Nave_Viajera(nombre,Descripcion,potencia,max,destino,costo);
            ServicioEspacial.Crear_NaveEspacial(u);
            ServicioEspacial.Crear_Nave_Viajera(v);
            
            valido = "V";//Usuario valido
            return valido;

        } else {
            valido = "I"; // Usuario es invalido

        }
        return valido;
    }
    
    public String CreandoNaveLanzadera(String nombre,String Descripcion,int potencia,String carga,String combustible) {

        boolean veriNombre = true;
       
        String valido = "E";//Error si es que no se ejecuta

        veriNombre = ServicioEspacial.validarNave(nombre);
        

        if (veriNombre == false) {
            NaveEspacial u = new NaveEspacial(nombre,Descripcion,potencia);
            Nave_lanzadera L = new Nave_lanzadera(nombre,Descripcion,potencia,carga,combustible);
            ServicioEspacial.Crear_NaveEspacial(u);
            ServicioEspacial.Crear_Nave_Lanzadera(L);
            
            valido = "V";//Usuario valido
            return valido;

        } else {
            valido = "I"; // Usuario es invalido

        }
        return valido;
    }
    
    public String CreandoNaveRobotica(String nombre,String Descripcion,int potencia,String planeta,String tipoCombustible) {

        boolean veriNombre = true;
       
        String valido = "E";//Error si es que no se ejecuta

        veriNombre = ServicioEspacial.validarNave(nombre);
        

        if (veriNombre == false) {
            NaveEspacial u = new NaveEspacial(nombre,Descripcion,potencia);
            nave_robóticas r = new nave_robóticas (nombre,Descripcion,potencia,planeta,tipoCombustible);
            ServicioEspacial.Crear_NaveEspacial(u);
            ServicioEspacial.Crear_Nave_Robotica(r);
            
            valido = "V";//Usuario valido
            return valido;

        } else {
            valido = "I"; // Usuario es invalido

        }
        return valido;
    }
     
    public String CreandoNaveTripulada(String nombre,String Descripcion,int potencia,String mision) {

        boolean veriNombre = true;
       
        String valido = "E";//Error si es que no se ejecuta

        veriNombre = ServicioEspacial.validarNave(nombre);
        

        if (veriNombre == false) {
            NaveEspacial u = new NaveEspacial(nombre,Descripcion,potencia);
            nave_tripuladas t = new nave_tripuladas (nombre,Descripcion,potencia,mision);
            ServicioEspacial.Crear_NaveEspacial(u);
            ServicioEspacial.Crear_Nave_Tripuladas(t);
            
            valido = "V";//Usuario valido
            return valido;

        } else {
            valido = "I"; // Usuario es invalido

        }
        return valido;
    }
    
    public ArrayList<NaveEspacial> InventarioNaves(String nom) {
        ArrayList<NaveEspacial> naves = new ArrayList<>();
        try {
            naves = ServicioEspacial.InventarioNave(nom);
        } catch (Exception e) {
            System.out.println("Error en buscar el nombre de los espetaculos por el nombre del artista");
        }
        return naves;
    }
    
    
     public ArrayList<NaveEspacial> inventario(){
        ArrayList<NaveEspacial> datos = new ArrayList<>();
        datos = this.ServicioEspacial.Inventario();
        return datos;
    }
    
    
    public int Encontrar_Nave(String nombre) {
        if (ServicioEspacial.Encontrar_Nave(nombre) == 1) {
            return 1;//lanzadera
        } else if (ServicioEspacial.Encontrar_Nave(nombre) == 2) {
            return 2;//robotica
        } else if (ServicioEspacial.Encontrar_Nave(nombre) == 3) {
            return 3;//tripulada
        } else if (ServicioEspacial.Encontrar_Nave(nombre) == 4){
            return 4;//viajera
        }else {
            return 5;//error
        }

    }
    
    
}
