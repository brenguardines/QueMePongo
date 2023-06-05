package org.example;

public class SastreSanJuan implements Sastre{
  @Override
  public Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador(new TipoPrenda("Chomba", Categoria.PARTE_SUPERIOR));
    borrador.especificarColorPrimario(new Color(0,255,00));
    borrador.especificarMaterial(Material.PIQUE);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador(new TipoPrenda("Pantalon", Categoria.PARTE_INFERIOR));
    borrador.especificarColorPrimario(new Color(128,128,128));
    borrador.especificarMaterial(Material.ACETATO);
    return borrador.crearPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    Borrador borrador = new Borrador(new TipoPrenda("Zapatillas", Categoria.CALZADO));
    borrador.especificarColorPrimario(new Color(255,255,255));
    borrador.especificarMaterial(Material.LONA);
    return borrador.crearPrenda();
  }
}