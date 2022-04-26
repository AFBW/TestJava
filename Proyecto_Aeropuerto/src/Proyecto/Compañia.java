package Proyecto;

public class Compañia {

  private String nombre;
  private Vuelo listaVuelos[] = new Vuelo[10];
  private int numVuelo = 0;                    //Inicializamos el numero de vuelo en 0

  //Metodo Constructor 1
  public Compañia(String nombre) {
    this.nombre = nombre;
  }

  //Metodo constructor 2
  public Compañia(String nombre, Vuelo v[]) {
    this.nombre = nombre;
    listaVuelos = v;
    numVuelo = v.length;
  }

  //Metodo insertar vuelo uno a uno
  public void insertarVuelo(Vuelo vuelo) {
    listaVuelos[numVuelo] = vuelo;
    numVuelo++;
  }

  //Getters
  public String getNombre() {
    return nombre;
  }

  public int getNumVuelo() {
    return numVuelo;
  }

  //Metodo Getter Obtener un vuelo especifico atravez del iterador
  public Vuelo getVuelo(int i) {
    return listaVuelos[i];
  }

  //Metodo Getter Obtener vuelo atravez del identificacor
  public Vuelo getVuelo(String id) {
    boolean encontrado = false;
    int i = 0;
    Vuelo v = null;                                                   //En el caso de que no se introduzca ningula sea nulo
    while ((encontrado == false) && (i < listaVuelos.length)) {       //Busqueda secuencial
      if (id.equals(listaVuelos[i].getIdentificador())) {             //Si este id es igual algun identificador en mi listaVuelos obtener el identificador
        encontrado = true;
        v = listaVuelos[i];
      }
      i++;
    }
    return v;
  }

}
