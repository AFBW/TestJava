/*
Pedir 3 numeros y Ordenarlos de mayor a menor
 */
package ordenar3numeros;

import java.util.Scanner;

public class Ordenar3Numeros {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int num1;
    int num2;
    int num3;
    
    System.out.print("Introduce el primer numero: ");
    num1=entrada.nextInt();
    System.out.print("Introduce el segundo numero: ");
    num2=entrada.nextInt();
    System.out.print("Introduce el tercer numero: ");
    num3=entrada.nextInt();
    
    if(num1>num2 && num2>num3){
      System.out.println(num1+" , "+num2+" , "+num3);
      
    }else if(num1<num2 && num2<num3){
      System.out.println(num3+" , "+num2+" , "+num1);
      
    }else if(num1<num2 && num2>num3){
      System.out.println(num2+" , "+num3+" , "+num1);
      
    }else if(num1<num2 && num2<num3){
      System.out.println(num3+" , "+num2+" , "+num1);
      
    }else if(num1>num3 && num3<num2){
      System.out.println(num1+" , "+num3+" , "+num2);
      
    }else if(num1<num2 && num2<num3){
      System.out.println(num2+" , "+num1+" , "+num3);
      
    }else if(num1<num2 && num2>num3){
      System.out.println(num1+" , "+num2+" , "+num3);
    }
    
  }
  
}
