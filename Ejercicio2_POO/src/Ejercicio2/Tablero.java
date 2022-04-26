/*
Ejercicio2: Contruir un programa que permita dirigir el movimiento de un objeto dentro de un tablero
y actualice su posicion dentro del mismo. Los movimientos posibles son: ARRIBA, ABAJO, DERECHA E IZQUIERDA
Tras cada movimiento el programa mostrara la nueva direccion elegida y las coordenadas de situacion del
objeto dentro del tablero.
 */
package Ejercicio2;

public class Tablero {
  //Atributos
    private int x;
    private int y;
    
    //Metodos
    
    //Metodo Constructor
    public Tablero(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void moverArriba(int incremento){
        y = y + incremento;
    }
    
    public void moverAbajo(int incremento){
        y = y - incremento;
    }
    
    public void moverDerecha(int incremento){
        x = x + incremento;
    }
    
    public void moverIzquierda(int incremento){
        x = - incremento;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    

}
