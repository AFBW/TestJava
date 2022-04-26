
package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static int indiceGanador(Atleta atletas[]){
        float tiempoCarrera;
        int indice=0;
        tiempoCarrera=atletas[indice].getTiempoCarrera();
        for(int i=1 ; i<atletas.length ; i++){
            if(atletas[i].getTiempoCarrera()< tiempoCarrera){
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice=i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numeroAtleta, nAtletas, indiceAtletaGanador;
        String nombre;
        float tiempoCarrera;
        
        System.out.print("Introduce el nº de atletas de la carrera:");
        nAtletas = entrada.nextInt();
        
        /*Una vez que sabemos el nº de Atletas 
        que vamos a tener creamos los objetos 
        para ese nº de atletas
        */
        
        Atleta atletas[] = new Atleta[nAtletas];
        
        for(int i=0 ; i<=nAtletas ; i++){
            System.out.println("\nDigite los datos del Atleta "+(i+1)+":");
            System.out.print("Introduzca el nº del Atleta: ");
            numeroAtleta = entrada.nextInt();
            System.out.print("Introduce el nombre del Atleta: ");
            nombre = entrada.nextLine();
            entrada.nextLine();
            System.out.print("Introduce el tiempo de carrera del Atleta: ");
            tiempoCarrera = entrada.nextFloat();
            
            atletas[i]= new Atleta(numeroAtleta, nombre, tiempoCarrera);            
        }
        indiceAtletaGanador = indiceGanador(atletas);
        System.out.println("El Atleta Ganador es: "+atletas[indiceAtletaGanador].mostrarDatosGanador());
    }
}
