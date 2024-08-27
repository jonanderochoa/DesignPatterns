package creacionales.abstract_factory.fabricas;

import creacionales.abstract_factory.entidades.Estructura;
import creacionales.abstract_factory.entidades.Personaje;
import creacionales.abstract_factory.entidades.Recurso;
import creacionales.abstract_factory.entidades.futuro.BaseMilitar;
import creacionales.abstract_factory.entidades.futuro.PlantaEnergetica;
import creacionales.abstract_factory.entidades.futuro.Soldado;

public class FuturoFactory implements GameFactory {

  @Override
  public Personaje crearPersonaje() {
    return new Soldado();
  }

  @Override
  public Estructura crearEstructura() {
    return new BaseMilitar();
  }

  @Override
  public Recurso crearRecurso() {
    return new PlantaEnergetica();
  }
}
