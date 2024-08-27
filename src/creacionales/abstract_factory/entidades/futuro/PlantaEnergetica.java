package creacionales.abstract_factory.entidades.futuro;

import creacionales.abstract_factory.entidades.Recurso;

public class PlantaEnergetica implements Recurso {

  @Override
  public void recolectar() {
    System.out.println("Generando energía");
  }
}
