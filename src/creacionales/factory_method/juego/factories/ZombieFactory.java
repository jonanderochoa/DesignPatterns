package creacionales.factory_method.juego.factories;

import creacionales.factory_method.juego.enemies.Enemy;
import creacionales.factory_method.juego.enemies.Zombie;

public class ZombieFactory extends EnemyFactory {

  @Override
  public Enemy createEnemy() {
    return new Zombie();
  }
}
