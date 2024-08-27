package creacionales.factory_method.juego.enemies;

public class Dragon implements Enemy {

  @Override
  public void attack() {
    System.out.println("El dragon ataca con fuego");
  }

  @Override
  public void takeDamage(int damage) {
    System.out.println("El dragon recibe " + damage + " puntos de daño");
  }
}
