package org.example;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Material material;
  private ColorPrimario colorPrimario;
  private ColorSecundario colorSecundario;

  public Prenda(TipoPrenda tipoPrenda, Material material, ColorPrimario colorPrimario, ColorSecundario colorSecundario) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario; //con color secundario
  }

  public Prenda(TipoPrenda tipoPrenda, Material material, ColorPrimario colorPrimario) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.colorPrimario = colorPrimario; //sin color secundario
  }

  public Categoria getCategoria() {
    return tipoPrenda.getCategoria();
  }

}
