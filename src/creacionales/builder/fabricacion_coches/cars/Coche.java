package creacionales.builder.fabricacion_coches.cars;

import creacionales.builder.fabricacion_coches.components.Motor;
import creacionales.builder.fabricacion_coches.components.NavegadorGPS;
import creacionales.builder.fabricacion_coches.components.OrdenadorViaje;
import creacionales.builder.fabricacion_coches.components.Transmision;

public class Coche {

  private final TipoCoche tipo;
  private final int asientos;
  private final Motor motor;
  private final Transmision transmision;
  private final OrdenadorViaje ordenadorViaje;
  private final NavegadorGPS navegadorGPS;
  private double combustible = 0;

  public Coche(TipoCoche tipo, int asientos, Motor motor, Transmision transmision,
      OrdenadorViaje ordenadorViaje, NavegadorGPS navegadorGPS) {
    this.tipo = tipo;
    this.asientos = asientos;
    this.motor = motor;
    this.transmision = transmision;
    this.ordenadorViaje = ordenadorViaje;
    if (this.ordenadorViaje != null) {
      this.ordenadorViaje.setCar(this);
    }
    this.navegadorGPS = navegadorGPS;
  }

  public TipoCoche getTipo() {
    return tipo;
  }

  public int getAsientos() {
    return asientos;
  }

  public Motor getMotor() {
    return motor;
  }

  public Transmision getTransmision() {
    return transmision;
  }

  public OrdenadorViaje getOrdenadorViaje() {
    return ordenadorViaje;
  }

  public NavegadorGPS getNavegadorGPS() {
    return navegadorGPS;
  }

  public double getCombustible() {
    return combustible;
  }

  public void setCombustible(double combustible) {
    this.combustible = combustible;
  }
}
