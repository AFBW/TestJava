package Proyecto;

public class Aeropuerto {

  private String nombre;
  private String ciudad;
  private String pais;
  private Compañia listaCompañias[] = new Compañia[10];
  private int numCompañia;

  //Metodo constructor 1
  public Aeropuerto(String nombre, String ciudad, String pais) {
    this.nombre = nombre;
    this.ciudad = ciudad;
    this.pais = pais;
    this.numCompañia = 0;
  }

  //Metodo constructor 2
  public Aeropuerto(String nombre, String ciudad, String pais, Compañia c[]) {
    this.nombre = nombre;
    this.ciudad = ciudad;
    this.pais = pais;
    listaCompañias = c;
    this.numCompañia = c.length;
  }

  //Metodo para insertar compañia
  public void insertarCompañia(Compañia compañia) {
    listaCompañias[numCompañia] = compañia;
    numCompañia++;
  }

  //Metodo Getter para que nos muestre todo
  public String getNombre() {
    return nombre;
  }

  public String getCiudad() {
    return ciudad;
  }

  public String getPais() {
    return pais;
  }

  public Compañia[] getListaCompañias() {
    return listaCompañias;
  }

  public int getNumCompañia() {
    return numCompañia;
  }

  //Metodo Buscar una compañia por su iterador
  public Compañia getCompañia(int i) {
    return listaCompañias[i];
  }

  //Metodo Buscar una compañia por su nombre
  public Compañia getCompañia(String nombre) {
    boolean encontrado = false;
    int i = 0;
    Compañia c = null;                                                  //En el caso de que no se introduzca ninguna sea nulo
    while ((encontrado == false) && (i < listaCompañias.length)) {      //Busqueda secuencial  Mientras encontrado se false y el iterador menos al numero de compañias
      if (nombre.equals(listaCompañias[i].getNombre())) {               //Si el nombre es igual a cualquier nombre que tenemos en listaCompañias
        encontrado = true;
        c = listaCompañias[i];
      }
      i++;
    }
    return c;
  }
}
