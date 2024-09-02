package creacionales.builder.fabricacion_coches.builders;

import creacionales.builder.fabricacion_coches.cars.Coche;
import creacionales.builder.fabricacion_coches.cars.TipoCoche;
import creacionales.builder.fabricacion_coches.components.Motor;
import creacionales.builder.fabricacion_coches.components.NavegadorGPS;
import creacionales.builder.fabricacion_coches.components.OrdenadorViaje;
import creacionales.builder.fabricacion_coches.components.Transmision;

public class CocheBuilder implements Builder {

  private TipoCoche tipoCoche;
  private int asientos;
  private Motor motor;
  private Transmision transmision;
  private OrdenadorViaje ordenadorViaje;
  private NavegadorGPS navegadorGPS;

  @Override
  public void setTipoCoche(TipoCoche tipoCoche) {
    this.tipoCoche = tipoCoche;
  }

  @Override
  public void setAsientos(int asientos) {
    this.asientos = asientos;
  }

  @Override
  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  @Override
  public void setTransmision(Transmision transmision) {
    this.transmision = transmision;
  }

  @Override
  public void setOrdenadorViaje(OrdenadorViaje ordenadorViaje) {
    this.ordenadorViaje = ordenadorViaje;
  }

  @Override
  public void setNavegadorGPS(NavegadorGPS navegadorGPS) {
    this.navegadorGPS = navegadorGPS;
  }

  public Coche getResult() {
    return new Coche(tipoCoche, asientos, motor, transmision, ordenadorViaje, navegadorGPS);
  }
}
