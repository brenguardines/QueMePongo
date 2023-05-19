package org.example;

import org.junit.jupiter.api.Test;

public class PrendaTest {


  @Test
  void unaRemeraDeAlgodonAzul() {
    TipoPrenda tipo = new TipoPrenda("Remera", Categoria.PARTE_SUPERIOR);
    Material material = Material.ALGODON;
    ColorPrimario colorPrimario = new ColorPrimario(0,0,255);
  }

  @Test
  void unPantalonDeJeanBlancoYRojo() {
    TipoPrenda tipo = new TipoPrenda("Pantalon", Categoria.PARTE_INFERIOR);
    Material material = Material.JEAN;
    ColorPrimario colorPrimario = new ColorPrimario(255,255,255);
    ColorSecundario colorSecundario = new ColorSecundario(255,0,0);
  }

  @Test
  void unaCamperaDeCueroNegro() {
    TipoPrenda tipo = new TipoPrenda("Pantalon", Categoria.PARTE_SUPERIOR);
    Material material = Material.CUERO;
    ColorPrimario colorPrimario = new ColorPrimario(0,0,0);
  }

}