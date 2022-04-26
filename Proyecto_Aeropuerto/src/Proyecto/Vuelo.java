package Proyecto;

public class Vuelo {

  private String identificador;
  private String ciudadOrigen;
  private String ciudadDestino;
  private double precio;
  private int numMaxPasajeros;
  private int numActualPasajeros;
  private Pasajero listaPasajeros[]; //Arreglo de objetos

  //Metodo constructor
  public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
    this.identificador = identificador;
    this.ciudadOrigen = ciudadOrigen;
    this.ciudadDestino = ciudadDestino;
    this.precio = precio;
    this.numMaxPasajeros = numMaxPasajeros;
    this.numActualPasajeros = 0;
    this.listaPasajeros = new Pasajero[numMaxPasajeros];
  }

  /*Metodo Pedir un pasajero y lo metemos en la listaPasajero con
  el iterador numActualPasajeros*/
  public void insertarPasajero(Pasajero pasajero) {
    listaPasajeros[numActualPasajeros] = pasajero;
    numActualPasajeros++;
  }

  //Getters
  public String getIdentificador() {
    return identificador;
  }

  public String getCiudadOrigen() {
    return ciudadOrigen;
  }

  public String getCiudadDestino() {
    return ciudadDestino;
  }

  public double getPrecio() {
    return precio;
  }

  public int getNumMaxPasajeros() {
    return numMaxPasajeros;
  }

  public int getNumeroActualPasajeros() {
    return numActualPasajeros;
  }

  //Metodo para obtener el pasajero mediante el iterador i
  public Pasajero getPasajero(int i) {
    return listaPasajeros[i];
  }

  //Metodo obtener el pasajero mediante el pasaporte (BUSQUEDA SECUANCIAL)
  public Pasajero getPasajero(String pasaporte) {
    boolean encontrado = false;
    int i = 0;
    Pasajero pas = null;                                                //En el caso de que no se introduzca ninguno sea nulo
    while ((i < listaPasajeros.length) && (encontrado == false)) {      //Busqueda secuencial (Si encontrado es falso y le hacemos recorrer la lista de pasajeros)
      if (pasaporte.equals(listaPasajeros[i].getPasaporte())) {         //Para recorrer la lista de pasajeros comprobamos que si String pasajero corresponde con algun pasaporte de mi listaPasajeros mediante el getPasaporte
        encontrado = true;                                              //Si se cumple seria true
        pas = listaPasajeros[i];
      }
      i++;
    }
    return pas;
  }

}
