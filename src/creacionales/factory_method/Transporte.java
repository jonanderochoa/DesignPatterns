package creacionales.factory_method;

/**
 * Interfaz transporte de la que extienden todos los transportes y que tienen el metodo comun enviar
 */
public interface Transporte {

  /**
   * Metodo comun de todos los transportes que tendran que ser implementadas por las clases concretas
   */
  void enviar();
}
