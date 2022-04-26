
package Registro_Cuenta_Bancaria;

public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;
    private String dni;
    Cuenta cuentas[];
    
    //Metodos
    //Metodo Constructor
    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }
    
    //Metodos Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
    
    //Metodos Acciones
    
    public double consultar_saldo(int n){
        return cuentas[n].getSaldo();
    }
    
    public void ingresar_dinero(int n, double cantidad){
        cuentas[n].ingresarDinero(cantidad);
    }
    
    public void retirar_dinero(int n, double cantidad){
        cuentas[n].retirarDinero(cantidad);
    }
}
