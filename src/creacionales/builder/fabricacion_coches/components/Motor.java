package creacionales.builder.fabricacion_coches.components;

public class Motor {

  private final double volumen;
  private double kilometraje;
  private boolean arrancado;

  public Motor(double volumen, double kilometraje) {
    this.volumen = volumen;
    this.kilometraje = kilometraje;
  }

  public double getVolumen() {
    return volumen;
  }

  public double getKilometraje() {
    return kilometraje;
  }

  public void go(double kilometraje) {
    if (arrancado) {
      this.kilometraje += kilometraje;
    } else {
      System.out.println("Tienes que arrancar");
    }
  }

  public boolean isArrancado() {
    return this.arrancado;
  }

  public void on() {
    this.arrancado = true;
  }

  public void off() {
    this.arrancado = false;
  }
}
