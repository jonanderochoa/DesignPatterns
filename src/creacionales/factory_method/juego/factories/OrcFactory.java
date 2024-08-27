package creacionales.factory_method.juego.factories;

import creacionales.factory_method.juego.enemies.Enemy;
import creacionales.factory_method.juego.enemies.Orc;

public class OrcFactory extends EnemyFactory {

  @Override
  public Enemy createEnemy() {
    return new Orc();
  }
}
