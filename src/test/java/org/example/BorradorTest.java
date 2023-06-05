package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class BorradorTest {

  private Prenda unaCamisaSinTramaYSinColorSecundario(){
    Borrador borrador =  new Borrador(new TipoPrenda("Camisa", Categoria.PARTE_SUPERIOR));
    borrador.especificarMaterial(Material.ALGODON);
    borrador.especificarColorPrimario(new Color(255,255,255));
    return borrador.crearPrenda();
  }

  private Prenda unaPantalonConTramaYSinColorSecundario(){
    Borrador borrador =  new Borrador(new TipoPrenda("Pantalon", Categoria.PARTE_INFERIOR));
    borrador.especificarMaterial(Material.JEAN);
    borrador.especificarTrama(Trama.RAYADA);
    borrador.especificarColorPrimario(new Color(0,0,255));
    return borrador.crearPrenda();
  }

  private Prenda unaZapatillasConTramaYConColorSecundario(){
    Borrador borrador =  new Borrador(new TipoPrenda("Zapatillas", Categoria.CALZADO));
    borrador.especificarMaterial(Material.LONA);
    borrador.especificarTrama(Trama.ESTAMPADO);
    borrador.especificarColorPrimario(new Color(70,45,30));
    borrador.especificarColorSecundario(new Color(32,240,86));
    return borrador.crearPrenda();
  }

  @Test
  void unaPrendaSinTramaEsLisa() {
    assertEquals(unaCamisaSinTramaYSinColorSecundario().getTrama().toString(), "LISA");
  }

  @Test
  void unaPrendaConTramaYSinColorSecundario() {
    Trama trama = Trama.RAYADA;
    assertEquals(unaPantalonConTramaYSinColorSecundario().getTrama().toString(), "RAYADA");
    assertEquals(unaPantalonConTramaYSinColorSecundario().getColorSecundario(), null);
  }

  @Test
  void unaPrendaConTramaYColorSecundario() {
    Trama trama = Trama.ESTAMPADO;
    Color color = new Color(32,240,86);
    assertEquals(unaZapatillasConTramaYConColorSecundario().getTrama().toString(), "ESTAMPADO");
    assertEquals(unaZapatillasConTramaYConColorSecundario().getColorSecundario().getColorRed() , color.getColorRed());
    assertEquals(unaZapatillasConTramaYConColorSecundario().getColorSecundario().getColorGreen() , color.getColorGreen());
    assertEquals(unaZapatillasConTramaYConColorSecundario().getColorSecundario().getColorBlue() , color.getColorBlue());
  }

}