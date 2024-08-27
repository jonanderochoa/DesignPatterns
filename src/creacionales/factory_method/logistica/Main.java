package creacionales.factory_method.logistica;

import creacionales.factory_method.logistica.logisticas.LogisticaFactory;
import creacionales.factory_method.logistica.logisticas.LogisticaFactoryBarco;
import creacionales.factory_method.logistica.logisticas.LogisticaFactoryCamion;

public class Main {

  public static void main(String[] args) {

    LogisticaFactory logisticaFactory; // Creacion de la factoria

    logisticaFactory = new LogisticaFactoryBarco(); // instanciacion de la logistica de barcos
    logisticaFactory.enviarTransporte();  // Creacion del barco y envio

    logisticaFactory = new LogisticaFactoryCamion();  // Cambio de la logistica a la de Camion
    logisticaFactory.enviarTransporte();  // Creacion del camion y envio
  }
}
