package creacionales.builder.fabricacion_coches.components;

import creacionales.builder.fabricacion_coches.cars.Coche;

public class OrdenadorViaje {

  private Coche coche;

  public void setCar(Coche coche) {
    this.coche = coche;
  }

  public void showFuelLevel() {
    System.out.println("Combustible: " + coche.getCombustible());
  }

  public void showStatus() {
    if (this.coche.getMotor().isArrancado()) {
      System.out.println("Coche arrancado");
    } else {
      System.out.println("Coche parado");
    }
  }
}
