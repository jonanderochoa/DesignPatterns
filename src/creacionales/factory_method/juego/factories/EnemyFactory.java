package creacionales.factory_method.juego.factories;

import creacionales.factory_method.juego.enemies.Enemy;

public abstract class EnemyFactory {

  /**
   * Factory Method
   * Metodo abstracto que obliga a los que la extiendan a implementar el Enemy que devuelve
   * @return Devuelve el Enemy
   */
  protected abstract Enemy createEnemy();

  public void spawnEnemy() {
    Enemy enemy = createEnemy();
    System.out.println("Enemigo creado " + enemy.getClass());
    enemy.attack();
  }

}
