public class Carro {
  private String marca;
  private String modelo;
  private String cor;
  private int ano;
  private int velocidadeAtual;

  public Carro(String marca, String modelo, String cor, int ano, int velocidadeAtual) {
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.ano = ano;
    this.velocidadeAtual = velocidadeAtual;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getVelocidadeAtual() {
    return velocidadeAtual;
  }

  public void setVelocidadeAtual(int velocidadeAtual) {
    this.velocidadeAtual = velocidadeAtual;
  }

  public void acelerar() {
    System.out.println(modelo + " está acelerando.");
  }

  public void frear() {
    System.out.println(modelo + " está freando.");
  }

  public void ligar() {
    System.out.println(modelo + " está ligado.");
  }

  public void desligar() {
    System.out.println(modelo + " está desligado.");
  }

  public void buzinar() {
    System.out.println(modelo + " fez: Biiiii!");
  }
}