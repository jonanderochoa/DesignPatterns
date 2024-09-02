package creacionales.prototype.juego;

/**
 * Definimos una clase Enemigo que representa a un enemigo en el juego. Esta clase implementa la
 * interfaz Cloneable para permitir la clonación.
 */
public class Enemigo implements Cloneable {

  private String tipo;
  private int salud;
  private int danio;
  private int velocidad;
  private Inventario inventario;

  public Enemigo(String tipo, int salud, int danio, int velocidad, Inventario inventario) {
    this.tipo = tipo;
    this.salud = salud;
    this.danio = danio;
    this.velocidad = velocidad;
    this.inventario = inventario;
  }

  public void atacar() {
    System.out.println(tipo + " ataca con " + danio + " de daño");
  }

  @Override
  protected Enemigo clone() {
    try {
      Enemigo enemigoClonado = (Enemigo) super.clone();
      enemigoClonado.inventario = this.inventario.clone();
      return enemigoClonado;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  @Override
  public String toString() {
    return "Enemigo{" +
        "tipo='" + tipo + '\'' +
        ", salud=" + salud +
        ", danio=" + danio +
        ", velocidad=" + velocidad +
        ", inventario=" + inventario +
        '}';
  }
}
