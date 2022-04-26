/*
Diseñar y codificar una aplicacion informatica para una compañia de gestion aeroportuaria
satisfacciendo los siguientes requisitos:
-Para cada Aeropuerto es necesario saber:
a) Todas las compañias de vuelo que operan en el 
b) Nombre del aeropuerto, la ciudad donde se ubica, y el pais al que pertenece.

-Cada compañia se caracteriza por el nombre y la lista de vuelos que ofrece.
-Los vuelos estan definidos por su identificador, la ciudad de origen, la ciudad de destino, 
el precio del viaje, la lista de pasajeros, el numero maximo de pasajeros permitidos en el vuelo,
y el numero real de pasajeros que ha reservado el asiento en el avion.
-Los Aropuertos pueden ser privados o publicos.
  a)Los Aeropuertos privados tienen una seria de empresas que lo patrocinan y es necesario
saber el nombre de cada una de las empresas.
  b)Para los aeropuertos publicosse requiere saber la cantidad de dinero correspondiente 
a la subvencion gubernamental.

-Se necesita gestionar tambien la informacion de los pasajeros.
  a)Para cada pasajero se ncecetita saber nombre, numero de pasaporte y nacionalidad.


La aplicacion tendra un menu con las siguientes Opciones:

  1)Consultar los aeropuertos gestionados, indicando separadamente los aeropuertos Publicos y Privados.
  Para cada uno de ellos, mostrar su nombre, la ciudad de ubicacion y el pais al que pertenece.

  2)Visualizar las empresas que patrocinan un determinado aeropuerto, en caso de que sea privado,
  o la cuantia de la subvencion en caso de que sea publico.

  3)Para un determinado aeropuerto, se debe poder mostrar la lista de compañias que vuelan desde ese aeropuerto.

  4)Para una determinada compañia que opera en un aeropuerto concreto, listar todos los posibles vuelos
  que dicha compañia ofrece, mostrando su identificador,la ciudad de origen y destino y el precio de vuelo.

  5)Mostrar todos los posibles vuelos(identificador) que parten de una ciudad de origen
  a otra ciudad destino (indicadas por el usuario) y mostrar su precio.
 */
package Proyecto;

import java.util.Scanner;

public class Principal {

  static Scanner entrada = new Scanner(System.in);
  final static int num = 4;                                 //Numero de aeropuertos
  static Aeropuerto aeropuertos[] = new Aeropuerto[num];    //Creamos un arreglo de Aeropuerto

  public static void main(String[] args) {

    //Metodo Insertar datos de los Aeropuertos
    insertarDatosAeropuerto(aeropuertos);
    menu();
  }

