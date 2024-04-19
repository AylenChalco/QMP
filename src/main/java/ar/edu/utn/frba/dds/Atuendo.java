package ar.edu.utn.frba.dds;

import java.util.List;

public class Atuendo {
  List<Prenda> prendas;

  public void cargarPrendaValida(Prenda prenda) {
    if (prenda.esValida()) {
      prendas.add(prenda);
    }
  }
}
