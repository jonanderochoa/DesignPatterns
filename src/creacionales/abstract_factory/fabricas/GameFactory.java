package creacionales.abstract_factory.fabricas;

import creacionales.abstract_factory.entidades.Estructura;
import creacionales.abstract_factory.entidades.Personaje;
import creacionales.abstract_factory.entidades.Recurso;

/**
 * Clase responsable de crear los productos relacionados.
 * Esta fábrica abstracta tendrá métodos para crear unidades, estructuras, y recursos.
 */
public interface GameFactory {

  Personaje crearPersonaje();

  Estructura crearEstructura();

  Recurso crearRecurso();

}
