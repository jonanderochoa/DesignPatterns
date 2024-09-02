package creacionales.builder.niveles_juego;

public class Main {

  public static void main(String[] args) {

    /**
     * Nivel facil
     */
    Nivel nivelFacil = new Nivel.NivelBuilder()
        .setDificultad("Facil")
        .setNumeroDeEnemigos(7)
        .setTipoTerrreno("Bosque")
        .setMusicaFondo("Musica tranquila")
        .build();

    System.out.println(nivelFacil);

    /**
     * Nivel dificil
     */
    Nivel nivelDificil = new Nivel.NivelBuilder()
        .setDificultad("Dificil")
        .setNumeroDeEnemigos(15)
        .setTipoTerrreno("Ciudad")
        .setMusicaFondo("Musica intensa")
        .build();

    System.out.println(nivelDificil);
  }

}
