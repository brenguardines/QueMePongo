package org.example;
import java.util.Objects;

public class Borrador {

  private TipoPrenda tipoPrenda;
  private Material material;
  private Trama trama;
  private Color colorPrimario;
  private Color colorSecundario;

  public Borrador(TipoPrenda tipoPrenda){
    validateNonNull(tipoPrenda, "tipo de prenda");
    this.tipoPrenda = tipoPrenda;
  }
  public void especificarTipo(TipoPrenda tipoPrenda){
    validateNonNull(tipoPrenda, "tipo de prenda");
    this.tipoPrenda = tipoPrenda;
  }

  public void especificarMaterial(Material material){
    validateNonNull(material, "material");
    this.material = material;
  }

  public void especificarTrama(Trama trama){
    this.trama = trama == null ? Trama.LISA : trama;
  }

  public void especificarColorPrimario(Color colorPrimario){
    validateNonNull(colorPrimario, "color primario");
    this.colorPrimario = colorPrimario;
  }

  public void especificarColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }

  public Prenda crearPrenda(){
    return new Prenda(tipoPrenda,material,trama,colorPrimario,colorSecundario);
  }

  public void validateNonNull(Object parametro,String nombreParametro){
    if(parametro == null){
      throw new IllegalArgumentException("El parametro "+ nombreParametro +" no puede ser nulo");
    }
  }

}
