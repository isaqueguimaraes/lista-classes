public class Lampada {
  private int potencia;
  private String corDaLuz;
  private String tipo;
  private int voltagem;
  private String estado;

  public Lampada(int potencia, String corDaLuz, String tipo, int voltagem, String estado) {
    this.potencia = potencia;
    this.corDaLuz = corDaLuz;
    this.tipo = tipo;
    this.voltagem = voltagem;
    this.estado = estado;
  }

  public int getPotencia() {
    return potencia;
  }

  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }

  public String getCorDaLuz() {
    return corDaLuz;
  }

  public void setCorDaLuz(String corDaLuz) {
    this.corDaLuz = corDaLuz;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getVoltagem() {
    return voltagem;
  }

  public void setVoltagem(int voltagem) {
    this.voltagem = voltagem;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public void acender() {
    System.out.println("Lâmpada acesa.");
  }

  public void apagar() {
    System.out.println("Lâmpada apagada.");
  }

  public void queimar() {
    System.out.println("A lâmpada queimou.");
  }

  public void ajustarIntensidade() {
    System.out.println("Ajustando a intensidade da luz.");
  }

  public void trocar() {
    System.out.println("Trocando a lâmpada.");
  }
}
