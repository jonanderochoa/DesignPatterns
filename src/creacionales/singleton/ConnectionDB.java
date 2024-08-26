package creacionales.singleton;

import static java.util.Objects.isNull;

/**
 * Clase con patron singleton
 * Tenemos una variable estatica instance
 * Si es nula creamos la instancia y la asignamos
 * Si no la devuelve
 */
public class ConnectionDB {

  /**
   * Variable estatica que contiene la conexion
   */
  private static ConnectionDB instance;

  /**
   * Contructor private para evitar que puedan crear objetos
   */
  private ConnectionDB() {

  }

  /**
   * Metodo que crea una instancia si no la tiene y si la tiene devuelve la existente
   * @return instancia
   */
  public static ConnectionDB getInstance() {
    if(isNull(instance)){
      instance = new ConnectionDB();
    }
    return instance;
  }
}
