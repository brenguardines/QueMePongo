package org.example;

public class Color {
  private Integer colorRed;
  private Integer colorGreen;
  private Integer colorBlue;

  public Color(Integer colorRed, Integer colorGreen, Integer colorBlue) {
    this.colorRed = colorRed;
    this.colorGreen = colorGreen;
    this.colorBlue = colorBlue;
  }

  public Integer getColorRed() {
    return colorRed;
  }

  public Integer getColorGreen() {
    return colorGreen;
  }

  public Integer getColorBlue() {
    return colorBlue;
  }
}