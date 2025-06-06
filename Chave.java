public class Chave {
  private String material;
  private String tipo;
  private double tamanho;
  private String cor;
  private String formato;

  public Chave(String material, String tipo, double tamanho, String cor, String formato) {
    this.material = material;
    this.tipo = tipo;
    this.tamanho = tamanho;
    this.cor = cor;
    this.formato = formato;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getTamanho() {
    return tamanho;
  }

  public void setTamanho(double tamanho) {
    this.tamanho = tamanho;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getFormato() {
    return formato;
  }

  public void setFormato(String formato) {
    this.formato = formato;
  }

  public void abrir() {
    System.out.println("A chave está abrindo algo.");
  }

  public void fechar() {
    System.out.println("A chave está fechando algo.");
  }

  public void girar() {
    System.out.println("Girando a chave.");
  }

  public void encaixar() {
    System.out.println("Encaixando a chave.");
  }

  public void guardar() {
    System.out.println("Guardando a chave.");
  }
}
