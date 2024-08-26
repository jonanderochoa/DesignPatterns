package creacionales.factory_method.logisticas;

import creacionales.factory_method.transportes.Camion;
import creacionales.factory_method.transportes.Transporte;

/**
 * Clase concreta de creacion de camiones.
 * Extiende de la clase abstracta LogicaFactory de la que
 * implementa el metodo abstracto createTransporte
 */
public class LogisticaFactoryCamion extends LogisticaFactory {

  @Override
  public Transporte createTransporte() {
    return new Camion();
  }
}
