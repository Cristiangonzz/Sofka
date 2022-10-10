/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.NaveEspacial;
import Clases.Nave_Viajera;
import Clases.Nave_lanzadera;
import Clases.nave_robóticas;
import Clases.nave_tripuladas;
import Persistencia.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cristian González
 */
public class Servicio_Espacial_DB {
    private Connection conn = new ConexionDB().getConexion();
    
    /* public Servicio_Espacial_DB() {

    }*/
    
    public boolean validarNave(String nombre) {
        try {
            PreparedStatement status = conn.prepareStatement("SELECT * FROM naves_espaciales WHERE Nombre= ?");
            status.setString(1, nombre);
            ResultSet ResultadoConsulta = status.executeQuery();
            if (ResultadoConsulta.first()) {
                return true;
            } else {
                return false;// existe el usuario
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // No existe el usuario
        }
    }
    
    
    public boolean Crear_NaveEspacial(NaveEspacial u) {

        try {

            PreparedStatement result = conn.prepareStatement("INSERT INTO naves_espaciales (Nombre,Descripcion,potencia) VALUE (?,?,?)");
            result.setString(1, u.getNombre());
            result.setString(2, u.getDescripcion());
            result.setFloat(3, u.getPotencia());
            result.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);

        }
        return false;
    }
     
    public boolean Crear_Nave_Viajera(Nave_Viajera u) {

        try {

            PreparedStatement result = conn.prepareStatement("INSERT INTO nave_viajera (Nombre_Nave,Personas_Max,Destino,Costo) VALUE (?,?,?,?)");
            result.setString(1, u.getNombre());
            result.setInt(2, u.getPerMax());
            result.setString(3, u.getDestino());
            result.setFloat(4, u.getCosto());
            result.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);

        }
        return false;
    }
    
    public boolean Crear_Nave_Lanzadera(Nave_lanzadera u) {

        try {

            PreparedStatement result = conn.prepareStatement("INSERT INTO nave_lanzadera (Nombre_Nave,Nom_Carga,Tipo_Combustible) VALUE (?,?,?)");
            result.setString(1, u.getNombre());
            result.setString(2, u.getNombre_carga());
            result.setString(3, u.getTipo_combustible());
            result.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);

        }
        return false;
    }
    
    public boolean Crear_Nave_Robotica(nave_robóticas u) {

        try {

            PreparedStatement result = conn.prepareStatement("INSERT INTO nave_robotica (Nombre_Nave,Planeta_a_Estudiar,Tipo_Combustible) VALUE (?,?,?)");
            result.setString(1, u.getNombre());
            result.setString(2, u.getPlaneta_a_Estudiar());
            result.setString(3, u.getTipo_combustible());
            result.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);

        }
        return false;
    }

    public boolean Crear_Nave_Tripuladas(nave_tripuladas u) {

        try {

            PreparedStatement result = conn.prepareStatement("INSERT INTO nave_tripulada (Nombre_Nave,Mision) VALUE (?,?)");
            result.setString(1, u.getNombre());
            result.setString(2, u.getMision());
            result.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);

        }
        return false;
    }
     
    public ArrayList<NaveEspacial> InventarioNave(String nombre) {
        NaveEspacial es;
        ArrayList<NaveEspacial> nave = new ArrayList<>();
        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM naves_espaciales  WHERE Nombre = ?");
            consulta.setString(1, nombre);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                es = new NaveEspacial();//para que sean registros nuevos 
                es.setNombre(resultado.getString("Nombre"));
                es.setDescripcion(resultado.getString("Descripcion"));
                es.setPotencia(resultado.getInt("Potencia"));

                nave.add(es);
            }

            return nave;
        } catch (SQLException e) {
            System.out.println("Error al buscar Espetaculos");
        }
        return nave;
    }
    
    
    public int Encontrar_Nave(String nombre) {
        try {
            PreparedStatement consultar = conn.prepareStatement("SELECT * FROM nave_lanzadera WHERE Nombre_Nave = ?");
            consultar.setString(1, nombre);
            ResultSet resultado = consultar.executeQuery();
            
            if (resultado.next()) {
                return 1;//nave lanzadera
            } else {
                PreparedStatement consultar1 = conn.prepareStatement("SELECT * FROM nave_robotica WHERE Nombre_Nave = ?");
                consultar1.setString(1, nombre);
                ResultSet resultado1 = consultar1.executeQuery();
                if(resultado1.next()){
                    return 2;//nave robotica
                }else {
                    PreparedStatement consultar2 = conn.prepareStatement("SELECT * FROM nave_tripulada WHERE Nombre_Nave = ?");
                    consultar2.setString(1, nombre);
                    ResultSet resultado2 = consultar2.executeQuery();
                    if(resultado2.next()){
                        return 3;//nave tripulada
                    }else {
                         PreparedStatement consultar4 = conn.prepareStatement("SELECT * FROM nave_viajera WHERE Nombre_Nave = ?");
                         consultar4.setString(1, nombre);
                         ResultSet resultado4 = consultar4.executeQuery();
                         if(resultado4.next()){
                             return 4;//nave viajera
                         }
                        
                    }
                    
                }
            
            }
        } catch (Exception e) {
            System.out.println("Error al verificar que es artista o espectador");
        }
        return 5;

    }
    
   
    
   //Llenar inventario 
    
    public ArrayList<NaveEspacial> Inventario(){
        NaveEspacial model;
        ArrayList<NaveEspacial> datos = new ArrayList<>();
        
        try{
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM naves_espaciales");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                model = new NaveEspacial();
                model.setNombre(rs.getString("Nombre"));
                model.setDescripcion(rs.getString("Descripcion"));
                datos.add(model);
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
    
    
        
}
