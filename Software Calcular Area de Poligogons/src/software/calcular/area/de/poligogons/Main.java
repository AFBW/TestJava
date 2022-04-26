/*
Ejercicio 9: Hacer un programa para calcular el area de poligonos (Triangulos y Rectangulos)
el programa debe ser capaz de almacenar en un arreglo N triangulos y rectangulos, y al final
mostrar el area y los datos de cada uno. Para ello se tendra lo siguiente:

-Una super clase llamada Poligono.
-Una sub clase llamada Rectangulo
-Una sub clase llamada Triangulo
 */
package software.calcular.area.de.poligogons;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
  Scanner entrada = new Scanner(System.in);

  public static void main(String[] args) {
    //Llenar un poligono
    llenarPoligono();
  }

  public static void llenarPoligono() {
    char respuesta;
    int opcion;
    do {

      do {
        System.out.println("Digite que poligono desea");
        System.out.println("1. Triangulo");
        System.out.println("2. Rectangulo");
        System.out.println("Opcion: ");
        opcion = entrada.nextInt();

      } while (opcion < 1 || opcion > 2);

      switch (opcion) {
        case 1: //Llenar un triangulo
          break;

        case 2: //Llenar un rectangulo
          break;

      }
      System.out.println("\nDesea introducir otro poligono(s/n)");
    } while (respuesta == 's' || respuesta == 'S');

  }

  public static void llenarTriangulo() {
    double lado1, lado2, lado3;

    System.out.println("\nDigite el lado1 del triangulo: ");
    lado1 = entrada.nextDouble();
    System.out.println("\nDigite el lado2 del triangulo: ");
    lado2 = entrada.nextDouble();
    System.out.println("\nDigite el lado3 del triangulo: ");
    lado3 = entrada.nextDouble();

  }
}
