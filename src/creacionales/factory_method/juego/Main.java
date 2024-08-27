package creacionales.factory_method.juego;

import creacionales.factory_method.juego.factories.DragonFactory;
import creacionales.factory_method.juego.factories.EnemyFactory;
import creacionales.factory_method.juego.factories.OrcFactory;
import creacionales.factory_method.juego.factories.ZombieFactory;

public class Main {

  public static void main(String[] args) {

    // Nivel dificultad inicial
    EnemyFactory factory = new ZombieFactory();
    factory.spawnEnemy();

    // Nivel dificultad medio
    factory = new OrcFactory();
    factory.spawnEnemy();

    // Nivel dificultad final
    factory = new DragonFactory();
    factory.spawnEnemy();
  }

}
