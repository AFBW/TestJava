
package com.mycompany.ejercicio3_poo;

import Ejercicio3.Vehiculo;
import java.util.Scanner;

public class Main {
    public static float indiceCocheMasBarato(Vehiculo coches[]){
    float precio;
    float indice=0;
    int numeroVehiculos = 0,indiceBarato;
    
    precio=coches[0].getPrecio();
    for(int i=0; i<=numeroVehiculos ; i++){
        if(coches[i].getPrecio()<precio){
            precio = coches[i].getPrecio();
            indice = i;
        }
    }
        return indice;
      }

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;
        
        System.out.print("Digita la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();
        
        //Creamos los objetos para los coches
        Vehiculo coches[]= new Vehiculo[numeroVehiculos];
        
        for(int i=0 ; i<=numeroVehiculos ; i++){
            
            System.out.println("\nDigite las caracteristicas del coche "+(i+1)+":");
            
            System.out.print("Introduzca la marca ");
            marca = entrada.nextLine();
            
            System.out.print("Introduzca el modelo ");
            modelo = entrada.nextLine();
            
            System.out.print("Introduzca el precio ");
            precio = entrada.nextFloat();
            
            coches[i]= new Vehiculo(marca, modelo, precio);
        }
        indiceBarato = indiceCocheMasBarato(coches);
        System.out.println("\nEl coche mas barato es ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
