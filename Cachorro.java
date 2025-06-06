public class Cachorro {
  private String raca;
  private int idade;
  private double peso;
  private String cor;
  private String nome;

  public Cachorro(String raca, int idade, double peso, String cor, String nome) {
    this.raca = raca;
    this.idade = idade;
    this.peso = peso;
    this.cor = cor;
    this.nome = nome;
  }

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void latir() {
    System.out.println(nome + " está latindo.");
  }

  public void correr() {
    System.out.println(nome + " está correndo.");
  }

  public void comer() {
    System.out.println(nome + " está comendo.");
  }

  public void dormir() {
    System.out.println(nome + " está dormindo.");
  }

  public void brincar() {
    System.out.println(nome + " está brincando.");
  }
}
