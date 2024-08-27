package creacionales.factory_method.juego.enemies;

public class Zombie implements Enemy {

  @Override
  public void attack() {
    System.out.println("El zombie ataca mordiendo");
  }

  @Override
  public void takeDamage(int damage) {
    System.out.println("El zombie recibe " + damage + " puntos de daño");
  }
}
