
package software.calcular.area.de.poligogons;

public class Triangulo extends Poligono{
    private double lado1;
    private double lado2;
    private double lado3;
    
    //Constructor

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    //Getters

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    
    //Mostrar datos

    @Override
    public String toString() {
        return "Triandulo: \n"+super.toString() + "\nlado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }
    
    //Metodo Area
    @Override
    public double area(){
        double p = (lado1+lado2+lado3)/2;
        return Math.sqrt((p*(p-lado1)*(p-lado2)*(p-lado3)));
    }
    
    
}
