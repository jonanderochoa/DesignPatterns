package creacionales.factory_method;

public class Logistica {

  public static void main(String[] args) {

    Transporte camion = new Camion();
    Transporte barco = new Barco();

    camion.enviar();
    barco.enviar();
  }

}
