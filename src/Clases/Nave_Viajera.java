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
public class Nave_Viajera extends NaveEspacial {
    //Viaja para hacerle un tour a la gente a traves de la luna , martes y diferentes planetas del sistema solar .
   
     private int PerMax;
     private String destino;
     private int costo;
     
     public Nave_Viajera(){
        
    }
     
    public Nave_Viajera(String Nombre, String descripcion, int potencia ,int maxima,String destino,int costo){
        super(Nombre,descripcion,potencia);
        this.PerMax = maxima;
        this.destino = destino;
        this.costo = costo;
    } 
    /*public Nave_Viajera(int maxima,String destino,float costo){
        this.PerMax = maxima;
        this.destino = destino;
        this.costo = costo;
    }*/
    public int getPerMax() {
        return PerMax;
    }

    public void setPerMax(int PerMax) {
        this.PerMax = PerMax;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
}
