package Proyecto;

public class AeropuertoPrivado extends Aeropuerto {

  private String listaEmpresas[] = new String[10];
  private int numEmpresa;

  //Inicializamos el metodo constructor 1
  public AeropuertoPrivado(String nombre, String ciudad, String pais) {
    super(nombre, ciudad, pais);
  }

  //Inicializamos el metodo Constructor2
  public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c, String e[]) {
    super(nombre, ciudad, pais, c);
    this.listaEmpresas = e;
    numEmpresa = e.length;
  }

  //Metodo para insertar varias empresas en el arreglo
  public void insertarEmpresa(String e[]) {
    this.listaEmpresas = e;
    this.numEmpresa = e.length;
  }

  //MEtodo para insertar una empresa en un arreglo
  public void insertarEmpresas(String e) {
    listaEmpresas[numEmpresa] = e;
    numEmpresa++;
  }

  //Metodos Getters para mostrar las empresas
  public String[] getListaEmpresas() {
    return listaEmpresas;
  }

  public int getNumEmpresa() {
    return numEmpresa;
  }

}
