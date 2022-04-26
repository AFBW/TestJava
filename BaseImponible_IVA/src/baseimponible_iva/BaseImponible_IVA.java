/*
 *Un economista nos ha encargado un programa para realizar calculos con el IVA.
LA aplicacion debe solicitar la base imponible y el IVA a aplicar.
Mostrar por pantalla el Importe correspondiente al IVA y el Total.
 */
package baseimponible_iva;

import java.util.Locale;
import java.util.Scanner;

public class BaseImponible_IVA {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    double iva;
    double baseImponible;
    
    System.out.print("Introduce el porcentaje del IVA a aplicar: ");
    iva=entrada.nextDouble();
    
    System.out.print("Introduce la base imponible: ");
    baseImponible=entrada.nextDouble();
    
    baseImponible -= ((iva/100)*baseImponible);
    
    System.out.println("Para tu sueldo es de "+baseImponible+"€ para un IVA aplicado de "+iva+" ");
    
  }
  
}
