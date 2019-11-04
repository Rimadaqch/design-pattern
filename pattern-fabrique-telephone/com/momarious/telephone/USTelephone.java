package com.momarious.telephone ;
/*
 * FRAdresse.java
 */

/**
 * Adresse fran�aise (Concrete Product)
 */
public class USTelephone extends AbstractTelephone {

  private static final String PAYS = "ETATS-UNIS";
  

  public String getCountry() {
    return PAYS;
  }
  
  public String toString() {
    return getNumero() + " " + PAYS + " ";
  }

  public String getCodeRegional() {
    return ""; 
  }
  
  
}
