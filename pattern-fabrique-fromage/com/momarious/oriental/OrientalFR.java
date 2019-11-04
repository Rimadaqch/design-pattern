package com.momarious.oriental;

public class OrientalFR extends AbstractOriental {

  private static final String PAYS = "FRANCE";
  
  public String getCountry() {
    return PAYS;
  }
  
  public String toString() {
    return "Oriental" + " from " + PAYS + "\n ";
  }
}