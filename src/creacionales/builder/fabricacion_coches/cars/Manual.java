package creacionales.builder.fabricacion_coches.cars;

import creacionales.builder.fabricacion_coches.components.Motor;
import creacionales.builder.fabricacion_coches.components.NavegadorGPS;
import creacionales.builder.fabricacion_coches.components.OrdenadorViaje;
import creacionales.builder.fabricacion_coches.components.Transmision;

public class Manual {

  private final TipoCoche tipoCoche;
  private final int asientos;
  private final Motor motor;
  private final Transmision transmision;
  private final OrdenadorViaje ordenadorViaje;
  private final NavegadorGPS navegadorGPS;

  public Manual(TipoCoche tipoCoche, int asientos, Motor motor, Transmision transmision,
      OrdenadorViaje ordenadorViaje, NavegadorGPS navegadorGPS) {
    this.tipoCoche = tipoCoche;
    this.asientos = asientos;
    this.motor = motor;
    this.transmision = transmision;
    this.ordenadorViaje = ordenadorViaje;
    this.navegadorGPS = navegadorGPS;
  }

  public String print() {
    String info = "";
    info += "Tipo: " + tipoCoche + "\n";
    info += "Asientos: " + asientos + "\n";
    info += "Motor: cc - " + motor.getVolumen() + "; km - " + motor.getKilometraje() + "\n";
    info += "Transmisión: " + transmision + "\n";
    if (this.ordenadorViaje != null) {
      info += "Ordenador de vieja: Functional" + "\n";
    } else {
      info += "Ordenador de vieja: N/A" + "\n";
    }
    if (this.navegadorGPS != null) {
      info += "Navegador GPS: Functional" + "\n";
    } else {
      info += "Navegador GPS: N/A" + "\n";
    }
    return info;
  }
}
