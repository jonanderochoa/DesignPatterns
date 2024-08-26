package creacionales.factory_method;

/**
 * Entidad Barco que es un Transporte
 */
public class Barco implements Transporte {

  /**
   * Implementacion del metodo enviar de la interfaz Transporte
   */
  @Override
  public void enviar() {
    System.out.println("Barco enviado");
  }
}
