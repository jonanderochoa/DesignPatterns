package creacionales.abstract_factory.fabricas;

import creacionales.abstract_factory.entidades.Estructura;
import creacionales.abstract_factory.entidades.Personaje;
import creacionales.abstract_factory.entidades.Recurso;
import creacionales.abstract_factory.entidades.edad_media.Caballero;
import creacionales.abstract_factory.entidades.edad_media.Castillo;
import creacionales.abstract_factory.entidades.edad_media.Mina;

public class EdadMediaFactory implements GameFactory {

  @Override
  public Personaje crearPersonaje() {
    return new Caballero();
  }

  @Override
  public Estructura crearEstructura() {
    return new Castillo();
  }

  @Override
  public Recurso crearRecurso() {
    return new Mina();
  }
}
