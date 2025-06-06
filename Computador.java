public class Computador {
  private String processador;
  private int memoriaRAM;
  private int armazenamento;
  private String sistemaOperacional;
  private String marca;

  public Computador(String processador, int memoriaRAM, int armazenamento, String sistemaOperacional, String marca) {
    this.processador = processador;
    this.memoriaRAM = memoriaRAM;
    this.armazenamento = armazenamento;
    this.sistemaOperacional = sistemaOperacional;
    this.marca = marca;
  }

  public String getProcessador() {
    return processador;
  }

  public void setProcessador(String processador) {
    this.processador = processador;
  }

  public int getMemoriaRAM() {
    return memoriaRAM;
  }

  public void setMemoriaRAM(int memoriaRAM) {
    this.memoriaRAM = memoriaRAM;
  }

  public int getArmazenamento() {
    return armazenamento;
  }

  public void setArmazenamento(int armazenamento) {
    this.armazenamento = armazenamento;
  }

  public String getSistemaOperacional() {
    return sistemaOperacional;
  }

  public void setSistemaOperacional(String sistemaOperacional) {
    this.sistemaOperacional = sistemaOperacional;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void ligar() {
    System.out.println("Ligando o computador.");
  }

  public void desligar() {
    System.out.println("Desligando o computador.");
  }

  public void executarPrograma() {
    System.out.println("Executando um programa.");
  }

  public void reiniciar() {
    System.out.println("Reiniciando o computador.");
  }

  public void conectarInternet() {
    System.out.println("Conectando à internet.");
  }
}
