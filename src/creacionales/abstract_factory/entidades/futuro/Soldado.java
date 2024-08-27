package creacionales.abstract_factory.entidades.futuro;

import creacionales.abstract_factory.entidades.Personaje;

public class Soldado implements Personaje {

  @Override
  public void atacar() {
    System.out.println("Soldado dispara laser");
  }
}
