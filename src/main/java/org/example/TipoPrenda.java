package org.example;

public class TipoPrenda {
  private String nombre;
  Categoria categoria;

  public TipoPrenda(String nombre, Categoria categoria) {
    this.nombre = nombre;
    this.categoria = categoria;
  }

  public String getNombre() {
    return nombre;
  }

  public Categoria getCategoria() {
    return categoria;
  }
}
