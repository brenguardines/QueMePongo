package org.example;

public class Uniforme {

  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado){
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }

  public Uniforme fabricar (Sastre sastre){
    return new Uniforme(sastre.fabricarParteSuperior(),
                        sastre.fabricarParteInferior(),
                        sastre.fabricarCalzado());
  }
}
