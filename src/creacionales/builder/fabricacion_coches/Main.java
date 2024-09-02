package creacionales.builder.fabricacion_coches;

import creacionales.builder.fabricacion_coches.builders.CocheBuilder;
import creacionales.builder.fabricacion_coches.builders.ManualCocheBuilder;
import creacionales.builder.fabricacion_coches.cars.Coche;
import creacionales.builder.fabricacion_coches.cars.Manual;
import creacionales.builder.fabricacion_coches.director.Director;

public class Main {

  public static void main(String[] args) {

    Director director = new Director(); // Creamos el director. El director genera coches predefinidos
    CocheBuilder builder = new CocheBuilder();  // Creamos un builder de coches
    director.construirDeportivo(builder); // Se lo pasamos al metodo del director
    // Recogemos el coche del builder y lo imprimimos
    Coche coche = builder.getResult();
    System.out.println("Car built:\n" + coche.getTipo());

    ManualCocheBuilder manualBuilder = new ManualCocheBuilder();  // Creamos un builder del manual
    director.construirSub(manualBuilder); // Construimos un sub
    // Recogemos el manual del builder y lo imprimimos
    Manual carManual = manualBuilder.getResult();
    System.out.println("\nCar manual built:\n" + carManual.print());
  }
}
