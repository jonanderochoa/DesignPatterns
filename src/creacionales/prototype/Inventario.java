package creacionales.prototype;

import java.util.ArrayList;
import java.util.List;

public class Inventario implements Cloneable {

  private List<Elemento> elementos;

  public Inventario() {
    this.elementos = new ArrayList<>();
  }

  public void addElemento(Elemento elemento) {
    elementos.add(elemento);
  }

  public List<Elemento> getElementos() {
    return elementos;
  }

  @Override
  public String toString() {
    return "Inventario{" +
        "elementos=" + elementos +
        '}';
  }

  @Override
  protected Inventario clone() {
    try {

      Inventario inventarioClonado = (Inventario) super.clone();
      inventarioClonado.elementos = new ArrayList<>();
      elementos.forEach(
          el -> inventarioClonado.elementos.add(new Elemento(el.getNombre(), el.getPoder())));
      return inventarioClonado;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}
