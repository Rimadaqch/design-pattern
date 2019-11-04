package com.momarious.adresse;


public class FRAdresse extends AbstractAdresse {
  private static final String PAYS = "FRANCE";
  
  public String getCountry() {
    return PAYS;
  }
  
  public String toString() {
    return getRue() + "\n" + getCodePostal() + " " + getVille() + "\n" + PAYS + "\n";
  }
  
}
