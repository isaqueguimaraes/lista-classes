public class Livro {
  private String titulo;
  private String autor;
  private int numeroDePaginas;
  private String genero;
  private String editora;

  public Livro(String titulo, String autor, int numeroDePaginas, String genero, String editora) {
    this.titulo = titulo;
    this.autor = autor;
    this.numeroDePaginas = numeroDePaginas;
    this.genero = genero;
    this.editora = editora;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getNumeroDePaginas() {
    return numeroDePaginas;
  }

  public void setNumeroDePaginas(int numeroDePaginas) {
    this.numeroDePaginas = numeroDePaginas;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public void abrir() {
    System.out.println("Abrindo o livro: " + titulo);
  }

  public void fechar() {
    System.out.println("Fechando o livro: " + titulo);
  }

  public void lerPagina() {
    System.out.println("Lendo uma página de " + titulo);
  }

  public void marcarPagina() {
    System.out.println("Marcando página do livro: " + titulo);
  }

  public void emprestar() {
    System.out.println("Emprestando o livro: " + titulo);
  }
}