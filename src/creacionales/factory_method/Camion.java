package creacionales.factory_method;

/**
 * Entidad Camion que es un Transporte
 */
public class Camion implements Transporte {

  /**
   * Implementacion del metodo enviar de la interfaz Transporte
   */
  @Override
  public void enviar() {
    System.out.println("Camion enviado");
  }
}
