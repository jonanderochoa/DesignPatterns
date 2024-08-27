package creacionales.factory_method.juego.factories;

import creacionales.factory_method.juego.enemies.Dragon;
import creacionales.factory_method.juego.enemies.Enemy;

public class DragonFactory extends EnemyFactory {

  @Override
  public Enemy createEnemy() {
    return new Dragon();
  }
}
