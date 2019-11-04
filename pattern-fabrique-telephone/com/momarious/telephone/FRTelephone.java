package com.momarious.telephone ;


public class FRTelephone extends AbstractTelephone {
  private static final String PAYS = "FRANCE";
  
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
