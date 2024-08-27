package creacionales.abstract_factory.entidades.edad_media;

import creacionales.abstract_factory.entidades.Personaje;

public class Caballero implements Personaje {

  @Override
  public void atacar() {
    System.out.println("El caballero ataca con la espada");
  }
}
