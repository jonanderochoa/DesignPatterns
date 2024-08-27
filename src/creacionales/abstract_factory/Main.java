package creacionales.abstract_factory;

import creacionales.abstract_factory.fabricas.EdadMediaFactory;
import creacionales.abstract_factory.fabricas.FuturoFactory;
import creacionales.abstract_factory.fabricas.GameFactory;

public class Main {

  public static void main(String[] args) {

    GameFactory factory;
    Game game;

    // Creamos una partida de tipo edad media.
    factory = new EdadMediaFactory();
    game = new Game(factory);
    game.play();

    // Creamos una partida de tipo futurista.
    factory = new FuturoFactory();
    game = new Game(factory);
    game.play();
  }
}
