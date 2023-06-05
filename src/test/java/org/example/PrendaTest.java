package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PrendaTest {
  @Test
  void unaPrendaSinColorSecundario() {
    assertEquals(unaRemeraDeAlgodonAzul().getColorSecundario(), null);
  }

  @Test
  void unaPrendaConColorSecundario() {
    Color color = new Color(255,0,0);
    assertEquals(unPantalonDeJeanBlancoYRojo().getColorSecundario().getColorRed() , color.getColorRed());
    assertEquals(unPantalonDeJeanBlancoYRojo().getColorSecundario().getColorGreen() , color.getColorGreen());
    assertEquals(unPantalonDeJeanBlancoYRojo().getColorSecundario().getColorBlue() , color.getColorBlue());
  }

  @Test
  void laCategoriaDeUnaCamperaEsParteSuperior() {
    assertEquals(unaCamperaDeCueroNegro().getCategoria().toString(), "PARTE_SUPERIOR");
  }


  private Prenda unaRemeraDeAlgodonAzul(){
    return new Prenda(
        new TipoPrenda("Remera", Categoria.PARTE_SUPERIOR),
        Material.ALGODON,
        Trama.LISA,
        new Color(0,0,255));
  }

  private Prenda unPantalonDeJeanBlancoYRojo(){
    return new Prenda(
        new TipoPrenda("Pantalon", Categoria.PARTE_INFERIOR),
        Material.JEAN,
        Trama.RAYADA,
        new Color(255,255,255),
        new Color(255,0,0));
  }

  private Prenda unaCamperaDeCueroNegro(){
    return new Prenda(
        new TipoPrenda("Pantalon", Categoria.PARTE_SUPERIOR),
        Material.CUERO,
        Trama.ESTAMPADO,
        new Color(0,0,0));
  }

}