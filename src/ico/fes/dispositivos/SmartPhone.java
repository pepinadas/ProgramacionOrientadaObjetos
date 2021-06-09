/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.dispositivos;

/**
 *
 * @author Personal
 */
public class SmartPhone {
    private String marca;
    private String modelo;
    private String color;
    private float tamanio;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String color, float tamanio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tamanio = tamanio;
    }

    public SmartPhone(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamanio=" + tamanio + '}';
    }
    
    public boolean encender(){
        System.out.println("Encendiendo el equipo "+ this.marca );
        return true;
    }
    
    public int llamar(int numeroDestino){
        System.out.println("Llamando al numero "+ numeroDestino );
        return 60;
    }
    
    public void tomarFoto(){
        System.out.println("Tomando foto ....");
    }
    
}
