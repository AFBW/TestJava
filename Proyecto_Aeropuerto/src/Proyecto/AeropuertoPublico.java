package Proyecto;

public class AeropuertoPublico extends Aeropuerto {

  private double subvencion;

  //Metodo Constructor 1
  public AeropuertoPublico(String nombre, String ciudad, String pais) {
    super(nombre, ciudad, pais);
  }

  //Metodo Constructor 2
  public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais, Compañia[] c) {
    super(nombre, ciudad, pais, c);
    this.subvencion = subvencion;
  }

  //Metodo Constructor 3
  public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais) {
    super(nombre, ciudad, pais);
    this.subvencion = subvencion;
  }

  //Metodo Getter para obtener la subvencion
  public double getSubvencion() {
    return subvencion;
  }

}
