package creacionales.prototype;

public class Elemento {

  private String nombre;
  private int poder;

  public Elemento(String nombre, int poder) {
    this.nombre = nombre;
    this.poder = poder;
  }

  public String getNombre() {
    return nombre;
  }

  public int getPoder() {
    return poder;
  }

  @Override
  public String toString() {
    return "Elemento{" +
        "nombre='" + nombre + '\'' +
        ", poder=" + poder +
        '}';
  }
}
