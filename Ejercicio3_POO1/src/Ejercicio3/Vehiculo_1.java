/*
Ejercicio3: Construir un programa que dada una serie de vehiculos caracterizados
por su marca, modelo y precio, imprima las propiedades del vehiculo mas barato.
Para ello se debera leer por teclado las caracteristicas de cada vehiculo y
crear una clase que represente a cada uno de ellos
*/
package Ejercicio3;

public class Vehiculo {
    public String marca;
    public String modelo;
    public  float precio;

    //Constructor
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: €"+precio+"\n";
    }
    
    
}
