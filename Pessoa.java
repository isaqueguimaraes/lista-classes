public class Pessoa {
  private String nome;
  private int idade;
  private double altura;
  private double peso;
  private String genero;

  public Pessoa(String nome, int idade, double altura, double peso, String genero) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.peso = peso;
    this.genero = genero;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public void falar() {
    System.out.println(nome + " está falando.");
  }

  public void andar() {
    System.out.println(nome + " está andando.");
  }

  public void comer() {
    System.out.println(nome + " está comendo.");
  }

  public void dormir() {
    System.out.println(nome + " está dormindo.");
  }

  public void trabalhar() {
    System.out.println(nome + " está trabalhando.");
  }

}