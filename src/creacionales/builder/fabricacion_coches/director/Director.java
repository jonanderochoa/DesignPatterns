package creacionales.builder.fabricacion_coches.director;

import creacionales.builder.fabricacion_coches.builders.Builder;
import creacionales.builder.fabricacion_coches.cars.TipoCoche;
import creacionales.builder.fabricacion_coches.components.Motor;
import creacionales.builder.fabricacion_coches.components.NavegadorGPS;
import creacionales.builder.fabricacion_coches.components.OrdenadorViaje;
import creacionales.builder.fabricacion_coches.components.Transmision;

/**
 * El director construye coches de un tipo con unas caracteristicas especificas
 */
public class Director {

  public void construirDeportivo(Builder builder) {
    builder.setTipoCoche(TipoCoche.DEPORTIVO);
    builder.setAsientos(2);
    builder.setMotor(new Motor(3.0, 0));
    builder.setTransmision(Transmision.SECUENCIAL);
    builder.setOrdenadorViaje(new OrdenadorViaje());
    builder.setNavegadorGPS(new NavegadorGPS());
  }

  public void construirFamiliar(Builder builder) {
    builder.setTipoCoche(TipoCoche.FAMILIAR);
    builder.setAsientos(2);
    builder.setMotor(new Motor(1.2, 0));
    builder.setTransmision(Transmision.AUTOMATICO);
    builder.setOrdenadorViaje(new OrdenadorViaje());
    builder.setNavegadorGPS(new NavegadorGPS());
  }

  public void construirSub(Builder builder) {
    builder.setTipoCoche(TipoCoche.SUB);
    builder.setAsientos(4);
    builder.setMotor(new Motor(2.5, 0));
    builder.setTransmision(Transmision.MANUAL);
    builder.setNavegadorGPS(new NavegadorGPS());
  }
}
