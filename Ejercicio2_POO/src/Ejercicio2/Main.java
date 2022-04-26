package Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Tablero t1;
        int x, y, opcion, incremento = 0;

        System.out.print("Introduce la cordenada inicial de x: ");
        x = entrada.nextInt();
        System.out.print("Introduce la cordenada inicial de y: ");
        y = entrada.nextInt();

        //Posicion inicial del objeto 
        t1 = new Tablero(x, y);

        do {

            System.out.println("Digite en que sentido quiere moverse");
            System.out.println("1. Mueve el objeto hacia arriba");
            System.out.println("2. Mueve el objeto hacia abajo");
            System.out.println("3. Mueve el objeto hacia derecha");
            System.out.println("4. Mueve el objeto hacia izquierda");
            System.out.println("5. Salir");
            System.out.println("Digite una opcion: ");
            opcion = entrada.nextInt();

            if (opcion != 5) {
                System.out.println("Digite la cantidad de espacios a moverse.");
                incremento = entrada.nextInt();

                switch (opcion) {

                    case 1:
                        t1.moverArriba(incremento);
                        break;
                    case 2:
                        t1.moverArriba(incremento);
                        break;
                    case 3:
                        t1.moverDerecha(incremento);
                        break;
                    case 4:
                        t1.moverIzquierda(incremento);
                        break;
                    case 5:
                        break;

                    default:
                        System.out.println("Error");
                        break;
                }

                System.out.println("El objeto se encuentra en (" + t1.getX() + " ," + t1.getY() + ")");

            }
            while (opcion != 5);
        
        }
}
