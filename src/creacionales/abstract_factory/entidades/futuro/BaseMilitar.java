package creacionales.abstract_factory.entidades.futuro;

import creacionales.abstract_factory.entidades.Estructura;

public class BaseMilitar implements Estructura {

  @Override
  public void construir() {
    System.out.println("Base militar creada");
  }
}
