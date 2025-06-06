public class Relogio {
  private String marca;
  private String modelo;
  private String tipo;
  private String cor;
  private String horaAtual;

  public Relogio(String marca, String modelo, String tipo, String cor, String horaAtual) {
    this.marca = marca;
    this.modelo = modelo;
    this.tipo = tipo;
    this.cor = cor;
    this.horaAtual = horaAtual;
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

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getHoraAtual() {
    return horaAtual;
  }

  public void setHoraAtual(String horaAtual) {
    this.horaAtual = horaAtual;
  }

  public void mostrarHora() {
    System.out.println("Hora atual: " + horaAtual);
  }

  public void ajustarHora() {
    System.out.println("Ajustando a hora.");
  }

  public void cronometro() {
    System.out.println("Iniciando o cronômetro.");
  }

  public void alarme() {
    System.out.println("Alarme ativado.");
  }

  public void parar() {
    System.out.println("Relógio parado.");
  }
}
