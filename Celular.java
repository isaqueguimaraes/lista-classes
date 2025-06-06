public class Celular {
  private String marca;
  private String modelo;
  private String cor;
  private int armazenamento;
  private int bateria;

  public Celular(String marca, String modelo, String cor, int armazenamento, int bateria) {
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.armazenamento = armazenamento;
    this.bateria = bateria;
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

  public int getArmazenamento() {
    return armazenamento;
  }

  public void setArmazenamento(int armazenamento) {
    this.armazenamento = armazenamento;
  }

  public int getBateria() {
    return bateria;
  }

  public void setBateria(int bateria) {
    this.bateria = bateria;
  }

  public void ligar() {
    System.out.println(modelo + " está ligando.");
  }

  public void desligar() {
    System.out.println(modelo + " está desligando.");
  }

  public void tirarFoto() {
    System.out.println(modelo + " tirou uma foto.");
  }

  public void enviarMensagem() {
    System.out.println(modelo + " enviou uma mensagem.");
  }

  public void tocarMusica() {
    System.out.println(modelo + " está tocando música.");
  }
}
