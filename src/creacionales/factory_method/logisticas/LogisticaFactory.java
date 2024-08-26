package creacionales.factory_method.logisticas;

import creacionales.factory_method.transportes.Transporte;

/**
 * Clase abstracta que crea Transportes y los envia
 */
public abstract class LogisticaFactory {

  /**
   * Metodo abstracto de creacion de Transporte
   *
   * @return Transporte
   */
  protected abstract Transporte createTransporte();

  /**
   * Metodo de creacion de un nuevo transporte. Llama al metodo abstracto createTransporte que
   * devuelve un transporte y lo envia usando su metodo enviar()
   */
  public void enviarTransporte() {
    Transporte transporte = this.createTransporte();
    transporte.enviar();
  }
}
