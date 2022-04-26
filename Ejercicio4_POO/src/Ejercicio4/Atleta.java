/*
Ejercicio4: Construir un programa para una competicion de atletismo, el programa debe 
gestionar una serie de atletas caracterizado por su numero de atleta, nombre y tiempo de carrera,
al final el programa debe mostrar los datos del atleta ganador de la carrera.
 */
package Ejercicio4;

public class Atleta {
    //Atributos
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    //Metodos:
    
    //Metodo Constructor
    public Atleta(int numeroAtleta, String nombre, float tiempo) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempo;
        
    }
    //Metodo para obtener el tiempo de carrera
    public float getTiempoCarrera() {
        return tiempoCarrera;
    }
    //Metodo para mostrar los datos del Atleta ganador
    public String mostrarDatosGanador(){
        return "Numero del Atleta:"+numeroAtleta+"\nNombre: "+nombre+"\nTiempo:"+tiempoCarrera+"\n";
    }
    

}
