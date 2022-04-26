/*
 Diseñar un programa para trabajar con triangulos Isoceles.
Para ello defina los atributos necesarios que se requieren,
proporcione metodos de consulta, un metodo constructor e 
implemente metodos para calcular el perimetro y el area 
de un triangulo, ademas implementar un metodo que apartir
de un arreglo de triangulos devuelva el area del triangulo
de mayor superficie
 */

/*
Triangulo_Isoceles:
-base: double;
-lado: double;
---------------
triangulo_Isoceles(double base, double lado)
obtenerPerimetro(): double;
obtenerArea(): double;
*/
package Ejercicio5;

public class Triangulo_Isoceles {
    
    //Atributos:
    private double base, lado;
    
    //Constructor
    public Triangulo_Isoceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    //Metodo Obtener Perimetro
    public double obtenerPerimetro(){
        double perimetro = 2*lado*base;
        return perimetro;
    }
    
    //Metoto obtener Area
    public double obtenerArea(){
        double area = (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
        return area;
    }
    
}
