package Ejercicio5;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {
    
    /*Metodo Estatico para calcular el Mayor Area de un Arreglo,
    por lo tanto le tengo que enviar todos los objetos de triangulos*/
    public static double mayorArea(Triangulo_Isoceles[] triangulos){
        
        double area;
        
        //Inicializamos con el Primer triangulo
        area = triangulos[0].obtenerArea();
        
        //
        for(int i=1 ; i<triangulos.length ; i++){
            
            if(triangulos[i].obtenerArea()>area){
                
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Variables
        double base,lado;
        int numeroTriangulos;
        
        System.out.print("Introduce el numero de triangulos: ");
        numeroTriangulos = entrada.nextInt();
        
        //Creamos los Objetos(Triangulos)
        Triangulo_Isoceles[] triangulos = new Triangulo_Isoceles[numeroTriangulos];
        
        for(int i=1 ; i<triangulos.length ; i++){
            System.out.println("Introduce los valores del triangulo "+i+":");
            System.out.print("Introduce la base: ");
            base = entrada.nextDouble();
            System.out.print("Introduce el lado: ");
            lado = entrada.nextDouble();
            
            //Almacenamos los datos de todos los Triangulos
            triangulos[i] = new Triangulo_Isoceles(base, lado);
            
            System.out.print("El Perimetro es: "+triangulos[i].obtenerPerimetro());
            System.out.println("\nEl Area es: "+triangulos[i].obtenerArea());
        }
        System.out.println("El Area del triangulo de mayor superficie es: "+mayorArea(triangulos));
    }  
}
