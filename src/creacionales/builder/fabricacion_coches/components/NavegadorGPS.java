package creacionales.builder.fabricacion_coches.components;

public class NavegadorGPS {

  private String ruta;

  public NavegadorGPS() {
    this.ruta = "Calle de la piruleta";
  }

  public NavegadorGPS(String ruta) {
    this.ruta = ruta;
  }

  public String getRuta() {
    return ruta;
  }
}
