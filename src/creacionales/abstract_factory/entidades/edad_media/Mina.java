package creacionales.abstract_factory.entidades.edad_media;

import creacionales.abstract_factory.entidades.Recurso;

public class Mina implements Recurso {

  @Override
  public void recolectar() {
    System.out.println("Minando oro");
  }
}
