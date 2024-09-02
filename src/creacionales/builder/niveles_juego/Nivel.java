package creacionales.builder.niveles_juego;

public class Nivel {

  private String dificultad;
  private int numeroDeEnemigos;
  private String tipoTerrreno;
  private String musicaFondo;

  /**
   * Constructor del builder
   */
  private Nivel(NivelBuilder builder) {
    this.dificultad = builder.dificultad;
    this.numeroDeEnemigos = builder.numeroDeEnemigos;
    this.tipoTerrreno = builder.tipoTerrreno;
    this.musicaFondo = builder.musicaFondo;
  }

  @Override
  public String toString() {
    return "Nivel{" +
        "dificultad='" + dificultad + '\'' +
        ", numeroDeEnemigos=" + numeroDeEnemigos +
        ", tipoTerrreno='" + tipoTerrreno + '\'' +
        ", musicaFondo='" + musicaFondo + '\'' +
        '}';
  }

  /**
   * Builder estatico interno para la creacion de niveles
   */
  public static class NivelBuilder {

    private String dificultad;
    private int numeroDeEnemigos;
    private String tipoTerrreno;
    private String musicaFondo;

    public NivelBuilder setDificultad(String dificultad) {
      this.dificultad = dificultad;
      return this;
    }

    public NivelBuilder setNumeroDeEnemigos(int numeroDeEnemigos) {
      this.numeroDeEnemigos = numeroDeEnemigos;
      return this;
    }

    public NivelBuilder setTipoTerrreno(String tipoTerrreno) {
      this.tipoTerrreno = tipoTerrreno;
      return this;
    }

    public NivelBuilder setMusicaFondo(String musicaFondo) {
      this.musicaFondo = musicaFondo;
      return this;
    }

    public Nivel build() {
      return new Nivel(this);
    }
  }
}
