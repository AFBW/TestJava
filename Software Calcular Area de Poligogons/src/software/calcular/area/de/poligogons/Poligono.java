package software.calcular.area.de.poligogons;

public abstract class Poligono {

    protected int numeroLados;

    //Constructor
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    //Getter
    public int getNumeroLados() {
        return numeroLados;
    }

    //Mostrar datos
    @Override
    public String toString() {
        return "Numero Lados" + numeroLados + '}';
    }
    
    //Metodo Area como abstrapto
    public abstract double area();

}