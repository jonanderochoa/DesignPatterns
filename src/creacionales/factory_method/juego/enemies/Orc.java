package creacionales.factory_method.juego.enemies;

public class Orc implements Enemy {

  @Override
  public void attack() {
    System.out.println("El orco ataca con su hacha");
  }

  @Override
  public void takeDamage(int damage) {
    System.out.println("El orco recibe " + damage + " puntos de daño");
  }
}
