
package software.calcular.area.de.poligogons;

public class Rectangulo extends Poligono{
    private double lado1;
    private double lado2;
    
    //Constructor

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //Getters

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }
    
    //Mostrar Datos

    @Override
    public String toString() {
        return "Rectangulo: \n"+ super.toString() + "\nlado1= " + lado1 + ", lado2= " + lado2;
    }
    
    //Metodo Area
    
    @Override
    public double area(){
        return lado1*lado2;
    }
    
    
}
