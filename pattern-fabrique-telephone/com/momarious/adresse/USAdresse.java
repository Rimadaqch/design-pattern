package com.momarious.adresse;

/*
 * FRAdresse.java
 */

/**
 * Adresse fran�aise (Concrete Product)
 */
public class USAdresse extends AbstractAdresse {
  
  private static final String PAYS = "ETATS-UNIS";
  
  public String getCountry() {
    return PAYS;
  }
  
  public String toString() {
    return getRue() + "\n" + getCodePostal() + " " + getVille() + "\n" + PAYS + "\n";
  }
  
}
