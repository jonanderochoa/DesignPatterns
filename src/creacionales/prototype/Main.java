package creacionales.prototype;

import creacionales.factory_method.juego.enemies.Enemy;

public class Main {

  public static void main(String[] args) {


    Inventario inventarioOrco = new Inventario();
    inventarioOrco.addElemento(new Elemento("Hacha", 10));
    inventarioOrco.addElemento(new Elemento("Escudo", 15));

    // Creamos un prototipo de enemigo
    Enemigo prototipoOrco = new Enemigo("Orco", 100, 15, 5, inventarioOrco);
    // Clonamos el prototipo para crear nuevo enemigos
    Enemigo orco1 = prototipoOrco.clone();
    Enemigo orco2 = prototipoOrco.clone();
    // Mostramos los datos del orco1
    System.out.println(orco1);
    // Atacamos con el orco2
    orco2.atacar();

    Inventario inventarioTroll = new Inventario();
    inventarioTroll.addElemento(new Elemento("Espada", 10));
    inventarioTroll.addElemento(new Elemento("arco", 15));

    Enemigo prototipoTroll = new Enemigo("Troll", 200, 25, 3, inventarioTroll);
    Enemigo troll1 = prototipoTroll.clone();
    System.out.println(troll1);
    troll1.atacar();
  }
}
