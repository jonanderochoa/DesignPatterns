package creacionales.abstract_factory.entidades.edad_media;

import creacionales.abstract_factory.entidades.Estructura;

public class Castillo implements Estructura {

  @Override
  public void construir() {
    System.out.println("Castillo construido");
  }
}