  public static void insertarDatosAeropuerto(Aeropuerto aero[]) {
    aero[0] = new AeropuertoPublico(800000000, "Baraja", "Madrid", "España");   //1º Creamos el Primer Aeropuerto Publico
    aero[0].insertarCompañia(new Compañia("Rianair"));                          //2º Creamos las compañias dentro del Aeropuertp
    aero[0].insertarCompañia(new Compañia("Qatar Airways"));                    //2º Creamos las compañias dentro del Aeropuertp
    aero[0].getCompañia("Qatar Airways").insertarVuelo(new Vuelo("IB20", "Madrid", "Qatar", 150.90, 150));          //3º Creamos un vuelo, para ello Obtenemos cada compañia e Insertamos el vuelo
    aero[0].getCompañia("Rianair").insertarVuelo(new Vuelo("IB30", "Madrid", "Mexico DC", 180.90, 120));              //3º Creamos un vuelo, para ello Obtenemos cada compañia e Insertamos el vuelo
    aero[0].getCompañia("Rianair").insertarVuelo(new Vuelo("IB31", "Madrid", "Jerez de la Frontera", 125.90, 120));   //3º Creamos un vuelo, para ello Obtenemos cada compañia e Insertamos el vuelo
    aero[0].getCompañia("Qatar Airways").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "20GBHP", "Española")); //4º Creamos los pasajeros, para ello Obtenemos la compañia, obtenemos el vuelo e Insertamos los pasajeros
    aero[0].getCompañia("Qatar Airways").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "22GBHP", "Española"));
    aero[0].getCompañia("Rianair").getVuelo("IB31").insertarPasajero(new Pasajero("Pepe", "27HIJO", "Española"));

    aero[1] = new AeropuertoPrivado("Central Ciudad Real", "Ciudad Real", "España");    //1º Creamos el Segundo Aeropuerto Privado
    aero[1].insertarCompañia(new Compañia("AirEuropa"));
    String Empresas[] = {"Cobresol", "Aguila34"};
    ((AeropuertoPrivado) aero[1]).insertarEmpresa(Empresas);
    aero[1].getCompañia("AirEuropa").insertarVuelo(new Vuelo("IC33", "Madrid", "Buenos Aires", 190.90, 100));
    aero[1].getCompañia("Rianair").getVuelo("IB21").insertarPasajero(new Pasajero("Alvaro", "67GYT", "Española"));

    aero[2] = new AeropuertoPublico(200000, "Jerez Airport", "Jerez", "España");
    aero[2].insertarCompañia(new Compañia("Iberia"));
    aero[2].insertarCompañia(new Compañia("easyJet"));
    aero[2].getCompañia("Iberia").insertarVuelo(new Vuelo("AE030", "Jerez de la Frontera", "Alicante", 150.90, 150));
    aero[2].getCompañia("easyjet").insertarVuelo(new Vuelo("AF030", "Jerez de la Frontera", "Alicante", 180.90, 120));
    aero[2].getCompañia("Iberia").getVuelo("AE030").insertarPasajero(new Pasajero("Manuel", "20YYY", "Española")); //4º Creamos los pasajeros, para ello Obtenemos la compañia, obtenemos el vuelo e Insertamos los pasajeros
    aero[2].getCompañia("easyjet").getVuelo("AF030").insertarPasajero(new Pasajero("Alberto", "22UUU", "Española"));

    aero[3] = new AeropuertoPublico(300000, "Valencia Airport", "Valencia", "España");
    aero[3].insertarCompañia(new Compañia("Iberia"));
    aero[3].insertarCompañia(new Compañia("Vueling Airlines"));
    aero[3].getCompañia("Iberia").insertarVuelo(new Vuelo("AU030", "Valencia", "Alicante", 150.90, 150));
    aero[3].getCompañia("easyjet").insertarVuelo(new Vuelo("AT030", "Valencia", "Munich", 190.90, 120));
    aero[3].getCompañia("Iberia").getVuelo("AU030").insertarPasajero(new Pasajero("Pepe", "20YUD", "Española"));
    aero[3].getCompañia("easyjet").getVuelo("AT030").insertarPasajero(new Pasajero("Alberto", "22UTU", "Española"));

  }

  public static void menu() {
    String nombreAeropuerto;
    String nombreCompañia;
    String origen;
    String destino;
    int opcion;
    Aeropuerto aeropuerto;
    Compañia compañia;

    do {
      System.out.println("\t-MENU:");
      System.out.println("1. Ver Aeropuertos Creados (Publicos o Privados)");
      System.out.println("2. Ver Empresas (Privado) o Subvenciones (Publico)");
      System.out.println("3. Lista de Compañias de un Aeropuerto");
      System.out.println("4. Lista de todos los posibles vuelos por compañia");
      System.out.println("5. Mostrar todos los posibles vuelos de Origen a Destino");
      System.out.println("6. SALIR");
      System.out.println("Opcion: ");
      opcion = entrada.nextInt();

      switch (opcion) {
        case 1: //Ver Aeropuertos Creados (Publicos o Privados)
          System.out.println("");
          mostrarDatosAeropuertos(aeropuertos);
          break;
        case 2: //Ver Empresas (Privado) o Subvenciones (Publico)
          System.out.println("");
          mostrarPatrocinio(aeropuertos);
          break;
        case 3: //Lista de Compañias de un Aeropuerto
          entrada.nextLine();  //Corregimos el fallo del Buffer del programa  
          System.out.print("\nDigite el nombre del Aeropuerto: ");
          nombreAeropuerto = entrada.nextLine();
          aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
          if (aeropuerto == null) {
            System.out.println("El Aeropuerto no existe");
          } else {
            mostrarCompañias(aeropuerto);
          }
          break;
        case 4: //Lista de todos los posibles vuelos por compañia
          entrada.nextLine();     //Corregimos el Buffer
          System.out.println("Digite el nombre del aeropuerto: ");
          nombreAeropuerto = entrada.nextLine();
          aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
          if (aeropuerto == null) {
            System.out.println("El Aeropuerto no existe");
          } else {
            System.out.print("\nDigite el nombre de la compañia: ");
            nombreCompañia = entrada.nextLine();
            compañia = aeropuerto.getCompañia(nombreCompañia);
            mostrarVuelos(compañia);
          }
          break;
        case 5: //Mostrar todos los posibles vuelos de Origen a Destino
          entrada.nextLine();
          System.out.print("\nDigite la ciudad de Origen: ");
          origen = entrada.nextLine();
          System.out.print("\nDigite la ciudad de Destino");
          destino = entrada.nextLine();
          mostrarVueloOrigenDestino(origen, destino, aeropuertos);
          break;
        case 6: //SALIR
          break;

        default:
          System.out.println("Error, no has marcado la opccion correcta");
      }
      System.out.println("");

    } while (opcion != 6);
  }

  public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]) {
    for (int i = 0; i < aeropuertos.length; i++) {
      if (aeropuertos[i] instanceof AeropuertoPrivado) {   //Si el aeropuerto que estas recorriendo es un AeropuertoPrivado (Instanceof DEtermina si el Aeropuerto pertenece a AeropuertoPrivado)
        System.out.println("Aeropuerto Privado");
        System.out.println("Nombre: " + aeropuertos[i].getNombre());
        System.out.println("Ciudad de Ubicacion: " + aeropuertos[i].getCiudad());
        System.out.println("Pais: " + aeropuertos[i].getPais());
      } else {
        System.out.println("Aeropuerto Publico");
        System.out.println("Nombre: " + aeropuertos[i].getNombre());
        System.out.println("Ciudad de Ubicacion: " + aeropuertos[i].getCiudad());
        System.out.println("Pais: " + aeropuertos[i].getPais());
      }
      System.out.println("");
    }
  }

  public static void mostrarPatrocinio(Aeropuerto aeropuertos[]) {
    String empresas[];

    for (int i = 0; i < aeropuertos.length; i++) {
      if (aeropuertos[i] instanceof AeropuertoPrivado) {
        System.out.println("Aeropuerto Privado " + aeropuertos[i].getNombre());
        empresas = ((AeropuertoPrivado) aeropuertos[i]).getListaEmpresas();
        for (int j = 0; j < empresas.length; i++) {
          System.out.println(empresas[j]);
        }
      } else {
        System.out.println("Aeropuerto Publico " + aeropuertos[i].getNombre());
        System.out.println("Subvencion " + ((AeropuertoPublico) aeropuertos[i]).getSubvencion());
      }
      System.out.println("");
    }
  }

  public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]) {
    boolean encontrado = false;
    int i = 0;
    Aeropuerto aero = null;
    while ((encontrado == false) && (i < aeropuertos.length)) {
      if (nombre.equals(aeropuertos[i].getNombre())) {
        encontrado = true;
        aero = aeropuertos[i];
      }
      i++;
    }
    return aero;
  }

  public static void mostrarCompañias(Aeropuerto aeropuerto) {
    System.out.println("\nLas compañias del Aeropuerto " + aeropuerto.getNombre());
    for (int i = 0; i < aeropuerto.getNumCompañia(); i++) {
      System.out.println(aeropuerto.getCompañia(i).getNombre());
    }
  }

  public static void mostrarVuelos(Compañia compañia) {
    Vuelo vuelo;
    System.out.println("Los vuelos de la compañia " + compañia.getNombre());
    for (int i = 0; i < compañia.getNumVuelo(); i++) {
      vuelo = compañia.getVuelo(i);
      System.out.println("Identificador de vuelo: " + vuelo.getIdentificador());
      System.out.println("Ciudad de Origen: " + vuelo.getCiudadOrigen());
      System.out.println("Ciudad de Destino: " + vuelo.getCiudadDestino());
      System.out.println("Precio " + vuelo.getPrecio() + " €");
      System.out.println("");
    }
  }

  public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]) {
    Vuelo vuelo;
    int contador = 0;
    Vuelo listaVuelos[];

    for (int i = 0; i < aeropuertos.length; i++) {                  //Recorremos los aeropuertos
      for (int j = 0; j < aeropuertos[i].getNumCompañia(); j++) {   //Recorremos las compañias
        for (int k = 0; k < aeropuertos[i].getCompañia(j).getNumVuelo(); k++) {   //Recorremos los vuelos
          vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
          if ((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))) {
            contador++;
          }
        }

      }

    }

    listaVuelos = new Vuelo[contador];
    int q = 0;

    for (int i = 0; i < aeropuertos.length; i++) {
      for (int j = 0; j < aeropuertos[i].getNumCompañia(); j++) {
        for (int k = 0; k < aeropuertos[i].getCompañia(j).getNumVuelo(); k++) {
          vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
          if ((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))) {
            listaVuelos[q] = vuelo;
            q++;
          }
        }
      }
    }
    return listaVuelos;

  }

  private static void mostrarVueloOrigenDestino(String origen, String destino, Aeropuerto[] aeropuertos) {
     Vuelo vuelos[];
    vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
    if (vuelos.length == 0) {
      System.out.println("No existen vuelos de esa ciudad de Origen a Destino");
    }
    else{
      System.out.println("\nVuelos encontrados: ");
      for(int i=0; i<vuelos.length; i++){
        System.out.println("Identificador de vuelo "+vuelos[i].getIdentificador());
        System.out.println("Ciudad de Origen: "+vuelos[i].getCiudadOrigen());
        System.out.println("Ciudad de Destino: "+vuelos[i].getCiudadDestino());
        System.out.println("Precio: "+vuelos[i].getPrecio());
        System.out.println("");
      }
    }

  }
}
