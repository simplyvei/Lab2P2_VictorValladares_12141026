/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_victorvalladares_12141026;

/**
 *
 * @author valla
 */
public class Animales {
    private String nombreC;
    private String nombreComun;
    private String habitat;
    private String alimentacion;
    private String descripcion;
    private String geografica;
    private int vida;
    
    public Animales(){
        
    }
    public Animales(String nombreC, String nombreComun, String habitat, String alimentacion, String descripcion, String geografica, int vida){
        this.nombreC = nombreC;
        this.nombreComun = nombreComun;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.descripcion = descripcion;
        this.geografica = geografica;
        this.vida = vida;
    }
    
    public void setNombreC(String nombreC){
        this.nombreC = nombreC;
    }
    public String getNombreC(){
        return nombreC;
    }
    public void setNombreComun(String nombreComun){
        this.nombreComun = nombreComun;
    }
    public String getNombreComun(){
        return nombreComun;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getHabitat(){
        return habitat;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setAlimentacion(String alimentacion){
        this.alimentacion = alimentacion;
    }
    public String getAlimentacion(){
        return alimentacion;
    }
    public void setGeografica(String geografica){
        this.geografica = geografica;
    }
    public String getGeografica(){
        return geografica;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida(){
        return vida;
    }
}
