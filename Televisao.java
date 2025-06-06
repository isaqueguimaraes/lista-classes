public class Televisao {
  private String marca;
  private int tamanhoPolegadas;
  private String resolucao;
  private String tipoDeTela;
  private int canalAtual;

  public Televisao(String marca, int tamanhoPolegadas, String resolucao, String tipoDeTela, int canalAtual) {
    this.marca = marca;
    this.tamanhoPolegadas = tamanhoPolegadas;
    this.resolucao = resolucao;
    this.tipoDeTela = tipoDeTela;
    this.canalAtual = canalAtual;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getTamanhoPolegadas() {
    return tamanhoPolegadas;
  }

  public void setTamanhoPolegadas(int tamanhoPolegadas) {
    this.tamanhoPolegadas = tamanhoPolegadas;
  }

  public String getResolucao() {
    return resolucao;
  }

  public void setResolucao(String resolucao) {
    this.resolucao = resolucao;
  }

  public String getTipoDeTela() {
    return tipoDeTela;
  }

  public void setTipoDeTela(String tipoDeTela) {
    this.tipoDeTela = tipoDeTela;
  }

  public int getCanalAtual() {
    return canalAtual;
  }

  public void setCanalAtual(int canalAtual) {
    this.canalAtual = canalAtual;
  }

  public void ligar() {
    System.out.println("Televisão ligada.");
  }

  public void desligar() {
    System.out.println("Televisão desligada.");
  }

  public void mudarCanal() {
    System.out.println("Mudando de canal.");
  }

  public void aumentarVolume() {
    System.out.println("Aumentando o volume.");
  }

  public void diminuirVolume() {
    System.out.println("Diminuindo o volume.");
  }
}
