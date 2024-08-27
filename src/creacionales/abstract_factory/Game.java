package creacionales.abstract_factory;

import creacionales.abstract_factory.entidades.Estructura;
import creacionales.abstract_factory.entidades.Personaje;
import creacionales.abstract_factory.entidades.Recurso;
import creacionales.abstract_factory.fabricas.GameFactory;

public class Game {

  private Personaje personaje;
  private Estructura estructura;
  private Recurso recurso;

  public Game(GameFactory factory) {
    personaje = factory.crearPersonaje();
    estructura = factory.crearEstructura();
    recurso = factory.crearRecurso();
  }

  public void play() {
    personaje.atacar();
    estructura.construir();
    recurso.recolectar();
  }
}
