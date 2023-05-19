package org.example;

import java.util.List;

public class Atuendo {
  List<Prenda> prendas;

  public Atuendo(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }
}
