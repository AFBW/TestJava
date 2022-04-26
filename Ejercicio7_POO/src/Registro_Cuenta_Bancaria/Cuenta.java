
package Registro_Cuenta_Bancaria;

public class Cuenta {
//Atributos
    private int numeroCuenta;
    private double saldo;
    
    //Metodos
    //Metodo Constructor
    
    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    //Metodos Getters
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    //Metodo para modificar el saldo, void (no retorna nada)
    
    public void ingresarDinero(double cantidad){
        saldo += cantidad;
    }
    
    public void retirarDinero(double cantidad){
        saldo -= cantidad;
    }
        
}
