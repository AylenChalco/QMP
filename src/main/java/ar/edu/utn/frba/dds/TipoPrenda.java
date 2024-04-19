package ar.edu.utn.frba.dds;

public class TipoPrenda {
  Categoria categoria;

  TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria devolverCategoria() {
    return this.categoria;
  }
}
