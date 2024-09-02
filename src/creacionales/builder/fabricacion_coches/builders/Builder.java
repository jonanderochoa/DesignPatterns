package creacionales.builder.fabricacion_coches.builders;

import creacionales.builder.fabricacion_coches.cars.TipoCoche;
import creacionales.builder.fabricacion_coches.components.Motor;
import creacionales.builder.fabricacion_coches.components.NavegadorGPS;
import creacionales.builder.fabricacion_coches.components.OrdenadorViaje;
import creacionales.builder.fabricacion_coches.components.Transmision;

public interface Builder {

  void setTipoCoche(TipoCoche tipoCoche);

  void setAsientos(int asientos);

  void setMotor(Motor motor);

  void setTransmision(Transmision transmision);

  void setOrdenadorViaje(OrdenadorViaje ordenadorViaje);

  void setNavegadorGPS(NavegadorGPS navegadorGPS);

}
