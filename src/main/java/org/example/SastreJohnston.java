package org.example;

public class SastreJohnston implements Sastre{
  @Override
  public Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador(new TipoPrenda("Camisa", Categoria.PARTE_SUPERIOR));
    borrador.especificarColorPrimario(new Color(255,255,255));
    borrador.especificarMaterial(Material.ALGODON);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador(new TipoPrenda("Pantalon", Categoria.PARTE_INFERIOR));
    borrador.especificarColorPrimario(new Color(0,0,0));
    borrador.especificarMaterial(Material.ALGODON);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    Borrador borrador = new Borrador(new TipoPrenda("Zapatos", Categoria.CALZADO));
    borrador.especificarColorPrimario(new Color(0,0,0));
    borrador.especificarMaterial(Material.CUERO);
    return borrador.crearPrenda();
  }
}
