package creacionales.factory_method.logistica.logisticas;

import creacionales.factory_method.logistica.transportes.Barco;
import creacionales.factory_method.logistica.transportes.Transporte;

/**
 * Clase concreta de creacion de barcos.
 * Extiende de la clase abstracta LogicaFactory de la que
 * implementa el metodo abstracto createTransporte
 */
public class LogisticaFactoryBarco extends LogisticaFactory {

  @Override
  public Transporte createTransporte() {
    return new Barco();
  }
}
