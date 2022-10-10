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
public class NaveEspacial {
    private String Nombre ,descripcion;
    private int potencia ;
    //nave 1 , peso 2900 , potencia 32000×5 caballos , EE.UU , nombre: Saturno V.
    //Metodo 1 : despegar : dar un mensaje decrciente , 3..2..1 
    //Metodo 2 : abrir compuertas para la entrada de personas ,o objeto como sateltes.
    //Metodo 3 : que le hagan una revsion .
    
    public NaveEspacial(){
        
    }
    
    public NaveEspacial (String Nombre_,String descripcion,int potencia){
        this.Nombre = Nombre_;
        this.descripcion = descripcion;  
        this.potencia = potencia;
       
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    
   
    
    
}
